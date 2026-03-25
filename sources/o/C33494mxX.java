package o;

import androidx.core.view.WindowCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33494mxX {
    public static final C33494mxX copydefault = new C33494mxX();

    private C33494mxX() {
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        EZpvd(activity, C52761wXj.Activity.EZpvd);
    }

    public final void EZpvd(@NotNull android.app.Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        AEQbTJ(activity);
        WindowCompat.getInsetsController(activity.getWindow(), activity.getWindow().getDecorView()).setAppearanceLightNavigationBars(z);
    }

    public final void EZpvd(@NotNull android.app.Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        OLrzqt(activity, activity.getColor(i));
    }

    public final void OLrzqt(@NotNull android.app.Activity activity, @androidx.annotation.ColorInt int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof ActivityC52757wXf) {
            ((ActivityC52757wXf) activity).setNavigationBarColorSafely(i);
        } else {
            activity.getWindow().setNavigationBarColor(i);
        }
    }
}
