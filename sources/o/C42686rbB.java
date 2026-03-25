package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42686rbB implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final RecyclerView EZpvd;
    public final C55173xeu KWHzl;
    public final C33546myW OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C42686rbB(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.copydefault = constraintLayout;
        this.KWHzl = c55173xeu;
        this.AEQbTJ = c55113xdn;
        this.EZpvd = recyclerView;
        this.OLrzqt = c33546myW;
    }

    public static C42686rbB OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RvdRAu;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.RLmrWm;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = qZH.StateListAnimator.HrMTQN;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = qZH.StateListAnimator.getConnectivityMgr;
                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                    if (c33546myW != null) {
                        return new C42686rbB((ConstraintLayout) view, c55173xeu, c55113xdn, recyclerView, c33546myW);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
