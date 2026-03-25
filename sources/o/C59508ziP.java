package o;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: o.ziP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59508ziP implements PrivilegedAction {
    public final /* synthetic */ java.lang.String EZpvd;
    public final /* synthetic */ java.lang.String KWHzl;

    public C59508ziP(java.lang.String str, java.lang.String str2) {
        this.EZpvd = str;
        this.KWHzl = str2;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        return java.lang.System.getProperty(this.EZpvd, this.KWHzl);
    }
}
