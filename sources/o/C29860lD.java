package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C29860lD {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8721bI c8721bI) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8721bI, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PendingIntent.copydefault, new EX("MaxDurationInSeconds"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Long lOLrzqt = c8721bI.OLrzqt();
        if (lOLrzqt != null) {
            ebEZpvd.EZpvd(c5101Et, lOLrzqt.longValue());
        }
        ebEZpvd.AEQbTJ();
    }
}
