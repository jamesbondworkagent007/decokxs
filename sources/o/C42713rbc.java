package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42713rbc implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.view.View AhwBna;
    public final android.view.View EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final android.widget.FrameLayout gEmmrt;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AhwBna;
    }

    public C42713rbc(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout5, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout6) {
        this.AhwBna = view;
        this.AEQbTJ = appCompatTextView;
        this.OLrzqt = frameLayout;
        this.KWHzl = frameLayout2;
        this.copydefault = frameLayout3;
        this.EZpvd = view2;
        this.valueOf = frameLayout4;
        this.gEmmrt = frameLayout5;
        this.AYXKKw = constraintLayout;
        this.djBIcL = frameLayout6;
    }

    public static C42713rbc EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.WS, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C42713rbc EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.AEQbTJ;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = qZH.StateListAnimator.gGvvIC;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = qZH.StateListAnimator.giSNqX;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = qZH.StateListAnimator.gtdfxv;
                    android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.hrjNmC))) != null) {
                        i = qZH.StateListAnimator.putInt;
                        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout4 != null) {
                            i = qZH.StateListAnimator.HJWChPOKBmQNaCIdOM;
                            android.widget.FrameLayout frameLayout5 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout5 != null) {
                                i = qZH.StateListAnimator.gCNefq;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = qZH.StateListAnimator.dpErvT;
                                    android.widget.FrameLayout frameLayout6 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout6 != null) {
                                        return new C42713rbc(view, appCompatTextView, frameLayout, frameLayout2, frameLayout3, viewFindChildViewById, frameLayout4, frameLayout5, constraintLayout, frameLayout6);
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
