package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class SdpOppOpsRecord {
    public static final byte[] AEQbTJ(DT dt, FingerprintGestureController fingerprintGestureController) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("EventId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("FeedbackValue"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Username"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strAEQbTJ = fingerprintGestureController.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        TestApi testApiCopydefault = fingerprintGestureController.copydefault();
        if (testApiCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, testApiCopydefault.EZpvd());
        }
        java.lang.String strEZpvd = fingerprintGestureController.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        java.lang.String strOLrzqt = fingerprintGestureController.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
