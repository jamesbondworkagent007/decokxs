package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TrustAnchor {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull IpManagerEvent ipManagerEvent) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(ipManagerEvent, "");
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et = new C5101Et(sharedElementCallback, new EX("CreationTimeAfter"));
        C5101Et c5101Et2 = new C5101Et(sharedElementCallback, new EX("CreationTimeBefore"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et3 = new C5101Et(stateListAnimator, new EX("DatasetType"));
        C5101Et c5101Et4 = new C5101Et(stateListAnimator, new EX("Status"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        NetworkMetrics networkMetricsOLrzqt = ipManagerEvent.OLrzqt();
        if (networkMetricsOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, networkMetricsOLrzqt.AEQbTJ());
        }
        ValidationProbeEvent validationProbeEventAEQbTJ = ipManagerEvent.AEQbTJ();
        if (validationProbeEventAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, validationProbeEventAEQbTJ.copydefault());
        }
        C5173Hn c5173HnKWHzl = ipManagerEvent.KWHzl();
        if (c5173HnKWHzl != null) {
            ebEZpvd.KWHzl(c5101Et, c5173HnKWHzl, TimestampFormat.EPOCH_SECONDS);
        }
        C5173Hn c5173HnEZpvd = ipManagerEvent.EZpvd();
        if (c5173HnEZpvd != null) {
            ebEZpvd.KWHzl(c5101Et2, c5173HnEZpvd, TimestampFormat.EPOCH_SECONDS);
        }
        ebEZpvd.AEQbTJ();
    }
}
