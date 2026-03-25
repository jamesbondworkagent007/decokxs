package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16259egZ implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final LottieAnimationView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final android.view.View EZpvd;
    public final ShapeableImageView KWHzl;
    public final C52794wYp OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final AppCompatTextView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final C33537myN valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C16259egZ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4) {
        this.gEmmrt = constraintLayout;
        this.OLrzqt = c52794wYp;
        this.EZpvd = view;
        this.AEQbTJ = appCompatImageView;
        this.KWHzl = shapeableImageView;
        this.copydefault = linearLayoutCompat;
        this.valueOf = c33537myN;
        this.AYXKKw = lottieAnimationView;
        this.AhwBna = appCompatTextView;
        this.djBIcL = appCompatTextView2;
        this.values = appCompatTextView3;
        this.AkhnZx = appCompatTextView4;
    }

    public static C16259egZ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C16259egZ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.AkhnZx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16259egZ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.DGUQLIOvDItG;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.aQtmcU))) != null) {
            i = C13754dXa.ActionBar.zdxASf;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C13754dXa.ActionBar.sFt;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = C13754dXa.ActionBar.OmPrLP;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C13754dXa.ActionBar.MediaControllerCompatTransportControlsBase;
                        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
                        if (c33537myN != null) {
                            i = C13754dXa.ActionBar.getLegacyAudioStream;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                            if (lottieAnimationView != null) {
                                i = C13754dXa.ActionBar.FullyDrawnReporter;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C13754dXa.ActionBar.r8lambda9oQ81VFq3e0CkAqj9HHhVQeVeY;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C13754dXa.ActionBar.ComponentDialogExternalSyntheticApiModelOutline0;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = C13754dXa.ActionBar.ActivityResultContracts;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                return new C16259egZ((ConstraintLayout) view, c52794wYp, viewFindChildViewById, appCompatImageView, shapeableImageView, linearLayoutCompat, c33537myN, lottieAnimationView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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
