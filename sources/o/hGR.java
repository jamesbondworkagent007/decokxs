package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGR implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final AppCompatImageView EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public hGR(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4, @androidx.annotation.NonNull ConstraintLayout constraintLayout2) {
        this.AYXKKw = constraintLayout;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = appCompatImageView2;
        this.copydefault = appCompatImageView3;
        this.KWHzl = appCompatImageView4;
        this.AEQbTJ = constraintLayout2;
    }

    public static hGR AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.adwzgZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hGR AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QVsKAR;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = C23274hvD.Application.DbvGUJ;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = C23274hvD.Application.extraCallbackWithResult;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplBase1;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView4 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new hGR(constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, constraintLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
