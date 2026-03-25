package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.iG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23698iG {
    public static final byte[] AEQbTJ(DT dt, P p) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.Integer numEZpvd = p.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et, numEZpvd.intValue());
        }
        java.lang.String strCopydefault = p.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
