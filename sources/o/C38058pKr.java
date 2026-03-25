package o;

/* JADX INFO: renamed from: o.pKr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C38058pKr {
    public static void copydefault(java.io.Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (java.io.Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }
}
