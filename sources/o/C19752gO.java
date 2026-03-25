package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.gO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C19752gO {
    public static final byte[] AEQbTJ(DT dt, YearPickerView yearPickerView) {
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
        java.lang.String strEZpvd = yearPickerView.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.Integer numKWHzl = yearPickerView.KWHzl();
        if (numKWHzl != null) {
            ebEZpvd.OLrzqt(c5101Et2, numKWHzl.intValue());
        }
        java.lang.String strAEQbTJ = yearPickerView.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        SpinnerAdapter spinnerAdapterCopydefault = yearPickerView.copydefault();
        if (spinnerAdapterCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et4, spinnerAdapterCopydefault.copydefault());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
