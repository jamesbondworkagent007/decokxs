package com.immomo.mls.utils;

/* JADX INFO: loaded from: classes3.dex */
public class ScriptLoadException extends Exception {
    private int code;
    private String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMsg() {
        return this.msg;
    }

    public ScriptLoadException(int i, String str, Throwable th) {
        super(th);
        this.code = i;
        this.msg = str;
    }

    public ScriptLoadException(ERROR error, Throwable th) {
        this(error.code, error.msg, th);
    }
}
