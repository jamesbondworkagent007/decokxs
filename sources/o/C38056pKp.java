package o;

import com.google.common.base.Ascii;

/* JADX INFO: renamed from: o.pKp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C38056pKp {
    public static final char[] EZpvd = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] copydefault = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C38056pKp() {
    }

    public static java.lang.String EZpvd(byte[] bArr) {
        return EZpvd(bArr, true);
    }

    public static java.lang.String EZpvd(byte[] bArr, boolean z) {
        return KWHzl(bArr, z ? EZpvd : copydefault);
    }

    public static java.lang.String KWHzl(byte[] bArr, char[] cArr) {
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
