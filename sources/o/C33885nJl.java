package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33885nJl implements ViewBinding {
    public final C35893oHp AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final NestedScrollView copydefault;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C33885nJl(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.AEQbTJ = c35893oHp;
        this.copydefault = nestedScrollView;
        this.EZpvd = textView;
        this.gEmmrt = textView2;
        this.valueOf = textView3;
        this.AhwBna = textView4;
    }

    public static C33885nJl KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.gasjUx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C33885nJl KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.geLlBI;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C35399nuc.StateListAnimator.DPHOMC;
            C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
            if (c35893oHp != null) {
                i = C35399nuc.StateListAnimator.QOjuYg;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = C35399nuc.StateListAnimator.DcNNRp;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C35399nuc.StateListAnimator.OEsIKP;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C35399nuc.StateListAnimator.OqhRBMiKdSzF;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C35399nuc.StateListAnimator.UkCIYP;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    return new C33885nJl((ConstraintLayout) view, constraintLayout, c35893oHp, nestedScrollView, textView, textView2, textView3, textView4);
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
