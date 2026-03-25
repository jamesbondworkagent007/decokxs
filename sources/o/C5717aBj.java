package o;

import androidx.fragment.app.FragmentActivity;
import o.mMP;

/* JADX INFO: renamed from: o.aBj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5717aBj extends AbstractC43215rlA implements mMP {
    public final int KWHzl = 1;
    public final int OLrzqt = 500;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "Passkey诊断(Passkey Self Check)";
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
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity == null) {
            return false;
        }
        fragmentActivity.startActivity(ActivityC5718aBk.Companion.copydefault(fragmentActivity));
        return true;
    }
}
