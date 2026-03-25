package o;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.RenderMode;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iaS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24257iaS {
    public static final void EZpvd(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        loadingAnim$default(viewGroup, CDNSourceManager.LottieSource.DEX_LOADING_ORDER_DETAIL, false, false, false, 14, null);
    }

    public static /* synthetic */ void loadingAnim$default(android.view.ViewGroup viewGroup, CDNSourceManager.LottieSource lottieSource, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        AEQbTJ(viewGroup, lottieSource, z, z2, z3);
    }

    public static final void AEQbTJ(@NotNull android.view.ViewGroup viewGroup, @NotNull CDNSourceManager.LottieSource lottieSource, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(lottieSource, "");
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
            c55113xdn.setMinimumHeight(C55298xhM.copydefault(152.0f, context2));
        }
        C22361hds.OLrzqt(c55113xdn, lottieSource);
        c55113xdn.setScaleType(z2 ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_START);
        c55113xdn.setRepeatCount(-1);
        c55113xdn.playAnimation();
        viewGroup.addView(c55113xdn, layoutParams);
    }
}
