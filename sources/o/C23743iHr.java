package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23743iHr implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final RecyclerView AhwBna;
    public final C27385juG EZpvd;
    public final C55113xdn KWHzl;
    public final C33546myW OLrzqt;
    public final C52794wYp copydefault;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C23743iHr(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C27385juG c27385juG, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.valueOf = constraintLayout;
        this.copydefault = c52794wYp;
        this.AEQbTJ = c55173xeu;
        this.EZpvd = c27385juG;
        this.KWHzl = c55113xdn;
        this.OLrzqt = c33546myW;
        this.AhwBna = recyclerView;
    }

    public static C23743iHr KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.QHmsKR;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C25493ixk.ActionBar.hrjNmC;
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
                                return new C23743iHr((ConstraintLayout) view, c52794wYp, c55173xeu, c27385juG, c55113xdn, c33546myW, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
