package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nJK implements ViewBinding {
    public final AppCompatImageView EZpvd;
    public final AppCompatTextView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public nJK(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.OLrzqt = constraintLayout;
        this.copydefault = appCompatTextView;
        this.EZpvd = appCompatImageView;
        this.KWHzl = appCompatTextView2;
    }

    public static nJK AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.OBJEWx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static nJK OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.alsFma;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C35399nuc.StateListAnimator.DQYQgr;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C35399nuc.StateListAnimator.QzqeNH;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    return new nJK((ConstraintLayout) view, appCompatTextView, appCompatImageView, appCompatTextView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
