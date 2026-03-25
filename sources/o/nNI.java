package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nNI implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final nKW KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public nNI(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull nKW nkw, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = nkw;
        this.AEQbTJ = textView;
        this.copydefault = textView2;
        this.EZpvd = textView3;
        this.AhwBna = textView4;
        this.gEmmrt = textView5;
    }

    public static nNI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.RvdRAu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static nNI copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.siEkQe;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            nKW nkwKWHzl = nKW.KWHzl(viewFindChildViewById);
            i = C35399nuc.StateListAnimator.icKaHr;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C35399nuc.StateListAnimator.isTimeProfileEmpty;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C35399nuc.StateListAnimator.hQufeQ;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C35399nuc.StateListAnimator.fdazkH;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C35399nuc.StateListAnimator.onLost;
                            android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                return new nNI((ConstraintLayout) view, nkwKWHzl, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
