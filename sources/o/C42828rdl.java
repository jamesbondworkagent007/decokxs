package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42828rdl implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C41820qxy AYXKKw;
    public final android.widget.FrameLayout EZpvd;
    public final C55173xeu KWHzl;
    public final C33546myW OLrzqt;
    public final C33546myW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.OLrzqt;
    }

    public C42828rdl(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull C41820qxy c41820qxy) {
        this.OLrzqt = c33546myW;
        this.EZpvd = frameLayout;
        this.KWHzl = c55173xeu;
        this.AEQbTJ = recyclerView;
        this.copydefault = c33546myW2;
        this.AYXKKw = c41820qxy;
    }

    public static C42828rdl copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DbNXlk;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.fkESqH;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.onStatusChanged;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    C33546myW c33546myW = (C33546myW) view;
                    i = qZH.StateListAnimator.fmdvVn;
                    C41820qxy c41820qxy = (C41820qxy) ViewBindings.findChildViewById(view, i);
                    if (c41820qxy != null) {
                        return new C42828rdl(c33546myW, frameLayout, c55173xeu, recyclerView, c33546myW, c41820qxy);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
