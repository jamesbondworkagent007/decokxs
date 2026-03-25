package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42660rac implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final C55258xgZ EZpvd;
    public final C35144npl KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C34888nku copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C42660rac(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C34888nku c34888nku, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C35144npl c35144npl, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.OLrzqt = linearLayout;
        this.copydefault = c34888nku;
        this.EZpvd = c55258xgZ;
        this.KWHzl = c35144npl;
        this.AEQbTJ = c55113xdn;
    }

    public static C42660rac EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dUDNAs;
        C34888nku c34888nku = (C34888nku) ViewBindings.findChildViewById(view, i);
        if (c34888nku != null) {
            i = qZH.StateListAnimator.fupbxE;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = qZH.StateListAnimator.FSMca;
                C35144npl c35144npl = (C35144npl) ViewBindings.findChildViewById(view, i);
                if (c35144npl != null) {
                    i = qZH.StateListAnimator.ibnZAm;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        return new C42660rac((android.widget.LinearLayout) view, c34888nku, c55258xgZ, c35144npl, c55113xdn);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
