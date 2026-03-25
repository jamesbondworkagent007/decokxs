package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42923rfa implements ViewBinding {
    public final C42950rgA AEQbTJ;
    public final android.view.View EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C42923rfa(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C42950rgA c42950rgA, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3) {
        this.EZpvd = view;
        this.AEQbTJ = c42950rgA;
        this.copydefault = appCompatImageView;
        this.KWHzl = appCompatImageView2;
        this.OLrzqt = appCompatImageView3;
    }

    public static C42923rfa AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.fiXcQa, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C42923rfa AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sTzBva;
        C42950rgA c42950rgA = (C42950rgA) ViewBindings.findChildViewById(view, i);
        if (c42950rgA != null) {
            i = qZH.StateListAnimator.DcMfJKDIADVb;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.cancel;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = qZH.StateListAnimator.sCB;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView3 != null) {
                        return new C42923rfa(view, c42950rgA, appCompatImageView, appCompatImageView2, appCompatImageView3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
