package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42685rbA implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final pGS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C42685rbA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull pGS pgs, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8) {
        this.gEmmrt = constraintLayout;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
        this.EZpvd = textView3;
        this.copydefault = textView4;
        this.AEQbTJ = imageView;
        this.djBIcL = textView5;
        this.AYXKKw = textView6;
        this.valueOf = pgs;
        this.AhwBna = textView7;
        this.DbNXlk = textView8;
    }

    public static C42685rbA AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.aJFbMH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42685rbA copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.EZpvd;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = qZH.StateListAnimator.OLrzqt;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = qZH.StateListAnimator.UhxbNG;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = qZH.StateListAnimator.ULRxlR;
                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = qZH.StateListAnimator.init;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = qZH.StateListAnimator.HJWChPiaHEvk;
                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = qZH.StateListAnimator.aBDePw;
                                android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = qZH.StateListAnimator.DPVBvL;
                                    pGS pgs = (pGS) ViewBindings.findChildViewById(view, i);
                                    if (pgs != null) {
                                        i = qZH.StateListAnimator.setCurrentKeyboardTarget;
                                        android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView7 != null) {
                                            i = qZH.StateListAnimator.apNKau;
                                            android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView8 != null) {
                                                return new C42685rbA((ConstraintLayout) view, textView, textView2, textView3, textView4, imageView, textView5, textView6, pgs, textView7, textView8);
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
