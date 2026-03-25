package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.qZH;

/* JADX INFO: renamed from: o.raO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42646raO implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final LottieAnimationView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView DbNXlk;
    public final C52794wYp EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final NestedScrollView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.gEmmrt;
    }

    public C42646raO(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull NestedScrollView nestedScrollView2, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.gEmmrt = nestedScrollView;
        this.AEQbTJ = nestedScrollView2;
        this.EZpvd = c52794wYp;
        this.copydefault = imageView;
        this.KWHzl = imageView2;
        this.OLrzqt = imageView3;
        this.AYXKKw = lottieAnimationView;
        this.valueOf = textView;
        this.AhwBna = textView2;
        this.djBIcL = textView3;
        this.DbNXlk = textView4;
    }

    public static C42646raO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.fjfviF, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42646raO OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        int i = qZH.StateListAnimator.deregisterUser;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.hNurIN;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = qZH.StateListAnimator.FHvxmb;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = qZH.StateListAnimator.gkZNMa;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = qZH.StateListAnimator.GiPPlL;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = qZH.StateListAnimator.unregister;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = qZH.StateListAnimator.WFXFk;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = qZH.StateListAnimator.shErWi;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = qZH.StateListAnimator.ZGRCNj;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new C42646raO(nestedScrollView, nestedScrollView, c52794wYp, imageView, imageView2, imageView3, lottieAnimationView, textView, textView2, textView3, textView4);
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
