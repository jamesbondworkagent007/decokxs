package o;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23745iHt implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C55173xeu OLrzqt;
    public final NestedScrollView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C23745iHt(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull NestedScrollView nestedScrollView) {
        this.KWHzl = frameLayout;
        this.OLrzqt = c55173xeu;
        this.AEQbTJ = c55113xdn;
        this.EZpvd = recyclerView;
        this.copydefault = nestedScrollView;
    }

    public static C23745iHt copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QfJbVf;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C25493ixk.ActionBar.itxZVF;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C25493ixk.ActionBar.OFqMGB;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C25493ixk.ActionBar.hBORwR;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        return new C23745iHt((android.widget.FrameLayout) view, c55173xeu, c55113xdn, recyclerView, nestedScrollView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
