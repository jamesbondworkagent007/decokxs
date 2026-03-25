package o;

import java.security.PrivilegedAction;
import org.apache.commons.logging.impl.SimpleLog;

/* JADX INFO: renamed from: o.ziU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59513ziU implements PrivilegedAction {
    public final /* synthetic */ java.lang.String EZpvd;

    public C59513ziU(java.lang.String str) {
        this.EZpvd = str;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        java.lang.ClassLoader contextClassLoader = SimpleLog.getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader.getResourceAsStream(this.EZpvd);
        }
        return java.lang.ClassLoader.getSystemResourceAsStream(this.EZpvd);
    }
}
