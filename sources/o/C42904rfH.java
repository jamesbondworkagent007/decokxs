package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42904rfH implements ViewBinding {
    public final android.widget.Space AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final C40499qYc KWHzl;
    public final AppCompatTextView OLrzqt;
    public final Group copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.KWHzl;
    }

    public C42904rfH(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7) {
        this.KWHzl = c40499qYc;
        this.copydefault = group;
        this.AEQbTJ = space;
        this.OLrzqt = appCompatTextView;
        this.EZpvd = appCompatTextView2;
        this.AYXKKw = appCompatTextView3;
        this.AhwBna = appCompatTextView4;
        this.gEmmrt = appCompatTextView5;
        this.djBIcL = appCompatTextView6;
        this.valueOf = appCompatTextView7;
    }

    public static C42904rfH copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C42904rfH copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.finishInit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42904rfH copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.aCSzUz;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = qZH.StateListAnimator.dkJJWw;
            android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
            if (space != null) {
                i = qZH.StateListAnimator.sGvRiA;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = qZH.StateListAnimator.getItem;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = qZH.StateListAnimator.getSessionToken;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            i = qZH.StateListAnimator.getRoot;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView4 != null) {
                                i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi211;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView5 != null) {
                                    i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi21;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView6 != null) {
                                        i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212;
                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView7 != null) {
                                            return new C42904rfH((C40499qYc) view, group, space, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7);
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
