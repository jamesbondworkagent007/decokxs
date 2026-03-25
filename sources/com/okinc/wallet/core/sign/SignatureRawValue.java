package com.okinc.wallet.core.sign;

/* JADX INFO: loaded from: classes12.dex */
public class SignatureRawValue {
    public static final int $stable = 8;
    private String rawDataHex;
    private String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawDataHex() {
        return this.rawDataHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRawDataHex(String str) {
        this.rawDataHex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(String str) {
        this.signature = str;
    }

    public SignatureRawValue(String str, String str2) {
        this.rawDataHex = str;
        this.signature = str2;
    }
}
