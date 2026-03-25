package o;

import com.airbnb.lottie.LottieAnimationView;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6873aXb {
    public static final void OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (SPUtils.getBoolean("remove_main_anim", false)) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof LottieAnimationView) {
                ((LottieAnimationView) childAt).pauseAnimation();
            }
        }
    }

    public static final void EZpvd(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (SPUtils.getBoolean("remove_main_anim", false)) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof LottieAnimationView) {
                ((LottieAnimationView) childAt).playAnimation();
            }
        }
    }
}
