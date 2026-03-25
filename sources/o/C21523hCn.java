package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21523hCn implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final C33603mza EZpvd;
    public final C33546myW KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C33546myW copydefault;
    public final RecyclerView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.KWHzl;
    }

    public C21523hCn(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = c33546myW;
        this.AEQbTJ = c55113xdn;
        this.OLrzqt = constraintLayout;
        this.EZpvd = c33603mza;
        this.copydefault = c33546myW2;
        this.gEmmrt = recyclerView;
    }

    public static C21523hCn copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RuDPQV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21523hCn copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DrNnAm;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C23274hvD.Application.gbIfDn;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C23274hvD.Application.fRNHEq;
                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                if (c33603mza != null) {
                    C33546myW c33546myW = (C33546myW) view;
                    i = C23274hvD.Application.isFullyDrawnReported;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new C21523hCn(c33546myW, c55113xdn, constraintLayout, c33603mza, c33546myW, recyclerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
