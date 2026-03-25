package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34010nOb implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C52794wYp EZpvd;
    public final ConstraintLayout KWHzl;
    public final C33931nLd copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C34010nOb(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C33931nLd c33931nLd) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = c52794wYp;
        this.KWHzl = constraintLayout2;
        this.copydefault = c33931nLd;
    }

    public static C34010nOb KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DQzvGNdrmXxudrmXxu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C34010nOb AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.hUfVAv;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C35399nuc.StateListAnimator.sElUiK;
            android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById != null) {
                return new C34010nOb(constraintLayout, c52794wYp, constraintLayout, C33931nLd.OLrzqt(viewFindChildViewById));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
