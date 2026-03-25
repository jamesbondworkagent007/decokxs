package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42805rdO implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C42963rgN EZpvd;
    public final AppCompatImageView KWHzl;
    public final C40492qXw OLrzqt;
    public final C40499qYc copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.copydefault;
    }

    public C42805rdO(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C42963rgN c42963rgN, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5) {
        this.copydefault = c40499qYc;
        this.OLrzqt = c40492qXw;
        this.KWHzl = appCompatImageView;
        this.AEQbTJ = appCompatTextView;
        this.EZpvd = c42963rgN;
        this.gEmmrt = textView;
        this.AYXKKw = textView2;
        this.AhwBna = textView3;
        this.djBIcL = textView4;
        this.valueOf = textView5;
    }

    public static C42805rdO OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.dPnHjp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42805rdO EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.dLBcXg;
        C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
        if (c40492qXw != null) {
            i = qZH.StateListAnimator.DcMfJKRKUgwx;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = qZH.StateListAnimator.getUriFromString;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = qZH.StateListAnimator.onTransact;
                    C42963rgN c42963rgN = (C42963rgN) ViewBindings.findChildViewById(view, i);
                    if (c42963rgN != null) {
                        i = qZH.StateListAnimator.newSessionWithExtras;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = qZH.StateListAnimator.postMessage;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = qZH.StateListAnimator.read;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = qZH.StateListAnimator.AudioAttributesCompatParcelizer;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        i = qZH.StateListAnimator.AudioAttributesImplBaseParcelizer;
                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            return new C42805rdO((C40499qYc) view, c40492qXw, appCompatImageView, appCompatTextView, c42963rgN, textView, textView2, textView3, textView4, textView5);
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
