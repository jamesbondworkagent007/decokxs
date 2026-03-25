package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C21189gv {
    public static final byte[] EZpvd(DT dt, TextSwitcher textSwitcher) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("JobId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("NextToken"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("SortBy"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = textSwitcher.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        java.lang.Integer numCopydefault = textSwitcher.copydefault();
        if (numCopydefault != null) {
            ebEZpvd.OLrzqt(c5101Et2, numCopydefault.intValue());
        }
        java.lang.String strEZpvd = textSwitcher.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        AbsSpinner absSpinnerOLrzqt = textSwitcher.OLrzqt();
        if (absSpinnerOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, absSpinnerOLrzqt.KWHzl());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
