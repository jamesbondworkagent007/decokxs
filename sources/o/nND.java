package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nND implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final Barrier KWHzl;
    public final C35893oHp OLrzqt;
    public final Guideline copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public nND(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull C35893oHp c35893oHp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = barrier;
        this.copydefault = guideline;
        this.OLrzqt = c35893oHp;
        this.EZpvd = textView;
        this.valueOf = textView2;
        this.djBIcL = textView3;
        this.AhwBna = textView4;
    }

    public static nND EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.aJZHYI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static nND OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.getNewProxyInstance;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C35399nuc.StateListAnimator.DrNnAm;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = C35399nuc.StateListAnimator.invokespecialsiEkQe;
                C35893oHp c35893oHp = (C35893oHp) ViewBindings.findChildViewById(view, i);
                if (c35893oHp != null) {
                    i = C35399nuc.StateListAnimator.RidNCX;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C35399nuc.StateListAnimator.sVaiLC;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C35399nuc.StateListAnimator.QVMIlxQVMIlx;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C35399nuc.StateListAnimator.SFHvfS;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    return new nND((ConstraintLayout) view, barrier, guideline, c35893oHp, textView, textView2, textView3, textView4);
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
