package org.spongycastle.crypto.engines;

import com.flyco.tablayout.BuildConfig;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.lang.reflect.Array;
import okio.Utf8;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes25.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private static final int m4 = -1061109568;
    private static final int m5 = 1061109567;
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, 49, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, Ascii.DC2, UnsignedBytes.MAX_POWER_OF_TWO, -30, -21, 39, -78, 117, 9, -125, 44, Ascii.SUB, Ascii.ESC, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, SignedBytes.MAX_POWER_OF_TWO, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, Ascii.FF, 19, -20, 95, -105, 68, Ascii.ETB, -60, -89, 126, 61, 100, 93, Ascii.EM, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, Ascii.VT, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, Ascii.FS, -90, -76, -58, -24, -35, 116, Ascii.US, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, Ascii.SO, 97, 53, 87, -71, -122, -63, Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, Ascii.CR, -65, -26, 66, 104, 65, -103, 45, Ascii.SI, -80, 84, -69, Ascii.SYN};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, SignedBytes.MAX_POWER_OF_TWO, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, Ascii.RS, -113, -54, Utf8.REPLACEMENT_BYTE, Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, Ascii.FS, 117, -33, 110, 71, -15, Ascii.SUB, 113, Ascii.GS, 41, -59, -119, 111, -73, 98, Ascii.SO, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, Ascii.US, -35, -88, 51, -120, 7, -57, 49, -79, Ascii.DC2, 16, 89, 39, UnsignedBytes.MAX_POWER_OF_TWO, -20, 95, 96, 81, 127, -87, Ascii.EM, -75, 74, Ascii.CR, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, -42, 38, -31, 105, Ascii.DC4, 99, 85, 33, Ascii.FF, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, 47, 94, 188, 99, 198, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, 53, 106, BuildConfig.VERSION_CODE, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, 250, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};

    private static int FFmulX(int i) {
        return ((i & m2) << 1) ^ (((m1 & i) >>> 7) * 27);
    }

    private static int FFmulX2(int i) {
        int i2 = m4 & i;
        int i3 = i2 ^ (i2 >>> 1);
        return (((i & m5) << 2) ^ (i3 >>> 2)) ^ (i3 >>> 5);
    }

    private static int shift(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return BouncyCastleKeyManagementRepository.AES;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    private static int mcol(int i) {
        int iShift = shift(i, 8);
        int i2 = i ^ iShift;
        return FFmulX(i2) ^ (iShift ^ shift(i2, 16));
    }

    private static int inv_mcol(int i) {
        int iShift = shift(i, 8) ^ i;
        int iFFmulX = i ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    private static int subWord(int i) {
        byte[] bArr = S;
        return (bArr[(i >> 24) & 255] << Ascii.CAN) | (bArr[i & 255] & UnsignedBytes.MAX_VALUE) | ((bArr[(i >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[(i >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >> 2;
        this.ROUNDS = i + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i + 7, 4);
        if (i == 4) {
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i2 = 1; i2 <= 10; i2++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i2 - 1];
                int[] iArr2 = iArr[i2];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i == 6) {
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt9;
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt10;
            int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iSubWord;
            int i3 = iLittleEndianToInt6 ^ iSubWord;
            iArr3[3] = i3;
            int i4 = iLittleEndianToInt7 ^ i3;
            int[] iArr4 = iArr[2];
            iArr4[0] = i4;
            int i5 = iLittleEndianToInt8 ^ i4;
            iArr4[1] = i5;
            int i6 = iLittleEndianToInt9 ^ i5;
            iArr4[2] = i6;
            int i7 = iLittleEndianToInt10 ^ i6;
            iArr4[3] = i7;
            int i8 = 3;
            int i9 = 2;
            while (i8 < 12) {
                int iSubWord2 = iSubWord ^ (subWord(shift(i7, 8)) ^ i9);
                int[] iArr5 = iArr[i8];
                iArr5[0] = iSubWord2;
                int i10 = i3 ^ iSubWord2;
                iArr5[1] = i10;
                int i11 = i4 ^ i10;
                iArr5[2] = i11;
                int i12 = i5 ^ i11;
                iArr5[3] = i12;
                int i13 = i6 ^ i12;
                int i14 = i8 + 1;
                int[] iArr6 = iArr[i14];
                iArr6[0] = i13;
                int i15 = i7 ^ i13;
                iArr6[1] = i15;
                int i16 = i9 << 2;
                iSubWord = iSubWord2 ^ ((i9 << 1) ^ subWord(shift(i15, 8)));
                int[] iArr7 = iArr[i14];
                iArr7[2] = iSubWord;
                i3 = i10 ^ iSubWord;
                iArr7[3] = i3;
                i4 = i11 ^ i3;
                int[] iArr8 = iArr[i8 + 2];
                iArr8[0] = i4;
                i5 = i12 ^ i4;
                iArr8[1] = i5;
                i6 = i13 ^ i5;
                iArr8[2] = i6;
                i7 = i15 ^ i6;
                iArr8[3] = i7;
                i8 += 3;
                i9 = i16;
            }
            int iSubWord3 = (subWord(shift(i7, 8)) ^ i9) ^ iSubWord;
            int[] iArr9 = iArr[12];
            iArr9[0] = iSubWord3;
            int i17 = iSubWord3 ^ i3;
            iArr9[1] = i17;
            int i18 = i17 ^ i4;
            iArr9[2] = i18;
            iArr9[3] = i18 ^ i5;
        } else if (i == 8) {
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i19 = 2;
            int i20 = 1;
            while (i19 < 14) {
                iLittleEndianToInt11 ^= subWord(shift(iLittleEndianToInt18, 8)) ^ i20;
                int[] iArr10 = iArr[i19];
                iArr10[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr10[1] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr10[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr10[3] = iLittleEndianToInt14;
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr11 = iArr[i19 + 1];
                iArr11[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr11[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr11[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr11[3] = iLittleEndianToInt18;
                i19 += 2;
                i20 <<= 1;
            }
            int iSubWord4 = (subWord(shift(iLittleEndianToInt18, 8)) ^ i20) ^ iLittleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iSubWord4;
            int i21 = iSubWord4 ^ iLittleEndianToInt12;
            iArr12[1] = i21;
            int i22 = i21 ^ iLittleEndianToInt13;
            iArr12[2] = i22;
            iArr12[3] = i22 ^ iLittleEndianToInt14;
        } else {
            throw new IllegalStateException("Should never get here");
        }
        if (!z) {
            for (int i23 = 1; i23 < this.ROUNDS; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr13 = iArr[i23];
                    iArr13[i24] = inv_mcol(iArr13[i24]);
                }
            }
        }
        return iArr;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
            this.forEncryption = z;
        } else {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            unpackBlock(bArr, i);
            encryptBlock(this.WorkingKey);
            packBlock(bArr2, i2);
            return 16;
        }
        unpackBlock(bArr, i);
        decryptBlock(this.WorkingKey);
        packBlock(bArr2, i2);
        return 16;
    }

    private void unpackBlock(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        this.C0 = (b & UnsignedBytes.MAX_VALUE) | ((b2 & UnsignedBytes.MAX_VALUE) << 8) | ((b3 & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i + 3] << Ascii.CAN);
        byte b4 = bArr[i + 4];
        byte b5 = bArr[i + 5];
        byte b6 = bArr[i + 6];
        this.C1 = (b4 & UnsignedBytes.MAX_VALUE) | ((b5 & UnsignedBytes.MAX_VALUE) << 8) | ((b6 & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i + 7] << Ascii.CAN);
        byte b7 = bArr[i + 8];
        byte b8 = bArr[i + 9];
        byte b9 = bArr[i + 10];
        this.C2 = (b7 & UnsignedBytes.MAX_VALUE) | ((b8 & UnsignedBytes.MAX_VALUE) << 8) | ((b9 & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i + 11] << Ascii.CAN);
        byte b10 = bArr[i + 12];
        this.C3 = (bArr[i + 15] << Ascii.CAN) | ((bArr[i + 13] & UnsignedBytes.MAX_VALUE) << 8) | (b10 & UnsignedBytes.MAX_VALUE) | ((bArr[i + 14] & UnsignedBytes.MAX_VALUE) << 16);
    }

    private void packBlock(byte[] bArr, int i) {
        int i2 = this.C0;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
        int i3 = this.C1;
        bArr[i + 4] = (byte) i3;
        bArr[i + 5] = (byte) (i3 >> 8);
        bArr[i + 6] = (byte) (i3 >> 16);
        bArr[i + 7] = (byte) (i3 >> 24);
        int i4 = this.C2;
        bArr[i + 8] = (byte) i4;
        bArr[i + 9] = (byte) (i4 >> 8);
        bArr[i + 10] = (byte) (i4 >> 16);
        bArr[i + 11] = (byte) (i4 >> 24);
        int i5 = this.C3;
        bArr[i + 12] = (byte) i5;
        bArr[i + 13] = (byte) (i5 >> 8);
        bArr[i + 14] = (byte) (i5 >> 16);
        bArr[i + 15] = (byte) (i5 >> 24);
    }

    private void encryptBlock(int[][] iArr) {
        int i = this.C0;
        char c = 0;
        int[] iArr2 = iArr[0];
        int i2 = i ^ iArr2[0];
        int i3 = this.C1 ^ iArr2[1];
        int i4 = this.C2 ^ iArr2[2];
        int iMcol = iArr2[3] ^ this.C3;
        int i5 = 1;
        for (int i6 = 1; i5 < this.ROUNDS - i6; i6 = 1) {
            byte[] bArr = S;
            int iMcol2 = mcol((((bArr[i2 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(i3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(i4 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(iMcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][c];
            int iMcol3 = mcol((((bArr[i3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(i4 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(iMcol >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(i2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][i6];
            int iMcol4 = mcol((((bArr[i4 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(iMcol >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(i2 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(i3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][2];
            int iMcol5 = mcol(((((bArr[(i2 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr[iMcol & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr[(i3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(i4 >> 24) & 255] << Ascii.CAN));
            int i7 = i5 + 1;
            int i8 = iMcol5 ^ iArr[i5][3];
            int iMcol6 = mcol((((bArr[iMcol2 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(iMcol3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(iMcol4 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(i8 >> 24) & 255] << Ascii.CAN));
            int i9 = iArr[i7][c];
            int iMcol7 = mcol((((bArr[iMcol3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(iMcol4 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(i8 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(iMcol2 >> 24) & 255] << Ascii.CAN));
            int i10 = iArr[i7][i6];
            int iMcol8 = mcol(((((bArr[(i8 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr[iMcol4 & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr[(iMcol2 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(iMcol3 >> 24) & 255] << Ascii.CAN));
            int i11 = iArr[i7][2];
            i5 += 2;
            iMcol = iArr[i7][3] ^ mcol((((bArr[i8 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(iMcol2 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(iMcol3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(iMcol4 >> 24) & 255] << Ascii.CAN));
            i2 = iMcol6 ^ i9;
            i3 = iMcol7 ^ i10;
            i4 = iMcol8 ^ i11;
            c = 0;
        }
        byte[] bArr2 = S;
        int iMcol9 = mcol((((bArr2[i2 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(i3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(i4 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(iMcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][0];
        int iMcol10 = mcol((((bArr2[i3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(i4 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(iMcol >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(i2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][1];
        int iMcol11 = mcol((((bArr2[i4 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(iMcol >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(i2 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(i3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][2];
        int iMcol12 = mcol(((((bArr2[(i2 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr2[iMcol & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr2[(i3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(i4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][3];
        byte b = bArr2[iMcol9 & 255];
        byte b2 = bArr2[(iMcol10 >> 8) & 255];
        byte b3 = bArr2[(iMcol11 >> 16) & 255];
        byte b4 = bArr2[(iMcol12 >> 24) & 255];
        int[] iArr3 = iArr[i5 + 1];
        this.C0 = ((((b & UnsignedBytes.MAX_VALUE) ^ ((b2 & UnsignedBytes.MAX_VALUE) << 8)) ^ ((b3 & UnsignedBytes.MAX_VALUE) << 16)) ^ (b4 << Ascii.CAN)) ^ iArr3[0];
        this.C1 = ((((bArr2[iMcol10 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(iMcol11 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(iMcol12 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(iMcol9 >> 24) & 255] << Ascii.CAN)) ^ iArr3[1];
        this.C2 = ((((bArr2[iMcol11 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(iMcol12 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(iMcol9 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(iMcol10 >> 24) & 255] << Ascii.CAN)) ^ iArr3[2];
        this.C3 = ((((bArr2[iMcol12 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(iMcol9 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(iMcol10 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(iMcol11 >> 24) & 255] << Ascii.CAN)) ^ iArr3[3];
    }

    private void decryptBlock(int[][] iArr) {
        int i = this.C0;
        int i2 = this.ROUNDS;
        int[] iArr2 = iArr[i2];
        char c = 0;
        int i3 = i ^ iArr2[0];
        int i4 = this.C1 ^ iArr2[1];
        int i5 = this.C2 ^ iArr2[2];
        int i6 = i2 - 1;
        int iInv_mcol = iArr2[3] ^ this.C3;
        for (int i7 = 1; i6 > i7; i7 = 1) {
            byte[] bArr = Si;
            int iInv_mcol2 = inv_mcol((((bArr[i3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(iInv_mcol >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(i5 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(i4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][c];
            int iInv_mcol3 = inv_mcol((((bArr[i4 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(i3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(iInv_mcol >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(i5 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][i7];
            int iInv_mcol4 = inv_mcol((((bArr[i5 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(i4 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(i3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(iInv_mcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][2];
            int iInv_mcol5 = inv_mcol((bArr[(i3 >> 24) & 255] << Ascii.CAN) ^ (((bArr[iInv_mcol & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(i5 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(i4 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)));
            int i8 = i6 - 1;
            int i9 = iInv_mcol5 ^ iArr[i6][3];
            int iInv_mcol6 = inv_mcol((((bArr[iInv_mcol2 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(i9 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(iInv_mcol4 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(iInv_mcol3 >> 24) & 255] << Ascii.CAN));
            int i10 = iArr[i8][c];
            int iInv_mcol7 = inv_mcol((((bArr[iInv_mcol3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(iInv_mcol2 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(i9 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(iInv_mcol4 >> 24) & 255] << Ascii.CAN));
            int i11 = iArr[i8][i7];
            int iInv_mcol8 = inv_mcol(((((bArr[(iInv_mcol3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8) ^ (bArr[iInv_mcol4 & 255] & UnsignedBytes.MAX_VALUE)) ^ ((bArr[(iInv_mcol2 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(i9 >> 24) & 255] << Ascii.CAN));
            int i12 = iArr[i8][2];
            i6 -= 2;
            iInv_mcol = iArr[i8][3] ^ inv_mcol((((bArr[i9 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr[(iInv_mcol4 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr[(iInv_mcol3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr[(iInv_mcol2 >> 24) & 255] << Ascii.CAN));
            i3 = iInv_mcol6 ^ i10;
            i4 = iInv_mcol7 ^ i11;
            i5 = iInv_mcol8 ^ i12;
            c = 0;
        }
        byte[] bArr2 = Si;
        int iInv_mcol9 = inv_mcol((((bArr2[i3 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(iInv_mcol >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(i5 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(i4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][0];
        int iInv_mcol10 = inv_mcol((((bArr2[i4 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(i3 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(iInv_mcol >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(i5 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][1];
        int iInv_mcol11 = inv_mcol((((bArr2[i5 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(i4 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(i3 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(iInv_mcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][2];
        int iInv_mcol12 = inv_mcol((bArr2[(i3 >> 24) & 255] << Ascii.CAN) ^ (((bArr2[iInv_mcol & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(i5 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(i4 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16))) ^ iArr[i6][3];
        byte b = bArr2[iInv_mcol9 & 255];
        byte b2 = bArr2[(iInv_mcol12 >> 8) & 255];
        byte b3 = bArr2[(iInv_mcol11 >> 16) & 255];
        byte b4 = bArr2[(iInv_mcol10 >> 24) & 255];
        int[] iArr3 = iArr[0];
        this.C0 = ((((b & UnsignedBytes.MAX_VALUE) ^ ((b2 & UnsignedBytes.MAX_VALUE) << 8)) ^ ((b3 & UnsignedBytes.MAX_VALUE) << 16)) ^ (b4 << Ascii.CAN)) ^ iArr3[0];
        this.C1 = ((((bArr2[iInv_mcol10 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(iInv_mcol9 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(iInv_mcol12 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(iInv_mcol11 >> 24) & 255] << Ascii.CAN)) ^ iArr3[1];
        this.C2 = ((((bArr2[iInv_mcol11 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(iInv_mcol10 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(iInv_mcol9 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(iInv_mcol12 >> 24) & 255] << Ascii.CAN)) ^ iArr3[2];
        this.C3 = ((((bArr2[iInv_mcol12 & 255] & UnsignedBytes.MAX_VALUE) ^ ((bArr2[(iInv_mcol11 >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8)) ^ ((bArr2[(iInv_mcol10 >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16)) ^ (bArr2[(iInv_mcol9 >> 24) & 255] << Ascii.CAN)) ^ iArr3[3];
    }
}
