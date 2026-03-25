package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes2.dex */
public final class IpSecTunnelInterfaceResponse {
    public static final byte[] AEQbTJ(DT dt, ActivityConfigurationChangeItem activityConfigurationChangeItem) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AccessToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("FriendlyDeviceName"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("Session"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("UserCode"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = activityConfigurationChangeItem.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        java.lang.String strCopydefault = activityConfigurationChangeItem.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        java.lang.String strEZpvd = activityConfigurationChangeItem.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        java.lang.String strOLrzqt = activityConfigurationChangeItem.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
