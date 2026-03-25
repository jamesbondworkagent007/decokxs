package com.bytedance.applog.network;

/* JADX INFO: loaded from: classes2.dex */
public class RangersHttpTimeoutException extends RangersHttpException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RangersHttpTimeoutException(String str) {
        super(408, str);
    }
}
