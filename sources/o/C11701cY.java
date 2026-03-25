package o;

import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11701cY {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull WebViewZygote webViewZygote) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(webViewZygote, "");
        AbstractC5105Ex.ActionBar actionBar = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et = new C5101Et(actionBar, new EX("Height"));
        C5101Et c5101Et2 = new C5101Et(actionBar, new EX("Left"));
        C5101Et c5101Et3 = new C5101Et(actionBar, new EX("Top"));
        C5101Et c5101Et4 = new C5101Et(actionBar, new EX(HttpHeaders.WIDTH));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Float fAEQbTJ = webViewZygote.AEQbTJ();
        if (fAEQbTJ != null) {
            ebEZpvd.copydefault(c5101Et4, fAEQbTJ.floatValue());
        }
        java.lang.Float fKWHzl = webViewZygote.KWHzl();
        if (fKWHzl != null) {
            ebEZpvd.copydefault(c5101Et, fKWHzl.floatValue());
        }
        java.lang.Float fEZpvd = webViewZygote.EZpvd();
        if (fEZpvd != null) {
            ebEZpvd.copydefault(c5101Et2, fEZpvd.floatValue());
        }
        java.lang.Float fCopydefault = webViewZygote.copydefault();
        if (fCopydefault != null) {
            ebEZpvd.copydefault(c5101Et3, fCopydefault.floatValue());
        }
        ebEZpvd.AEQbTJ();
    }
}
