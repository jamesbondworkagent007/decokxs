package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21588hEy implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55173xeu AYXKKw;
    public final ConstraintLayout AhwBna;
    public final C31123loA AkhnZx;
    public final ViewPager2 DbNXlk;
    public final C55173xeu EZpvd;
    public final android.widget.TextView KWHzl;
    public final C22281hcR OLrzqt;
    public final FragmentContainerView copydefault;
    public final android.widget.FrameLayout djBIcL;
    public final LottieAnimationView gEmmrt;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C21588hEy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C22281hcR c22281hcR, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull C55173xeu c55173xeu2, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull C31123loA c31123loA, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AhwBna = constraintLayout;
        this.KWHzl = textView;
        this.copydefault = fragmentContainerView;
        this.AEQbTJ = frameLayout;
        this.OLrzqt = c22281hcR;
        this.EZpvd = c55173xeu;
        this.djBIcL = frameLayout2;
        this.valueOf = frameLayout3;
        this.AYXKKw = c55173xeu2;
        this.gEmmrt = lottieAnimationView;
        this.AkhnZx = c31123loA;
        this.DbNXlk = viewPager2;
    }

    public static C21588hEy AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gbIfDn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C21588hEy copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.UrRBLY;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.DcMfJKgMxgjU;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = C23274hvD.Application.hNurIN;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C23274hvD.Application.DFbvW;
                    C22281hcR c22281hcR = (C22281hcR) ViewBindings.findChildViewById(view, i);
                    if (c22281hcR != null) {
                        i = C23274hvD.Application.DeEinT;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C23274hvD.Application.OCdtug;
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout3 != null) {
                                    i = C23274hvD.Application.IResultReceiverDefault;
                                    C55173xeu c55173xeu2 = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                    if (c55173xeu2 != null) {
                                        i = C23274hvD.Application.PlaybackStateCompatApi22;
                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                        if (lottieAnimationView != null) {
                                            i = C23274hvD.Application.ContextAwareKtwithContextAvailable2listener1;
                                            C31123loA c31123loA = (C31123loA) ViewBindings.findChildViewById(view, i);
                                            if (c31123loA != null) {
                                                i = C23274hvD.Application.getIntent;
                                                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                                if (viewPager2 != null) {
                                                    return new C21588hEy((ConstraintLayout) view, textView, fragmentContainerView, frameLayout, c22281hcR, c55173xeu, frameLayout2, frameLayout3, c55173xeu2, lottieAnimationView, c31123loA, viewPager2);
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
