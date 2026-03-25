package com.alibaba.sdk.android.oss.internal;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.TaskCancelException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
import com.alibaba.sdk.android.oss.common.utils.OSSSharedPreferences;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.model.AbortMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.ListPartsRequest;
import com.alibaba.sdk.android.oss.model.ListPartsResult;
import com.alibaba.sdk.android.oss.model.PartETag;
import com.alibaba.sdk.android.oss.model.PartSummary;
import com.alibaba.sdk.android.oss.model.ResumableUploadRequest;
import com.alibaba.sdk.android.oss.model.ResumableUploadResult;
import com.alibaba.sdk.android.oss.model.UploadPartRequest;
import com.alibaba.sdk.android.oss.model.UploadPartResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.CheckedInputStream;

/* JADX INFO: loaded from: classes14.dex */
public class SequenceUploadTask extends BaseMultipartUploadTask<ResumableUploadRequest, ResumableUploadResult> implements Callable<ResumableUploadResult> {
    private List<Integer> mAlreadyUploadIndex;
    private File mCRC64RecordFile;
    private long mFirstPartSize;
    private File mRecordFile;
    private OSSSharedPreferences mSp;

    public SequenceUploadTask(ResumableUploadRequest resumableUploadRequest, OSSCompletedCallback<ResumableUploadRequest, ResumableUploadResult> oSSCompletedCallback, ExecutionContext executionContext, InternalRequestOperation internalRequestOperation) {
        super(internalRequestOperation, resumableUploadRequest, oSSCompletedCallback, executionContext);
        this.mAlreadyUploadIndex = new ArrayList();
        this.mSp = OSSSharedPreferences.instance(this.mContext.getApplicationContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initMultipartUploadId() throws ServiceException, ClientException, IOException {
        Map map;
        boolean zIsTruncated;
        ClassNotFoundException e;
        if (!OSSUtils.isEmptyString(((ResumableUploadRequest) this.mRequest).getRecordDirectory())) {
            String strCalculateMd5Str = BinaryUtil.calculateMd5Str(this.mUploadFilePath);
            StringBuilder sb = new StringBuilder();
            sb.append(strCalculateMd5Str);
            sb.append(((ResumableUploadRequest) this.mRequest).getBucketName());
            sb.append(((ResumableUploadRequest) this.mRequest).getObjectKey());
            sb.append(String.valueOf(((ResumableUploadRequest) this.mRequest).getPartSize()));
            sb.append(this.mCheckCRC64 ? "-crc64" : "");
            sb.append("-sequence");
            String strCalculateMd5Str2 = BinaryUtil.calculateMd5Str(sb.toString().getBytes());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((ResumableUploadRequest) this.mRequest).getRecordDirectory());
            String str = File.separator;
            sb2.append(str);
            sb2.append(strCalculateMd5Str2);
            File file = new File(sb2.toString());
            this.mRecordFile = file;
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.mRecordFile));
                this.mUploadId = bufferedReader.readLine();
                bufferedReader.close();
                OSSLog.logDebug("sequence [initUploadId] - Found record file, uploadid: " + this.mUploadId);
            }
            if (!OSSUtils.isEmptyString(this.mUploadId)) {
                if (this.mCheckCRC64) {
                    File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + str + this.mUploadId);
                    if (file2.exists()) {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file2));
                        try {
                            try {
                                map = (Map) objectInputStream.readObject();
                                try {
                                    file2.delete();
                                } catch (ClassNotFoundException e2) {
                                    e = e2;
                                    OSSLog.logThrowable2Local(e);
                                }
                            } finally {
                                objectInputStream.close();
                                file2.delete();
                            }
                        } catch (ClassNotFoundException e3) {
                            e = e3;
                            map = null;
                        }
                    } else {
                        map = null;
                    }
                    int nextPartNumberMarker = 0;
                    do {
                        ListPartsRequest listPartsRequest = new ListPartsRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId);
                        if (nextPartNumberMarker > 0) {
                            listPartsRequest.setPartNumberMarker(Integer.valueOf(nextPartNumberMarker));
                        }
                        OSSAsyncTask<ListPartsResult> oSSAsyncTaskListParts = this.mApiOperation.listParts(listPartsRequest, null);
                        try {
                            ListPartsResult listPartsResult = (ListPartsResult) oSSAsyncTaskListParts.getResult();
                            zIsTruncated = listPartsResult.isTruncated();
                            nextPartNumberMarker = listPartsResult.getNextPartNumberMarker();
                            List<PartSummary> parts = listPartsResult.getParts();
                            for (int i = 0; i < parts.size(); i++) {
                                PartSummary partSummary = parts.get(i);
                                PartETag partETag = new PartETag(partSummary.getPartNumber(), partSummary.getETag());
                                partETag.setPartSize(partSummary.getSize());
                                if (map != null && map.size() > 0 && map.containsKey(Integer.valueOf(partETag.getPartNumber()))) {
                                    partETag.setCRC64(((Long) map.get(Integer.valueOf(partETag.getPartNumber()))).longValue());
                                }
                                this.mPartETags.add(partETag);
                                this.mUploadedLength += partSummary.getSize();
                                this.mAlreadyUploadIndex.add(Integer.valueOf(partSummary.getPartNumber()));
                                if (i == 0) {
                                    this.mFirstPartSize = partSummary.getSize();
                                }
                            }
                        } catch (ClientException e4) {
                            throw e4;
                        } catch (ServiceException e5) {
                            if (e5.getStatusCode() != 404) {
                                throw e5;
                            }
                            this.mUploadId = null;
                            zIsTruncated = false;
                        }
                        oSSAsyncTaskListParts.waitUntilFinished();
                    } while (zIsTruncated);
                }
            }
            if (!this.mRecordFile.exists() && !this.mRecordFile.createNewFile()) {
                throw new ClientException("Can't create file at path: " + this.mRecordFile.getAbsolutePath() + "\nPlease make sure the directory exist!");
            }
        }
        if (OSSUtils.isEmptyString(this.mUploadId)) {
            InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), ((ResumableUploadRequest) this.mRequest).getMetadata());
            initiateMultipartUploadRequest.isSequential = true;
            this.mUploadId = ((InitiateMultipartUploadResult) this.mApiOperation.initMultipartUpload(initiateMultipartUploadRequest, null).getResult()).getUploadId();
            if (this.mRecordFile != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.mRecordFile));
                bufferedWriter.write(this.mUploadId);
                bufferedWriter.close();
            }
        }
        ((ResumableUploadRequest) this.mRequest).setUploadId(this.mUploadId);
    }

    /* JADX DEBUG: Method merged with bridge method: doMultipartUpload()Lcom/alibaba/sdk/android/oss/model/CompleteMultipartUploadResult; */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public ResumableUploadResult doMultipartUpload() throws Throwable {
        long j = this.mUploadedLength;
        checkCancel();
        int[] iArr = this.mPartAttr;
        int i = iArr[0];
        int i2 = iArr[1];
        if (this.mPartETags.size() > 0 && this.mAlreadyUploadIndex.size() > 0) {
            long jLongValue = this.mUploadedLength;
            if (jLongValue > this.mFileLength) {
                throw new ClientException("The uploading file is inconsistent with before");
            }
            if (this.mFirstPartSize != i) {
                throw new ClientException("The part size setting is inconsistent with before");
            }
            if (!TextUtils.isEmpty(this.mSp.getStringValue(this.mUploadId))) {
                jLongValue = Long.valueOf(this.mSp.getStringValue(this.mUploadId)).longValue();
            }
            long j2 = jLongValue;
            OSSProgressCallback<Request> oSSProgressCallback = this.mProgressCallback;
            if (oSSProgressCallback != 0) {
                oSSProgressCallback.onProgress(this.mRequest, j2, this.mFileLength);
            }
            this.mSp.removeKey(this.mUploadId);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.mAlreadyUploadIndex.size() == 0 || !this.mAlreadyUploadIndex.contains(Integer.valueOf(i3 + 1))) {
                if (i3 == i2 - 1) {
                    i = (int) (this.mFileLength - j);
                }
                OSSLog.logDebug("upload part readByte : " + i);
                j += (long) i;
                uploadPart(i3, i, i2);
                if (this.mUploadException != null) {
                    break;
                }
            }
        }
        checkException();
        CompleteMultipartUploadResult completeMultipartUploadResult = completeMultipartUploadResult();
        ResumableUploadResult resumableUploadResult = completeMultipartUploadResult != null ? new ResumableUploadResult(completeMultipartUploadResult) : null;
        File file = this.mRecordFile;
        if (file != null) {
            file.delete();
        }
        File file2 = this.mCRC64RecordFile;
        if (file2 != null) {
            file2.delete();
        }
        return resumableUploadResult;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x00c4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x00ce */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x00d0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x012d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0133 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x0001 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x0001 */
    /* JADX DEBUG: Type inference failed for r2v5. Raw type applied. Possible types: Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest */
    /* JADX DEBUG: Type inference failed for r3v0. Raw type applied. Possible types: Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest */
    /* JADX DEBUG: Type inference failed for r3v5. Raw type applied. Possible types: Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest */
    /* JADX DEBUG: Type inference failed for r9v24. Raw type applied. Possible types: Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest */
    /* JADX DEBUG: Type inference failed for r9v28. Raw type applied. Possible types: Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        if (r0 == 0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[Catch: all -> 0x0134, TryCatch #2 {all -> 0x0134, blocks: (B:39:0x00de, B:41:0x00e6, B:42:0x00ea, B:44:0x0104, B:45:0x0122), top: B:62:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[Catch: all -> 0x0134, TryCatch #2 {all -> 0x0134, blocks: (B:39:0x00de, B:41:0x00e6, B:42:0x00ea, B:44:0x0104, B:45:0x0122), top: B:62:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask, com.alibaba.sdk.android.oss.internal.SequenceUploadTask] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uploadPart(int i, int i2, int i3) throws Throwable {
        UploadPartRequest uploadPartRequest;
        ?? randomAccessFile;
        long j;
        PartETag partETag;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        try {
            try {
                try {
                } catch (ServiceException e) {
                    e = e;
                    uploadPartRequest = null;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (IOException e3) {
                OSSLog.logThrowable2Local(e3);
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (this.mContext.getCancellationHandler().isCancelled()) {
                return;
            }
            this.mRunPartTaskCount++;
            preUploadPart(i, i2, i3);
            randomAccessFile = new RandomAccessFile(this.mUploadFile, "r");
            try {
                try {
                    uploadPartRequest = new UploadPartRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId, i + 1);
                    j = i;
                } catch (Exception e4) {
                    e = e4;
                    r0 = randomAccessFile;
                    processException(e);
                } catch (Throwable th2) {
                    th = th2;
                    r0 = randomAccessFile;
                    if (r0 != 0) {
                    }
                    throw th;
                }
                try {
                    byte[] bArr = new byte[i2];
                    randomAccessFile.seek(j * ((ResumableUploadRequest) this.mRequest).getPartSize());
                    randomAccessFile.readFully(bArr, 0, i2);
                    uploadPartRequest.setPartContent(bArr);
                    uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                    uploadPartRequest.setCRC64(((ResumableUploadRequest) this.mRequest).getCRC64());
                    UploadPartResult uploadPartResultSyncUploadPart = this.mApiOperation.syncUploadPart(uploadPartRequest);
                    partETag = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart.getETag());
                    long j2 = i2;
                    partETag.setPartSize(j2);
                    if (this.mCheckCRC64) {
                        partETag.setCRC64(uploadPartResultSyncUploadPart.getClientCRC().longValue());
                    }
                    this.mPartETags.add(partETag);
                    this.mUploadedLength += j2;
                    uploadPartFinish(partETag);
                } catch (ServiceException e5) {
                    e = e5;
                    r0 = randomAccessFile;
                    if (e.getStatusCode() == 409) {
                    }
                    if (r0 == 0) {
                    }
                    r0.close();
                    r0 = r0;
                }
            } catch (ServiceException e6) {
                e = e6;
                uploadPartRequest = null;
            }
            if (this.mContext.getCancellationHandler().isCancelled()) {
                TaskCancelException taskCancelException = new TaskCancelException("sequence upload task cancel");
                throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
            }
            onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
            randomAccessFile.close();
            r0 = partETag;
            if (e.getStatusCode() == 409) {
                processException(e);
            } else {
                PartETag partETag2 = new PartETag(uploadPartRequest.getPartNumber(), e.getPartEtag());
                partETag2.setPartSize(uploadPartRequest.getPartContent().length);
                if (this.mCheckCRC64) {
                    partETag2.setCRC64(new CheckedInputStream(new ByteArrayInputStream(uploadPartRequest.getPartContent()), new CRC64()).getChecksum().getValue());
                }
                this.mPartETags.add(partETag2);
                this.mUploadedLength += (long) i2;
            }
            if (r0 == 0) {
                return;
            }
            r0.close();
            r0 = r0;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = r0;
            r0 = randomAccessFile;
            if (r0 != 0) {
                try {
                    r0.close();
                } catch (IOException e7) {
                    OSSLog.logThrowable2Local(e7);
                }
            }
            throw th;
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void checkException() throws Throwable {
        ObjectOutputStream objectOutputStream;
        if (this.mContext.getCancellationHandler().isCancelled()) {
            if (((ResumableUploadRequest) this.mRequest).deleteUploadOnCancelling().booleanValue()) {
                abortThisUpload();
                File file = this.mRecordFile;
                if (file != null) {
                    file.delete();
                }
            } else {
                List<PartETag> list = this.mPartETags;
                if (list != null && list.size() > 0 && this.mCheckCRC64 && ((ResumableUploadRequest) this.mRequest).getRecordDirectory() != null) {
                    HashMap map = new HashMap();
                    for (PartETag partETag : this.mPartETags) {
                        map.put(Integer.valueOf(partETag.getPartNumber()), Long.valueOf(partETag.getCRC64()));
                    }
                    ObjectOutputStream objectOutputStream2 = null;
                    try {
                        try {
                            File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + File.separator + this.mUploadId);
                            this.mCRC64RecordFile = file2;
                            if (!file2.exists()) {
                                this.mCRC64RecordFile.createNewFile();
                            }
                            objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.mCRC64RecordFile));
                            try {
                                objectOutputStream.writeObject(map);
                                objectOutputStream.close();
                            } catch (IOException e) {
                                e = e;
                                objectOutputStream2 = objectOutputStream;
                                OSSLog.logThrowable2Local(e);
                                if (objectOutputStream2 != null) {
                                    objectOutputStream2.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream = null;
                    }
                }
            }
        }
        super.checkException();
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void abortThisUpload() {
        if (this.mUploadId != null) {
            this.mApiOperation.abortMultipartUpload(new AbortMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId), null).waitUntilFinished();
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void processException(Exception exc) {
        if (this.mUploadException == null || !exc.getMessage().equals(this.mUploadException.getMessage())) {
            this.mUploadException = exc;
        }
        OSSLog.logThrowable2Local(exc);
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mIsCancel) {
            return;
        }
        this.mIsCancel = true;
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void uploadPartFinish(PartETag partETag) throws Exception {
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mSp.contains(this.mUploadId)) {
            return;
        }
        this.mSp.setStringValue(this.mUploadId, String.valueOf(this.mUploadedLength));
        onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
    }
}
