package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class EventLogger {
    public static final byte[] OLrzqt(DT dt, BatteryManager batteryManager) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("LanguageCode"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Text"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        SynchronousResultReceiver synchronousResultReceiverKWHzl = batteryManager.KWHzl();
        if (synchronousResultReceiverKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, synchronousResultReceiverKWHzl.OLrzqt());
        }
        java.lang.String strOLrzqt = batteryManager.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
