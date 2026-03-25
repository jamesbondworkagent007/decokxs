package com.alibaba.sdk.android.oss.model;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;

/* JADX INFO: loaded from: classes14.dex */
public class UploadPartRequest extends OSSRequest {
    private String bucketName;
    private String md5Digest;
    private String objectKey;
    private byte[] partContent;
    private int partNumber;
    private OSSProgressCallback<UploadPartRequest> progressCallback;
    private String uploadId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMd5Digest() {
        return this.md5Digest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getObjectKey() {
        return this.objectKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getPartContent() {
        return this.partContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getPartNumber() {
        return this.partNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSSProgressCallback<UploadPartRequest> getProgressCallback() {
        return this.progressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUploadId() {
        return this.uploadId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMd5Digest(String str) {
        this.md5Digest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectKey(String str) {
        this.objectKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPartContent(byte[] bArr) {
        this.partContent = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPartNumber(int i) {
        this.partNumber = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProgressCallback(OSSProgressCallback<UploadPartRequest> oSSProgressCallback) {
        this.progressCallback = oSSProgressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadId(String str) {
        this.uploadId = str;
    }

    public UploadPartRequest() {
    }

    public UploadPartRequest(String str, String str2, String str3, int i) {
        this.bucketName = str;
        this.objectKey = str2;
        this.uploadId = str3;
        this.partNumber = i;
    }
}
