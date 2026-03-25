package o;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: o.ziO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59507ziO implements PrivilegedAction {
    public final /* synthetic */ java.lang.ClassLoader KWHzl;
    public final /* synthetic */ java.lang.String OLrzqt;

    public C59507ziO(java.lang.ClassLoader classLoader, java.lang.String str) {
        this.KWHzl = classLoader;
        this.OLrzqt = str;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        java.lang.ClassLoader classLoader = this.KWHzl;
        if (classLoader != null) {
            return classLoader.getResourceAsStream(this.OLrzqt);
        }
        return java.lang.ClassLoader.getSystemResourceAsStream(this.OLrzqt);
    }
}
