package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42891rev implements ViewBinding {
    public final C40358qSx AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C42891rev(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull C40358qSx c40358qSx) {
        this.KWHzl = constraintLayout;
        this.copydefault = appCompatImageView;
        this.EZpvd = appCompatImageView2;
        this.OLrzqt = appCompatImageView3;
        this.AEQbTJ = c40358qSx;
    }

    public static C42891rev OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.cancel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42891rev KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DlmWDR;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = qZH.StateListAnimator.QWpYiD;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = qZH.StateListAnimator.gsvlRV;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = qZH.StateListAnimator.fDu;
                    C40358qSx c40358qSx = (C40358qSx) ViewBindings.findChildViewById(view, i);
                    if (c40358qSx != null) {
                        return new C42891rev((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, c40358qSx);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
