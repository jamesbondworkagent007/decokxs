package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yid, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57449yid implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final C55251xgS EZpvd;
    public final Barrier KWHzl;
    public final C55251xgS OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C57449yid(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = view;
        this.KWHzl = barrier;
        this.EZpvd = c55251xgS;
        this.AEQbTJ = appCompatImageView;
        this.OLrzqt = c55251xgS2;
        this.AhwBna = appCompatTextView;
        this.djBIcL = textView;
    }

    public static C57449yid AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.QKVWgx, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C57449yid KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.KWHzl;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C57406yhn.StateListAnimator.fIwbmz;
            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
            if (c55251xgS != null) {
                i = C57406yhn.StateListAnimator.AubY;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C57406yhn.StateListAnimator.hBpjJd;
                    C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                    if (c55251xgS2 != null) {
                        i = C57406yhn.StateListAnimator.Ufzxmz;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView != null) {
                            i = C57406yhn.StateListAnimator.aJFbMH;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                return new C57449yid(view, barrier, c55251xgS, appCompatImageView, c55251xgS2, appCompatTextView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
