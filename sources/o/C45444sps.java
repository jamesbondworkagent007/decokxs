package o;

import o.ActivityC45440spo;
import o.mMP;

/* JADX INFO: renamed from: o.sps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45444sps extends AbstractC43215rlA implements mMP {
    public final int copydefault = 1;
    public final int KWHzl = 301;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "OKSupport Debug Tools";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return false;
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return true;
        }
        activityAEQbTJ.startActivity(ActivityC45440spo.Activity.createIntent$default(ActivityC45440spo.Companion, activityAEQbTJ, false, 2, null));
        return true;
    }
}
