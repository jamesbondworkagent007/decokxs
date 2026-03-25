package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public final class nNL implements ViewBinding {
    public final wYK AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C33933nLf OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public nNL(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C33933nLf c33933nLf) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = wyk;
        this.copydefault = constraintLayout2;
        this.OLrzqt = c33933nLf;
    }

    public static nNL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.geLlBI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static nNL AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.aUsmxb;
        wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
        if (wyk != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C35399nuc.StateListAnimator.sElUiK;
            android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById != null) {
                return new nNL(constraintLayout, wyk, constraintLayout, C33933nLf.copydefault(viewFindChildViewById));
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
