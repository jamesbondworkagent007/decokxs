package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class MeteringRectangle {
    public static final byte[] copydefault(DT dt, StatsManager statsManager) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("CSS"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ClientId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Application.KWHzl, new EX("ImageFile"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = statsManager.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strOLrzqt = statsManager.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        byte[] bArrEZpvd = statsManager.EZpvd();
        if (bArrEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, C5162Hc.OLrzqt(bArrEZpvd));
        }
        java.lang.String strAEQbTJ = statsManager.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
