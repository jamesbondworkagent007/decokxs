package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.liveness.lca.components.ClippedOvalImageView;
import com.okinc.liveness.lca.components.FaceOvalView;
import com.okinc.liveness.lca.components.FreshnessView;
import com.okinc.liveness.lca.components.PreviewTextureView;
import o.C45697sut;

/* JADX INFO: renamed from: o.suy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45702suy implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final LottieAnimationView AYXKKw;
    public final android.widget.ProgressBar AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.FrameLayout DbNXlk;
    public final FaceOvalView EZpvd;
    public final FreshnessView KWHzl;
    public final ClippedOvalImageView OLrzqt;
    public final C33537myN copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.FrameLayout fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.LinearLayout valueOf;
    public final PreviewTextureView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.DbNXlk;
    }

    public C45702suy(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull FaceOvalView faceOvalView, @androidx.annotation.NonNull FreshnessView freshnessView, @androidx.annotation.NonNull ClippedOvalImageView clippedOvalImageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull PreviewTextureView previewTextureView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.DbNXlk = frameLayout;
        this.copydefault = c33537myN;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = faceOvalView;
        this.KWHzl = freshnessView;
        this.OLrzqt = clippedOvalImageView;
        this.gEmmrt = linearLayout;
        this.djBIcL = linearLayout2;
        this.valueOf = linearLayout3;
        this.AYXKKw = lottieAnimationView;
        this.AhwBna = progressBar;
        this.values = previewTextureView;
        this.fetchVPNInfo = frameLayout2;
        this.AkhnZx = textView;
        this.isConnected = textView2;
        this.ejfBZ = textView3;
    }

    public static C45702suy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C45702suy EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C45697sut.StateListAnimator.AhwBna, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C45702suy KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C45697sut.Activity.OLrzqt;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C45697sut.Activity.valueOf;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C45697sut.Activity.getNewProxyInstance;
                FaceOvalView faceOvalView = (FaceOvalView) ViewBindings.findChildViewById(view, i);
                if (faceOvalView != null) {
                    i = C45697sut.Activity.zsXlph;
                    FreshnessView freshnessView = (FreshnessView) ViewBindings.findChildViewById(view, i);
                    if (freshnessView != null) {
                        i = C45697sut.Activity.zLjUOn;
                        ClippedOvalImageView clippedOvalImageView = (ClippedOvalImageView) ViewBindings.findChildViewById(view, i);
                        if (clippedOvalImageView != null) {
                            i = C45697sut.Activity.gHZMYf;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C45697sut.Activity.AxsJAY;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C45697sut.Activity.OcIXYQ;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = C45697sut.Activity.DTwDnp;
                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                        if (lottieAnimationView != null) {
                                            i = C45697sut.Activity.ORxRYg;
                                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
                                            if (progressBar != null) {
                                                i = C45697sut.Activity.QfsBiF;
                                                PreviewTextureView previewTextureView = (PreviewTextureView) ViewBindings.findChildViewById(view, i);
                                                if (previewTextureView != null) {
                                                    i = C45697sut.Activity.OBJEWx;
                                                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout != null) {
                                                        i = C45697sut.Activity.QHmsKR;
                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = C45697sut.Activity.spnCvw;
                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                i = C45697sut.Activity.Dmq;
                                                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView3 != null) {
                                                                    return new C45702suy((android.widget.FrameLayout) view, c33537myN, c52794wYp, faceOvalView, freshnessView, clippedOvalImageView, linearLayout, linearLayout2, linearLayout3, lottieAnimationView, progressBar, previewTextureView, frameLayout, textView, textView2, textView3);
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
