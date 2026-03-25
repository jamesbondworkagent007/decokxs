package o;

/* JADX INFO: renamed from: o.zpC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59866zpC {
    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        try {
            return java.lang.System.getProperty(str, str2);
        } catch (java.lang.SecurityException unused) {
            return str2;
        }
    }
}
