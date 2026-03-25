package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57392yhZ implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final C55251xgS AhwBna;
    public final Barrier EZpvd;
    public final C55251xgS KWHzl;
    public final Barrier OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C57392yhZ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull Barrier barrier2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AEQbTJ = view;
        this.EZpvd = barrier;
        this.OLrzqt = barrier2;
        this.copydefault = appCompatImageView;
        this.KWHzl = c55251xgS;
        this.AhwBna = c55251xgS2;
        this.djBIcL = textView;
        this.AYXKKw = appCompatTextView;
    }

    public static C57392yhZ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.DTwDnp, viewGroup);
        return copydefault(viewGroup);
    }

    public static C57392yhZ copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.KWHzl;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C57406yhn.StateListAnimator.EZpvd;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier2 != null) {
                i = C57406yhn.StateListAnimator.AubY;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C57406yhn.StateListAnimator.DCUTEI;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C57406yhn.StateListAnimator.RdAHlO;
                        C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS2 != null) {
                            i = C57406yhn.StateListAnimator.dUDNAs;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C57406yhn.StateListAnimator.Ufzxmz;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    return new C57392yhZ(view, barrier, barrier2, appCompatImageView, c55251xgS, c55251xgS2, textView, appCompatTextView);
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
