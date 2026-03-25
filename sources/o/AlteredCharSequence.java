package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class AlteredCharSequence {
    public static final byte[] copydefault(DT dt, BestClock bestClock) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("LanguageCode"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Text"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        PrinterCapabilitiesInfo printerCapabilitiesInfoKWHzl = bestClock.KWHzl();
        if (printerCapabilitiesInfoKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, printerCapabilitiesInfoKWHzl.EZpvd());
        }
        java.lang.String strOLrzqt = bestClock.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
