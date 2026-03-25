package o;

/* JADX INFO: renamed from: o.ywL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58173ywL {
    public static byte[] AEQbTJ(java.lang.String str) {
        byte[] byteArray = new java.math.BigInteger(str, 36).toByteArray();
        int iOLrzqt = OLrzqt(str);
        byte[] bArr = new byte[byteArray.length + iOLrzqt];
        java.lang.System.arraycopy(byteArray, 0, bArr, iOLrzqt, byteArray.length);
        return bArr;
    }

    public static java.lang.String AEQbTJ(byte[] bArr) {
        java.lang.String string = new java.math.BigInteger(1, bArr).toString(36);
        int iCopydefault = copydefault(bArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < iCopydefault; i++) {
            sb.append("0");
        }
        sb.append(string);
        return sb.toString();
    }

    public static int copydefault(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != 0) {
                return i;
            }
        }
        return bArr.length;
    }

    public static int OLrzqt(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                return i;
            }
        }
        return str.length();
    }
}
