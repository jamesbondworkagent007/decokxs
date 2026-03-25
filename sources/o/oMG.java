package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oMG implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55173xeu AYXKKw;
    public final NestedScrollView AhwBna;
    public final AppCompatTextView DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final C33546myW djBIcL;
    public final C36110oPq fetchVPNInfo;
    public final C55237xgE gEmmrt;
    public final android.widget.LinearLayout isConnected;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public oMG(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull C36110oPq c36110oPq) {
        this.valueOf = linearLayout;
        this.KWHzl = frameLayout;
        this.copydefault = textView;
        this.EZpvd = imageView;
        this.OLrzqt = linearLayout2;
        this.AEQbTJ = frameLayout2;
        this.AYXKKw = c55173xeu;
        this.AhwBna = nestedScrollView;
        this.djBIcL = c33546myW;
        this.gEmmrt = c55237xgE;
        this.DbNXlk = appCompatTextView;
        this.isConnected = linearLayout3;
        this.fetchVPNInfo = c36110oPq;
    }

    public static oMG OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.fLIjIY;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C35964oKf.StateListAnimator.zhUgOk;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C35964oKf.StateListAnimator.DDjfYY;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35964oKf.StateListAnimator.dYepVG;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C35964oKf.StateListAnimator.DYICSh;
                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = C35964oKf.StateListAnimator.sWlOSi;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C35964oKf.StateListAnimator.getInterfaceDescriptor;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                if (nestedScrollView != null) {
                                    i = C35964oKf.StateListAnimator.getSessionToken;
                                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                    if (c33546myW != null) {
                                        i = C35964oKf.StateListAnimator.search;
                                        C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                                        if (c55237xgE != null) {
                                            i = C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                i = C35964oKf.StateListAnimator.setSessionActivity;
                                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.onCommand))) != null) {
                                                    return new oMG((android.widget.LinearLayout) view, frameLayout, textView, imageView, linearLayout, frameLayout2, c55173xeu, nestedScrollView, c33546myW, c55237xgE, appCompatTextView, linearLayout2, C36110oPq.KWHzl(viewFindChildViewById));
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
