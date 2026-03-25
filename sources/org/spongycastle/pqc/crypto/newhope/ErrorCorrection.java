package org.spongycastle.pqc.crypto.newhope;

import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes25.dex */
class ErrorCorrection {
    public static int abs(int i) {
        int i2 = i >> 31;
        return (i ^ i2) - i2;
    }

    public static int f(int[] iArr, int i, int i2, int i3) {
        int i4 = (i3 * 2730) >> 25;
        int i5 = i4 - ((12288 - (i3 - (i4 * 12289))) >> 31);
        iArr[i] = (i5 >> 1) + (i5 & 1);
        int i6 = i5 - 1;
        iArr[i2] = (i6 >> 1) + (i6 & 1);
        return abs(i3 - (iArr[i] * 24578));
    }

    public static int g(int i) {
        int i2 = (i * 2730) >> 27;
        int i3 = i2 - ((CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA - (i - (CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA * i2))) >> 31);
        return abs((((i3 >> 1) + (i3 & 1)) * 98312) - i);
    }

    public static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        for (int i = 0; i < 256; i++) {
            int i2 = ((bArr3[i >>> 3] >>> (i & 7)) & 1) * 4;
            int i3 = i + 256;
            int i4 = i + 512;
            int i5 = i + 768;
            int iF = (24577 - (((f(iArr, 0, 4, (sArr2[i] * 8) + i2) + f(iArr, 1, 5, (sArr2[i3] * 8) + i2)) + f(iArr, 2, 6, (sArr2[i4] * 8) + i2)) + f(iArr, 3, 7, (sArr2[i5] * 8) + i2))) >> 31;
            int i6 = ~iF;
            int i7 = iArr[0];
            int i8 = iArr[4];
            int i9 = iArr[1];
            int i10 = iArr[5];
            int i11 = iArr[2];
            int i12 = iArr[6];
            int i13 = (iArr[7] & iF) ^ (iArr[3] & i6);
            sArr[i] = (short) ((((i6 & i7) ^ (i8 & iF)) - i13) & 3);
            sArr[i3] = (short) ((((i9 & i6) ^ (i10 & iF)) - i13) & 3);
            sArr[i4] = (short) ((((i11 & i6) ^ (i12 & iF)) - i13) & 3);
            sArr[i5] = (short) (3 & ((-iF) + (i13 * 2)));
        }
    }

    public static short LDDecode(int i, int i2, int i3, int i4) {
        return (short) (((((g(i) + g(i2)) + g(i3)) + g(i4)) - 98312) >>> 31);
    }

    public static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        for (int i = 0; i < 256; i++) {
            short s = sArr[i];
            short s2 = sArr2[i];
            int i2 = i + 768;
            short s3 = sArr2[i2];
            int i3 = i + 256;
            short s4 = sArr[i3];
            short s5 = sArr2[i3];
            int i4 = i + 512;
            short s6 = sArr[i4];
            short s7 = sArr2[i4];
            short s8 = sArr[i2];
            int i5 = i >>> 3;
            bArr[i5] = (byte) ((LDDecode(((s * 8) + 196624) - (((s2 * 2) + s3) * 12289), ((s4 * 8) + 196624) - (((s5 * 2) + s3) * 12289), ((s6 * 8) + 196624) - (((s7 * 2) + s3) * 12289), ((s8 * 8) + 196624) - (s3 * 12289)) << (i & 7)) | bArr[i5]);
        }
    }
}
