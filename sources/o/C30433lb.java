package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30433lb {
    public static final byte[] OLrzqt(DT dt, C10629bs c10629bs) {
        EW ew = new EW();
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et = new C5101Et(fragmentManager, new EX("MaxInferenceUnits"));
        C5101Et c5101Et2 = new C5101Et(fragmentManager, new EX("MinInferenceUnits"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ProjectVersionArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.Integer numEZpvd = c10629bs.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et, numEZpvd.intValue());
        }
        java.lang.Integer numOLrzqt = c10629bs.OLrzqt();
        if (numOLrzqt != null) {
            ebEZpvd.OLrzqt(c5101Et2, numOLrzqt.intValue());
        }
        java.lang.String strAEQbTJ = c10629bs.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
