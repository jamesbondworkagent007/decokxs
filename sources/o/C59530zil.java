package o;

/* JADX INFO: renamed from: o.zil, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59530zil extends C59528zij {
    public static final void AEQbTJ(long j, byte[] bArr, int i, int i2) {
        int i3 = i + (i2 * 2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = C59479zhn.AEQbTJ()[(int) (255 & j)];
            bArr[i3 - 1] = (byte) i5;
            i3 -= 2;
            bArr[i3] = (byte) (i5 >> 8);
            j >>= 8;
        }
    }

    public static final void AEQbTJ(java.lang.String str, int i) {
        if (str.charAt(i) == '-') {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Expected '-' (hyphen) at index " + i + ", but was '" + str.charAt(i) + '\'').toString());
    }

    public static final void copydefault(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) (j >>> ((7 - i2) * 8));
        }
    }
}
