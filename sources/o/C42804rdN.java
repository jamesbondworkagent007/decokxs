package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42804rdN implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C42950rgA OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42804rdN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C42950rgA c42950rgA, @androidx.annotation.NonNull AppCompatImageView appCompatImageView) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = c42950rgA;
        this.copydefault = appCompatImageView;
    }

    public static C42804rdN AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.dIjzlO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42804rdN AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sTzBva;
        C42950rgA c42950rgA = (C42950rgA) ViewBindings.findChildViewById(view, i);
        if (c42950rgA != null) {
            i = qZH.StateListAnimator.DcMfJKRKUgwx;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                return new C42804rdN((ConstraintLayout) view, c42950rgA, appCompatImageView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
