package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public final class nKY implements ViewBinding {
    public final RecyclerView EZpvd;
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public nKY(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.OLrzqt = constraintLayout;
        this.EZpvd = recyclerView;
    }

    public static nKY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DGgnkA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static nKY KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.hvKCwS;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new nKY((ConstraintLayout) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
