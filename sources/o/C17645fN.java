package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17645fN {
    public static final void OLrzqt(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull RtlSpacingHelper rtlSpacingHelper) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(rtlSpacingHelper, "");
        AbstractC5105Ex.ActionBar actionBar = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et = new C5101Et(actionBar, new EX("MinBoundingBoxHeight"));
        C5101Et c5101Et2 = new C5101Et(actionBar, new EX("MinBoundingBoxWidth"));
        C5101Et c5101Et3 = new C5101Et(actionBar, new EX("MinConfidence"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Float fCopydefault = rtlSpacingHelper.copydefault();
        if (fCopydefault != null) {
            ebEZpvd.copydefault(c5101Et3, fCopydefault.floatValue());
        }
        java.lang.Float fEZpvd = rtlSpacingHelper.EZpvd();
        if (fEZpvd != null) {
            ebEZpvd.copydefault(c5101Et, fEZpvd.floatValue());
        }
        java.lang.Float fKWHzl = rtlSpacingHelper.KWHzl();
        if (fKWHzl != null) {
            ebEZpvd.copydefault(c5101Et2, fKWHzl.floatValue());
        }
        ebEZpvd.AEQbTJ();
    }
}
