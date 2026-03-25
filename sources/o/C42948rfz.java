package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42948rfz implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C42948rfz(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.EZpvd = constraintLayout;
        this.copydefault = appCompatImageView;
        this.AEQbTJ = appCompatImageView2;
        this.OLrzqt = constraintLayout2;
        this.KWHzl = constraintLayout3;
        this.AhwBna = textView;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = textView4;
    }

    public static C42948rfz copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.clearRegistrations, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42948rfz OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.getAdvertisingId;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = qZH.StateListAnimator.zEHIKV;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = qZH.StateListAnimator.finishInit;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = qZH.StateListAnimator.gbIfDn;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = qZH.StateListAnimator.Slwtri;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = qZH.StateListAnimator.zMXLsR;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImpl;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = qZH.StateListAnimator.onLoadChildren;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        return new C42948rfz((ConstraintLayout) view, appCompatImageView, appCompatImageView2, constraintLayout, constraintLayout2, textView, textView2, textView3, textView4);
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
