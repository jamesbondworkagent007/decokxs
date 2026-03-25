package com.okinc.business.defi.biz.core.error;

/* JADX INFO: loaded from: classes14.dex */
public final class WalletDataError extends OKWException {
    public static final int $stable = 0;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.error.OKWException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public WalletDataError(String str) {
        super(str, null);
        this.message = str;
    }
}
