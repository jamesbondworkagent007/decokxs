package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iJJ implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C27339jtN KWHzl;
    public final C55173xeu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public iJJ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C27339jtN c27339jtN) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = c55173xeu;
        this.KWHzl = c27339jtN;
    }

    public static iJJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.RJOkX;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C25493ixk.ActionBar.gwTjWJ;
            C27339jtN c27339jtN = (C27339jtN) ViewBindings.findChildViewById(view, i);
            if (c27339jtN != null) {
                return new iJJ((ConstraintLayout) view, c55173xeu, c27339jtN);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
