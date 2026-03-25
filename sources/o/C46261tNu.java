package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46261tNu implements ViewBinding {
    public final C33546myW AEQbTJ;
    public final C33604mzb EZpvd;
    public final C33603mza KWHzl;
    public final C54990xbW OLrzqt;
    public final RecyclerView copydefault;
    public final ConstraintLayout djBIcL;
    public final C55237xgE gEmmrt;
    public final C33537myN valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C46261tNu(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C54990xbW c54990xbW, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull C33537myN c33537myN) {
        this.djBIcL = constraintLayout;
        this.OLrzqt = c54990xbW;
        this.copydefault = recyclerView;
        this.AEQbTJ = c33546myW;
        this.EZpvd = c33604mzb;
        this.KWHzl = c33603mza;
        this.gEmmrt = c55237xgE;
        this.valueOf = c33537myN;
    }

    public static C46261tNu EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C46261tNu AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.fFgQHt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C46261tNu AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DGUQLIDGUQLI;
        C54990xbW c54990xbW = (C54990xbW) ViewBindings.findChildViewById(view, i);
        if (c54990xbW != null) {
            i = C47501trL.TaskDescription.DztXDE;
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
                                    return new C46261tNu((ConstraintLayout) view, c54990xbW, recyclerView, c33546myW, c33604mzb, c33603mza, c55237xgE, c33537myN);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
