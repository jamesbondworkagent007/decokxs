package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21633hGp implements ViewBinding {
    public final Barrier AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final android.view.View EZpvd;
    public final Barrier KWHzl;
    public final AppCompatTextView OLrzqt;
    public final Barrier copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C21633hGp(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2, @androidx.annotation.NonNull Barrier barrier3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7) {
        this.EZpvd = view;
        this.KWHzl = barrier;
        this.AEQbTJ = barrier2;
        this.copydefault = barrier3;
        this.OLrzqt = appCompatTextView;
        this.AhwBna = appCompatTextView2;
        this.AYXKKw = appCompatTextView3;
        this.djBIcL = appCompatTextView4;
        this.gEmmrt = appCompatTextView5;
        this.valueOf = appCompatTextView6;
        this.fetchVPNInfo = appCompatTextView7;
    }

    public static C21633hGp KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.HJWChPURsaBn, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C21633hGp AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gwTjWJ;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C23274hvD.Application.dHguZz;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = C23274hvD.Application.OHqIaq;
                Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i);
                if (barrier3 != null) {
                    i = C23274hvD.Application.UiThread;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C23274hvD.Application.AppCompatDelegateImpl1;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C23274hvD.Application.AppCompatDelegateImpl3;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = C23274hvD.Application.onAnimationStart;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    i = C23274hvD.Application.AppCompatDelegateImpl6;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView5 != null) {
                                        i = C23274hvD.Application.getColor;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView6 != null) {
                                            i = C23274hvD.Application.getBarLength;
                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView7 != null) {
                                                return new C21633hGp(view, barrier, barrier2, barrier3, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7);
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
