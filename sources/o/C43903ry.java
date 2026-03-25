package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C43903ry {
    public static final byte[] OLrzqt(DT dt, C37079on c37079on) {
        EW ew = new EW();
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et = new C5101Et(sharedElementCallback, new EX("AfterCreationTime"));
        C5101Et c5101Et2 = new C5101Et(sharedElementCallback, new EX("BeforeCreationTime"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxResults"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        C5173Hn c5173HnEZpvd = c37079on.EZpvd();
        if (c5173HnEZpvd != null) {
            ebEZpvd.KWHzl(c5101Et, c5173HnEZpvd, TimestampFormat.EPOCH_SECONDS);
        }
        C5173Hn c5173HnCopydefault = c37079on.copydefault();
        if (c5173HnCopydefault != null) {
            ebEZpvd.KWHzl(c5101Et2, c5173HnCopydefault, TimestampFormat.EPOCH_SECONDS);
        }
        java.lang.Integer numKWHzl = c37079on.KWHzl();
        if (numKWHzl != null) {
            ebEZpvd.OLrzqt(c5101Et3, numKWHzl.intValue());
        }
        java.lang.String strAEQbTJ = c37079on.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
