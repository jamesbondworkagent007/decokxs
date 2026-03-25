package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42721rbk implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final C42989rgn KWHzl;
    public final AppCompatImageView OLrzqt;
    public final ConstraintLayout copydefault;
    public final C41312qoT gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42721rbk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C42989rgn c42989rgn, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C41312qoT c41312qoT) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = c42989rgn;
        this.copydefault = constraintLayout2;
        this.OLrzqt = appCompatImageView;
        this.EZpvd = appCompatImageView2;
        this.gEmmrt = c41312qoT;
    }

    public static C42721rbk AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.hCLrkq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42721rbk OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sTzBva;
        C42989rgn c42989rgn = (C42989rgn) ViewBindings.findChildViewById(view, i);
        if (c42989rgn != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = qZH.StateListAnimator.DlABUU;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.fVjYLc;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = qZH.StateListAnimator.RgaQzq;
                    C41312qoT c41312qoT = (C41312qoT) ViewBindings.findChildViewById(view, i);
                    if (c41312qoT != null) {
                        return new C42721rbk(constraintLayout, c42989rgn, constraintLayout, appCompatImageView, appCompatImageView2, c41312qoT);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
