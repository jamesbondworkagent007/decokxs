package com.alibaba.sdk.android.oss;

import com.alibaba.sdk.android.oss.common.OSSLog;

/* JADX INFO: loaded from: classes2.dex */
public class ClientException extends Exception {
    private Boolean canceled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Boolean isCanceledException() {
        return this.canceled;
    }

    public ClientException() {
        this.canceled = Boolean.FALSE;
    }

    public ClientException(String str) {
        super("[ErrorMessage]: " + str);
        this.canceled = Boolean.FALSE;
    }

    public ClientException(Throwable th) {
        super(th);
        this.canceled = Boolean.FALSE;
    }

    public ClientException(String str, Throwable th) {
        this(str, th, Boolean.FALSE);
    }

    public ClientException(String str, Throwable th, Boolean bool) {
        super("[ErrorMessage]: " + str, th);
        this.canceled = bool;
        OSSLog.logThrowable2Local(this);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (getCause() == null) {
            return message;
        }
        return getCause().getMessage() + "\n" + message;
    }
}
