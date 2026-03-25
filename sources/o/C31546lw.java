package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.lw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31546lw {
    public static final byte[] copydefault(DT dt, C8403bC c8403bC) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ProjectVersionArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c8403bC.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
