package o;

import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: renamed from: o.ziL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59504ziL implements PrivilegedAction {
    public final /* synthetic */ java.lang.String EZpvd;
    public final /* synthetic */ java.lang.ClassLoader KWHzl;

    public C59504ziL(java.lang.ClassLoader classLoader, java.lang.String str) {
        this.KWHzl = classLoader;
        this.EZpvd = str;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        try {
            java.lang.ClassLoader classLoader = this.KWHzl;
            if (classLoader != null) {
                return classLoader.getResources(this.EZpvd);
            }
            return java.lang.ClassLoader.getSystemResources(this.EZpvd);
        } catch (java.io.IOException e) {
            if (LogFactory.KWHzl()) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.EZpvd);
                stringBuffer.append(":");
                stringBuffer.append(e.getMessage());
                LogFactory.AYXKKw(stringBuffer.toString());
            }
            return null;
        } catch (java.lang.NoSuchMethodError unused) {
            return null;
        }
    }
}
