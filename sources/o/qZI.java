package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes16.dex */
public final class qZI implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C33546myW EZpvd;
    public final C55237xgE KWHzl;
    public final C33537myN OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public qZI(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55237xgE c55237xgE) {
        this.AEQbTJ = linearLayout;
        this.OLrzqt = c33537myN;
        this.copydefault = recyclerView;
        this.EZpvd = c33546myW;
        this.KWHzl = c55237xgE;
    }

    public static qZI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static qZI copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static qZI copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.isConnected;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = qZH.StateListAnimator.fzHEvu;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.ORrpqH;
                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                if (c33546myW != null) {
                    i = qZH.StateListAnimator.DcNNRp;
                    C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                    if (c55237xgE != null) {
                        return new qZI((android.widget.LinearLayout) view, c33537myN, recyclerView, c33546myW, c55237xgE);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
