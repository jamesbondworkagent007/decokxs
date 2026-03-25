package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rdj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42826rdj implements ViewBinding {
    public final C55244xgL EZpvd;
    public final C35156npx KWHzl;
    public final ViewPager2 OLrzqt;
    public final C35156npx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C35156npx getRoot() {
        return this.KWHzl;
    }

    public C42826rdj(@androidx.annotation.NonNull C35156npx c35156npx, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull C35156npx c35156npx2, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.KWHzl = c35156npx;
        this.EZpvd = c55244xgL;
        this.copydefault = c35156npx2;
        this.OLrzqt = viewPager2;
    }

    public static C42826rdj OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DCUTEIdCUTEI;
        C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
        if (c55244xgL != null) {
            C35156npx c35156npx = (C35156npx) view;
            int i2 = qZH.StateListAnimator.writeToParcel;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i2);
            if (viewPager2 != null) {
                return new C42826rdj(c35156npx, c55244xgL, c35156npx, viewPager2);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
