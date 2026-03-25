package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class AdvertiseSettings {
    public static final byte[] KWHzl(DT dt, Account account) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("DeviceKey"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("DeviceRememberedStatus"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Username"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = account.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        Nullable nullableKWHzl = account.KWHzl();
        if (nullableKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, nullableKWHzl.OLrzqt());
        }
        java.lang.String strOLrzqt = account.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strOLrzqt);
        }
        java.lang.String strAEQbTJ = account.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
