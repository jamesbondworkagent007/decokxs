package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iHu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23746iHu implements ViewBinding {
    public final C33546myW AEQbTJ;
    public final ViewPager2 AYXKKw;
    public final C33603mza AhwBna;
    public final C27385juG EZpvd;
    public final AppBarLayout KWHzl;
    public final C55173xeu OLrzqt;
    public final C55244xgL copydefault;
    public final ConstraintLayout djBIcL;
    public final C55113xdn valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C23746iHu(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C27385juG c27385juG, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.djBIcL = constraintLayout;
        this.KWHzl = appBarLayout;
        this.AEQbTJ = c33546myW;
        this.EZpvd = c27385juG;
        this.copydefault = c55244xgL;
        this.OLrzqt = c55173xeu;
        this.valueOf = c55113xdn;
        this.AhwBna = c33603mza;
        this.AYXKKw = viewPager2;
    }

    public static C23746iHu AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.KWHzl;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = C25493ixk.ActionBar.RVsVBY;
            C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
            if (c33546myW != null) {
                i = C25493ixk.ActionBar.getPriority;
                C27385juG c27385juG = (C27385juG) ViewBindings.findChildViewById(view, i);
                if (c27385juG != null) {
                    i = C25493ixk.ActionBar.DGUQLIOvDItG;
                    C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                    if (c55244xgL != null) {
                        i = C25493ixk.ActionBar.hrjNmC;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C25493ixk.ActionBar.HJWChPRAkuRW;
                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                            if (c55113xdn != null) {
                                i = C25493ixk.ActionBar.ORrpqH;
                                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                if (c33603mza != null) {
                                    i = C25493ixk.ActionBar.IMediaControllerCallbackStubProxy;
                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                    if (viewPager2 != null) {
                                        return new C23746iHu((ConstraintLayout) view, appBarLayout, c33546myW, c27385juG, c55244xgL, c55173xeu, c55113xdn, c33603mza, viewPager2);
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
