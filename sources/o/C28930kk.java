package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28930kk {
    public static final byte[] EZpvd(DT dt, C6739aV c6739aV) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("CollectionId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("FaceId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxUsers"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("UserId"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("UserMatchThreshold"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c6739aV.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.String strKWHzl = c6739aV.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        java.lang.Integer numOLrzqt = c6739aV.OLrzqt();
        if (numOLrzqt != null) {
            ebEZpvd.OLrzqt(c5101Et3, numOLrzqt.intValue());
        }
        java.lang.String strAEQbTJ = c6739aV.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        java.lang.Float fCopydefault = c6739aV.copydefault();
        if (fCopydefault != null) {
            ebEZpvd.copydefault(c5101Et5, fCopydefault.floatValue());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
