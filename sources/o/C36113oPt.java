package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36113oPt implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ProgressBar copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C36113oPt(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = view;
        this.copydefault = progressBar;
        this.EZpvd = appCompatTextView;
        this.KWHzl = appCompatImageView;
        this.djBIcL = textView;
        this.AhwBna = textView2;
    }

    public static C36113oPt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.QqiRNA;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C35964oKf.StateListAnimator.UPzgla;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
            if (progressBar != null) {
                i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi21;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase3;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C35964oKf.StateListAnimator.MediaSessionCompat3;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C36113oPt((ConstraintLayout) view, viewFindChildViewById, progressBar, appCompatTextView, appCompatImageView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
