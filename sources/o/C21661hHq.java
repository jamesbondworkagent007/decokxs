package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21661hHq implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final LottieAnimationView AYXKKw;
    public final C31699mAq AhwBna;
    public final C22309hct EZpvd;
    public final LottieAnimationView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.FrameLayout gEmmrt;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.valueOf;
    }

    public C21661hHq(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C22309hct c22309hct, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C31699mAq c31699mAq) {
        this.valueOf = frameLayout;
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = frameLayout2;
        this.copydefault = textView;
        this.EZpvd = c22309hct;
        this.KWHzl = lottieAnimationView;
        this.AYXKKw = lottieAnimationView2;
        this.gEmmrt = frameLayout3;
        this.djBIcL = linearLayout;
        this.AhwBna = c31699mAq;
    }

    public static C21661hHq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.dYepVG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21661hHq EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.gdmIOq;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.putCallback;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.MediaSessionCompat;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.ensureClassLoader;
                    C22309hct c22309hct = (C22309hct) ViewBindings.findChildViewById(view, i);
                    if (c22309hct != null) {
                        i = C23274hvD.Application.release;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C23274hvD.Application.getRemoteControlClient;
                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView2 != null) {
                                i = C23274hvD.Application.PlaybackStateCompatRepeatMode;
                                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout2 != null) {
                                    i = C23274hvD.Application.PlaybackStateCompatApi21;
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = C23274hvD.Application.createFullyDrawnExecutor;
                                        C31699mAq c31699mAq = (C31699mAq) ViewBindings.findChildViewById(view, i);
                                        if (c31699mAq != null) {
                                            return new C21661hHq((android.widget.FrameLayout) view, linearLayoutCompat, frameLayout, textView, c22309hct, lottieAnimationView, lottieAnimationView2, frameLayout2, linearLayout, c31699mAq);
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
