package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.gV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C19941gV {
    public static final byte[] EZpvd(DT dt, ViewAnimator viewAnimator) {
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
        AbstractC58373z abstractC58373zCopydefault = viewAnimator.copydefault();
        if (abstractC58373zCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, abstractC58373zCopydefault.EZpvd());
        }
        java.lang.String strKWHzl = viewAnimator.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        java.lang.Integer numEZpvd = viewAnimator.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et3, numEZpvd.intValue());
        }
        java.lang.String strOLrzqt = viewAnimator.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        A aAEQbTJ = viewAnimator.AEQbTJ();
        if (aAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et5, aAEQbTJ.OLrzqt());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
