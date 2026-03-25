package org.spongycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import okio.Utf8;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes25.dex */
public class SM4Engine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private final int[] X = new int[4];
    private int[] rk;
    private static final byte[] Sbox = {-42, -112, -23, -2, -52, -31, 61, -73, Ascii.SYN, -74, Ascii.DC4, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, Ascii.VT, 67, -19, -49, -84, 98, -28, -77, Ascii.FS, -87, -55, 8, -24, -107, UnsignedBytes.MAX_POWER_OF_TWO, -33, -108, -6, 117, -113, Utf8.REPLACEMENT_BYTE, -90, 71, 7, -89, -4, -13, 115, Ascii.ETB, -70, -125, 89, 60, Ascii.EM, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, Ascii.SI, 75, 112, 86, -99, 53, Ascii.RS, 36, Ascii.SO, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, SignedBytes.MAX_POWER_OF_TWO, -57, 56, -75, -93, -9, -14, -50, -7, 97, Ascii.NAK, -95, -32, -82, 93, -92, -101, 52, Ascii.SUB, 85, -83, -109, 50, 48, -11, -116, -79, -29, Ascii.GS, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, Ascii.CR, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, Ascii.ESC, -81, -110, -69, -35, -68, 127, 17, -39, 92, 65, Ascii.US, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, Ascii.DC2, -72, -27, -76, -80, -119, 105, -105, 74, Ascii.FF, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, Ascii.CAN, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};
    private static final int[] CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};
    private static final int[] FK = {-1548633402, 1453994832, 1736282519, -1301273892};

    private int rotateLeft(int i, int i2) {
        return (i << i2) | (i >>> (-i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    private int tau(int i) {
        byte[] bArr = Sbox;
        return (bArr[i & 255] & UnsignedBytes.MAX_VALUE) | ((bArr[(i >> 24) & 255] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[(i >> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[(i >> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8);
    }

    private int L_ap(int i) {
        int iRotateLeft = rotateLeft(i, 13);
        return (i ^ iRotateLeft) ^ rotateLeft(i, 23);
    }

    private int T_ap(int i) {
        return L_ap(tau(i));
    }

    private int[] expandKey(boolean z, byte[] bArr) {
        int[] iArr = new int[32];
        int[] iArr2 = {Pack.bigEndianToInt(bArr, 0), Pack.bigEndianToInt(bArr, 4), Pack.bigEndianToInt(bArr, 8), Pack.bigEndianToInt(bArr, 12)};
        int i = iArr2[0];
        int[] iArr3 = FK;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        if (z) {
            int i2 = iArr4[0];
            int i3 = iArr4[1];
            int i4 = iArr4[2];
            int i5 = iArr4[3];
            int[] iArr5 = CK;
            int iT_ap = i2 ^ T_ap(((i3 ^ i4) ^ i5) ^ iArr5[0]);
            iArr[0] = iT_ap;
            int iT_ap2 = T_ap((iT_ap ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = iT_ap2;
            int iT_ap3 = T_ap((iT_ap2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = iT_ap3;
            iArr[3] = iArr4[3] ^ T_ap(((iArr[0] ^ iArr[1]) ^ iT_ap3) ^ iArr5[3]);
            for (int i6 = 4; i6 < 32; i6++) {
                iArr[i6] = iArr[i6 - 4] ^ T_ap(((iArr[i6 - 3] ^ iArr[i6 - 2]) ^ iArr[i6 - 1]) ^ CK[i6]);
            }
        } else {
            int i7 = iArr4[0];
            int i8 = iArr4[1];
            int i9 = iArr4[2];
            int i10 = iArr4[3];
            int[] iArr6 = CK;
            int iT_ap4 = i7 ^ T_ap(iArr6[0] ^ ((i8 ^ i9) ^ i10));
            iArr[31] = iT_ap4;
            int iT_ap5 = T_ap((iT_ap4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr6[1]) ^ iArr4[1];
            iArr[30] = iT_ap5;
            int iT_ap6 = T_ap((iT_ap5 ^ (iArr4[3] ^ iArr[31])) ^ iArr6[2]) ^ iArr4[2];
            iArr[29] = iT_ap6;
            iArr[28] = iArr4[3] ^ T_ap((iT_ap6 ^ (iArr[31] ^ iArr[30])) ^ iArr6[3]);
            for (int i11 = 27; i11 >= 0; i11--) {
                iArr[i11] = iArr[i11 + 4] ^ T_ap(((iArr[i11 + 3] ^ iArr[i11 + 2]) ^ iArr[i11 + 1]) ^ CK[31 - i11]);
            }
        }
        return iArr;
    }

    private int L(int i) {
        int iRotateLeft = rotateLeft(i, 2);
        int iRotateLeft2 = rotateLeft(i, 10);
        int iRotateLeft3 = rotateLeft(i, 18);
        return (((i ^ iRotateLeft) ^ iRotateLeft2) ^ iRotateLeft3) ^ rotateLeft(i, 24);
    }

    private int T(int i) {
        return L(tau(i));
    }

    private void R(int[] iArr, int i) {
        int i2 = i + 1;
        int i3 = i + 2;
        int i4 = i + 3;
        int i5 = iArr[i] ^ iArr[i4];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        iArr[i4] = i6;
        iArr[i] = iArr[i] ^ i6;
        int i7 = iArr[i2] ^ iArr[i3];
        iArr[i2] = i7;
        int i8 = i7 ^ iArr[i3];
        iArr[i3] = i8;
        iArr[i2] = i8 ^ iArr[i2];
    }

    private int F0(int[] iArr, int i) {
        return T((iArr[3] ^ (iArr[1] ^ iArr[2])) ^ i) ^ iArr[0];
    }

    private int F1(int[] iArr, int i) {
        return T((iArr[0] ^ (iArr[2] ^ iArr[3])) ^ i) ^ iArr[1];
    }

    private int F2(int[] iArr, int i) {
        return T((iArr[1] ^ (iArr[3] ^ iArr[0])) ^ i) ^ iArr[2];
    }

    private int F3(int[] iArr, int i) {
        return T((iArr[2] ^ (iArr[0] ^ iArr[1])) ^ i) ^ iArr[3];
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            if (key.length != 16) {
                throw new IllegalArgumentException("SM4 requires a 128 bit key");
            }
            this.rk = expandKey(z, key);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to SM4 init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        if (this.rk == null) {
            throw new IllegalStateException("SM4 not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        this.X[0] = Pack.bigEndianToInt(bArr, i);
        this.X[1] = Pack.bigEndianToInt(bArr, i + 4);
        this.X[2] = Pack.bigEndianToInt(bArr, i + 8);
        this.X[3] = Pack.bigEndianToInt(bArr, i + 12);
        for (int i3 = 0; i3 < 32; i3 += 4) {
            int[] iArr = this.X;
            iArr[0] = F0(iArr, this.rk[i3]);
            int[] iArr2 = this.X;
            iArr2[1] = F1(iArr2, this.rk[i3 + 1]);
            int[] iArr3 = this.X;
            iArr3[2] = F2(iArr3, this.rk[i3 + 2]);
            int[] iArr4 = this.X;
            iArr4[3] = F3(iArr4, this.rk[i3 + 3]);
        }
        R(this.X, 0);
        Pack.intToBigEndian(this.X[0], bArr2, i2);
        Pack.intToBigEndian(this.X[1], bArr2, i2 + 4);
        Pack.intToBigEndian(this.X[2], bArr2, i2 + 8);
        Pack.intToBigEndian(this.X[3], bArr2, i2 + 12);
        return 16;
    }
}
