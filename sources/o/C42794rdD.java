package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import o.qZH;

/* JADX INFO: renamed from: o.rdD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42794rdD implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final MaterialCardView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final ConstraintLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C42794rdD(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull MaterialCardView materialCardView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.gEmmrt = constraintLayout;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = imageView;
        this.EZpvd = textView;
        this.KWHzl = linearLayout;
        this.copydefault = textView2;
        this.AYXKKw = materialCardView;
        this.AhwBna = constraintLayout2;
        this.djBIcL = linearLayout2;
    }

    public static C42794rdD copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DaTmkG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42794rdD EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.AEQbTJ;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.QbewEr;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = qZH.StateListAnimator.dxcTrN;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = qZH.StateListAnimator.fZBcTu;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = qZH.StateListAnimator.flVtFt;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = qZH.StateListAnimator.hBpjJd;
                            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, i);
                            if (materialCardView != null) {
                                i = qZH.StateListAnimator.TarCU;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = qZH.StateListAnimator.kcQGz;
                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        return new C42794rdD((ConstraintLayout) view, c52794wYp, imageView, textView, linearLayout, textView2, materialCardView, constraintLayout, linearLayout2);
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
