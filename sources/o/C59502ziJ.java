package o;

import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: renamed from: o.ziJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59502ziJ implements PrivilegedAction {
    public final /* synthetic */ java.lang.String EZpvd;
    public final /* synthetic */ java.lang.ClassLoader copydefault;

    public C59502ziJ(java.lang.String str, java.lang.ClassLoader classLoader) {
        this.EZpvd = str;
        this.copydefault = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        return LogFactory.AEQbTJ(this.EZpvd, this.copydefault);
    }
}
