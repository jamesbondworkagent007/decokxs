package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36096oPc implements ViewBinding {
    public final Guideline AEQbTJ;
    public final C36103oPj AYXKKw;
    public final AppCompatTextView AhwBna;
    public final Guideline EZpvd;
    public final android.widget.ProgressBar KWHzl;
    public final Guideline OLrzqt;
    public final Guideline copydefault;
    public final C36103oPj djBIcL;
    public final C36103oPj gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C36096oPc(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull Guideline guideline3, @androidx.annotation.NonNull Guideline guideline4, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull C36103oPj c36103oPj, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C36103oPj c36103oPj2, @androidx.annotation.NonNull C36103oPj c36103oPj3) {
        this.valueOf = constraintLayout;
        this.AEQbTJ = guideline;
        this.EZpvd = guideline2;
        this.OLrzqt = guideline3;
        this.copydefault = guideline4;
        this.KWHzl = progressBar;
        this.AYXKKw = c36103oPj;
        this.AhwBna = appCompatTextView;
        this.gEmmrt = c36103oPj2;
        this.djBIcL = c36103oPj3;
    }

    public static C36096oPc EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C35964oKf.StateListAnimator.Hx;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = C35964oKf.StateListAnimator.DcMfJKfNUfqk;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline2 != null) {
                i = C35964oKf.StateListAnimator.DcMfJKfwDlxl;
                Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline3 != null) {
                    i = C35964oKf.StateListAnimator.DcMfJKsfEqpH;
                    Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline4 != null) {
                        i = C35964oKf.StateListAnimator.compare;
                        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
                        if (progressBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.DDDCac))) != null) {
                            C36103oPj c36103oPjOLrzqt = C36103oPj.OLrzqt(viewFindChildViewById);
                            i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.onMediaButtonEvent))) != null) {
                                C36103oPj c36103oPjOLrzqt2 = C36103oPj.OLrzqt(viewFindChildViewById2);
                                i = C35964oKf.StateListAnimator.onPlayFromMediaId;
                                android.view.View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                                if (viewFindChildViewById3 != null) {
                                    return new C36096oPc((ConstraintLayout) view, guideline, guideline2, guideline3, guideline4, progressBar, c36103oPjOLrzqt, appCompatTextView, c36103oPjOLrzqt2, C36103oPj.OLrzqt(viewFindChildViewById3));
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
