package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class StaticLayout {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull HwRemoteBinder hwRemoteBinder) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(hwRemoteBinder, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("JobName"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("JobStatus"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et3 = new C5101Et(sharedElementCallback, new EX("SubmitTimeAfter"));
        C5101Et c5101Et4 = new C5101Et(sharedElementCallback, new EX("SubmitTimeBefore"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = hwRemoteBinder.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        StatsDimensionsValue statsDimensionsValueAEQbTJ = hwRemoteBinder.AEQbTJ();
        if (statsDimensionsValueAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, statsDimensionsValueAEQbTJ.KWHzl());
        }
        C5173Hn c5173HnOLrzqt = hwRemoteBinder.OLrzqt();
        if (c5173HnOLrzqt != null) {
            ebEZpvd.KWHzl(c5101Et4, c5173HnOLrzqt, TimestampFormat.EPOCH_SECONDS);
        }
        C5173Hn c5173HnKWHzl = hwRemoteBinder.KWHzl();
        if (c5173HnKWHzl != null) {
            ebEZpvd.KWHzl(c5101Et3, c5173HnKWHzl, TimestampFormat.EPOCH_SECONDS);
        }
        ebEZpvd.AEQbTJ();
    }
}
