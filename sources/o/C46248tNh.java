package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46248tNh implements ViewBinding {
    public final C33546myW AEQbTJ;
    public final C33604mzb EZpvd;
    public final RecyclerView KWHzl;
    public final C33603mza OLrzqt;
    public final ConstraintLayout copydefault;
    public final C55237xgE djBIcL;
    public final C33537myN valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C46248tNh(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull C33537myN c33537myN) {
        this.copydefault = constraintLayout;
        this.KWHzl = recyclerView;
        this.AEQbTJ = c33546myW;
        this.EZpvd = c33604mzb;
        this.OLrzqt = c33603mza;
        this.djBIcL = c55237xgE;
        this.valueOf = c33537myN;
    }

    public static C46248tNh copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C46248tNh OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.OcIXYQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C46248tNh copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DztXDE;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C47501trL.TaskDescription.OEgNct;
            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
            if (c33546myW != null) {
                i = C47501trL.TaskDescription.OijiEz;
                C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                if (c33604mzb != null) {
                    i = C47501trL.TaskDescription.dPkBzA;
                    C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                    if (c33603mza != null) {
                        i = C47501trL.TaskDescription.drbYRJ;
                        C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                        if (c55237xgE != null) {
                            i = C47501trL.TaskDescription.fZc;
                            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
                            if (c33537myN != null) {
                                return new C46248tNh((ConstraintLayout) view, recyclerView, c33546myW, c33604mzb, c33603mza, c55237xgE, c33537myN);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
