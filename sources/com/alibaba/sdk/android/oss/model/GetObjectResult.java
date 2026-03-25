package com.alibaba.sdk.android.oss.model;

import com.alibaba.sdk.android.oss.internal.CheckCRC64DownloadInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class GetObjectResult extends OSSResult {
    private long contentLength;
    private ObjectMetadata metadata = new ObjectMetadata();
    private InputStream objectContent;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getContentLength() {
        return this.contentLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputStream getObjectContent() {
        return this.objectContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setContentLength(long j) {
        this.contentLength = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectContent(InputStream inputStream) {
        this.objectContent = inputStream;
    }

    @Override // com.alibaba.sdk.android.oss.model.OSSResult
    public Long getClientCRC() {
        InputStream inputStream = this.objectContent;
        if (inputStream != null && (inputStream instanceof CheckCRC64DownloadInputStream)) {
            return Long.valueOf(((CheckCRC64DownloadInputStream) inputStream).getClientCRC64());
        }
        return super.getClientCRC();
    }
}
