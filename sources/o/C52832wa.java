package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C52832wa {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C46240tN c46240tN) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c46240tN, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("Key"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Value"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et, c46240tN.OLrzqt());
        ebEZpvd.AEQbTJ(c5101Et2, c46240tN.KWHzl());
        ebEZpvd.AEQbTJ();
    }
}
