package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import o.qZH;

/* JADX INFO: renamed from: o.rel, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42881rel implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final Barrier EZpvd;
    public final FlexboxLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final C40492qXw copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final AppCompatTextView fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final C55251xgS isConnected;
    public final C40499qYc valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.valueOf;
    }

    public C42881rel(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C40492qXw c40492qXw, @androidx.annotation.NonNull FlexboxLayout flexboxLayout, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull AppCompatImageView appCompatImageView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.valueOf = c40499qYc;
        this.EZpvd = barrier;
        this.OLrzqt = linearLayout;
        this.copydefault = c40492qXw;
        this.KWHzl = flexboxLayout;
        this.AEQbTJ = appCompatImageView;
        this.AhwBna = appCompatImageView2;
        this.gEmmrt = appCompatImageView3;
        this.AYXKKw = appCompatTextView;
        this.djBIcL = textView;
        this.fetchVPNInfo = appCompatTextView2;
        this.DbNXlk = textView2;
        this.AkhnZx = textView3;
        this.values = textView4;
        this.isConnected = c55251xgS;
        this.ejfBZ = textView5;
        this.fARcdN = textView6;
    }

    public static C42881rel KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DMb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42881rel KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.QVAiDq;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = qZH.StateListAnimator.aJFbMH;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = qZH.StateListAnimator.dLBcXg;
                C40492qXw c40492qXw = (C40492qXw) ViewBindings.findChildViewById(view, i);
                if (c40492qXw != null) {
                    i = qZH.StateListAnimator.ggKfIT;
                    FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i);
                    if (flexboxLayout != null) {
                        i = qZH.StateListAnimator.svY;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = qZH.StateListAnimator.DcMfJKDcMfJK;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView2 != null) {
                                i = qZH.StateListAnimator.DcMfJKRKUgwx;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView3 != null) {
                                    i = qZH.StateListAnimator.getUriFromString;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = qZH.StateListAnimator.DXTac;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = qZH.StateListAnimator.onTransact;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView2 != null) {
                                                i = qZH.StateListAnimator.newSessionWithExtras;
                                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = qZH.StateListAnimator.postMessage;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = qZH.StateListAnimator.read;
                                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView4 != null) {
                                                            i = qZH.StateListAnimator.IconCompatParcelizer;
                                                            C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
                                                            if (c55251xgS != null) {
                                                                i = qZH.StateListAnimator.AudioAttributesCompatParcelizer;
                                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView5 != null) {
                                                                    i = qZH.StateListAnimator.AudioAttributesImplApi21Parcelizer;
                                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView6 != null) {
                                                                        return new C42881rel((C40499qYc) view, barrier, linearLayout, c40492qXw, flexboxLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatTextView, textView, appCompatTextView2, textView2, textView3, textView4, c55251xgS, textView5, textView6);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
