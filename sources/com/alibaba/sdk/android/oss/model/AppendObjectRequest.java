package com.alibaba.sdk.android.oss.model;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;

/* JADX INFO: loaded from: classes14.dex */
public class AppendObjectRequest extends OSSRequest {
    private String bucketName;
    private Long initCRC64;
    private ObjectMetadata metadata;
    private String objectKey;
    private long position;
    private OSSProgressCallback<AppendObjectRequest> progressCallback;
    private byte[] uploadData;
    private String uploadFilePath;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long getInitCRC64() {
        return this.initCRC64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getObjectKey() {
        return this.objectKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSSProgressCallback<AppendObjectRequest> getProgressCallback() {
        return this.progressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getUploadData() {
        return this.uploadData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUploadFilePath() {
        return this.uploadFilePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInitCRC64(Long l) {
        this.initCRC64 = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectKey(String str) {
        this.objectKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPosition(long j) {
        this.position = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProgressCallback(OSSProgressCallback<AppendObjectRequest> oSSProgressCallback) {
        this.progressCallback = oSSProgressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadData(byte[] bArr) {
        this.uploadData = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadFilePath(String str) {
        this.uploadFilePath = str;
    }

    public AppendObjectRequest(String str, String str2, String str3) {
        this(str, str2, str3, (ObjectMetadata) null);
    }

    public AppendObjectRequest(String str, String str2, String str3, ObjectMetadata objectMetadata) {
        setBucketName(str);
        setObjectKey(str2);
        setUploadFilePath(str3);
        setMetadata(objectMetadata);
    }

    public AppendObjectRequest(String str, String str2, byte[] bArr) {
        this(str, str2, bArr, (ObjectMetadata) null);
    }

    public AppendObjectRequest(String str, String str2, byte[] bArr, ObjectMetadata objectMetadata) {
        setBucketName(str);
        setObjectKey(str2);
        setUploadData(bArr);
        setMetadata(objectMetadata);
    }
}
