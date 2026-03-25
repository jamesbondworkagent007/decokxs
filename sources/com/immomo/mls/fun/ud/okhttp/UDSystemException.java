package com.immomo.mls.fun.ud.okhttp;

/* JADX INFO: loaded from: classes14.dex */
public final class UDSystemException extends Exception {
    public static final int $stable = 8;
    private String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(String str) {
        this.msg = str;
    }

    public UDSystemException(String str) {
        super(str);
        this.msg = str;
    }
}
