package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes20.dex */
public final class Constructor {
    public static final byte[] AEQbTJ(DT dt, ExceptionInInitializerError exceptionInInitializerError) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("IdentityPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = exceptionInInitializerError.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
