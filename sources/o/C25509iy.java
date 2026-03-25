package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.iy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C25509iy {
    public static final byte[] AEQbTJ(DT dt, M m) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("NextToken"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("ProjectArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.Integer numEZpvd = m.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et, numEZpvd.intValue());
        }
        java.lang.String strAEQbTJ = m.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        java.lang.String strKWHzl = m.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
