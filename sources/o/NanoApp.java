package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class NanoApp {
    public static final byte[] OLrzqt(DT dt, SystemUpdatePolicy systemUpdatePolicy) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AccessToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DeviceKey"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("DeviceRememberedStatus"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = systemUpdatePolicy.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strEZpvd = systemUpdatePolicy.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        Nullable nullableAEQbTJ = systemUpdatePolicy.AEQbTJ();
        if (nullableAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, nullableAEQbTJ.OLrzqt());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
