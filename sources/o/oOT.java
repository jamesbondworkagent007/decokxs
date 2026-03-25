package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOT implements ViewBinding {
    public final C39792pyy AEQbTJ;
    public final android.view.View AYXKKw;
    public final pAJ AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatImageView copydefault;
    public final Group djBIcL;
    public final C55239xgG fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;
    public final C55249xgQ values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AYXKKw;
    }

    public oOT(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C39792pyy c39792pyy, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull pAJ paj, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.AYXKKw = view;
        this.OLrzqt = appCompatTextView;
        this.copydefault = appCompatImageView;
        this.EZpvd = appCompatImageView2;
        this.AEQbTJ = c39792pyy;
        this.KWHzl = appCompatTextView2;
        this.AhwBna = paj;
        this.gEmmrt = appCompatTextView3;
        this.valueOf = appCompatTextView4;
        this.djBIcL = group;
        this.AkhnZx = appCompatTextView5;
        this.values = c55249xgQ;
        this.fetchVPNInfo = c55239xgG;
        this.DbNXlk = appCompatTextView6;
    }

    public static oOT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.frkDMe, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static oOT AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
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
                        i = C35964oKf.StateListAnimator.processStrongAuthMessage;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C35964oKf.StateListAnimator.HJWChPRAkuRW;
                            pAJ paj = (pAJ) ViewBindings.findChildViewById(view, i);
                            if (paj != null) {
                                i = C35964oKf.StateListAnimator.gISBfG;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView3 != null) {
                                    i = C35964oKf.StateListAnimator.WFXFk;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView4 != null) {
                                        i = C35964oKf.StateListAnimator.ZpNRhN;
                                        Group group = (Group) ViewBindings.findChildViewById(view, i);
                                        if (group != null) {
                                            i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi26;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView5 != null) {
                                                i = C35964oKf.StateListAnimator.sendEvent;
                                                C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                                                if (c55249xgQ != null) {
                                                    i = C35964oKf.StateListAnimator.sendShuffleMode;
                                                    C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                                                    if (c55239xgG != null) {
                                                        i = C35964oKf.StateListAnimator.sendRepeatMode;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView6 != null) {
                                                            return new oOT(view, appCompatTextView, appCompatImageView, appCompatImageView2, c39792pyy, appCompatTextView2, paj, appCompatTextView3, appCompatTextView4, group, appCompatTextView5, c55249xgQ, c55239xgG, appCompatTextView6);
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
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
