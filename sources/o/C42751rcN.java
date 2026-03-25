package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42751rcN implements ViewBinding {
    public final C40499qYc AEQbTJ;
    public final RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.AEQbTJ;
    }

    public C42751rcN(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = c40499qYc;
        this.OLrzqt = recyclerView;
    }

    public static C42751rcN OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C42751rcN((C40499qYc) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
