package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.pN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38121pN {
    public static final byte[] EZpvd(DT dt, C35106np c35106np) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("AdapterId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = c35106np.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
