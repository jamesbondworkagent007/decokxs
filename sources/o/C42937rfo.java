package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42937rfo implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final android.view.View EZpvd;
    public final Barrier KWHzl;
    public final AppCompatImageView OLrzqt;
    public final C55251xgS copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C42937rfo(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4) {
        this.EZpvd = view;
        this.KWHzl = barrier;
        this.OLrzqt = appCompatImageView;
        this.copydefault = c55251xgS;
        this.AEQbTJ = appCompatTextView;
        this.djBIcL = appCompatTextView2;
        this.AhwBna = appCompatTextView3;
        this.valueOf = appCompatTextView4;
    }

    public static C42937rfo AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.dbwnZN, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C42937rfo AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QUSxYX;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = qZH.StateListAnimator.QslYrK;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.fraLem;
                C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                if (c55251xgS != null) {
                    i = qZH.StateListAnimator.DLl;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = qZH.StateListAnimator.dHAKvv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = qZH.StateListAnimator.extraCallbackWithResult;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = qZH.StateListAnimator.onTransact;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    return new C42937rfo(view, barrier, appCompatImageView, c55251xgS, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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
