package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBY implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final ConstraintLayout AkhnZx;
    public final C55244xgL EZpvd;
    public final C55173xeu KWHzl;
    public final android.widget.HorizontalScrollView OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.ImageView djBIcL;
    public final ViewPager2 fetchVPNInfo;
    public final C55113xdn gEmmrt;
    public final android.widget.ImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AkhnZx;
    }

    public hBY(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AkhnZx = constraintLayout;
        this.AEQbTJ = lottieAnimationView;
        this.EZpvd = c55244xgL;
        this.KWHzl = c55173xeu;
        this.copydefault = view;
        this.OLrzqt = horizontalScrollView;
        this.valueOf = imageView;
        this.AYXKKw = imageView2;
        this.djBIcL = imageView3;
        this.AhwBna = linearLayout;
        this.gEmmrt = c55113xdn;
        this.fetchVPNInfo = viewPager2;
    }

    public static hBY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.invokespecialDaTmkG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hBY EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.finit;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C23274hvD.Application.invokespecialROgMPW;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                i = C23274hvD.Application.QOjuYg;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dNxZaP))) != null) {
                    i = C23274hvD.Application.DkGEDn;
                    android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                    if (horizontalScrollView != null) {
                        i = C23274hvD.Application.DbvGUJ;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C23274hvD.Application.hijVBL;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C23274hvD.Application.INotificationSideChannelStubProxy;
                                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = C23274hvD.Application.isCaptioningEnabled;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                        if (c55113xdn != null) {
                                            i = C23274hvD.Application.setTitleCondensed;
                                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                            if (viewPager2 != null) {
                                                return new hBY((ConstraintLayout) view, lottieAnimationView, c55244xgL, c55173xeu, viewFindChildViewById, horizontalScrollView, imageView, imageView2, imageView3, linearLayout, c55113xdn, viewPager2);
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
