package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import o.qZH;

/* JADX INFO: renamed from: o.rcW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42760rcW implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final AppBarLayout EZpvd;
    public final CoordinatorLayout KWHzl;
    public final CoordinatorLayout OLrzqt;
    public final FragmentContainerView copydefault;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.OLrzqt;
    }

    public C42760rcW(@androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.OLrzqt = coordinatorLayout;
        this.EZpvd = appBarLayout;
        this.KWHzl = coordinatorLayout2;
        this.AEQbTJ = fragmentContainerView;
        this.copydefault = fragmentContainerView2;
        this.valueOf = appCompatTextView;
    }

    public static C42760rcW EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.AkhnZx;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            i = qZH.StateListAnimator.invokespecialaGOrKO;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = qZH.StateListAnimator.invokespecialatDTRm;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView2 != null) {
                    i = qZH.StateListAnimator.asBinder;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        return new C42760rcW(coordinatorLayout, appBarLayout, coordinatorLayout, fragmentContainerView, fragmentContainerView2, appCompatTextView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
