package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rcE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42742rcE implements ViewBinding {
    public final CoordinatorLayout AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final FragmentContainerView KWHzl;
    public final C55244xgL OLrzqt;
    public final CoordinatorLayout copydefault;
    public final ViewPager2 djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42742rcE(@androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AEQbTJ = coordinatorLayout;
        this.copydefault = coordinatorLayout2;
        this.KWHzl = fragmentContainerView;
        this.OLrzqt = c55244xgL;
        this.EZpvd = appCompatTextView;
        this.djBIcL = viewPager2;
    }

    public static C42742rcE copydefault(@androidx.annotation.NonNull android.view.View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = qZH.StateListAnimator.invokespecialaGOrKO;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = qZH.StateListAnimator.hBUiXU;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                i = qZH.StateListAnimator.isAvailable;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = qZH.StateListAnimator.registerCallbackMessenger;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C42742rcE(coordinatorLayout, coordinatorLayout, fragmentContainerView, c55244xgL, appCompatTextView, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
