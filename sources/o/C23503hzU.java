package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.okinc.uilab.reminder.OKReminder;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23503hzU implements ViewBinding {
    public final AppBarLayout AEQbTJ;
    public final C33603mza AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final OKReminder EZpvd;
    public final kNN KWHzl;
    public final FragmentContainerView OLrzqt;
    public final CollapsingToolbarLayout copydefault;
    public final C33546myW djBIcL;
    public final C55254xgV gEmmrt;
    public final ViewPager2 isConnected;
    public final CoordinatorLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AhwBna;
    }

    public C23503hzU(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull kNN knn, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AhwBna = frameLayout;
        this.AEQbTJ = appBarLayout;
        this.copydefault = collapsingToolbarLayout;
        this.OLrzqt = fragmentContainerView;
        this.EZpvd = oKReminder;
        this.KWHzl = knn;
        this.valueOf = coordinatorLayout;
        this.AYXKKw = c33603mza;
        this.djBIcL = c33546myW;
        this.gEmmrt = c55254xgV;
        this.isConnected = viewPager2;
    }

    public static C23503hzU KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DaRZkR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23503hzU copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.EZpvd;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = C23274hvD.Application.finishInit;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, i);
            if (collapsingToolbarLayout != null) {
                i = C23274hvD.Application.GQzpsZ;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView != null) {
                    i = C23274hvD.Application.isActive;
                    OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                    if (oKReminder != null) {
                        i = C23274hvD.Application.setSessionToken2Bundle;
                        kNN knn = (kNN) ViewBindings.findChildViewById(view, i);
                        if (knn != null) {
                            i = C23274hvD.Application.verifyToken;
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                            if (coordinatorLayout != null) {
                                i = C23274hvD.Application.lambdanew0;
                                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                if (c33603mza != null) {
                                    i = C23274hvD.Application.launch;
                                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                    if (c33546myW != null) {
                                        i = C23274hvD.Application.ContextAwareKt;
                                        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                                        if (c55254xgV != null) {
                                            i = C23274hvD.Application.setShowAsActionFlags;
                                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                            if (viewPager2 != null) {
                                                return new C23503hzU((android.widget.FrameLayout) view, appBarLayout, collapsingToolbarLayout, fragmentContainerView, oKReminder, knn, coordinatorLayout, c33603mza, c33546myW, c55254xgV, viewPager2);
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
