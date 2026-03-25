package com.okinc.ok_kyc_core.data.lca;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaMissedKeyException extends Throwable {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public LcaMissedKeyException(String str) {
        super(str);
        this.message = str;
    }
}
