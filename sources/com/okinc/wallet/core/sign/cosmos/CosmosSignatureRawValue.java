package com.okinc.wallet.core.sign.cosmos;

import com.okinc.wallet.core.sign.SignatureRawValue;

/* JADX INFO: loaded from: classes12.dex */
public final class CosmosSignatureRawValue extends SignatureRawValue {
    public static final int $stable = 8;
    private String publicKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicKey(String str) {
        this.publicKey = str;
    }

    public CosmosSignatureRawValue(String str, String str2, String str3) {
        super(str2, str3);
        this.publicKey = str;
    }
}
