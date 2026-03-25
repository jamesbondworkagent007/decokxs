package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16584emg implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final NestedScrollView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final ConstraintLayout EZpvd;
    public final AppCompatImageView KWHzl;
    public final C52794wYp OLrzqt;
    public final android.view.View copydefault;
    public final LottieAnimationView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final C33537myN valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C16584emg(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5) {
        this.EZpvd = constraintLayout;
        this.copydefault = view;
        this.OLrzqt = c52794wYp;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = appCompatImageView2;
        this.valueOf = c33537myN;
        this.djBIcL = lottieAnimationView;
        this.AhwBna = nestedScrollView;
        this.gEmmrt = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
        this.DbNXlk = appCompatTextView3;
        this.AkhnZx = appCompatTextView4;
        this.values = appCompatTextView5;
    }

    public static C16584emg EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.dbUqJD;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C13754dXa.ActionBar.BVXAa;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C13754dXa.ActionBar.OGitdB;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = C13754dXa.ActionBar.avCqka;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView2 != null) {
                        i = C13754dXa.ActionBar.MediaControllerCompatApi21;
                        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
                        if (c33537myN != null) {
                            i = C13754dXa.ActionBar.MediaControllerCompatApi21Callback;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView != null) {
                                i = C13754dXa.ActionBar.getStateWithUpdatedPosition;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                if (nestedScrollView != null) {
                                    i = C13754dXa.ActionBar.MediaSessionCompatApi22;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null) {
                                        i = C13754dXa.ActionBar.MediaSessionCompatApi21Callback;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView2 != null) {
                                            i = C13754dXa.ActionBar.createItem;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                i = C13754dXa.ActionBar.MediaSessionCompatApi23;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = C13754dXa.ActionBar.MediaSessionCompatApi23CallbackProxy;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        return new C16584emg((ConstraintLayout) view, viewFindChildViewById, c52794wYp, appCompatImageView, appCompatImageView2, c33537myN, lottieAnimationView, nestedScrollView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
