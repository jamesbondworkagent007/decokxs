package com.amplifyframework.api.aws;

import android.os.Handler;
import android.os.Looper;
import com.amplifyframework.api.ApiException;

/* JADX INFO: loaded from: classes21.dex */
final class TimeoutWatchdog {
    private final Handler handler = new Handler(Looper.getMainLooper());
    private long timeoutMs = -1;
    private Runnable timeoutAction = null;

    public void start(Runnable runnable, long j) throws ApiException {
        synchronized (this) {
            if (runnable == null) {
                throw new ApiException("Passed null action to watchdog.", "Sorry, we don't have a suggested fix for this error yet.");
            }
            if (j <= 0) {
                throw new ApiException("timeoutMs must be > 0.", "Make sure you didn't set a negative timeout");
            }
            stop();
            this.timeoutMs = j;
            this.timeoutAction = runnable;
            this.handler.postDelayed(runnable, j);
        }
    }

    public void reset() {
        synchronized (this) {
            Runnable runnable = this.timeoutAction;
            if (runnable != null) {
                this.handler.removeCallbacks(runnable);
                this.handler.postDelayed(this.timeoutAction, this.timeoutMs);
            }
        }
    }

    public void stop() {
        synchronized (this) {
            Runnable runnable = this.timeoutAction;
            if (runnable != null) {
                this.handler.removeCallbacks(runnable);
            }
            this.timeoutAction = null;
            this.timeoutMs = -1L;
        }
    }
}
