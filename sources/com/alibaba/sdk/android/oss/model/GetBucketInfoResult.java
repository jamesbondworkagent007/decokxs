package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes14.dex */
public class GetBucketInfoResult extends OSSResult {
    private OSSBucketSummary bucket;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSSBucketSummary getBucket() {
        return this.bucket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucket(OSSBucketSummary oSSBucketSummary) {
        this.bucket = oSSBucketSummary;
    }

    @Override // com.alibaba.sdk.android.oss.model.OSSResult
    public String toString() {
        return String.format("GetBucketInfoResult<%s>:\n bucket:%s", super.toString(), this.bucket.toString());
    }
}
