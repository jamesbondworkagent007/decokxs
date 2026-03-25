package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class SensorEventListener {
    public static final byte[] AEQbTJ(DT dt, ExpandableListActivity expandableListActivity) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("NextToken"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.Integer numOLrzqt = expandableListActivity.OLrzqt();
        if (numOLrzqt != null) {
            ebEZpvd.OLrzqt(c5101Et, numOLrzqt.intValue());
        }
        java.lang.String strKWHzl = expandableListActivity.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        java.lang.String strAEQbTJ = expandableListActivity.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
