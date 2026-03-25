package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.dM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13456dM {
    public static final byte[] copydefault(DT dt, CheckBox checkBox) {
        EW ew = new EW();
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et = new C5101Et(stateListAnimator, new EX("AutoUpdate"));
        C5101Et c5101Et2 = new C5101Et(stateListAnimator, new EX("Feature"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ProjectName"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        AbstractC8031av abstractC8031avCopydefault = checkBox.copydefault();
        if (abstractC8031avCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, abstractC8031avCopydefault.copydefault());
        }
        DatePickerSpinnerDelegate datePickerSpinnerDelegateOLrzqt = checkBox.OLrzqt();
        if (datePickerSpinnerDelegateOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, datePickerSpinnerDelegateOLrzqt.KWHzl());
        }
        java.lang.String strAEQbTJ = checkBox.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
