package com.bytedance.applog.network;

/* JADX INFO: loaded from: classes2.dex */
public class RangersHttpException extends Exception {
    public int mResponseCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RangersHttpException(int i, String str) {
        super(str);
        this.mResponseCode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RangersHttpException(int i, Throwable th) {
        super(th);
        this.mResponseCode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getResponseCode() {
        return this.mResponseCode;
    }
}
