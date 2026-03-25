package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42861reR implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final Barrier EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C41312qoT copydefault;
    public final AppCompatTextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42861reR(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C41312qoT c41312qoT, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4) {
        this.AEQbTJ = view;
        this.EZpvd = barrier;
        this.OLrzqt = appCompatImageView;
        this.copydefault = c41312qoT;
        this.KWHzl = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
        this.AhwBna = appCompatTextView4;
    }

    public static C42861reR OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.bindToGooglePlayService, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C42861reR AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QUSxYX;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = qZH.StateListAnimator.DcMfJKDSqxTE;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.dPaqAf;
                C41312qoT c41312qoT = (C41312qoT) ViewBindings.findChildViewById(view, i);
                if (c41312qoT != null) {
                    i = qZH.StateListAnimator.DLl;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = qZH.StateListAnimator.dHAKvv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = qZH.StateListAnimator.onTransact;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = qZH.StateListAnimator.readTypedObject;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    return new C42861reR(view, barrier, appCompatImageView, c41312qoT, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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
