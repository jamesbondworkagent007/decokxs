package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42824rdh implements ViewBinding {
    public final C40369qTh KWHzl;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.KWHzl;
    }

    public C42824rdh(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = c40369qTh;
        this.copydefault = recyclerView;
    }

    public static C42824rdh AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C42824rdh((C40369qTh) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
