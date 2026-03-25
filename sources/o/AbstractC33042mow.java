package o;

import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;
import o.C33037mor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC33042mow extends AbstractC32996moC {
    public LottieAnimationView DbNXlk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull LottieAnimationView lottieAnimationView) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public final void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, final android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        final android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(requireContext());
        AEQbTJ(frameLayout);
        new C33037mor(layoutInflater.getContext(), new pSF()).EZpvd(getLayoutId(), null, new C33037mor.Application() { // from class: o.mot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33037mor.Application
            public final void AEQbTJ(android.view.View view, int i, android.view.ViewGroup viewGroup2) {
                AbstractC33042mow.KWHzl(frameLayout, this, bundle, view, i, viewGroup2);
            }
        });
        return frameLayout;
    }

    public static final void KWHzl(android.widget.FrameLayout frameLayout, AbstractC33042mow abstractC33042mow, android.os.Bundle bundle, android.view.View view, int i, android.view.ViewGroup viewGroup) {
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        Intrinsics.copydefault(view);
        abstractC33042mow.AEQbTJ(view, bundle);
        abstractC33042mow.KWHzl(frameLayout);
    }

    public ViewGroup.LayoutParams fetchVPNInfo() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public void AEQbTJ(@NotNull android.widget.FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(requireContext());
        EZpvd(lottieAnimationView);
        frameLayout.addView(lottieAnimationView, fetchVPNInfo());
        lottieAnimationView.playAnimation();
        this.DbNXlk = lottieAnimationView;
    }

    public void KWHzl(@NotNull android.widget.FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "");
        LottieAnimationView lottieAnimationView = this.DbNXlk;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
            frameLayout.removeView(lottieAnimationView);
        }
    }
}
