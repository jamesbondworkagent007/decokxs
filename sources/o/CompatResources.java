package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CompatResources {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull NavigationRes navigationRes) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(navigationRes, "");
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et = new C5101Et(taskDescription, new EX("ChallengeRequiredOnNewDevice"));
        C5101Et c5101Et2 = new C5101Et(taskDescription, new EX("DeviceOnlyRememberedOnUserPrompt"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (navigationRes.EZpvd()) {
            ebEZpvd.OLrzqt(c5101Et, navigationRes.EZpvd());
        }
        if (navigationRes.KWHzl()) {
            ebEZpvd.OLrzqt(c5101Et2, navigationRes.KWHzl());
        }
        ebEZpvd.AEQbTJ();
    }
}
