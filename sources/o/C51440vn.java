package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C51440vn {
    public static final byte[] copydefault(DT dt, C47647tu c47647tu) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("DisplayLanguageCode"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        AbstractC46856tf abstractC46856tfKWHzl = c47647tu.KWHzl();
        if (abstractC46856tfKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, abstractC46856tfKWHzl.KWHzl());
        }
        java.lang.Integer numCopydefault = c47647tu.copydefault();
        if (numCopydefault != null) {
            ebEZpvd.OLrzqt(c5101Et2, numCopydefault.intValue());
        }
        java.lang.String strOLrzqt = c47647tu.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
