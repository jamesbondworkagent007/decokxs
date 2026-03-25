package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes9.dex */
public final class qZZ implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55258xgZ EZpvd;
    public final C34890nkw KWHzl;
    public final C35144npl OLrzqt;
    public final C34883nkp copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final C55113xdn gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.djBIcL;
    }

    public qZZ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C34890nkw c34890nkw, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C35144npl c35144npl, @androidx.annotation.NonNull C34883nkp c34883nkp, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.djBIcL = linearLayout;
        this.KWHzl = c34890nkw;
        this.EZpvd = c55258xgZ;
        this.OLrzqt = c35144npl;
        this.copydefault = c34883nkp;
        this.AEQbTJ = linearLayout2;
        this.gEmmrt = c55113xdn;
    }

    public static qZZ copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.aUsmxb;
        C34890nkw c34890nkw = (C34890nkw) ViewBindings.findChildViewById(view, i);
        if (c34890nkw != null) {
            i = qZH.StateListAnimator.fupbxE;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = qZH.StateListAnimator.FSMca;
                C35144npl c35144npl = (C35144npl) ViewBindings.findChildViewById(view, i);
                if (c35144npl != null) {
                    i = qZH.StateListAnimator.Dfm;
                    C34883nkp c34883nkp = (C34883nkp) ViewBindings.findChildViewById(view, i);
                    if (c34883nkp != null) {
                        i = qZH.StateListAnimator.GPCHlQ;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = qZH.StateListAnimator.ibnZAm;
                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                            if (c55113xdn != null) {
                                return new qZZ((android.widget.LinearLayout) view, c34890nkw, c55258xgZ, c35144npl, c34883nkp, linearLayout, c55113xdn);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
