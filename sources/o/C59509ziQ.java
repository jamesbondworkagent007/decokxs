package o;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: o.ziQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59509ziQ implements PrivilegedAction {
    public final /* synthetic */ java.lang.ClassLoader EZpvd;
    public final /* synthetic */ C59506ziN KWHzl;

    public C59509ziQ(C59506ziN c59506ziN, java.lang.ClassLoader classLoader) {
        this.KWHzl = c59506ziN;
        this.EZpvd = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        return this.EZpvd.getParent();
    }
}
