package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42827rdk implements ViewBinding {
    public final C41820qxy AEQbTJ;
    public final RecyclerView EZpvd;
    public final C33546myW KWHzl;
    public final C33546myW OLrzqt;
    public final C41819qxx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.OLrzqt;
    }

    public C42827rdk(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull C41819qxx c41819qxx, @androidx.annotation.NonNull C41820qxy c41820qxy) {
        this.OLrzqt = c33546myW;
        this.EZpvd = recyclerView;
        this.KWHzl = c33546myW2;
        this.copydefault = c41819qxx;
        this.AEQbTJ = c41820qxy;
    }

    public static C42827rdk EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            C33546myW c33546myW = (C33546myW) view;
            i = qZH.StateListAnimator.fRNHEq;
            C41819qxx c41819qxx = (C41819qxx) ViewBindings.findChildViewById(view, i);
            if (c41819qxx != null) {
                i = qZH.StateListAnimator.extraCallback;
                C41820qxy c41820qxy = (C41820qxy) ViewBindings.findChildViewById(view, i);
                if (c41820qxy != null) {
                    return new C42827rdk(c33546myW, recyclerView, c33546myW, c41819qxx, c41820qxy);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
