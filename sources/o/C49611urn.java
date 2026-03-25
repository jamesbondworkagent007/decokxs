package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C49511upt;

/* JADX INFO: renamed from: o.urn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49611urn implements ViewBinding {
    public final C55251xgS AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C55239xgG KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55258xgZ copydefault;
    public final ConstraintLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C49611urn(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull ConstraintLayout constraintLayout3) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = c55251xgS;
        this.EZpvd = constraintLayout2;
        this.KWHzl = c55239xgG;
        this.copydefault = c55258xgZ;
        this.gEmmrt = constraintLayout3;
    }

    public static C49611urn copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C49511upt.StateListAnimator.gHZMYf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C49611urn copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C49511upt.Application.AuCTel;
        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
        if (c55251xgS != null) {
            i = C49511upt.Application.uzCIH;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C49511upt.Application.UscePu;
                C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                if (c55239xgG != null) {
                    i = C49511upt.Application.DGUQLIhJrIAr;
                    C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                    if (c55258xgZ != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                        return new C49611urn(constraintLayout2, c55251xgS, constraintLayout, c55239xgG, c55258xgZ, constraintLayout2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
