package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOW implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final C49352umt AYXKKw;
    public final Flow AhwBna;
    public final ConstraintLayout AkhnZx;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final android.widget.FrameLayout gEmmrt;
    public final AppCompatTextView valueOf;
    public final NestedScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.values;
    }

    public oOW(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull Flow flow, @androidx.annotation.NonNull C49352umt c49352umt, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.values = nestedScrollView;
        this.AEQbTJ = appCompatTextView;
        this.OLrzqt = appCompatImageView;
        this.KWHzl = appCompatTextView2;
        this.EZpvd = appCompatTextView3;
        this.copydefault = appCompatTextView4;
        this.valueOf = appCompatTextView5;
        this.djBIcL = appCompatTextView6;
        this.AhwBna = flow;
        this.AYXKKw = c49352umt;
        this.gEmmrt = frameLayout;
        this.AkhnZx = constraintLayout;
    }

    public static oOW copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.AYXKKw;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C35964oKf.StateListAnimator.DTwDnp;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C35964oKf.StateListAnimator.QOLQEE;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    i = C35964oKf.StateListAnimator.DaTmkG;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = C35964oKf.StateListAnimator.DPHOMC;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = C35964oKf.StateListAnimator.ROgMPW;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView5 != null) {
                                i = C35964oKf.StateListAnimator.aCSzUz;
                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView6 != null) {
                                    i = C35964oKf.StateListAnimator.DcMfJKDIADVb;
                                    Flow flow = (Flow) ViewBindings.findChildViewById(view, i);
                                    if (flow != null) {
                                        i = C35964oKf.StateListAnimator.sbu;
                                        C49352umt c49352umt = (C49352umt) ViewBindings.findChildViewById(view, i);
                                        if (c49352umt != null) {
                                            i = C35964oKf.StateListAnimator.getDefaultCipherSuites;
                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (frameLayout != null) {
                                                i = C35964oKf.StateListAnimator.createSocket;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    return new oOW((NestedScrollView) view, appCompatTextView, appCompatImageView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, flow, c49352umt, frameLayout, constraintLayout);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
