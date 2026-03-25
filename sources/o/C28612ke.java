package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28612ke {
    public static final byte[] OLrzqt(DT dt, C6370aO c6370aO) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("CollectionId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("FaceId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("FaceMatchThreshold"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxFaces"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strOLrzqt = c6370aO.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        java.lang.String strKWHzl = c6370aO.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        java.lang.Float fAEQbTJ = c6370aO.AEQbTJ();
        if (fAEQbTJ != null) {
            ebEZpvd.copydefault(c5101Et3, fAEQbTJ.floatValue());
        }
        java.lang.Integer numEZpvd = c6370aO.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et4, numEZpvd.intValue());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
