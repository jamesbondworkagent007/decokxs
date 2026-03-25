package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOK implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final Guideline AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C39792pyy EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.view.View djBIcL;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public oOK(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull C39792pyy c39792pyy, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.djBIcL = view;
        this.OLrzqt = appCompatTextView;
        this.copydefault = appCompatImageView;
        this.KWHzl = appCompatImageView2;
        this.AEQbTJ = appCompatImageView3;
        this.EZpvd = c39792pyy;
        this.AYXKKw = guideline;
        this.AhwBna = appCompatTextView2;
        this.valueOf = appCompatTextView3;
    }

    public static oOK OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.DrqXHJ, viewGroup);
        return copydefault(viewGroup);
    }

    public static oOK copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.OcIXYQ;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C35964oKf.StateListAnimator.iRxXKY;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C35964oKf.StateListAnimator.iZzfmt;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C35964oKf.StateListAnimator.fBE;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView3 != null) {
                        i = C35964oKf.StateListAnimator.DQzvGNdrmXxu;
                        C39792pyy c39792pyy = (C39792pyy) ViewBindings.findChildViewById(view, i);
                        if (c39792pyy != null) {
                            i = C35964oKf.StateListAnimator.DcMfJKffREWX;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline != null) {
                                i = C35964oKf.StateListAnimator.gISBfG;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi26;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView3 != null) {
                                        return new oOK(view, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatImageView3, c39792pyy, guideline, appCompatTextView2, appCompatTextView3);
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
