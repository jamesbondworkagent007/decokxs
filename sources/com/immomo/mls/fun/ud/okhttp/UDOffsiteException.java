package com.immomo.mls.fun.ud.okhttp;

/* JADX INFO: loaded from: classes14.dex */
public final class UDOffsiteException extends Exception {
    public static final int $stable = 8;
    private String code;
    private String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(String str) {
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(String str) {
        this.msg = str;
    }

    public UDOffsiteException(String str, String str2) {
        super(str);
        this.msg = str;
        this.code = str2;
    }
}
