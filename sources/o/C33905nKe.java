package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33905nKe implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final ConstraintLayout KWHzl;
    public final C55230xfy OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C33905nKe(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = c55230xfy;
        this.AEQbTJ = recyclerView;
    }

    public static C33905nKe AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.QCjLjM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C33905nKe OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.resume;
        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
        if (c55230xfy != null) {
            i = C35399nuc.StateListAnimator.DVmcag;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new C33905nKe((ConstraintLayout) view, c55230xfy, recyclerView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
