package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42834rdr implements ViewBinding {
    public final C42989rgn AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C55071xcy copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C42834rdr(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C42989rgn c42989rgn, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55071xcy c55071xcy) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = c42989rgn;
        this.EZpvd = constraintLayout2;
        this.OLrzqt = appCompatImageView;
        this.copydefault = c55071xcy;
    }

    public static C42834rdr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.invokespecialROgMPW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42834rdr KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sTzBva;
        C42989rgn c42989rgn = (C42989rgn) ViewBindings.findChildViewById(view, i);
        if (c42989rgn != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = qZH.StateListAnimator.fVjYLc;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.RgaQzq;
                C55071xcy c55071xcy = (C55071xcy) ViewBindings.findChildViewById(view, i);
                if (c55071xcy != null) {
                    return new C42834rdr(constraintLayout, c42989rgn, constraintLayout, appCompatImageView, c55071xcy);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
