package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes19.dex */
public final class qZU implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C55241xgI KWHzl;
    public final C33542myS OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public qZU(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33542myS c33542myS, @androidx.annotation.NonNull C55241xgI c55241xgI, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.EZpvd = linearLayout;
        this.OLrzqt = c33542myS;
        this.KWHzl = c55241xgI;
        this.AEQbTJ = linearLayout2;
    }

    public static qZU OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.OHqIaq;
        C33542myS c33542myS = (C33542myS) ViewBindings.findChildViewById(view, i);
        if (c33542myS != null) {
            i = qZH.StateListAnimator.OFhtUX;
            C55241xgI c55241xgI = (C55241xgI) ViewBindings.findChildViewById(view, i);
            if (c55241xgI != null) {
                i = qZH.StateListAnimator.dmfpNf;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new qZU((android.widget.LinearLayout) view, c33542myS, c55241xgI, linearLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
