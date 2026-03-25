package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46268tOa implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55230xfy AYXKKw;
    public final CoordinatorLayout AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final AppBarLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final C55244xgL djBIcL;
    public final ViewPager2 gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.AhwBna;
    }

    public C46268tOa(@androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AhwBna = coordinatorLayout;
        this.OLrzqt = appBarLayout;
        this.EZpvd = imageView;
        this.copydefault = linearLayout;
        this.AEQbTJ = imageView2;
        this.KWHzl = imageView3;
        this.AYXKKw = c55230xfy;
        this.djBIcL = c55244xgL;
        this.valueOf = constraintLayout;
        this.gEmmrt = viewPager2;
    }

    public static C46268tOa AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.isConnected;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = C47501trL.TaskDescription.invokespecialhlXVux;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C47501trL.TaskDescription.profile;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C47501trL.TaskDescription.DcMfJKfwDlxl;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = C47501trL.TaskDescription.bindToGooglePlayService;
                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = C47501trL.TaskDescription.Dfv;
                            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                            if (c55230xfy != null) {
                                i = C47501trL.TaskDescription.GQzpsZgQzpsZ;
                                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                                if (c55244xgL != null) {
                                    i = C47501trL.TaskDescription.GzAsTt;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = C47501trL.TaskDescription.OhcwxsRkSIEV;
                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                        if (viewPager2 != null) {
                                            return new C46268tOa((CoordinatorLayout) view, appBarLayout, imageView, linearLayout, imageView2, imageView3, c55230xfy, c55244xgL, constraintLayout, viewPager2);
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
