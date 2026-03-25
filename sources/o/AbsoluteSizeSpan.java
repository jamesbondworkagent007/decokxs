package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AbsoluteSizeSpan {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull RemoteCallback remoteCallback) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(remoteCallback, "");
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et = new C5101Et(sharedElementCallback, new EX("CreationTimeAfter"));
        C5101Et c5101Et2 = new C5101Et(sharedElementCallback, new EX("CreationTimeBefore"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        C5173Hn c5173HnCopydefault = remoteCallback.copydefault();
        if (c5173HnCopydefault != null) {
            ebEZpvd.KWHzl(c5101Et, c5173HnCopydefault, TimestampFormat.EPOCH_SECONDS);
        }
        C5173Hn c5173HnOLrzqt = remoteCallback.OLrzqt();
        if (c5173HnOLrzqt != null) {
            ebEZpvd.KWHzl(c5101Et2, c5173HnOLrzqt, TimestampFormat.EPOCH_SECONDS);
        }
        ebEZpvd.AEQbTJ();
    }
}
