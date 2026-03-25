package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tPq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46311tPq implements ViewBinding {
    public final C33604mzb AEQbTJ;
    public final C33546myW EZpvd;
    public final RecyclerView KWHzl;
    public final C33546myW OLrzqt;
    public final C55237xgE copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.OLrzqt;
    }

    public C46311tPq(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull C55237xgE c55237xgE) {
        this.OLrzqt = c33546myW;
        this.AEQbTJ = c33604mzb;
        this.KWHzl = recyclerView;
        this.EZpvd = c33546myW2;
        this.copydefault = c55237xgE;
    }

    public static C46311tPq AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.fLIjIY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C46311tPq OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.OijiEz;
        C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
        if (c33604mzb != null) {
            i = C47501trL.TaskDescription.fMBJsc;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                C33546myW c33546myW = (C33546myW) view;
                i = C47501trL.TaskDescription.drbYRJ;
                C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                if (c55237xgE != null) {
                    return new C46311tPq(c33546myW, c33604mzb, recyclerView, c33546myW, c55237xgE);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
