package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23744iHs implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final RecyclerView AYXKKw;
    public final ConstraintLayout EZpvd;
    public final C33546myW KWHzl;
    public final C55113xdn OLrzqt;
    public final C27385juG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C23744iHs(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C27385juG c27385juG, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c55173xeu;
        this.copydefault = c27385juG;
        this.OLrzqt = c55113xdn;
        this.KWHzl = c33546myW;
        this.AYXKKw = recyclerView;
    }

    public static C23744iHs EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.hrjNmC;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C25493ixk.ActionBar.RIuxYh;
            C27385juG c27385juG = (C27385juG) ViewBindings.findChildViewById(view, i);
            if (c27385juG != null) {
                i = C25493ixk.ActionBar.HJWChPRAkuRW;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = C25493ixk.ActionBar.QOeQqh;
                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                    if (c33546myW != null) {
                        i = C25493ixk.ActionBar.hBUiXU;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new C23744iHs((ConstraintLayout) view, c55173xeu, c27385juG, c55113xdn, c33546myW, recyclerView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
