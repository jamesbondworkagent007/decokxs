package com.engagelab.privates.common.utils;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes14.dex */
public class SM4Util {
    private static final int BLOCK = 16;
    private static final int ROUND = 32;
    private static final String TAG = "SM4";
    private static byte[] Sbox = {-42, -112, -23, -2, -52, -31, 61, -73, Ascii.SYN, -74, Ascii.DC4, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, Ascii.VT, 67, -19, -49, -84, 98, -28, -77, Ascii.FS, -87, -55, 8, -24, -107, UnsignedBytes.MAX_POWER_OF_TWO, -33, -108, -6, 117, -113, Utf8.REPLACEMENT_BYTE, -90, 71, 7, -89, -4, -13, 115, Ascii.ETB, -70, -125, 89, 60, Ascii.EM, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, Ascii.SI, 75, 112, 86, -99, 53, Ascii.RS, 36, Ascii.SO, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, SignedBytes.MAX_POWER_OF_TWO, -57, 56, -75, -93, -9, -14, -50, -7, 97, Ascii.NAK, -95, -32, -82, 93, -92, -101, 52, Ascii.SUB, 85, -83, -109, 50, 48, -11, -116, -79, -29, Ascii.GS, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, Ascii.CR, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, Ascii.ESC, -81, -110, -69, -35, -68, 127, 17, -39, 92, 65, Ascii.US, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, Ascii.DC2, -72, -27, -76, -80, -119, 105, -105, 74, Ascii.FF, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, Ascii.CAN, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};
    private static int[] CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int ByteSub(int i) {
        byte[] bArr = Sbox;
        return (bArr[i & 255] & UnsignedBytes.MAX_VALUE) | ((bArr[(i >>> 24) & 255] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[(i >>> 16) & 255] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[(i >>> 8) & 255] & UnsignedBytes.MAX_VALUE) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int L1(int i) {
        int iRotl = Rotl(i, 2);
        int iRotl2 = Rotl(i, 10);
        int iRotl3 = Rotl(i, 18);
        return (((i ^ iRotl) ^ iRotl2) ^ iRotl3) ^ Rotl(i, 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int L2(int i) {
        int iRotl = Rotl(i, 13);
        return (i ^ iRotl) ^ Rotl(i, 23);
    }

    private static int Rotl(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void cbcXor(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] decode(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("key's length should be 16");
        }
        if (bArr3 != null && bArr3.length != 16) {
            bArr3 = null;
        }
        int[] iArrSm4KeyExt = sm4KeyExt(bArr2, true);
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[bArr.length];
        int i = 0;
        while (true) {
            int i2 = i + 16;
            if (i2 > bArr.length) {
                return revertPkcs7Padding(bArr6);
            }
            System.arraycopy(bArr, i, bArr4, 0, 16);
            sm4Crypt(bArr4, bArr5, iArrSm4KeyExt);
            if (bArr3 != null) {
                cbcXor(bArr5, bArr3);
            } else {
                bArr3 = new byte[16];
            }
            System.arraycopy(bArr, i, bArr3, 0, 16);
            System.arraycopy(bArr5, 0, bArr6, i, 16);
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] decryptBytes(byte[] bArr, String str) throws Exception {
        return decode(bArr, hexStringToByte(str), str.substring(0, 16).getBytes("utf-8"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] encode(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("key's length should be 16");
        }
        if (bArr3 != null && bArr3.length != 16) {
            bArr3 = null;
        }
        byte[] bArrPkcs7padding = pkcs7padding(bArr);
        int[] iArrSm4KeyExt = sm4KeyExt(bArr2, false);
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[bArrPkcs7padding.length];
        int i = 0;
        while (true) {
            int i2 = i + 16;
            if (i2 > bArrPkcs7padding.length) {
                return bArr5;
            }
            System.arraycopy(bArrPkcs7padding, i, bArr4, 0, 16);
            if (bArr3 != null) {
                cbcXor(bArr4, bArr3);
            } else {
                bArr3 = new byte[16];
            }
            sm4Crypt(bArr4, bArr3, iArrSm4KeyExt);
            System.arraycopy(bArr3, 0, bArr5, i, bArr3.length);
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] encryptBytes(byte[] bArr, String str, String str2) throws Exception {
        return encode(bArr, hexStringToByte(str), str2.getBytes("utf-8"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] hexStringToByte(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] charArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (toByte(charArray[i2 + 1]) | (toByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static byte[] pkcs7padding(byte[] bArr) {
        int length = 16 - (bArr.length % 16);
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + length);
        for (int i = 0; i < length; i++) {
            bArrCopyOf[bArr.length + i] = (byte) length;
        }
        return bArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static byte[] revertPkcs7Padding(byte[] bArr) {
        int length = bArr.length - bArr[bArr.length - 1];
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void sm4Crypt(byte[] bArr, byte[] bArr2, int[] iArr) {
        int[] iArrL3 = L3(bArr);
        for (int i = 0; i < 32; i += 4) {
            int iL1 = iArrL3[0] ^ L1(ByteSub(((iArrL3[1] ^ iArrL3[2]) ^ iArrL3[3]) ^ iArr[i]));
            iArrL3[0] = iL1;
            int iL12 = L1(ByteSub((iL1 ^ (iArrL3[2] ^ iArrL3[3])) ^ iArr[i + 1])) ^ iArrL3[1];
            iArrL3[1] = iL12;
            int iL13 = L1(ByteSub((iL12 ^ (iArrL3[3] ^ iArrL3[0])) ^ iArr[i + 2])) ^ iArrL3[2];
            iArrL3[2] = iL13;
            iArrL3[3] = L1(ByteSub((iL13 ^ (iArrL3[1] ^ iArrL3[0])) ^ iArr[i + 3])) ^ iArrL3[3];
        }
        for (int i2 = 0; i2 < 16; i2 += 4) {
            int i3 = iArrL3[3 - (i2 / 4)];
            bArr2[i2] = (byte) ((i3 >>> 24) & 255);
            bArr2[i2 + 1] = (byte) ((i3 >>> 16) & 255);
            bArr2[i2 + 2] = (byte) ((i3 >>> 8) & 255);
            bArr2[i2 + 3] = (byte) (i3 & 255);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int[] sm4KeyExt(byte[] bArr, boolean z) {
        int[] iArrL3 = L3(bArr);
        iArrL3[0] = iArrL3[0] ^ (-1548633402);
        iArrL3[1] = iArrL3[1] ^ 1453994832;
        iArrL3[2] = iArrL3[2] ^ 1736282519;
        iArrL3[3] = iArrL3[3] ^ (-1301273892);
        int[] iArr = new int[32];
        for (int i = 0; i < 32; i += 4) {
            int iL2 = iArrL3[0] ^ L2(ByteSub(((iArrL3[1] ^ iArrL3[2]) ^ iArrL3[3]) ^ CK[i]));
            iArrL3[0] = iL2;
            iArr[i] = iL2;
            int i2 = i + 1;
            int iL22 = iArrL3[1] ^ L2(ByteSub(((iArrL3[2] ^ iArrL3[3]) ^ iArrL3[0]) ^ CK[i2]));
            iArrL3[1] = iL22;
            iArr[i2] = iL22;
            int i3 = i + 2;
            int iL23 = iArrL3[2] ^ L2(ByteSub(((iArrL3[3] ^ iArrL3[0]) ^ iArrL3[1]) ^ CK[i3]));
            iArrL3[2] = iL23;
            iArr[i3] = iL23;
            int i4 = i + 3;
            int iL24 = iArrL3[3] ^ L2(ByteSub(((iArrL3[0] ^ iArrL3[1]) ^ iArrL3[2]) ^ CK[i4]));
            iArrL3[3] = iL24;
            iArr[i4] = iL24;
        }
        if (z) {
            for (int i5 = 0; i5 < 16; i5++) {
                int i6 = iArr[i5];
                int i7 = 31 - i5;
                iArr[i5] = iArr[i7];
                iArr[i7] = i6;
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int toByte(char c) {
        return (byte) "0123456789abcdef".indexOf(c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String toHexString(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("this byteArray must not be null or empty");
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = b & UnsignedBytes.MAX_VALUE;
            if (i < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString().toLowerCase();
    }

    private static int[] L3(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 4;
            iArr[i] = (bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
        }
        return iArr;
    }

    public static byte[] decryptBytes(byte[] bArr, String str, String str2) throws Exception {
        return decode(bArr, hexStringToByte(str), str2.getBytes("utf-8"));
    }
}
