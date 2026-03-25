package com.reown.sign.common.exceptions;

import com.reown.android.internal.common.exception.WalletConnectException;

/* JADX INFO: loaded from: classes24.dex */
public final class InvalidRequestException extends WalletConnectException {
    public final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.exception.WalletConnectException, java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public InvalidRequestException(String str) {
        super(str);
        this.message = str;
    }
}
