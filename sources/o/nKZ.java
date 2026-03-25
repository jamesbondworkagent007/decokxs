package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public final class nKZ implements ViewBinding {
    public final C55251xgS AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C35893oHp copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public nKZ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = c55251xgS;
        this.EZpvd = constraintLayout2;
        this.copydefault = c35893oHp;
        this.KWHzl = textView;
        this.valueOf = textView2;
    }

    public static nKZ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.QDqgQU;
        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
        if (c55251xgS != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C35399nuc.StateListAnimator.invokespecialsiEkQe;
            C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
            if (c35893oHp != null) {
                i = C35399nuc.StateListAnimator.fdazkH;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C35399nuc.StateListAnimator.QVMIlx;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new nKZ(constraintLayout, c55251xgS, constraintLayout, c35893oHp, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
