package o;

/* JADX INFO: renamed from: o.zot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59856zot {
    public static byte[] KWHzl(java.lang.String str, java.lang.String str2) {
        C59851zoo.AEQbTJ(str, "Input");
        C59851zoo.OLrzqt(str2, "Charset");
        try {
            return str.getBytes(str2);
        } catch (java.io.UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static byte[] AEQbTJ(java.lang.String str) {
        C59851zoo.AEQbTJ(str, "Input");
        return str.getBytes(C59514ziV.EZpvd);
    }

    private C59856zot() {
    }
}
