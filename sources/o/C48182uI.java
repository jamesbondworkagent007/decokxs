package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48182uI {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C46803te c46803te) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c46803te, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Application.KWHzl, new EX("Content"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ContentType"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et, C5162Hc.OLrzqt(c46803te.AEQbTJ()));
        ebEZpvd.AEQbTJ(c5101Et2, c46803te.KWHzl());
        ebEZpvd.AEQbTJ();
    }
}
