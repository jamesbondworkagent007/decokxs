package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNQ implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55237xgE AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C33546myW djBIcL;
    public final android.widget.FrameLayout gEmmrt;
    public final C33546myW isConnected;
    public final C33604mzb valueOf;
    public final NestedScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.djBIcL;
    }

    public tNQ(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout5, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout6, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C33546myW c33546myW2) {
        this.djBIcL = c33546myW;
        this.KWHzl = frameLayout;
        this.EZpvd = frameLayout2;
        this.copydefault = linearLayout;
        this.OLrzqt = frameLayout3;
        this.AEQbTJ = frameLayout4;
        this.AhwBna = frameLayout5;
        this.gEmmrt = frameLayout6;
        this.valueOf = c33604mzb;
        this.AYXKKw = c55237xgE;
        this.values = nestedScrollView;
        this.isConnected = c33546myW2;
    }

    public static tNQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.spnCvw;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C47501trL.TaskDescription.zblBkD;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = C47501trL.TaskDescription.ixgjPv;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C47501trL.TaskDescription.Dmq;
                    android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout3 != null) {
                        i = C47501trL.TaskDescription.WS;
                        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout4 != null) {
                            i = C47501trL.TaskDescription.run;
                            android.widget.FrameLayout frameLayout5 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout5 != null) {
                                i = C47501trL.TaskDescription.call;
                                android.widget.FrameLayout frameLayout6 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout6 != null) {
                                    i = C47501trL.TaskDescription.OijiEz;
                                    C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                                    if (c33604mzb != null) {
                                        i = C47501trL.TaskDescription.fdt;
                                        C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                                        if (c55237xgE != null) {
                                            i = C47501trL.TaskDescription.DRGLNw;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null) {
                                                C33546myW c33546myW = (C33546myW) view;
                                                return new tNQ(c33546myW, frameLayout, frameLayout2, linearLayout, frameLayout3, frameLayout4, frameLayout5, frameLayout6, c33604mzb, c55237xgE, nestedScrollView, c33546myW);
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
