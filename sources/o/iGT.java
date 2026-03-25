package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iGT implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ViewPager2 AYXKKw;
    public final NestedScrollView AhwBna;
    public final android.view.View AkhnZx;
    public final C55254xgV DbNXlk;
    public final CoordinatorLayout EZpvd;
    public final AbstractC23810iKd KWHzl;
    public final AppBarLayout OLrzqt;
    public final C33537myN copydefault;
    public final C33546myW djBIcL;
    public final NestedScrollView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final AbstractC23810iKd isConnected;
    public final C27137jpX valueOf;
    public final FragmentContainerView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public iGT(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AbstractC23810iKd abstractC23810iKd, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C27137jpX c27137jpX, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull AbstractC23810iKd abstractC23810iKd2, @androidx.annotation.NonNull NestedScrollView nestedScrollView2, @androidx.annotation.NonNull C55254xgV c55254xgV) {
        this.gEmmrt = constraintLayout;
        this.copydefault = c33537myN;
        this.OLrzqt = appBarLayout;
        this.AEQbTJ = constraintLayout2;
        this.KWHzl = abstractC23810iKd;
        this.EZpvd = coordinatorLayout;
        this.AYXKKw = viewPager2;
        this.AhwBna = nestedScrollView;
        this.valueOf = c27137jpX;
        this.djBIcL = c33546myW;
        this.AkhnZx = view;
        this.values = fragmentContainerView;
        this.isConnected = abstractC23810iKd2;
        this.fetchVPNInfo = nestedScrollView2;
        this.DbNXlk = c55254xgV;
    }

    public static iGT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static iGT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static iGT AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.view.View viewFindChildViewById3;
        int i = C25493ixk.ActionBar.getNewProxyInstance;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C25493ixk.ActionBar.call;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
            if (appBarLayout != null) {
                i = C25493ixk.ActionBar.vLaW;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.BVXAa))) != null) {
                    AbstractC23810iKd abstractC23810iKdEZpvd = AbstractC23810iKd.EZpvd(viewFindChildViewById);
                    i = C25493ixk.ActionBar.iqeXgQ;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                    if (coordinatorLayout != null) {
                        i = C25493ixk.ActionBar.HJWChPUUMfbK;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null) {
                            i = C25493ixk.ActionBar.dNxZaP;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C25493ixk.ActionBar.HJWChPdNQGVJ;
                                C27137jpX c27137jpX = (C27137jpX) ViewBindings.findChildViewById(view, i);
                                if (c27137jpX != null) {
                                    i = C25493ixk.ActionBar.hfFNez;
                                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                    if (c33546myW != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.RjCdvp))) != null) {
                                        i = C25493ixk.ActionBar.RsCxkX;
                                        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                        if (fragmentContainerView != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.onLost))) != null) {
                                            AbstractC23810iKd abstractC23810iKdEZpvd2 = AbstractC23810iKd.EZpvd(viewFindChildViewById3);
                                            i = C25493ixk.ActionBar.SFHvfSaKzXkR;
                                            NestedScrollView nestedScrollView2 = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView2 != null) {
                                                i = C25493ixk.ActionBar.ddhgMB;
                                                C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                                                if (c55254xgV != null) {
                                                    return new iGT((ConstraintLayout) view, c33537myN, appBarLayout, constraintLayout, abstractC23810iKdEZpvd, coordinatorLayout, viewPager2, nestedScrollView, c27137jpX, c33546myW, viewFindChildViewById2, fragmentContainerView, abstractC23810iKdEZpvd2, nestedScrollView2, c55254xgV);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
