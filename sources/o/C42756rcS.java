package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rcS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42756rcS implements ViewBinding {
    public final C55244xgL AEQbTJ;
    public final ViewPager2 EZpvd;
    public final C41387qpp KWHzl;
    public final C40369qTh copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.copydefault;
    }

    public C42756rcS(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C41387qpp c41387qpp) {
        this.copydefault = c40369qTh;
        this.AEQbTJ = c55244xgL;
        this.EZpvd = viewPager2;
        this.KWHzl = c41387qpp;
    }

    public static C42756rcS AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.hBUiXU;
        C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
        if (c55244xgL != null) {
            i = qZH.StateListAnimator.writeToParcel;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = qZH.StateListAnimator.isPlayable;
                C41387qpp c41387qpp = (C41387qpp) ViewBindings.findChildViewById(view, i);
                if (c41387qpp != null) {
                    return new C42756rcS((C40369qTh) view, c55244xgL, viewPager2, c41387qpp);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
