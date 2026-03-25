package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5638aAJ implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C52794wYp EZpvd;
    public final LottieAnimationView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C5638aAJ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = linearLayout;
        this.EZpvd = c52794wYp;
        this.copydefault = textView;
        this.KWHzl = lottieAnimationView;
        this.OLrzqt = textView2;
    }

    public static C5638aAJ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.zuWLRA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C5638aAJ copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.dNCPSb;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C8206ayP.StateListAnimator.gasjUx;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C8206ayP.StateListAnimator.QwvEab;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    i = C8206ayP.StateListAnimator.isReflectionWorking;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new C5638aAJ((android.widget.LinearLayout) view, c52794wYp, textView, lottieAnimationView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
