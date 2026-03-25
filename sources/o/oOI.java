package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOI implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final C39823pzc AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C55249xgQ AkhnZx;
    public final android.view.View AuCTel;
    public final C39824pzd DbNXlk;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final pAJ OLrzqt;
    public final AppCompatImageView copydefault;
    public final C55239xgG djBIcL;
    public final AppCompatTextView ejfBZ;
    public final C55249xgQ fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final android.view.View valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AuCTel;
    }

    public oOI(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull pAJ paj, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C55239xgG c55239xgG, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull C39823pzc c39823pzc, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull C39824pzd c39824pzd, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull C55249xgQ c55249xgQ2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7) {
        this.AuCTel = view;
        this.OLrzqt = paj;
        this.EZpvd = appCompatTextView;
        this.KWHzl = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.AEQbTJ = appCompatTextView2;
        this.djBIcL = c55239xgG;
        this.gEmmrt = appCompatTextView3;
        this.valueOf = view2;
        this.AYXKKw = c39823pzc;
        this.AhwBna = appCompatTextView4;
        this.DbNXlk = c39824pzd;
        this.fetchVPNInfo = c55249xgQ;
        this.values = appCompatTextView5;
        this.AkhnZx = c55249xgQ2;
        this.isConnected = appCompatTextView6;
        this.ejfBZ = appCompatTextView7;
    }

    public static oOI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C35964oKf.Application.gtCCJH, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static oOI AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.zLjUOn;
        pAJ paj = (pAJ) ViewBindings.findChildViewById(view, i);
        if (paj != null) {
            i = C35964oKf.StateListAnimator.OcIXYQ;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C35964oKf.StateListAnimator.iRxXKY;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C35964oKf.StateListAnimator.iZzfmt;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = C35964oKf.StateListAnimator.zSsVtY;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C35964oKf.StateListAnimator.pauseLocationServices;
                            C55239xgG c55239xgG = (C55239xgG) ViewBindings.findChildViewById(view, i);
                            if (c55239xgG != null) {
                                i = C35964oKf.StateListAnimator.processStrongAuthMessage;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.hOMIpD))) != null) {
                                    i = C35964oKf.StateListAnimator.DcMfJKDGTeJD;
                                    C39823pzc c39823pzc = (C39823pzc) ViewBindings.findChildViewById(view, i);
                                    if (c39823pzc != null) {
                                        i = C35964oKf.StateListAnimator.gISBfG;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView4 != null) {
                                            i = C35964oKf.StateListAnimator.sGvRiA;
                                            C39824pzd c39824pzd = (C39824pzd) ViewBindings.findChildViewById(view, i);
                                            if (c39824pzd != null) {
                                                i = C35964oKf.StateListAnimator.dESsmu;
                                                C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                                                if (c55249xgQ != null) {
                                                    i = C35964oKf.StateListAnimator.DjzMc;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = C35964oKf.StateListAnimator.RbMRq;
                                                        C55249xgQ c55249xgQ2 = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                                                        if (c55249xgQ2 != null) {
                                                            i = C35964oKf.StateListAnimator.zqaRxl;
                                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatTextView6 != null) {
                                                                i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi26;
                                                                AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                if (appCompatTextView7 != null) {
                                                                    return new oOI(view, paj, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatTextView2, c55239xgG, appCompatTextView3, viewFindChildViewById, c39823pzc, appCompatTextView4, c39824pzd, c55249xgQ, appCompatTextView5, c55249xgQ2, appCompatTextView6, appCompatTextView7);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
