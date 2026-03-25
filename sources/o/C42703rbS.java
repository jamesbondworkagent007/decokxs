package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42703rbS implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C33546myW KWHzl;
    public final C40607qbD OLrzqt;
    public final C41381qpj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.copydefault;
    }

    public C42703rbS(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C40607qbD c40607qbD) {
        this.copydefault = c41381qpj;
        this.AEQbTJ = recyclerView;
        this.KWHzl = c33546myW;
        this.OLrzqt = c40607qbD;
    }

    public static C42703rbS OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.onProviderEnabled;
            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
            if (c33546myW != null) {
                i = qZH.StateListAnimator.fmdvVn;
                C40607qbD c40607qbD = (C40607qbD) ViewBindings.findChildViewById(view, i);
                if (c40607qbD != null) {
                    return new C42703rbS((C41381qpj) view, recyclerView, c33546myW, c40607qbD);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
