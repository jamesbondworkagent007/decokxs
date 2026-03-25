package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42820rdd implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C40369qTh OLrzqt;
    public final C40363qTb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.OLrzqt;
    }

    public C42820rdd(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C40363qTb c40363qTb) {
        this.OLrzqt = c40369qTh;
        this.AEQbTJ = recyclerView;
        this.copydefault = c40363qTb;
    }

    public static C42820rdd copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.fmdvVn;
            C40363qTb c40363qTb = (C40363qTb) ViewBindings.findChildViewById(view, i);
            if (c40363qTb != null) {
                return new C42820rdd((C40369qTh) view, recyclerView, c40363qTb);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
