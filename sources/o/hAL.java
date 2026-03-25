package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAL implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final FragmentContainerView AYXKKw;
    public final AppCompatImageView AhwBna;
    public final C33603mza AkhnZx;
    public final C33546myW AuCTel;
    public final C55113xdn DbNXlk;
    public final AppBarLayout EZpvd;
    public final C55173xeu KWHzl;
    public final C55254xgV OLrzqt;
    public final ViewPager2 copydefault;
    public final AppCompatImageView djBIcL;
    public final android.widget.TextView fJNWhG;
    public final CoordinatorLayout fetchVPNInfo;
    public final LottieAnimationView gEmmrt;
    public final C55230xfy isConnected;
    public final android.widget.FrameLayout valueOf;
    public final android.widget.LinearLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.values;
    }

    public hAL(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull AppBarLayout appBarLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull CoordinatorLayout coordinatorLayout, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.values = linearLayout;
        this.AEQbTJ = frameLayout;
        this.EZpvd = appBarLayout;
        this.copydefault = viewPager2;
        this.OLrzqt = c55254xgV;
        this.KWHzl = c55173xeu;
        this.valueOf = frameLayout2;
        this.AYXKKw = fragmentContainerView;
        this.gEmmrt = lottieAnimationView;
        this.AhwBna = appCompatImageView;
        this.djBIcL = appCompatImageView2;
        this.isConnected = c55230xfy;
        this.DbNXlk = c55113xdn;
        this.fetchVPNInfo = coordinatorLayout;
        this.AkhnZx = c33603mza;
        this.AuCTel = c33546myW;
        this.fJNWhG = textView;
    }

    public static hAL copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.aKErDB;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C23274hvD.Application.gasjUx;
            AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
            if (appBarLayout != null) {
                i = C23274hvD.Application.dPnHjp;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    i = C23274hvD.Application.processStrongAuthMessage;
                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                    if (c55254xgV != null) {
                        i = C23274hvD.Application.sZqaRl;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C23274hvD.Application.jFiva;
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                i = C23274hvD.Application.avCqka;
                                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                if (fragmentContainerView != null) {
                                    i = C23274hvD.Application.onLost;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                    if (lottieAnimationView != null) {
                                        i = C23274hvD.Application.SQPLEi;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatImageView != null) {
                                            i = C23274hvD.Application.describeContents;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatImageView2 != null) {
                                                i = C23274hvD.Application.setRepeatMode;
                                                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                                                if (c55230xfy != null) {
                                                    i = C23274hvD.Application.toLegacyStreamType;
                                                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                    if (c55113xdn != null) {
                                                        i = C23274hvD.Application.onPlayFromMediaId;
                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                                        if (coordinatorLayout != null) {
                                                            i = C23274hvD.Application.lambdanew0;
                                                            C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                            if (c33603mza != null) {
                                                                i = C23274hvD.Application.getLauncher;
                                                                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                                if (c33546myW != null) {
                                                                    i = C23274hvD.Application.getConstantState;
                                                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView != null) {
                                                                        return new hAL((android.widget.LinearLayout) view, frameLayout, appBarLayout, viewPager2, c55254xgV, c55173xeu, frameLayout2, fragmentContainerView, lottieAnimationView, appCompatImageView, appCompatImageView2, c55230xfy, c55113xdn, coordinatorLayout, c33603mza, c33546myW, textView);
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
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
