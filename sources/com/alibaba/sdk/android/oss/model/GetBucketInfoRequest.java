package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes2.dex */
public class GetBucketInfoRequest extends OSSRequest {
    private String bucketName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public GetBucketInfoRequest(String str) {
        this.bucketName = str;
    }
}
