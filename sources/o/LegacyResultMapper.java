package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LegacyResultMapper {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ProcessMemoryState processMemoryState) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(processMemoryState, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Name"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Priority"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.OLrzqt(c5101Et2, processMemoryState.OLrzqt());
        ebEZpvd.AEQbTJ(c5101Et, processMemoryState.copydefault().OLrzqt());
        ebEZpvd.AEQbTJ();
    }
}
