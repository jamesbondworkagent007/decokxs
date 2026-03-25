package o;

/* JADX INFO: renamed from: o.ywQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58178ywQ {
    public static byte[] AEQbTJ(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] AEQbTJ(java.lang.String str) {
        return AEQbTJ(str, java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME));
    }

    public static java.lang.String copydefault(byte[] bArr, java.nio.charset.Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static java.lang.String KWHzl(byte[] bArr) {
        return copydefault(bArr, java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME));
    }

    public static java.lang.String EZpvd(byte[] bArr) {
        return copydefault(bArr, java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME));
    }
}
