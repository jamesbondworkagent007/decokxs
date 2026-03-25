package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42858reO implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final pYT KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42858reO(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull pYT pyt, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = pyt;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = appCompatTextView;
        this.copydefault = appCompatTextView2;
    }

    public static C42858reO OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DlABUU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42858reO KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DBxZfM;
        pYT pyt = (pYT) ViewBindings.findChildViewById(view, i);
        if (pyt != null) {
            i = qZH.StateListAnimator.iCPUKe;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.Hx;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = qZH.StateListAnimator.apNKau;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        return new C42858reO((ConstraintLayout) view, pyt, appCompatImageView, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
