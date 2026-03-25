package o;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57600ylV {
    public static /* synthetic */ void loadingFindAnim$default(android.view.ViewGroup viewGroup, java.lang.String str, float f, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        boolean z4 = (i & 4) != 0 ? false : z;
        boolean z5 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            z3 = true;
        }
        EZpvd(viewGroup, str, f2, z4, z5, z3);
    }

    public static final void EZpvd(@NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str, float f, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (SPUtils.getBoolean("remove_main_anim", false)) {
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.getLayoutParams().height = -1;
        viewGroup.getLayoutParams().width = -1;
        viewGroup.setBackgroundResource(C52761wXj.Activity.EZpvd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55113xdn c55113xdn = new C55113xdn(context, null, 0, 6, null);
        c55113xdn.setAutoMirrored(z3);
        if (C57601ylW.KWHzl.AhwBna() && Build.VERSION.SDK_INT == 29) {
            c55113xdn.setRenderMode(RenderMode.SOFTWARE);
        }
        if (z) {
            android.content.Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c55113xdn.setMaxHeight(C33052mpF.EZpvd(148.0f, context2));
        }
        c55113xdn.setAnimation(str);
        c55113xdn.setScaleType(z2 ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START);
        c55113xdn.setRepeatCount(-1);
        c55113xdn.playAnimation();
        viewGroup.addView(c55113xdn, layoutParams);
    }

    public static /* synthetic */ void loadingAnim$default(android.view.ViewGroup viewGroup, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        OLrzqt(viewGroup, str, z, z2, z3);
    }

    public static final void OLrzqt(@NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (SPUtils.getBoolean("remove_main_anim", false)) {
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.getLayoutParams().height = -1;
        viewGroup.getLayoutParams().width = -1;
        viewGroup.setBackgroundResource(C52761wXj.Activity.EZpvd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55113xdn c55113xdn = new C55113xdn(context, null, 0, 6, null);
        c55113xdn.setAutoMirrored(z3);
        if (C57601ylW.KWHzl.AhwBna() && Build.VERSION.SDK_INT == 29) {
            c55113xdn.setRenderMode(RenderMode.SOFTWARE);
        }
        if (z) {
            android.content.Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c55113xdn.setMinimumHeight(C33052mpF.EZpvd(152.0f, context2));
        }
        c55113xdn.setAnimation(str);
        c55113xdn.setScaleType(z2 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_START);
        c55113xdn.setRepeatCount(-1);
        c55113xdn.playAnimation();
        viewGroup.addView(c55113xdn, layoutParams);
    }

    public static /* synthetic */ void loadingAnim$default(android.view.ViewGroup viewGroup, java.lang.String str, ImageView.ScaleType scaleType, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        AEQbTJ(viewGroup, str, scaleType, z, z2);
    }

    public static final void AEQbTJ(@NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str, @NotNull ImageView.ScaleType scaleType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(scaleType, "");
        if (SPUtils.getBoolean("remove_main_anim", false)) {
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.setBackgroundResource(C52761wXj.Activity.EZpvd);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55113xdn c55113xdn = new C55113xdn(context, null, 0, 6, null);
        c55113xdn.setAutoMirrored(z2);
        if (C57601ylW.KWHzl.AhwBna() && Build.VERSION.SDK_INT == 29) {
            c55113xdn.setRenderMode(RenderMode.SOFTWARE);
        }
        c55113xdn.setAnimation(str);
        c55113xdn.setScaleType(scaleType);
        c55113xdn.setAdjustViewBounds(z);
        c55113xdn.setRepeatCount(-1);
        c55113xdn.playAnimation();
        viewGroup.removeAllViews();
        viewGroup.addView(c55113xdn, layoutParams);
    }

    public static final void AEQbTJ(@NotNull final android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (SPUtils.getBoolean("remove_main_anim", false)) {
            return;
        }
        viewGroup.postDelayed(new java.lang.Runnable() { // from class: o.ylT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57600ylV.EZpvd(viewGroup);
            }
        }, 300L);
    }

    public static final void EZpvd(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof LottieAnimationView) {
                ((LottieAnimationView) childAt).cancelAnimation();
            }
        }
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
    }

    public static /* synthetic */ void setAndPlayAnimation$default(LottieAnimationView lottieAnimationView, java.lang.String str, ImageView.ScaleType scaleType, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if ((i3 & 4) != 0) {
            i = -1;
        }
        if ((i3 & 8) != 0) {
            i2 = 1;
        }
        AEQbTJ(lottieAnimationView, str, scaleType, i, i2);
    }

    public static final void AEQbTJ(@NotNull LottieAnimationView lottieAnimationView, @NotNull java.lang.String str, @NotNull ImageView.ScaleType scaleType, int i, int i2) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(scaleType, "");
        lottieAnimationView.setBackgroundResource(C52761wXj.Activity.EZpvd);
        if (C57601ylW.KWHzl.AhwBna() && Build.VERSION.SDK_INT == 29) {
            lottieAnimationView.setRenderMode(RenderMode.SOFTWARE);
        }
        lottieAnimationView.setScaleType(scaleType);
        lottieAnimationView.setRepeatCount(i);
        lottieAnimationView.setRepeatMode(i2);
        lottieAnimationView.setAnimation(str);
        lottieAnimationView.playAnimation();
    }
}
