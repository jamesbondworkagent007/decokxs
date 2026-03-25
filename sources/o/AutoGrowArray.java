package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class AutoGrowArray {
    public static final byte[] KWHzl(DT dt, CancellationSignal cancellationSignal) {
        EW ew = new EW();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("LanguageCode"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Text"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        SynchronousResultReceiver synchronousResultReceiverAEQbTJ = cancellationSignal.AEQbTJ();
        if (synchronousResultReceiverAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, synchronousResultReceiverAEQbTJ.OLrzqt());
        }
        java.lang.String strKWHzl = cancellationSignal.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
