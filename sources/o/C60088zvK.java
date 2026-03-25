package o;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;

/* JADX INFO: renamed from: o.zvK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60088zvK {
    public static final char[] AEQbTJ = "0123456789abcdef".toCharArray();

    private C60088zvK() {
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        return EZpvd(str) ? str.substring(2) : str;
    }

    public static boolean EZpvd(java.lang.String str) {
        return !C60090zvM.AEQbTJ(str) && str.length() > 1 && str.charAt(0) == '0' && str.charAt(1) == 'x';
    }

    public static java.math.BigInteger OLrzqt(byte[] bArr) {
        return new java.math.BigInteger(1, bArr);
    }

    public static byte[] AEQbTJ(java.math.BigInteger bigInteger, int i) {
        int i2;
        int length;
        byte[] bArr = new byte[i];
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            length = byteArray.length - 1;
            i2 = 1;
        } else {
            i2 = 0;
            length = byteArray.length;
        }
        if (length > i) {
            throw new java.lang.RuntimeException("Input is too large to put in byte array of size " + i);
        }
        java.lang.System.arraycopy(byteArray, i2, bArr, i - length, length);
        return bArr;
    }

    public static byte[] copydefault(java.lang.String str) {
        byte[] bArr;
        java.lang.String strKWHzl = KWHzl(str);
        int length = strKWHzl.length();
        int i = 0;
        if (length == 0) {
            return new byte[0];
        }
        if (length % 2 != 0) {
            bArr = new byte[(length / 2) + 1];
            bArr[0] = (byte) java.lang.Character.digit(strKWHzl.charAt(0), 16);
            i = 1;
        } else {
            bArr = new byte[length / 2];
        }
        while (i < length) {
            int i2 = i + 1;
            bArr[i2 / 2] = (byte) ((java.lang.Character.digit(strKWHzl.charAt(i), 16) << 4) + java.lang.Character.digit(strKWHzl.charAt(i2), 16));
            i += 2;
        }
        return bArr;
    }

    public static java.lang.String KWHzl(byte[] bArr, int i, int i2, boolean z) {
        java.lang.String str = new java.lang.String(OLrzqt(bArr, i, i2));
        if (!z) {
            return str;
        }
        return EIP1271Verifier.hexPrefix + str;
    }

    public static char[] OLrzqt(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 << 1];
        int i3 = 0;
        int i4 = i;
        while (i4 < i2 + i) {
            byte b = bArr[i4];
            char[] cArr2 = AEQbTJ;
            cArr[i3] = cArr2[(b & UnsignedBytes.MAX_VALUE) >>> 4];
            cArr[i3 + 1] = cArr2[b & Ascii.SI];
            i4++;
            i3 += 2;
        }
        return cArr;
    }

    public static java.lang.String KWHzl(byte[] bArr) {
        return KWHzl(bArr, 0, bArr.length, true);
    }
}
