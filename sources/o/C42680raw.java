package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42680raw implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C42680raw(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.TextView textView7) {
        this.KWHzl = linearLayout;
        this.AEQbTJ = linearLayout2;
        this.EZpvd = textView;
        this.OLrzqt = textView2;
        this.copydefault = textView3;
        this.valueOf = textView4;
        this.AhwBna = textView5;
        this.AYXKKw = textView6;
        this.djBIcL = textView7;
    }

    public static C42680raw KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i = qZH.StateListAnimator.DkIxYv;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = qZH.StateListAnimator.UvfnWv;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = qZH.StateListAnimator.postMessage;
                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = qZH.StateListAnimator.validateRelationship;
                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = qZH.StateListAnimator.IPostMessageServiceStubProxy;
                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null) {
                            i = qZH.StateListAnimator.IPostMessageServiceDefault;
                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView6 != null) {
                                i = qZH.StateListAnimator.MediaBrowserCompat;
                                android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView7 != null) {
                                    return new C42680raw(linearLayout, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
