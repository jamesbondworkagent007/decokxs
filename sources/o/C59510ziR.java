package o;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: o.ziR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59510ziR implements PrivilegedAction {
    public final /* synthetic */ java.lang.String AEQbTJ;
    public final /* synthetic */ java.lang.String OLrzqt;

    public C59510ziR(java.lang.String str, java.lang.String str2) {
        this.OLrzqt = str;
        this.AEQbTJ = str2;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        return java.lang.System.getProperty(this.OLrzqt, this.AEQbTJ);
    }
}
