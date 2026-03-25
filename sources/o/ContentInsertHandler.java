package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ContentInsertHandler {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull FloatKeyframeSet floatKeyframeSet) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(floatKeyframeSet, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("EventAction"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et, floatKeyframeSet.KWHzl().OLrzqt());
        ebEZpvd.AEQbTJ();
    }
}
