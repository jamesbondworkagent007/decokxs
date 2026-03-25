package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C21968hT {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C35687o c35687o) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c35687o, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("FragmentNumber"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PendingIntent.copydefault, new EX("ProducerTimestamp"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Long lKWHzl = c35687o.KWHzl();
        if (lKWHzl != null) {
            ebEZpvd.EZpvd(c5101Et2, lKWHzl.longValue());
        }
        java.lang.String strEZpvd = c35687o.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        ebEZpvd.AEQbTJ();
    }
}
