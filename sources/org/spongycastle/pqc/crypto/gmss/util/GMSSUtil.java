package org.spongycastle.pqc.crypto.gmss.util;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes25.dex */
public class GMSSUtil {
    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] intToBytesLittleEndian(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public boolean testPowerOfTwo(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
        }
        return i == i2;
    }

    public int bytesToIntLittleEndian(byte[] bArr) {
        return ((bArr[3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[0] & UnsignedBytes.MAX_VALUE) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public int bytesToIntLittleEndian(byte[] bArr, int i) {
        byte b = bArr[i];
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | (b & UnsignedBytes.MAX_VALUE) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public byte[] concatenateArray(byte[][] bArr) {
        byte[] bArr2 = new byte[bArr.length * bArr[0].length];
        int length = 0;
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr3 = bArr[i];
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr[i].length;
        }
        return bArr2;
    }

    public void printArray(String str, byte[][] bArr) {
        System.out.println(str);
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                System.out.println(i + "; " + ((int) bArr2[i2]));
                i++;
            }
        }
    }

    public void printArray(String str, byte[] bArr) {
        System.out.println(str);
        int i = 0;
        for (byte b : bArr) {
            System.out.println(i + "; " + ((int) b));
            i++;
        }
    }
}
