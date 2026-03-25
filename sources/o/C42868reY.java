package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42868reY implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatImageView EZpvd;
    public final C42991rgp KWHzl;
    public final C42979rgd OLrzqt;
    public final android.view.View copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C42868reY(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C42991rgp c42991rgp, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C42979rgd c42979rgd, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.copydefault = view;
        this.KWHzl = c42991rgp;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = c42979rgd;
        this.AEQbTJ = appCompatTextView;
        this.valueOf = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
        this.gEmmrt = appCompatTextView4;
        this.AhwBna = appCompatTextView5;
        this.AYXKKw = appCompatTextView6;
    }

    public static C42868reY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DwQSDd, viewGroup);
        return copydefault(viewGroup);
    }

    public static C42868reY copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.FQNKFG;
        C42991rgp c42991rgp = (C42991rgp) ViewBindings.findChildViewById(view, i);
        if (c42991rgp != null) {
            i = qZH.StateListAnimator.aeJQwa;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.SqfPTR;
                C42979rgd c42979rgd = (C42979rgd) ViewBindings.findChildViewById(view, i);
                if (c42979rgd != null) {
                    i = qZH.StateListAnimator.dPaqAf;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = qZH.StateListAnimator.DLl;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = qZH.StateListAnimator.onServiceConnected;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = qZH.StateListAnimator.onTransact;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    i = qZH.StateListAnimator.MediaBrowserCompatCallbackHandler;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView5 != null) {
                                        i = qZH.StateListAnimator.subscribe;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView6 != null) {
                                            return new C42868reY(view, c42991rgp, appCompatImageView, c42979rgd, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
                                        }
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
