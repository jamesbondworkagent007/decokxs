package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57416yhx implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.view.View EZpvd;
    public final Barrier KWHzl;
    public final C55251xgS OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatTextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C57416yhx(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = view;
        this.KWHzl = barrier;
        this.AEQbTJ = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.OLrzqt = c55251xgS;
        this.gEmmrt = appCompatTextView;
        this.valueOf = textView;
    }

    public static C57416yhx copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.fJNWhG, viewGroup);
        return OLrzqt(viewGroup);
    }

    public static C57416yhx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.KWHzl;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C57406yhn.StateListAnimator.AubY;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C57406yhn.StateListAnimator.dNCPSb;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = C57406yhn.StateListAnimator.ODXsMY;
                    C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS != null) {
                        i = C57406yhn.StateListAnimator.DCUTEIddSDPG;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = C57406yhn.StateListAnimator.aJFbMH;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new C57416yhx(view, barrier, appCompatImageView, appCompatImageView2, c55251xgS, appCompatTextView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
