package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42765rcb implements ViewBinding {
    public final RecyclerView EZpvd;
    public final C41381qpj KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.KWHzl;
    }

    public C42765rcb(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = c41381qpj;
        this.EZpvd = recyclerView;
    }

    public static C42765rcb KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C42765rcb((C41381qpj) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
