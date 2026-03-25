package com.amplitude.core.utilities.http;

import com.google.android.gms.wallet.WalletConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum HttpStatus {
    SUCCESS(200),
    BAD_REQUEST(400),
    TIMEOUT(408),
    PAYLOAD_TOO_LARGE(WalletConstants.ERROR_CODE_UNKNOWN),
    TOO_MANY_REQUESTS(429),
    FAILED(500);

    private final int code;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    HttpStatus(int i) {
        this.code = i;
    }
}
