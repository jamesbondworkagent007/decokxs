package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42740rcC implements ViewBinding {
    public final C35152npt EZpvd;
    public final RecyclerView KWHzl;
    public final C35152npt OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C35152npt getRoot() {
        return this.EZpvd;
    }

    public C42740rcC(@androidx.annotation.NonNull C35152npt c35152npt, @androidx.annotation.NonNull C35152npt c35152npt2, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = c35152npt;
        this.OLrzqt = c35152npt2;
        this.KWHzl = recyclerView;
    }

    public static C42740rcC EZpvd(@androidx.annotation.NonNull android.view.View view) {
        C35152npt c35152npt = (C35152npt) view;
        int i = qZH.StateListAnimator.hPlhRW;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C42740rcC(c35152npt, c35152npt, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
