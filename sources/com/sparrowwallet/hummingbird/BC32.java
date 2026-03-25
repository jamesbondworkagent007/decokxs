package com.sparrowwallet.hummingbird;

import com.google.common.primitives.UnsignedBytes;
import com.sparrowwallet.hummingbird.BC32DecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class BC32 {
    private static final String CHARSET = "qpzry9x8gf2tvdw0s3jn54khce6mua7l";

    private static int polymod(byte[] bArr) {
        int i = 1;
        for (byte b : bArr) {
            int i2 = i >>> 25;
            i = ((i & 33554431) << 5) ^ (b & UnsignedBytes.MAX_VALUE);
            if ((i2 & 1) != 0) {
                i ^= 996825010;
            }
            if ((i2 & 2) != 0) {
                i ^= 642813549;
            }
            if ((i2 & 4) != 0) {
                i ^= 513874426;
            }
            if ((i2 & 8) != 0) {
                i ^= 1027748829;
            }
            if ((i2 & 16) != 0) {
                i ^= 705979059;
            }
        }
        return i;
    }

    private static boolean verifyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(new byte[]{0}, 0, bArr2, 0, 1);
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        return polymod(bArr2) == 1073741823;
    }

    private static byte[] createChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 7];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        int iPolymod = polymod(bArr2);
        byte[] bArr3 = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr3[i] = (byte) (((1073741823 ^ iPolymod) >>> ((5 - i) * 5)) & 31);
        }
        return bArr3;
    }

    public static String encode(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        byte[] bArrConvertBits = convertBits(arrayList, 8, 5, true);
        byte[] bArrCreateChecksum = createChecksum(bArrConvertBits);
        int length = bArrConvertBits.length + bArrCreateChecksum.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrConvertBits, 0, bArr2, 0, bArrConvertBits.length);
        System.arraycopy(bArrCreateChecksum, 0, bArr2, bArrConvertBits.length, bArrCreateChecksum.length);
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARSET.charAt(bArr2[i]));
        }
        return sb.toString();
    }

    public static byte[] decode(String str) {
        if (str.length() < 6) {
            throw new BC32DecoderException.InvalidDataLength("Input too short: " + str.length());
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new BC32DecoderException.InvalidCharacter(cCharAt, i);
            }
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                if (z2) {
                    throw new BC32DecoderException.InvalidCharacter(cCharAt, i);
                }
                z = true;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                if (z) {
                    throw new BC32DecoderException.InvalidCharacter(cCharAt, i);
                }
                z2 = true;
            }
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt2 = str.charAt(i2);
            if (CHARSET.indexOf(cCharAt2) == -1) {
                throw new IllegalArgumentException("BC32 characters  out of range");
            }
            bArr[i2] = (byte) CHARSET.indexOf(cCharAt2);
        }
        if (!verifyChecksum(bArr)) {
            throw new BC32DecoderException.InvalidChecksum();
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length - 6);
        ArrayList arrayList = new ArrayList();
        for (byte b : bArrCopyOfRange) {
            arrayList.add(Byte.valueOf(b));
        }
        return convertBits(arrayList, 5, 8, false);
    }

    private static byte[] convertBits(List<Byte> list, int i, int i2, boolean z) {
        int i3 = (1 << i2) - 1;
        ArrayList arrayList = new ArrayList();
        Iterator<Byte> it = list.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            short sByteValue = (short) (it.next().byteValue() & UnsignedBytes.MAX_VALUE);
            if ((sByteValue >> i) > 0) {
                throw new IllegalArgumentException("Illegal bytes for bc32 encoding");
            }
            i5 = (i5 << i) | sByteValue;
            i4 += i;
            while (i4 >= i2) {
                i4 -= i2;
                arrayList.add(Byte.valueOf((byte) ((i5 >> i4) & i3)));
            }
        }
        if (z && i4 > 0) {
            arrayList.add(Byte.valueOf((byte) ((i5 << (i2 - i4)) & i3)));
        } else if (i4 >= i || ((byte) ((i5 << (i2 - i4)) & i3)) != 0) {
            throw new IllegalArgumentException("Illegal bytes for bc32 encoding");
        }
        Object[] array = arrayList.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            bArr[i6] = ((Number) array[i6]).byteValue();
        }
        return bArr;
    }
}
