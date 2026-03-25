package o;

import com.google.common.base.Ascii;

/* JADX INFO: renamed from: o.aWk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6829aWk {
    public static final char[] AEQbTJ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] OLrzqt = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C6829aWk() {
    }

    public static java.lang.String KWHzl(byte[] bArr) {
        return KWHzl(bArr, true);
    }

    public static java.lang.String KWHzl(byte[] bArr, boolean z) {
        return EZpvd(bArr, z ? AEQbTJ : OLrzqt);
    }

    public static java.lang.String EZpvd(byte[] bArr, char[] cArr) {
        if (bArr == null || cArr == null) {
            return null;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length);
            for (byte b : bArr) {
                sb.append(cArr[(b & 240) >>> 4]);
                sb.append(cArr[b & Ascii.SI]);
            }
            return sb.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
