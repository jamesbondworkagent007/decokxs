package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23854iLu implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C27132jpS KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23854iLu(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27132jpS c27132jpS) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = c27132jpS;
    }

    public static C23854iLu OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.UrRBLY;
        C27132jpS c27132jpS = (C27132jpS) ViewBindings.findChildViewById(view, i);
        if (c27132jpS != null) {
            return new C23854iLu((ConstraintLayout) view, c27132jpS);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
