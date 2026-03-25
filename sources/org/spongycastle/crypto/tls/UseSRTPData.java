package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes25.dex */
public class UseSRTPData {
    protected byte[] mki;
    protected int[] protectionProfiles;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getMki() {
        return this.mki;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int[] getProtectionProfiles() {
        return this.protectionProfiles;
    }

    public UseSRTPData(int[] iArr, byte[] bArr) {
        if (iArr == null || iArr.length < 1 || iArr.length >= 32768) {
            throw new IllegalArgumentException("'protectionProfiles' must have length from 1 to (2^15 - 1)");
        }
        if (bArr == null) {
            bArr = TlsUtils.EMPTY_BYTES;
        } else if (bArr.length > 255) {
            throw new IllegalArgumentException("'mki' cannot be longer than 255 bytes");
        }
        this.protectionProfiles = iArr;
        this.mki = bArr;
    }
}
