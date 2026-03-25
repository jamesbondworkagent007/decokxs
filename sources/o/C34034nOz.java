package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34034nOz implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final LottieAnimationView KWHzl;
    public final android.widget.CheckBox copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C34034nOz(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.CheckBox checkBox, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView) {
        this.EZpvd = constraintLayout;
        this.copydefault = checkBox;
        this.AEQbTJ = imageView;
        this.KWHzl = lottieAnimationView;
    }

    public static C34034nOz copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.invokespecialDaTmkG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C34034nOz copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.aUsmxb;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = C35399nuc.StateListAnimator.DQzvGNdrmXxudrmXxu;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C35399nuc.StateListAnimator.getAdvertisingId;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                if (lottieAnimationView != null) {
                    return new C34034nOz((ConstraintLayout) view, checkBox, imageView, lottieAnimationView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
