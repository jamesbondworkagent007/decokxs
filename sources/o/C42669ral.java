package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.ral, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42669ral implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C42982rgg copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C42669ral(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C42982rgg c42982rgg, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2) {
        this.EZpvd = constraintLayout;
        this.copydefault = c42982rgg;
        this.AEQbTJ = constraintLayout2;
        this.OLrzqt = appCompatImageView;
        this.KWHzl = appCompatImageView2;
    }

    public static C42669ral OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.dxcTrN, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42669ral KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sTzBva;
        C42982rgg c42982rgg = (C42982rgg) ViewBindings.findChildViewById(view, i);
        if (c42982rgg != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = qZH.StateListAnimator.glVQsU;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.fVjYLc;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    return new C42669ral(constraintLayout, c42982rgg, constraintLayout, appCompatImageView, appCompatImageView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
