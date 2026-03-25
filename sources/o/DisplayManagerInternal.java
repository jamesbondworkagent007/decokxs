package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DisplayManagerInternal {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull WindowConfiguration windowConfiguration) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(windowConfiguration, "");
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et = new C5101Et(taskDescription, new EX("Enabled"));
        C5101Et c5101Et2 = new C5101Et(taskDescription, new EX("PreferredMfa"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (windowConfiguration.KWHzl()) {
            ebEZpvd.OLrzqt(c5101Et, windowConfiguration.KWHzl());
        }
        if (windowConfiguration.AEQbTJ()) {
            ebEZpvd.OLrzqt(c5101Et2, windowConfiguration.AEQbTJ());
        }
        ebEZpvd.AEQbTJ();
    }
}
