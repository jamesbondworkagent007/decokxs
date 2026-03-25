package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOQ implements ViewBinding {
    public final C39792pyy AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final AppCompatImageView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final oSF EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatImageView djBIcL;
    public final android.view.View gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.gEmmrt;
    }

    public oOQ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull oSF osf, @androidx.annotation.NonNull C39792pyy c39792pyy, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView4, @androidx.annotation.NonNull AppCompatImageView appCompatImageView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.gEmmrt = view;
        this.EZpvd = osf;
        this.AEQbTJ = c39792pyy;
        this.KWHzl = appCompatTextView;
        this.OLrzqt = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.valueOf = appCompatTextView2;
        this.AYXKKw = appCompatImageView3;
        this.AhwBna = appCompatImageView4;
        this.djBIcL = appCompatImageView5;
        this.AkhnZx = appCompatTextView3;
    }

    public static oOQ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.dzCpvv, viewGroup);
        return KWHzl(viewGroup);
    }

    public static oOQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.djBIcL;
        oSF osf = (oSF) ViewBindings.findChildViewById(view, i);
        if (osf != null) {
            i = C35964oKf.StateListAnimator.fetchVPNInfo;
            C39792pyy c39792pyy = (C39792pyy) ViewBindings.findChildViewById(view, i);
            if (c39792pyy != null) {
                i = C35964oKf.StateListAnimator.OcIXYQ;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C35964oKf.StateListAnimator.iRxXKY;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null) {
                        i = C35964oKf.StateListAnimator.iZzfmt;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView2 != null) {
                            i = C35964oKf.StateListAnimator.gISBfG;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView2 != null) {
                                i = C35964oKf.StateListAnimator.GVpNrs;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView3 != null) {
                                    i = C35964oKf.StateListAnimator.ArkbYM;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatImageView4 != null) {
                                        i = C35964oKf.StateListAnimator.sjbWxX;
                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView5 != null) {
                                            i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi26;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                return new oOQ(view, osf, c39792pyy, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatTextView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatTextView3);
                                            }
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
