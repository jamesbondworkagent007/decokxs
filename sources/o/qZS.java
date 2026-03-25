package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes19.dex */
public final class qZS implements ViewBinding {
    public final C55254xgV AEQbTJ;
    public final android.widget.LinearLayout KWHzl;
    public final C33542myS OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public qZS(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33542myS c33542myS, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.copydefault = linearLayout;
        this.OLrzqt = c33542myS;
        this.AEQbTJ = c55254xgV;
        this.KWHzl = linearLayout2;
    }

    public static qZS EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.OHqIaq;
        C33542myS c33542myS = (C33542myS) ViewBindings.findChildViewById(view, i);
        if (c33542myS != null) {
            i = qZH.StateListAnimator.OFhtUX;
            C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
            if (c55254xgV != null) {
                i = qZH.StateListAnimator.dmfpNf;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new qZS((android.widget.LinearLayout) view, c33542myS, c55254xgV, linearLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
