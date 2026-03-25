package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C33160mrH;

/* JADX INFO: renamed from: o.mtq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33301mtq implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final android.view.View KWHzl;
    public final C55249xgQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C33301mtq(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull ConstraintLayout constraintLayout2) {
        this.EZpvd = constraintLayout;
        this.copydefault = c55249xgQ;
        this.KWHzl = view;
        this.AEQbTJ = constraintLayout2;
    }

    public static C33301mtq EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C33160mrH.Application.AYXKKw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C33301mtq KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C33160mrH.StateListAnimator.AEQbTJ;
        C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
        if (c55249xgQ != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C33160mrH.StateListAnimator.iwGUEr))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new C33301mtq(constraintLayout, c55249xgQ, viewFindChildViewById, constraintLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
