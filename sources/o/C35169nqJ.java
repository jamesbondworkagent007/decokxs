package o;

import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35169nqJ {
    public static final C35169nqJ AEQbTJ = new C35169nqJ();

    private C35169nqJ() {
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (sSI.copydefault.copydefault()) {
            pUU.KWHzl("IMOuterRouteHelper", "RM Mode is enabled, skipping web navigation.");
        } else {
            C35878oHa.openPageWithInterceptor$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
        }
    }

    public final void KWHzl(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (sSI.copydefault.copydefault()) {
            pUU.KWHzl("IMOuterRouteHelper", "RM Mode is enabled, skipping trade main navigation.");
        } else {
            InterfaceC33171mrS.Activity.switchToAppMode$default((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class), activity, 1, true, 0, null, null, 56, null);
        }
    }
}
