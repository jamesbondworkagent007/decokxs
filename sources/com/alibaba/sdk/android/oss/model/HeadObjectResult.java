package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes14.dex */
public class HeadObjectResult extends OSSResult {
    private ObjectMetadata metadata = new ObjectMetadata();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }

    @Override // com.alibaba.sdk.android.oss.model.OSSResult
    public String toString() {
        return String.format("HeadObjectResult<%s>:\n metadata:%s", super.toString(), this.metadata.toString());
    }
}
