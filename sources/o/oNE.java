package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.okinc.uilab.reminder.OKReminder;
import o.C35964oKf;

/* JADX INFO: loaded from: classes18.dex */
public final class oNE implements ViewBinding {
    public final AppBarLayout AEQbTJ;
    public final C33546myW AYXKKw;
    public final CoordinatorLayout AhwBna;
    public final FragmentContainerView EZpvd;
    public final OKReminder KWHzl;
    public final C34619nfX OLrzqt;
    public final CollapsingToolbarLayout copydefault;
    public final C33603mza djBIcL;
    public final C55254xgV gEmmrt;
    public final ViewPager2 isConnected;
    public final C33546myW valueOf;
    public final OKReminder values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.AYXKKw;
    }

    public oNE(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull CollapsingToolbarLayout collapsingToolbarLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull C34619nfX c34619nfX, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull OKReminder oKReminder2, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AYXKKw = c33546myW;
        this.AEQbTJ = appBarLayout;
        this.copydefault = collapsingToolbarLayout;
        this.EZpvd = fragmentContainerView;
        this.KWHzl = oKReminder;
        this.OLrzqt = c34619nfX;
        this.AhwBna = coordinatorLayout;
        this.djBIcL = c33603mza;
        this.valueOf = c33546myW2;
        this.gEmmrt = c55254xgV;
        this.values = oKReminder2;
        this.isConnected = viewPager2;
    }

    public static oNE copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.DaRZkR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static oNE KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.OLrzqt;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = C35964oKf.StateListAnimator.DGUQLIdZmdUa;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, i);
            if (collapsingToolbarLayout != null) {
                i = C35964oKf.StateListAnimator.iKEqwx;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView != null) {
                    i = C35964oKf.StateListAnimator.DcNNRp;
                    OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                    if (oKReminder != null) {
                        i = C35964oKf.StateListAnimator.identifier;
                        C34619nfX c34619nfX = (C34619nfX) ViewBindings.findChildViewById(view, i);
                        if (c34619nfX != null) {
                            i = C35964oKf.StateListAnimator.ZqidTP;
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                            if (coordinatorLayout != null) {
                                i = C35964oKf.StateListAnimator.ICustomTabsCallback;
                                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                if (c33603mza != null) {
                                    C33546myW c33546myW = (C33546myW) view;
                                    i = C35964oKf.StateListAnimator.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
                                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                                    if (c55254xgV != null) {
                                        i = C35964oKf.StateListAnimator.onReceiveResult;
                                        OKReminder oKReminder2 = (OKReminder) ViewBindings.findChildViewById(view, i);
                                        if (oKReminder2 != null) {
                                            i = C35964oKf.StateListAnimator.onPlaybackPositionUpdate;
                                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                            if (viewPager2 != null) {
                                                return new oNE(c33546myW, appBarLayout, collapsingToolbarLayout, fragmentContainerView, oKReminder, c34619nfX, coordinatorLayout, c33603mza, c33546myW, c55254xgV, oKReminder2, viewPager2);
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
