package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C43479rq {
    public static final byte[] OLrzqt(DT dt, C37132oo c37132oo) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AdapterId"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et2 = new C5101Et(sharedElementCallback, new EX("AfterCreationTime"));
        C5101Et c5101Et3 = new C5101Et(sharedElementCallback, new EX("BeforeCreationTime"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c37132oo.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        C5173Hn c5173HnKWHzl = c37132oo.KWHzl();
        if (c5173HnKWHzl != null) {
            ebEZpvd.KWHzl(c5101Et2, c5173HnKWHzl, TimestampFormat.EPOCH_SECONDS);
        }
        C5173Hn c5173HnCopydefault = c37132oo.copydefault();
        if (c5173HnCopydefault != null) {
            ebEZpvd.KWHzl(c5101Et3, c5173HnCopydefault, TimestampFormat.EPOCH_SECONDS);
        }
        java.lang.Integer numAEQbTJ = c37132oo.AEQbTJ();
        if (numAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et4, numAEQbTJ.intValue());
        }
        java.lang.String strOLrzqt = c37132oo.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
