package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42662rae implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final C55258xgZ EZpvd;
    public final C34883nkp KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C34888nku copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AYXKKw;
    }

    public C42662rae(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C34888nku c34888nku, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C34883nkp c34883nkp, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.AYXKKw = linearLayout;
        this.copydefault = c34888nku;
        this.EZpvd = c55258xgZ;
        this.KWHzl = c34883nkp;
        this.OLrzqt = linearLayout2;
        this.AEQbTJ = c55113xdn;
    }

    public static C42662rae AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dUDNAs;
        C34888nku c34888nku = (C34888nku) ViewBindings.findChildViewById(view, i);
        if (c34888nku != null) {
            i = qZH.StateListAnimator.fupbxE;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = qZH.StateListAnimator.Dfm;
                C34883nkp c34883nkp = (C34883nkp) ViewBindings.findChildViewById(view, i);
                if (c34883nkp != null) {
                    i = qZH.StateListAnimator.GPCHlQ;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = qZH.StateListAnimator.ibnZAm;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            return new C42662rae((android.widget.LinearLayout) view, c34888nku, c55258xgZ, c34883nkp, linearLayout, c55113xdn);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
