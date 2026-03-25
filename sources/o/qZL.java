package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes19.dex */
public final class qZL implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C33542myS KWHzl;
    public final C55254xgV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public qZL(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull C33542myS c33542myS) {
        this.AEQbTJ = linearLayout;
        this.copydefault = c55254xgV;
        this.KWHzl = c33542myS;
    }

    public static qZL AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.vqBjd;
        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
        if (c55254xgV != null) {
            i = qZH.StateListAnimator.writeToParcel;
            C33542myS c33542myS = (C33542myS) ViewBindings.findChildViewById(view, i);
            if (c33542myS != null) {
                return new qZL((android.widget.LinearLayout) view, c55254xgV, c33542myS);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
