package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48370uOz implements ViewBinding {
    public final C55237xgE AEQbTJ;
    public final C33546myW EZpvd;
    public final RecyclerView KWHzl;
    public final C55237xgE copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55237xgE getRoot() {
        return this.AEQbTJ;
    }

    public C48370uOz(@androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55237xgE c55237xgE2) {
        this.AEQbTJ = c55237xgE;
        this.KWHzl = recyclerView;
        this.EZpvd = c33546myW;
        this.copydefault = c55237xgE2;
    }

    public static C48370uOz EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.ActivityViewModelLazyKtviewModels1;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C48033uCm.Application.resultCodeToString;
            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
            if (c33546myW != null) {
                C55237xgE c55237xgE = (C55237xgE) view;
                return new C48370uOz(c55237xgE, recyclerView, c33546myW, c55237xgE);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
