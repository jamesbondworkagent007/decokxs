package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import o.qZH;

/* JADX INFO: renamed from: o.rbl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42722rbl implements ViewBinding {
    public final CoordinatorLayout AEQbTJ;
    public final CoordinatorLayout EZpvd;
    public final AppBarLayout KWHzl;
    public final CollapsingToolbarLayout OLrzqt;
    public final C55244xgL copydefault;
    public final ViewPager2 valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42722rbl(@androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout2, @androidx.annotation.NonNull CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AEQbTJ = coordinatorLayout;
        this.KWHzl = appBarLayout;
        this.EZpvd = coordinatorLayout2;
        this.OLrzqt = collapsingToolbarLayout;
        this.copydefault = c55244xgL;
        this.valueOf = viewPager2;
    }

    public static C42722rbl AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.pause;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i = qZH.StateListAnimator.zvzmfz;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, i);
            if (collapsingToolbarLayout != null) {
                i = qZH.StateListAnimator.hBUiXU;
                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL != null) {
                    i = qZH.StateListAnimator.writeToParcel;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C42722rbl(coordinatorLayout, appBarLayout, coordinatorLayout, collapsingToolbarLayout, c55244xgL, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
