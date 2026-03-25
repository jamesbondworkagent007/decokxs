package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class NotificationRankingUpdate {
    public static final byte[] OLrzqt(DT dt, HostApduService hostApduService) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("FlywheelArn"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("FlywheelIterationId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strAEQbTJ = hostApduService.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        java.lang.String strEZpvd = hostApduService.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
