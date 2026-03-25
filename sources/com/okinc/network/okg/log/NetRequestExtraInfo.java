package com.okinc.network.okg.log;

import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public final class NetRequestExtraInfo {
    public static final int $stable = 8;
    private Long decompressedResponseSize;
    private HttpUrl realUrl;
    private int retryCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDecompressedResponseSize() {
        return this.decompressedResponseSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HttpUrl getRealUrl() {
        return this.realUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecompressedResponseSize(Long l) {
        this.decompressedResponseSize = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealUrl(HttpUrl httpUrl) {
        this.realUrl = httpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRetryCount(int i) {
        this.retryCount = i;
    }
}
