package o;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes24.dex */
public class xVX {
    public static java.lang.String AEQbTJ(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            copydefault(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    public static void copydefault(java.lang.StringBuffer stringBuffer, byte b) {
        stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b & Ascii.SI));
    }
}
