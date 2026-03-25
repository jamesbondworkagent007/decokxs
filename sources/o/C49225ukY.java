package o;

import o.mMP;

/* JADX INFO: renamed from: o.ukY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49225ukY extends AbstractC43215rlA implements mMP {
    public final int EZpvd;
    public int KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "OKShare Sharing Test(Text/Link/Image)";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    public C49225ukY(int i, int i2, int i3) {
        this.KWHzl = i;
        this.EZpvd = i2;
        this.copydefault = i3;
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).EZpvd(activityAEQbTJ);
            return true;
        }
        C55326xho.toast$default("currentActivity is not avaibale", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return true;
    }
}
