package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iHF implements ViewBinding {
    public final ConstraintLayout OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public iHF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.OLrzqt = constraintLayout;
        this.copydefault = recyclerView;
    }

    public static iHF copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.znKlvJ;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new iHF((ConstraintLayout) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
