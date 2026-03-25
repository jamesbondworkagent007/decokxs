package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42823rdg implements ViewBinding {
    public final RecyclerView EZpvd;
    public final C40369qTh KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.KWHzl;
    }

    public C42823rdg(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = c40369qTh;
        this.EZpvd = recyclerView;
    }

    public static C42823rdg AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C42823rdg((C40369qTh) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
