package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34028nOt implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C34028nOt(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = linearLayout;
        this.KWHzl = linearLayout2;
        this.AEQbTJ = lottieAnimationView;
        this.EZpvd = textView;
    }

    public static C34028nOt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i = C35399nuc.StateListAnimator.DlABUU;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C35399nuc.StateListAnimator.vqBjd;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C34028nOt(linearLayout, linearLayout, lottieAnimationView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
