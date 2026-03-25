package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class RestrictionsManager {
    public static final byte[] EZpvd(DT dt, PathKeyframes pathKeyframes) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("Description"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("GroupName"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Precedence"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("RoleArn"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = pathKeyframes.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        java.lang.String strOLrzqt = pathKeyframes.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        java.lang.Integer numEZpvd = pathKeyframes.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et3, numEZpvd.intValue());
        }
        java.lang.String strCopydefault = pathKeyframes.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strCopydefault);
        }
        java.lang.String strAEQbTJ = pathKeyframes.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
