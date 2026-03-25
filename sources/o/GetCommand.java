package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GetCommand {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ListFragment listFragment) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(listFragment, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("AttributeName"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("DeliveryMedium"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ElapsedRealtimeLong elapsedRealtimeLongEZpvd = listFragment.EZpvd();
        if (elapsedRealtimeLongEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, elapsedRealtimeLongEZpvd.AEQbTJ());
        }
        java.lang.String strCopydefault = listFragment.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        ebEZpvd.AEQbTJ();
    }
}
