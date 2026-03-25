package o;

import com.okinc.core.util.SPUtils;
import o.mMP;

/* JADX INFO: renamed from: o.dsd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14818dsd extends AbstractC43215rlA implements mMP {
    public final int OLrzqt = 1;
    public final int copydefault = 210;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "discover enable vconsole";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        boolean z = !SPUtils.getBoolean("dapp_vconsole", false);
        SPUtils.put("dapp_vconsole", java.lang.Boolean.valueOf(z));
        if (z) {
            C55326xho.toast$default("vconsole enabled", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            C55326xho.toast$default("vconsole disabled", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return true;
    }
}
