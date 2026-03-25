package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11512cR {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull WebViewLibraryLoader webViewLibraryLoader) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(webViewLibraryLoader, "");
        AbstractC5105Ex.ActionBar actionBar = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et = new C5101Et(actionBar, new EX("MaxPixelThreshold"));
        C5101Et c5101Et2 = new C5101Et(actionBar, new EX("MinCoveragePercentage"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Float fCopydefault = webViewLibraryLoader.copydefault();
        if (fCopydefault != null) {
            ebEZpvd.copydefault(c5101Et, fCopydefault.floatValue());
        }
        java.lang.Float fKWHzl = webViewLibraryLoader.KWHzl();
        if (fKWHzl != null) {
            ebEZpvd.copydefault(c5101Et2, fKWHzl.floatValue());
        }
        ebEZpvd.AEQbTJ();
    }
}
