package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C46526tXp;

/* JADX INFO: renamed from: o.tXu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46531tXu implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final RecyclerView OLrzqt;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C46531tXu(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2) {
        this.KWHzl = constraintLayout;
        this.copydefault = view;
        this.AEQbTJ = c33537myN;
        this.OLrzqt = recyclerView;
        this.EZpvd = constraintLayout2;
    }

    public static C46531tXu EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C46531tXu copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C46526tXp.ActionBar.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C46531tXu AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C46526tXp.Application.copydefault;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C46526tXp.Application.OLrzqt;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                i = C46526tXp.Application.isConnected;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new C46531tXu(constraintLayout, viewFindChildViewById, c33537myN, recyclerView, constraintLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
