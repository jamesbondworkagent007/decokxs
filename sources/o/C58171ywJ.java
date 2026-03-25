package o;

/* JADX INFO: renamed from: o.ywJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58171ywJ {
    public static final int[] AEQbTJ;
    public static final char[] OLrzqt;
    public static final char copydefault;

    static {
        char[] charArray = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();
        OLrzqt = charArray;
        int i = 0;
        copydefault = charArray[0];
        int[] iArr = new int[128];
        AEQbTJ = iArr;
        java.util.Arrays.fill(iArr, -1);
        while (true) {
            char[] cArr = OLrzqt;
            if (i >= cArr.length) {
                return;
            }
            AEQbTJ[cArr[i]] = i;
            i++;
        }
    }

    public static java.lang.String OLrzqt(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        int length = bArrCopyOf.length * 2;
        char[] cArr = new char[length];
        int i2 = i;
        int i3 = length;
        while (i2 < bArrCopyOf.length) {
            i3--;
            cArr[i3] = OLrzqt[AEQbTJ(bArrCopyOf, i2, 256, 58)];
            if (bArrCopyOf[i2] == 0) {
                i2++;
            }
        }
        while (i3 < length && cArr[i3] == copydefault) {
            i3++;
        }
        while (true) {
            i--;
            if (i >= 0) {
                i3--;
                cArr[i3] = copydefault;
            } else {
                return new java.lang.String(cArr, i3, length - i3);
            }
        }
    }

    public static byte[] copydefault(java.lang.String str) {
        int i = 0;
        if (str.length() == 0) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            int i3 = cCharAt < 128 ? AEQbTJ[cCharAt] : -1;
            if (i3 < 0) {
                throw new java.lang.IllegalStateException("InvalidCharacter in base 58");
            }
            bArr[i2] = (byte) i3;
        }
        while (i < length && bArr[i] == 0) {
            i++;
        }
        int length2 = str.length();
        byte[] bArr2 = new byte[length2];
        int i4 = length2;
        int i5 = i;
        while (i5 < length) {
            i4--;
            bArr2[i4] = AEQbTJ(bArr, i5, 58, 256);
            if (bArr[i5] == 0) {
                i5++;
            }
        }
        while (i4 < length2 && bArr2[i4] == 0) {
            i4++;
        }
        return java.util.Arrays.copyOfRange(bArr2, i4 - i, length2);
    }

    public static byte AEQbTJ(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < bArr.length) {
            int i5 = (i4 * i2) + (bArr[i] & 255);
            bArr[i] = (byte) (i5 / i3);
            i4 = i5 % i3;
            i++;
        }
        return (byte) i4;
    }
}
