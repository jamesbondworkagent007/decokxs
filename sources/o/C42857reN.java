package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42857reN implements ViewBinding {
    public final C40499qYc AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final Barrier EZpvd;
    public final AppCompatImageView KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView gEmmrt;
    public final C42963rgN valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.AEQbTJ;
    }

    public C42857reN(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C42963rgN c42963rgN, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = c40499qYc;
        this.EZpvd = barrier;
        this.OLrzqt = appCompatImageView;
        this.KWHzl = appCompatImageView2;
        this.copydefault = appCompatTextView;
        this.gEmmrt = appCompatTextView2;
        this.AhwBna = textView;
        this.valueOf = c42963rgN;
        this.AYXKKw = textView2;
    }

    public static C42857reN KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DcMfJKsgNvtZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42857reN copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QUSxYX;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = qZH.StateListAnimator.svY;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.DcMfJKRKUgwx;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = qZH.StateListAnimator.getUriFromString;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = qZH.StateListAnimator.rsEnD;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = qZH.StateListAnimator.DXTac;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = qZH.StateListAnimator.onTransact;
                                C42963rgN c42963rgN = (C42963rgN) ViewBindings.findChildViewById(view, i);
                                if (c42963rgN != null) {
                                    i = qZH.StateListAnimator.postMessage;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new C42857reN((C40499qYc) view, barrier, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2, textView, c42963rgN, textView2);
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
