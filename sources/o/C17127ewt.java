package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17127ewt implements ViewBinding {
    public final LottieAnimationView EZpvd;
    public final LottieAnimationView KWHzl;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C17127ewt(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView2) {
        this.copydefault = frameLayout;
        this.EZpvd = lottieAnimationView;
        this.KWHzl = lottieAnimationView2;
    }

    public static C17127ewt OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.avCqka, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C17127ewt copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.AudioAttributesCompatParcelizer;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C13754dXa.ActionBar.IconCompatParcelizer;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView2 != null) {
                return new C17127ewt((android.widget.FrameLayout) view, lottieAnimationView, lottieAnimationView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
