package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.rXV;

/* JADX INFO: renamed from: o.rYz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42603rYz implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final RecyclerView AYXKKw;
    public final C33546myW AhwBna;
    public final C55113xdn EZpvd;
    public final C33604mzb KWHzl;
    public final C55173xeu OLrzqt;
    public final C55113xdn copydefault;
    public final RecyclerView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42603rYz(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn2, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = c55113xdn;
        this.OLrzqt = c55173xeu;
        this.copydefault = c55113xdn2;
        this.KWHzl = c33604mzb;
        this.AYXKKw = recyclerView;
        this.djBIcL = recyclerView2;
        this.AhwBna = c33546myW;
    }

    public static C42603rYz EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = rXV.ActionBar.gEmmrt;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = rXV.ActionBar.AkhnZx;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = rXV.ActionBar.getNewProxyInstance;
                C55113xdn c55113xdn2 = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn2 != null) {
                    i = rXV.ActionBar.hDKMBd;
                    C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                    if (c33604mzb != null) {
                        i = rXV.ActionBar.zLjUOn;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            i = rXV.ActionBar.zsXlph;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView2 != null) {
                                i = rXV.ActionBar.gHZMYf;
                                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                if (c33546myW != null) {
                                    return new C42603rYz((ConstraintLayout) view, c55113xdn, c55173xeu, c55113xdn2, c33604mzb, recyclerView, recyclerView2, c33546myW);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
