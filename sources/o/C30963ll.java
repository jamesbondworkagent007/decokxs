package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30963ll {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C8297bA c8297bA) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c8297bA, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("MinSegmentConfidence"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Float fOLrzqt = c8297bA.OLrzqt();
        if (fOLrzqt != null) {
            ebEZpvd.copydefault(c5101Et, fOLrzqt.floatValue());
        }
        ebEZpvd.AEQbTJ();
    }
}
