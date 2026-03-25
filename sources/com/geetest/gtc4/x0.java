package com.geetest.gtc4;

/* JADX INFO: loaded from: classes21.dex */
public final class x0 extends RuntimeException {
    public static final int CODE_CANT_PARSE_CERT = -4;
    public static final int CODE_CERT_NOT_TRUSTED = -3;
    public static final int CODE_DEVICEIDS_UNAVAILABLE = -6;
    public static final int CODE_NOT_SUPPORT = -2;
    public static final int CODE_STRONGBOX_UNAVAILABLE = -5;
    public static final int CODE_SYSTEM_TOO_OLD = -7;
    public static final int CODE_UNKNOWN = -1;
    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x0(int i, Throwable th) {
        super(th);
        this.code = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getCode() {
        return this.code;
    }
}
