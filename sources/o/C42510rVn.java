package o;

import androidx.fragment.app.FragmentActivity;
import o.mMP;

/* JADX INFO: renamed from: o.rVn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42510rVn extends AbstractC43215rlA implements mMP {
    public final int copydefault = 1;
    public final int EZpvd = 500;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "OKCompliance Page Preview";
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
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity == null) {
            return false;
        }
        fragmentActivity.startActivity(ActivityC42504rVh.Companion.OLrzqt(fragmentActivity));
        return true;
    }
}
