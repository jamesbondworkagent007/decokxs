package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33924nKx implements ViewBinding {
    public final C55230xfy AEQbTJ;
    public final RecyclerView EZpvd;
    public final ConstraintLayout KWHzl;
    public final C55173xeu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C33924nKx(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = c55173xeu;
        this.AEQbTJ = c55230xfy;
        this.EZpvd = recyclerView;
    }

    public static C33924nKx OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.ixgjPv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C33924nKx copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.sTzBva;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C35399nuc.StateListAnimator.resume;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                i = C35399nuc.StateListAnimator.sZqaRl;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new C33924nKx((ConstraintLayout) view, c55173xeu, c55230xfy, recyclerView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
