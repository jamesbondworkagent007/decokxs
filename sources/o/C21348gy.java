package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.gy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C21348gy {
    public static final byte[] copydefault(DT dt, ThemedSpinnerAdapter themedSpinnerAdapter) {
        EW ew = new EW();
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et = new C5101Et(stateListAnimator, new EX("AggregateBy"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("JobId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("NextToken"));
        C5101Et c5101Et5 = new C5101Et(stateListAnimator, new EX("SortBy"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        Adapter adapterOLrzqt = themedSpinnerAdapter.OLrzqt();
        if (adapterOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, adapterOLrzqt.EZpvd());
        }
        java.lang.String strAEQbTJ = themedSpinnerAdapter.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        java.lang.Integer numCopydefault = themedSpinnerAdapter.copydefault();
        if (numCopydefault != null) {
            ebEZpvd.OLrzqt(c5101Et3, numCopydefault.intValue());
        }
        java.lang.String strKWHzl = themedSpinnerAdapter.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        AnalogClock analogClockEZpvd = themedSpinnerAdapter.EZpvd();
        if (analogClockEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et5, analogClockEZpvd.OLrzqt());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
