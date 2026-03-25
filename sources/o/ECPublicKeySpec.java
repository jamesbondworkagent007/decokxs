package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes20.dex */
public final class ECPublicKeySpec {
    public static final byte[] AEQbTJ(DT dt, NoSuchFieldException noSuchFieldException) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("DeveloperUserIdentifier"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("IdentityId"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("IdentityPoolId"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strOLrzqt = noSuchFieldException.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        java.lang.String strAEQbTJ = noSuchFieldException.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        java.lang.String strEZpvd = noSuchFieldException.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        java.lang.Integer numCopydefault = noSuchFieldException.copydefault();
        if (numCopydefault != null) {
            ebEZpvd.OLrzqt(c5101Et4, numCopydefault.intValue());
        }
        java.lang.String strKWHzl = noSuchFieldException.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
