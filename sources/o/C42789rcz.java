package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rcz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42789rcz implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55244xgL EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C42953rgD OLrzqt;
    public final C42953rgD copydefault;
    public final ViewPager2 valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42953rgD getRoot() {
        return this.copydefault;
    }

    public C42789rcz(@androidx.annotation.NonNull C42953rgD c42953rgD, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull C42953rgD c42953rgD2, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.copydefault = c42953rgD;
        this.KWHzl = frameLayout;
        this.EZpvd = c55244xgL;
        this.AEQbTJ = frameLayout2;
        this.OLrzqt = c42953rgD2;
        this.valueOf = viewPager2;
    }

    public static C42789rcz EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DbNXlk;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.DCUTEIdCUTEI;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                i = qZH.StateListAnimator.OKSWiw;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    C42953rgD c42953rgD = (C42953rgD) view;
                    i = qZH.StateListAnimator.writeToParcel;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C42789rcz(c42953rgD, frameLayout, c55244xgL, frameLayout2, c42953rgD, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
