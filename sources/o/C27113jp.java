package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C27113jp {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C7980au c7980au) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c7980au, "");
        AbstractC5105Ex.ActionBar actionBar = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et = new C5101Et(actionBar, new EX("X"));
        C5101Et c5101Et2 = new C5101Et(actionBar, new EX("Y"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Float fEZpvd = c7980au.EZpvd();
        if (fEZpvd != null) {
            ebEZpvd.copydefault(c5101Et, fEZpvd.floatValue());
        }
        java.lang.Float fAEQbTJ = c7980au.AEQbTJ();
        if (fAEQbTJ != null) {
            ebEZpvd.copydefault(c5101Et2, fAEQbTJ.floatValue());
        }
        ebEZpvd.AEQbTJ();
    }
}
