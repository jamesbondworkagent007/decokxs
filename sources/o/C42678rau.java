package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import o.qZH;

/* JADX INFO: renamed from: o.rau, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42678rau implements ViewBinding {
    public final AppBarLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final ViewPager DbNXlk;
    public final C33537myN EZpvd;
    public final FragmentContainerView KWHzl;
    public final C55244xgL OLrzqt;
    public final CoordinatorLayout copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final FragmentContainerView gEmmrt;
    public final C41311qoS valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public C42678rau(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C41311qoS c41311qoS, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ViewPager viewPager) {
        this.AhwBna = linearLayout;
        this.AEQbTJ = appBarLayout;
        this.EZpvd = c33537myN;
        this.copydefault = coordinatorLayout;
        this.OLrzqt = c55244xgL;
        this.KWHzl = fragmentContainerView;
        this.gEmmrt = fragmentContainerView2;
        this.djBIcL = linearLayout2;
        this.valueOf = c41311qoS;
        this.AYXKKw = textView;
        this.DbNXlk = viewPager;
    }

    public static C42678rau AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C42678rau OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.gwTjWJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C42678rau EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fetchVPNInfo;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = qZH.StateListAnimator.values;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                i = qZH.StateListAnimator.fLIjIY;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                if (coordinatorLayout != null) {
                    i = qZH.StateListAnimator.zzQwtT;
                    C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                    if (c55244xgL != null) {
                        i = qZH.StateListAnimator.UccSpe;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                        if (fragmentContainerView != null) {
                            i = qZH.StateListAnimator.invokespecialDaTmkG;
                            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                            if (fragmentContainerView2 != null) {
                                i = qZH.StateListAnimator.gAnGwV;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = qZH.StateListAnimator.gqESXP;
                                    C41311qoS c41311qoS = (C41311qoS) ViewBindings.findChildViewById(view, i);
                                    if (c41311qoS != null) {
                                        i = qZH.StateListAnimator.QWSkGZ;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = qZH.StateListAnimator.isBrowsable;
                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                                            if (viewPager != null) {
                                                return new C42678rau((android.widget.LinearLayout) view, appBarLayout, c33537myN, coordinatorLayout, c55244xgL, fragmentContainerView, fragmentContainerView2, linearLayout, c41311qoS, textView, viewPager);
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
