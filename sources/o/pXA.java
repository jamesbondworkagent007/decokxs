package o;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pXA {
    public static final void KWHzl(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C57600ylV.loadingAnim$default(viewGroup, C33492mxV.OLrzqt() ? "loading_market_double_night.lottie" : "loading_market_double.lottie", false, true, false, 10, (java.lang.Object) null);
    }

    public static final void copydefault(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C57600ylV.loadingAnim$default(viewGroup, C33492mxV.OLrzqt() ? "market_loading_ranking_list_dark.lottie" : "market_loading_ranking_list.lottie", false, true, false, 10, (java.lang.Object) null);
    }

    public static final void gEmmrt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        marketLoadingAnim$default(viewGroup, C33492mxV.OLrzqt() ? "loading_market_double_night.lottie" : "loading_market_double.lottie", false, true, false, 10, null);
    }

    public static /* synthetic */ void preLoadingMarketCardStyle$default(android.view.ViewGroup viewGroup, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C52761wXj.Activity.EZpvd;
        }
        OLrzqt(viewGroup, i);
    }

    public static final void OLrzqt(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        marketLoadingAnim$default(viewGroup, C33492mxV.OLrzqt() ? "market_card_night_loading.lottie" : "market_card_day_loading.lottie", false, true, false, 10, null);
        viewGroup.setBackgroundResource(i);
    }

    public static /* synthetic */ void marketLoadingAnim$default(android.view.ViewGroup viewGroup, java.lang.String str, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        copydefault(viewGroup, str, z, z2, z3);
    }

    public static final void copydefault(@NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
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

    public static final void OLrzqt(@NotNull final android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        viewGroup.postDelayed(new java.lang.Runnable() { // from class: o.pXD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                pXA.EZpvd(viewGroup);
            }
        }, 16L);
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
}
