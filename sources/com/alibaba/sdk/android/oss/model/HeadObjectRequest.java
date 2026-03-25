package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes14.dex */
public class HeadObjectRequest extends OSSRequest {
    private String bucketName;
    private String objectKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getObjectKey() {
        return this.objectKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectKey(String str) {
        this.objectKey = str;
    }

    public HeadObjectRequest(String str, String str2) {
        setBucketName(str);
        setObjectKey(str2);
    }
}
