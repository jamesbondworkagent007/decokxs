package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C35964oKf;

/* JADX INFO: loaded from: classes23.dex */
public final class oOV implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final C36114oPu AhwBna;
    public final C36250oUv EZpvd;
    public final C34698ngx KWHzl;
    public final ConstraintLayout OLrzqt;
    public final LottieAnimationView copydefault;
    public final android.widget.FrameLayout djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AYXKKw;
    }

    public oOV(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C34698ngx c34698ngx, @androidx.annotation.NonNull C36250oUv c36250oUv, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull C36114oPu c36114oPu, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.AYXKKw = frameLayout;
        this.KWHzl = c34698ngx;
        this.EZpvd = c36250oUv;
        this.AEQbTJ = c55173xeu;
        this.OLrzqt = constraintLayout;
        this.copydefault = lottieAnimationView;
        this.AhwBna = c36114oPu;
        this.djBIcL = frameLayout2;
    }

    public static oOV AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.hrjNmC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static oOV OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35964oKf.StateListAnimator.heceqZ;
        C34698ngx c34698ngx = (C34698ngx) ViewBindings.findChildViewById(view, i);
        if (c34698ngx != null) {
            i = C35964oKf.StateListAnimator.DsrFlB;
            C36250oUv c36250oUv = (C36250oUv) ViewBindings.findChildViewById(view, i);
            if (c36250oUv != null) {
                i = C35964oKf.StateListAnimator.invokespecialaGOrKO;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C35964oKf.StateListAnimator.cancel;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C35964oKf.StateListAnimator.DcMfJKDSqxTE;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35964oKf.StateListAnimator.fzHEvu))) != null) {
                            C36114oPu c36114oPuOLrzqt = C36114oPu.OLrzqt(viewFindChildViewById);
                            i = C35964oKf.StateListAnimator.dYepVG;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                return new oOV((android.widget.FrameLayout) view, c34698ngx, c36250oUv, c55173xeu, constraintLayout, lottieAnimationView, c36114oPuOLrzqt, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
