package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57450yie implements ViewBinding {
    public final Barrier AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.view.View AhwBna;
    public final AppCompatImageView EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final AppCompatImageView gEmmrt;
    public final android.widget.TextView valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AhwBna;
    }

    public C57450yie(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4, @androidx.annotation.NonNull AppCompatImageView appCompatImageView5, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AhwBna = view;
        this.AEQbTJ = barrier;
        this.copydefault = appCompatImageView;
        this.OLrzqt = appCompatImageView2;
        this.KWHzl = appCompatImageView3;
        this.EZpvd = appCompatImageView4;
        this.gEmmrt = appCompatImageView5;
        this.djBIcL = linearLayout;
        this.AYXKKw = linearLayout2;
        this.valueOf = textView;
        this.values = appCompatTextView;
    }

    public static C57450yie KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.QUSxYX, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C57450yie KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.KWHzl;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C57406yhn.StateListAnimator.sSMYrx;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C57406yhn.StateListAnimator.gHZMYf;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C57406yhn.StateListAnimator.aKErDB;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView3 != null) {
                        i = C57406yhn.StateListAnimator.UeEOUB;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView4 != null) {
                            i = C57406yhn.StateListAnimator.finit;
                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView5 != null) {
                                i = C57406yhn.StateListAnimator.AxsJAYsNCnLh;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C57406yhn.StateListAnimator.OqFWZa;
                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = C57406yhn.StateListAnimator.UrRBLY;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = C57406yhn.StateListAnimator.Ufzxmz;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                return new C57450yie(view, barrier, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, linearLayout, linearLayout2, textView, appCompatTextView);
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
