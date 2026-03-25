package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42710rbZ implements ViewBinding {
    public final C40776qeN AEQbTJ;
    public final C33546myW EZpvd;
    public final RecyclerView OLrzqt;
    public final C41381qpj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.copydefault;
    }

    public C42710rbZ(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull C40776qeN c40776qeN, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.copydefault = c41381qpj;
        this.AEQbTJ = c40776qeN;
        this.OLrzqt = recyclerView;
        this.EZpvd = c33546myW;
    }

    public static C42710rbZ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RSmiaq;
        C40776qeN c40776qeN = (C40776qeN) ViewBindings.findChildViewById(view, i);
        if (c40776qeN != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.onProviderEnabled;
                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                if (c33546myW != null) {
                    return new C42710rbZ((C41381qpj) view, c40776qeN, recyclerView, c33546myW);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
