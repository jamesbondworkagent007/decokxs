package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42786rcw implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C35152npt EZpvd;
    public final C35152npt KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C35152npt getRoot() {
        return this.KWHzl;
    }

    public C42786rcw(@androidx.annotation.NonNull C35152npt c35152npt, @androidx.annotation.NonNull C35152npt c35152npt2, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = c35152npt;
        this.EZpvd = c35152npt2;
        this.AEQbTJ = recyclerView;
    }

    public static C42786rcw OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        C35152npt c35152npt = (C35152npt) view;
        int i = qZH.StateListAnimator.hPlhRW;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C42786rcw(c35152npt, c35152npt, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
