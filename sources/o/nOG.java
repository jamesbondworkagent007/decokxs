package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes23.dex */
public final class nOG implements ViewBinding {
    public final C35918oIn AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.CheckBox KWHzl;
    public final Barrier OLrzqt;
    public final C35918oIn copydefault;
    public final android.widget.TextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final nKW valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public nOG(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull C35918oIn c35918oIn, @androidx.annotation.NonNull C35918oIn c35918oIn2, @androidx.annotation.NonNull android.widget.CheckBox checkBox, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull nKW nkw, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.gEmmrt = constraintLayout;
        this.OLrzqt = barrier;
        this.AEQbTJ = c35918oIn;
        this.copydefault = c35918oIn2;
        this.KWHzl = checkBox;
        this.EZpvd = linearLayout;
        this.AhwBna = constraintLayout2;
        this.valueOf = nkw;
        this.djBIcL = textView;
        this.AYXKKw = textView2;
    }

    public static nOG AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.invokespecialaGOrKO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static nOG copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.getNewProxyInstance;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C35399nuc.StateListAnimator.wlaJM;
            C35918oIn c35918oIn = (C35918oIn) ViewBindings.findChildViewById(view, i);
            if (c35918oIn != null) {
                i = C35399nuc.StateListAnimator.dxcTrN;
                C35918oIn c35918oIn2 = (C35918oIn) ViewBindings.findChildViewById(view, i);
                if (c35918oIn2 != null) {
                    i = C35399nuc.StateListAnimator.UlJrfe;
                    android.widget.CheckBox checkBox = (android.widget.CheckBox) ViewBindings.findChildViewById(view, i);
                    if (checkBox != null) {
                        i = C35399nuc.StateListAnimator.DGOPHZ;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = C35399nuc.StateListAnimator.siEkQe;
                            android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
                            if (viewFindChildViewById != null) {
                                nKW nkwKWHzl = nKW.KWHzl(viewFindChildViewById);
                                i = C35399nuc.StateListAnimator.ScLVFT;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C35399nuc.StateListAnimator.RZOtbZ;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new nOG(constraintLayout, barrier, c35918oIn, c35918oIn2, checkBox, linearLayout, constraintLayout, nkwKWHzl, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
