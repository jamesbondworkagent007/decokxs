package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42903rfG implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final Group KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C25917jLd copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42903rfG(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C25917jLd c25917jLd, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7) {
        this.AEQbTJ = view;
        this.copydefault = c25917jLd;
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = group;
        this.EZpvd = appCompatTextView;
        this.AhwBna = appCompatTextView2;
        this.AYXKKw = appCompatTextView3;
        this.gEmmrt = appCompatTextView4;
        this.djBIcL = appCompatTextView5;
        this.valueOf = appCompatTextView6;
        this.isConnected = appCompatTextView7;
    }

    public static C42903rfG copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.FYtjSf, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C42903rfG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sVvuFk;
        C25917jLd c25917jLd = (C25917jLd) ViewBindings.findChildViewById(view, i);
        if (c25917jLd != null) {
            i = qZH.StateListAnimator.DBAlnt;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = qZH.StateListAnimator.HJWChPRGtXKCRGtXKC;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = qZH.StateListAnimator.zNQIcI;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = qZH.StateListAnimator.onConnected;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = qZH.StateListAnimator.MediaBrowserCompatConnectionCallback;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = qZH.StateListAnimator.onConnectionSuspended;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    i = qZH.StateListAnimator.setInternalConnectionCallback;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView5 != null) {
                                        i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView6 != null) {
                                            i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBase6;
                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView7 != null) {
                                                return new C42903rfG(view, c25917jLd, linearLayoutCompat, group, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7);
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
