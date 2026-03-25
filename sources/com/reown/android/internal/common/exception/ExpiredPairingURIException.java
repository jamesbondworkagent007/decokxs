package com.reown.android.internal.common.exception;

/* JADX INFO: loaded from: classes12.dex */
public final class ExpiredPairingURIException extends WalletConnectException {
    public final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.exception.WalletConnectException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public ExpiredPairingURIException(String str) {
        super(str);
        this.message = str;
    }
}
