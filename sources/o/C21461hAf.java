package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21461hAf implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final RecyclerView KWHzl;
    public final wXO OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C21461hAf(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull wXO wxo) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = recyclerView;
        this.OLrzqt = wxo;
    }

    public static C21461hAf KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.akftKQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21461hAf copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ComponentActivityExternalSyntheticLambda1;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C23274hvD.Application.ViewTreeFullyDrawnReporterOwner;
            wXO wxo = (wXO) ViewBindings.findChildViewById(view, i);
            if (wxo != null) {
                return new C21461hAf((ConstraintLayout) view, recyclerView, wxo);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
