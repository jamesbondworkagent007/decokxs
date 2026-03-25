package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: renamed from: o.uO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48344uO {
    public static final byte[] EZpvd(DT dt, C47174tl c47174tl) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Name"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("TerminologyDataFormat"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = c47174tl.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        AbstractC46375tS abstractC46375tSCopydefault = c47174tl.copydefault();
        if (abstractC46375tSCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, abstractC46375tSCopydefault.AEQbTJ());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
