package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42842rdz implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final FragmentContainerView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final FragmentContainerView djBIcL;
    public final C55241xgI gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public C42842rdz(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55241xgI c55241xgI) {
        this.valueOf = linearLayout;
        this.OLrzqt = fragmentContainerView;
        this.AEQbTJ = linearLayout2;
        this.KWHzl = textView;
        this.EZpvd = constraintLayout;
        this.copydefault = imageView;
        this.djBIcL = fragmentContainerView2;
        this.AhwBna = textView2;
        this.gEmmrt = c55241xgI;
    }

    public static C42842rdz AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.AYXKKw;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = qZH.StateListAnimator.dvImUD;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = qZH.StateListAnimator.DTg;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = qZH.StateListAnimator.zqTOFw;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = qZH.StateListAnimator.cBPFI;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = qZH.StateListAnimator.hlXVux;
                            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                            if (fragmentContainerView2 != null) {
                                i = qZH.StateListAnimator.FYtjSf;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = qZH.StateListAnimator.OqhRBMiKdSzF;
                                    C55241xgI c55241xgI = (C55241xgI) ViewBindings.findChildViewById(view, i);
                                    if (c55241xgI != null) {
                                        return new C42842rdz((android.widget.LinearLayout) view, fragmentContainerView, linearLayout, textView, constraintLayout, imageView, fragmentContainerView2, textView2, c55241xgI);
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
