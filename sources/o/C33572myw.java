package o;

import com.google.common.base.Ascii;

/* JADX INFO: renamed from: o.myw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33572myw {
    public static java.lang.String EZpvd(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b >> 4) & 15));
            sb.append("0123456789abcdef".charAt(b & Ascii.SI));
        }
        return sb.toString();
    }
}
