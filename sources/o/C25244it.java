package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.it, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C25244it {
    public static final byte[] copydefault(DT dt, O o2) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.Integer numKWHzl = o2.KWHzl();
        if (numKWHzl != null) {
            ebEZpvd.OLrzqt(c5101Et, numKWHzl.intValue());
        }
        java.lang.String strOLrzqt = o2.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
