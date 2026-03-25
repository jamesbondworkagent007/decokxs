package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xal, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54952xal implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final wYC KWHzl;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C54952xal(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView) {
        this.copydefault = frameLayout;
        this.EZpvd = frameLayout2;
        this.KWHzl = wyc;
        this.AEQbTJ = lottieAnimationView;
    }

    public static C54952xal OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.QVAiDq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C54952xal copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i = C52761wXj.FragmentManager.RKDWNf;
        wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
        if (wyc != null) {
            i = C52761wXj.FragmentManager.DCUTEIddSDPG;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                return new C54952xal(frameLayout, frameLayout, wyc, lottieAnimationView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
