package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.jE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C25724jE {
    public static final byte[] KWHzl(DT dt, C5840aE c5840aE) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("PolicyDocument"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("PolicyName"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("PolicyRevisionId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("ProjectArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c5840aE.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.String strOLrzqt = c5840aE.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        java.lang.String strKWHzl = c5840aE.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        java.lang.String strAEQbTJ = c5840aE.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
