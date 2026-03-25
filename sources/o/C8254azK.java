package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C8254azK implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final android.widget.ImageView AkhnZx;
    public final android.widget.LinearLayout EZpvd;
    public final wYK KWHzl;
    public final AppCompatTextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C8254azK(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2) {
        this.copydefault = constraintLayout;
        this.KWHzl = wyk;
        this.EZpvd = linearLayout;
        this.AEQbTJ = appCompatTextView;
        this.OLrzqt = appCompatTextView2;
        this.AhwBna = appCompatTextView3;
        this.djBIcL = appCompatTextView4;
        this.valueOf = appCompatTextView5;
        this.gEmmrt = appCompatTextView6;
        this.AYXKKw = imageView;
        this.AkhnZx = imageView2;
    }

    public static C8254azK OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.OcIXYQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C8254azK KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C8206ayP.StateListAnimator.gHZMYf;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            i = C8206ayP.StateListAnimator.QOLQEE;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C8206ayP.StateListAnimator.swzYdv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C8206ayP.StateListAnimator.fGQ;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C8206ayP.StateListAnimator.iKEqwx;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C8206ayP.StateListAnimator.DPHNDa;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView4 != null) {
                                i = C8206ayP.StateListAnimator.DPHsZd;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView5 != null) {
                                    i = C8206ayP.StateListAnimator.isReflectionWorking;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView6 != null) {
                                        i = C8206ayP.StateListAnimator.invokespecialaGOrKO;
                                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = C8206ayP.StateListAnimator.invokespecialaKhcqp;
                                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                return new C8254azK((ConstraintLayout) view, wyk, linearLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, imageView, imageView2);
                                            }
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
