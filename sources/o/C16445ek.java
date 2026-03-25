package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C16445ek {
    public static final byte[] KWHzl(DT dt, ExpandableListAdapter expandableListAdapter) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("CollectionId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strOLrzqt = expandableListAdapter.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
