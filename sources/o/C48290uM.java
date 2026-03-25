package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48290uM {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C46697tc c46697tc) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c46697tc, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Id"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Type"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et2, c46697tc.KWHzl().AEQbTJ());
        ebEZpvd.AEQbTJ(c5101Et, c46697tc.copydefault());
        ebEZpvd.AEQbTJ();
    }
}
