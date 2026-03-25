package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C41610qu {
    public static final byte[] KWHzl(DT dt, C34062nQ c34062nQ) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AdapterId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("AdapterVersion"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = c34062nQ.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strKWHzl = c34062nQ.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
