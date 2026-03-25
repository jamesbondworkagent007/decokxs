package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C15915ea {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull CursorTreeAdapter cursorTreeAdapter) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(cursorTreeAdapter, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("ConfidenceThreshold"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Float fEZpvd = cursorTreeAdapter.EZpvd();
        if (fEZpvd != null) {
            ebEZpvd.copydefault(c5101Et, fEZpvd.floatValue());
        }
        ebEZpvd.AEQbTJ();
    }
}
