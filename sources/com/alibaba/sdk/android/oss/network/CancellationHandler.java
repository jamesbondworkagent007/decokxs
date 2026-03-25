package com.alibaba.sdk.android.oss.network;

import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public class CancellationHandler {
    private volatile Call call;
    private volatile boolean isCancelled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isCancelled() {
        return this.isCancelled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCall(Call call) {
        this.call = call;
    }

    public void cancel() {
        if (this.call != null) {
            this.call.cancel();
        }
        this.isCancelled = true;
    }
}
