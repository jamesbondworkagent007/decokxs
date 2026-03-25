package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C28102kOz;

/* JADX INFO: loaded from: classes23.dex */
public final class kOU implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final C52794wYp KWHzl;
    public final wYC OLrzqt;
    public final LottieAnimationView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public kOU(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull wYC wyc, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AYXKKw = constraintLayout;
        this.AEQbTJ = c52794wYp;
        this.KWHzl = c52794wYp2;
        this.copydefault = lottieAnimationView;
        this.OLrzqt = wyc;
        this.EZpvd = imageView;
        this.AhwBna = imageView2;
        this.valueOf = linearLayout;
        this.djBIcL = textView;
        this.gEmmrt = textView2;
    }

    public static kOU AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C28102kOz.Activity.gEmmrt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static kOU OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C28102kOz.StateListAnimator.KWHzl;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C28102kOz.StateListAnimator.copydefault;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C28102kOz.StateListAnimator.valueOf;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = C28102kOz.StateListAnimator.AhwBna;
                    wYC wyc = (wYC) ViewBindings.findChildViewById(view, i);
                    if (wyc != null) {
                        i = C28102kOz.StateListAnimator.fetchVPNInfo;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C28102kOz.StateListAnimator.DbNXlk;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C28102kOz.StateListAnimator.fJNWhG;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C28102kOz.StateListAnimator.zsXlph;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C28102kOz.StateListAnimator.AubY;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            return new kOU((ConstraintLayout) view, c52794wYp, c52794wYp2, lottieAnimationView, wyc, imageView, imageView2, linearLayout, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
