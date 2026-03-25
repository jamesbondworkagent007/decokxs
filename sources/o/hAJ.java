package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hAJ implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final ViewPager2 AhwBna;
    public final C21986hTr EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55254xgV OLrzqt;
    public final OKAlertBanner copydefault;
    public final ConstraintLayout djBIcL;
    public final android.view.View fetchVPNInfo;
    public final FragmentContainerView gEmmrt;
    public final C55113xdn isConnected;
    public final C55173xeu valueOf;
    public final C29154koL values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public hAJ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C21986hTr c21986hTr, @androidx.annotation.NonNull OKAlertBanner oKAlertBanner, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C29154koL c29154koL, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55113xdn c55113xdn) {
        this.djBIcL = constraintLayout;
        this.EZpvd = c21986hTr;
        this.copydefault = oKAlertBanner;
        this.KWHzl = linearLayout;
        this.AEQbTJ = lottieAnimationView;
        this.OLrzqt = c55254xgV;
        this.AhwBna = viewPager2;
        this.gEmmrt = fragmentContainerView;
        this.AYXKKw = textView;
        this.valueOf = c55173xeu;
        this.values = c29154koL;
        this.fetchVPNInfo = view;
        this.isConnected = c55113xdn;
    }

    public static hAJ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zhUgOk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hAJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.dvKsVJ;
        C21986hTr c21986hTr = (C21986hTr) ViewBindings.findChildViewById(view, i);
        if (c21986hTr != null) {
            i = C23274hvD.Application.ODWQjV;
            OKAlertBanner oKAlertBanner = (OKAlertBanner) ViewBindings.findChildViewById(view, i);
            if (oKAlertBanner != null) {
                i = C23274hvD.Application.DcMfJKDSqxTE;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C23274hvD.Application.toLegacyStreamType;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C23274hvD.Application.sendVolumeInfoChanged;
                        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                        if (c55254xgV != null) {
                            i = C23274hvD.Application.getToken;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                            if (viewPager2 != null) {
                                i = C23274hvD.Application.BinderThread;
                                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                if (fragmentContainerView != null) {
                                    i = C23274hvD.Application.onDestroy;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C23274hvD.Application.dispatchTouchEvent;
                                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                        if (c55173xeu != null) {
                                            i = C23274hvD.Application.getNumericModifiers;
                                            C29154koL c29154koL = (C29154koL) ViewBindings.findChildViewById(view, i);
                                            if (c29154koL != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.isVisible))) != null) {
                                                i = C23274hvD.Application.onTouchEvent;
                                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                if (c55113xdn != null) {
                                                    return new hAJ((ConstraintLayout) view, c21986hTr, oKAlertBanner, linearLayout, lottieAnimationView, c55254xgV, viewPager2, fragmentContainerView, textView, c55173xeu, c29154koL, viewFindChildViewById, c55113xdn);
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
