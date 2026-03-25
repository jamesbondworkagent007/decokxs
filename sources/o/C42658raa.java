package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42658raa implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final C55258xgZ EZpvd;
    public final C35144npl KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C46663tbS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AYXKKw;
    }

    public C42658raa(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C46663tbS c46663tbS, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C35144npl c35144npl, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.AYXKKw = linearLayout;
        this.copydefault = c46663tbS;
        this.EZpvd = c55258xgZ;
        this.KWHzl = c35144npl;
        this.OLrzqt = linearLayout2;
        this.AEQbTJ = c55113xdn;
    }

    public static C42658raa KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dUDNAs;
        C46663tbS c46663tbS = (C46663tbS) ViewBindings.findChildViewById(view, i);
        if (c46663tbS != null) {
            i = qZH.StateListAnimator.fupbxE;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = qZH.StateListAnimator.FSMca;
                C35144npl c35144npl = (C35144npl) ViewBindings.findChildViewById(view, i);
                if (c35144npl != null) {
                    i = qZH.StateListAnimator.GPCHlQ;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = qZH.StateListAnimator.ibnZAm;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            return new C42658raa((android.widget.LinearLayout) view, c46663tbS, c55258xgZ, c35144npl, linearLayout, c55113xdn);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
