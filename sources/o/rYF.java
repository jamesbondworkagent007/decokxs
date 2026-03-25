package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.rXV;

/* JADX INFO: loaded from: classes19.dex */
public final class rYF implements ViewBinding {
    public final C55239xgG AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C55251xgS KWHzl;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public rYF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c55239xgG;
        this.KWHzl = c55251xgS;
        this.copydefault = textView;
    }

    public static rYF OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(rXV.StateListAnimator.fetchVPNInfo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static rYF KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = rXV.ActionBar.AubY;
        C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
        if (c55239xgG != null) {
            i = rXV.ActionBar.RJOkX;
            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
            if (c55251xgS != null) {
                i = rXV.ActionBar.QUSxYX;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new rYF((ConstraintLayout) view, c55239xgG, c55251xgS, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
