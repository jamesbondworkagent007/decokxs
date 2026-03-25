package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42663raf implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout AhwBna;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final NestedScrollView djBIcL;
    public final NestedScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.djBIcL;
    }

    public C42663raf(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout5, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout6, @androidx.annotation.NonNull NestedScrollView nestedScrollView2) {
        this.djBIcL = nestedScrollView;
        this.OLrzqt = frameLayout;
        this.KWHzl = frameLayout2;
        this.EZpvd = frameLayout3;
        this.AEQbTJ = frameLayout4;
        this.copydefault = frameLayout5;
        this.AhwBna = frameLayout6;
        this.valueOf = nestedScrollView2;
    }

    public static C42663raf OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RIuxYh;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.DQzvGNdrmXxudrmXxu;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = qZH.StateListAnimator.DcMfJK;
                android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout3 != null) {
                    i = qZH.StateListAnimator.RSDDiY;
                    android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout4 != null) {
                        i = qZH.StateListAnimator.RTWSvT;
                        android.widget.FrameLayout frameLayout5 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout5 != null) {
                            i = qZH.StateListAnimator.RkASWs;
                            android.widget.FrameLayout frameLayout6 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout6 != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) view;
                                return new C42663raf(nestedScrollView, frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, nestedScrollView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
