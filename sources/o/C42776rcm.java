package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42776rcm implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final C28005kLj AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView DbNXlk;
    public final FragmentContainerView EZpvd;
    public final C28005kLj KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C40505qYi copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatTextView gEmmrt;
    public final C40505qYi valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40505qYi getRoot() {
        return this.valueOf;
    }

    public C42776rcm(@androidx.annotation.NonNull C40505qYi c40505qYi, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C40505qYi c40505qYi2, @androidx.annotation.NonNull C28005kLj c28005kLj, @androidx.annotation.NonNull C28005kLj c28005kLj2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.valueOf = c40505qYi;
        this.EZpvd = fragmentContainerView;
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = linearLayoutCompat2;
        this.copydefault = c40505qYi2;
        this.KWHzl = c28005kLj;
        this.AYXKKw = c28005kLj2;
        this.AhwBna = appCompatTextView;
        this.djBIcL = appCompatTextView2;
        this.gEmmrt = appCompatTextView3;
        this.fetchVPNInfo = appCompatTextView4;
        this.DbNXlk = appCompatTextView5;
        this.values = appCompatTextView6;
    }

    public static C42776rcm KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.invokespecialaVhqwO;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = qZH.StateListAnimator.GLcwwN;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = qZH.StateListAnimator.sILrnl;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat2 != null) {
                    i = qZH.StateListAnimator.getLocation;
                    C40505qYi c40505qYi = (C40505qYi) ViewBindings.findChildViewById(view, i);
                    if (c40505qYi != null) {
                        i = qZH.StateListAnimator.gdLjtZ;
                        C28005kLj c28005kLj = (C28005kLj) ViewBindings.findChildViewById(view, i);
                        if (c28005kLj != null) {
                            i = qZH.StateListAnimator.DVmcag;
                            C28005kLj c28005kLj2 = (C28005kLj) ViewBindings.findChildViewById(view, i);
                            if (c28005kLj2 != null) {
                                i = qZH.StateListAnimator.sJqpAA;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = qZH.StateListAnimator.gRtANS;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = qZH.StateListAnimator.onNavigationEvent;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = qZH.StateListAnimator.onMessageChannelReady;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = qZH.StateListAnimator.MediaBrowserCompatCustomActionCallback;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView5 != null) {
                                                    i = qZH.StateListAnimator.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView6 != null) {
                                                        return new C42776rcm((C40505qYi) view, fragmentContainerView, linearLayoutCompat, linearLayoutCompat2, c40505qYi, c28005kLj, c28005kLj2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
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
