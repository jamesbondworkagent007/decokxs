package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes20.dex */
public final class ProtectionDomain {
    public static final byte[] EZpvd(DT dt, NegativeArraySizeException negativeArraySizeException) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("HideDisabled"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("IdentityPoolId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.Boolean boolEZpvd = negativeArraySizeException.EZpvd();
        if (boolEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et, boolEZpvd.booleanValue());
        }
        java.lang.String strAEQbTJ = negativeArraySizeException.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        java.lang.Integer numCopydefault = negativeArraySizeException.copydefault();
        if (numCopydefault != null) {
            ebEZpvd.OLrzqt(c5101Et3, numCopydefault.intValue());
        }
        java.lang.String strOLrzqt = negativeArraySizeException.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
