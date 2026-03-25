package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42818rdb implements ViewBinding {
    public final C40369qTh EZpvd;
    public final RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.EZpvd;
    }

    public C42818rdb(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = c40369qTh;
        this.OLrzqt = recyclerView;
    }

    public static C42818rdb EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C42818rdb((C40369qTh) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
