package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOO implements ViewBinding {
    public final pAJ AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C39792pyy EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final android.view.View gEmmrt;
    public final pAJ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.gEmmrt;
    }

    public oOO(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C39792pyy c39792pyy, @androidx.annotation.NonNull pAJ paj, @androidx.annotation.NonNull pAJ paj2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.gEmmrt = view;
        this.copydefault = appCompatTextView;
        this.OLrzqt = appCompatImageView;
        this.KWHzl = appCompatImageView2;
        this.EZpvd = c39792pyy;
        this.AEQbTJ = paj;
        this.valueOf = paj2;
        this.AYXKKw = appCompatTextView2;
        this.AhwBna = appCompatTextView3;
    }

    public static oOO EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.DSiOMJ, viewGroup);
        return KWHzl(viewGroup);
    }

    public static oOO KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.OcIXYQ;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C35964oKf.StateListAnimator.iRxXKY;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C35964oKf.StateListAnimator.iZzfmt;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C35964oKf.StateListAnimator.DQzvGNdrmXxu;
                    C39792pyy c39792pyy = (C39792pyy) ViewBindings.findChildViewById(view, i);
                    if (c39792pyy != null) {
                        i = C35964oKf.StateListAnimator.ikIEnW;
                        pAJ paj = (pAJ) ViewBindings.findChildViewById(view, i);
                        if (paj != null) {
                            i = C35964oKf.StateListAnimator.isElapsedRealtimeNanosAvailable;
                            pAJ paj2 = (pAJ) ViewBindings.findChildViewById(view, i);
                            if (paj2 != null) {
                                i = C35964oKf.StateListAnimator.gISBfG;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView2 != null) {
                                    i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi26;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView3 != null) {
                                        return new oOO(view, appCompatTextView, appCompatImageView, appCompatImageView2, c39792pyy, paj, paj2, appCompatTextView2, appCompatTextView3);
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
