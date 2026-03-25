package org.spongycastle.pqc.crypto.newhope;

import android.R;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import okio.Utf8;
import org.bouncycastle.crypto.hpke.HPKE;
import org.spongycastle.crypto.digests.SHAKEDigest;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes25.dex */
class Poly {
    public static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 1024; i++) {
            sArr3[i] = Reduce.barrett((short) (sArr[i] + sArr2[i]));
        }
    }

    public static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            int i2 = i * 7;
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 1];
            byte b3 = bArr[i2 + 2];
            byte b4 = bArr[i2 + 3];
            byte b5 = bArr[i2 + 4];
            byte b6 = bArr[i2 + 5];
            byte b7 = bArr[i2 + 6];
            int i3 = i * 4;
            sArr[i3] = (short) ((b & UnsignedBytes.MAX_VALUE) | ((b2 & Utf8.REPLACEMENT_BYTE) << 8));
            sArr[i3 + 1] = (short) (((b2 & UnsignedBytes.MAX_VALUE) >>> 6) | ((b3 & UnsignedBytes.MAX_VALUE) << 2) | ((b4 & Ascii.SI) << 10));
            sArr[i3 + 2] = (short) (((b4 & UnsignedBytes.MAX_VALUE) >>> 4) | ((b5 & UnsignedBytes.MAX_VALUE) << 4) | ((b6 & 3) << 12));
            sArr[i3 + 3] = (short) (((b7 & UnsignedBytes.MAX_VALUE) << 6) | ((b6 & UnsignedBytes.MAX_VALUE) >>> 2));
        }
    }

    public static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    public static void getNoise(short[] sArr, byte[] bArr, byte b) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b;
        byte[] bArr3 = new byte[4096];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 4096);
        for (int i = 0; i < 1024; i++) {
            int iBigEndianToInt = Pack.bigEndianToInt(bArr3, i * 4);
            int i2 = 0;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 += (iBigEndianToInt >> i3) & R.attr.cacheColorHint;
            }
            sArr[i] = (short) (((((i2 >>> 24) + i2) & 255) + 12289) - (((i2 >>> 16) + (i2 >>> 8)) & 255));
        }
    }

    public static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i = 0; i < 1024; i++) {
            sArr3[i] = Reduce.montgomery((sArr[i] & HPKE.aead_EXPORT_ONLY) * (Reduce.montgomery((sArr2[i] & HPKE.aead_EXPORT_ONLY) * 3186) & HPKE.aead_EXPORT_ONLY));
        }
    }

    public static void toBytes(byte[] bArr, short[] sArr) {
        for (int i = 0; i < 256; i++) {
            int i2 = i * 4;
            short sNormalize = normalize(sArr[i2]);
            short sNormalize2 = normalize(sArr[i2 + 1]);
            short sNormalize3 = normalize(sArr[i2 + 2]);
            short sNormalize4 = normalize(sArr[i2 + 3]);
            int i3 = i * 7;
            bArr[i3] = (byte) sNormalize;
            bArr[i3 + 1] = (byte) ((sNormalize >> 8) | (sNormalize2 << 6));
            bArr[i3 + 2] = (byte) (sNormalize2 >> 2);
            bArr[i3 + 3] = (byte) ((sNormalize2 >> 10) | (sNormalize3 << 4));
            bArr[i3 + 4] = (byte) (sNormalize3 >> 4);
            bArr[i3 + 5] = (byte) ((sNormalize3 >> 12) | (sNormalize4 << 2));
            bArr[i3 + 6] = (byte) (sNormalize4 >> 6);
        }
    }

    public static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    public static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i2 = 0; i2 < 256; i2 += 2) {
                int i3 = ((bArr2[i2] & UnsignedBytes.MAX_VALUE) | ((bArr2[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8)) & 16383;
                if (i3 < 12289) {
                    int i4 = i + 1;
                    sArr[i] = (short) i3;
                    if (i4 == 1024) {
                        return;
                    } else {
                        i = i4;
                    }
                }
            }
        }
    }

    private static short normalize(short s) {
        short sBarrett = Reduce.barrett(s);
        int i = sBarrett - 12289;
        return (short) (((sBarrett ^ i) & (i >> 31)) ^ i);
    }
}
