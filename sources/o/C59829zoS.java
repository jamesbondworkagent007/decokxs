package o;

/* JADX INFO: renamed from: o.zoS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C59829zoS {
    public static byte[] copydefault(java.lang.String str, java.lang.String str2) {
        C59825zoO.copydefault(str, "Input");
        C59825zoO.OLrzqt(str2, "Charset");
        try {
            return str.getBytes(str2);
        } catch (java.io.UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    private C59829zoS() {
    }
}
