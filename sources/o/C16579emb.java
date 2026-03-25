package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16579emb implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final NestedScrollView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.view.View OLrzqt;
    public final C52794wYp copydefault;
    public final AppCompatTextView djBIcL;
    public final C33537myN gEmmrt;
    public final AppCompatTextView isConnected;
    public final LottieAnimationView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C16579emb(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatImageView appCompatImageView2, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = view;
        this.copydefault = c52794wYp;
        this.AEQbTJ = appCompatImageView;
        this.EZpvd = appCompatImageView2;
        this.gEmmrt = c33537myN;
        this.valueOf = lottieAnimationView;
        this.AhwBna = nestedScrollView;
        this.AYXKKw = appCompatTextView;
        this.djBIcL = appCompatTextView2;
        this.isConnected = appCompatTextView3;
        this.AkhnZx = appCompatTextView4;
        this.DbNXlk = appCompatTextView5;
    }

    public static C16579emb AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
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
                                                        return new C16579emb((ConstraintLayout) view, viewFindChildViewById, c52794wYp, appCompatImageView, appCompatImageView2, c33537myN, lottieAnimationView, nestedScrollView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
