package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LegacyCameraDevice {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull NotificationChannel notificationChannel) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(notificationChannel, "");
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et = new C5101Et(fragmentManager, new EX("MinimumLength"));
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et2 = new C5101Et(taskDescription, new EX("RequireLowercase"));
        C5101Et c5101Et3 = new C5101Et(taskDescription, new EX("RequireNumbers"));
        C5101Et c5101Et4 = new C5101Et(taskDescription, new EX("RequireSymbols"));
        C5101Et c5101Et5 = new C5101Et(taskDescription, new EX("RequireUppercase"));
        C5101Et c5101Et6 = new C5101Et(fragmentManager, new EX("TemporaryPasswordValidityDays"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Integer numAEQbTJ = notificationChannel.AEQbTJ();
        if (numAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et, numAEQbTJ.intValue());
        }
        if (notificationChannel.EZpvd()) {
            ebEZpvd.OLrzqt(c5101Et5, notificationChannel.EZpvd());
        }
        if (notificationChannel.copydefault()) {
            ebEZpvd.OLrzqt(c5101Et2, notificationChannel.copydefault());
        }
        if (notificationChannel.KWHzl()) {
            ebEZpvd.OLrzqt(c5101Et3, notificationChannel.KWHzl());
        }
        if (notificationChannel.OLrzqt()) {
            ebEZpvd.OLrzqt(c5101Et4, notificationChannel.OLrzqt());
        }
        if (notificationChannel.djBIcL() != 0) {
            ebEZpvd.OLrzqt(c5101Et6, notificationChannel.djBIcL());
        }
        ebEZpvd.AEQbTJ();
    }
}
