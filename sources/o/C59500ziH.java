package o;

/* JADX INFO: renamed from: o.ziH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59500ziH {
    public static byte[] EZpvd(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] copydefault(java.lang.String str) {
        return EZpvd(str, C59498ziF.AYXKKw);
    }

    public static java.lang.String copydefault(byte[] bArr, java.nio.charset.Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new java.lang.String(bArr, charset);
    }

    public static java.lang.String AEQbTJ(byte[] bArr) {
        return copydefault(bArr, C59498ziF.AYXKKw);
    }
}
