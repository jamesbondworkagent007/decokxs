package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOL implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatImageView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public oOL(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4) {
        this.gEmmrt = constraintLayout;
        this.OLrzqt = appCompatTextView;
        this.KWHzl = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.AEQbTJ = appCompatTextView2;
        this.EZpvd = appCompatTextView3;
        this.djBIcL = appCompatImageView3;
        this.AYXKKw = appCompatImageView4;
        this.valueOf = appCompatTextView4;
    }

    public static oOL AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DGUQLIhJrIAr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static oOL copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.OcIXYQ;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C35964oKf.StateListAnimator.iRxXKY;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C35964oKf.StateListAnimator.iZzfmt;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C35964oKf.StateListAnimator.glVQsU;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C35964oKf.StateListAnimator.gISBfG;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = C35964oKf.StateListAnimator.sSi;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView3 != null) {
                                i = C35964oKf.StateListAnimator.ijmTNW;
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView4 != null) {
                                    i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi26;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView4 != null) {
                                        return new oOL((ConstraintLayout) view, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatTextView2, appCompatTextView3, appCompatImageView3, appCompatImageView4, appCompatTextView4);
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
