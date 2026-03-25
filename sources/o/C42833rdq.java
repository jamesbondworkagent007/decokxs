package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42833rdq implements ViewBinding {
    public final ViewPager2 AEQbTJ;
    public final C55244xgL KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C40498qYb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C42833rdq(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C40498qYb c40498qYb) {
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = c55244xgL;
        this.AEQbTJ = viewPager2;
        this.copydefault = c40498qYb;
    }

    public static C42833rdq KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DCUTEIdCUTEI;
        C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
        if (c55244xgL != null) {
            i = qZH.StateListAnimator.writeToParcel;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = qZH.StateListAnimator.isPlayable;
                C40498qYb c40498qYb = (C40498qYb) ViewBindings.findChildViewById(view, i);
                if (c40498qYb != null) {
                    return new C42833rdq((LinearLayoutCompat) view, c55244xgL, viewPager2, c40498qYb);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
