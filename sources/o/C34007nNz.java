package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nNz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34007nNz implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C33933nLf EZpvd;
    public final ConstraintLayout OLrzqt;
    public final wYK copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C34007nNz(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C33933nLf c33933nLf) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = wyk;
        this.OLrzqt = constraintLayout2;
        this.EZpvd = c33933nLf;
    }

    public static C34007nNz OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.hrjNmC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C34007nNz copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.aUsmxb;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C35399nuc.StateListAnimator.DxnCrt;
            android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById != null) {
                return new C34007nNz(constraintLayout, wyk, constraintLayout, C33933nLf.copydefault(viewFindChildViewById));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
