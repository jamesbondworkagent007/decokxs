package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class SyncResult {
    public static final byte[] KWHzl(DT dt, TimeInterpolator timeInterpolator) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("CloudWatchLogsRoleArn"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("JobName"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = timeInterpolator.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.String strAEQbTJ = timeInterpolator.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        java.lang.String strOLrzqt = timeInterpolator.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
