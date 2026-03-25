package o;

import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public final class nMT implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final ShapeableImageView EZpvd;
    public final CardView KWHzl;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public nMT(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull CardView cardView) {
        this.copydefault = frameLayout;
        this.EZpvd = shapeableImageView;
        this.AEQbTJ = lottieAnimationView;
        this.KWHzl = cardView;
    }

    public static nMT EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.invokespecialhOMIpD;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
        if (shapeableImageView != null) {
            i = C35399nuc.StateListAnimator.getAdvertisingId;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C35399nuc.StateListAnimator.onStatusChanged;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    return new nMT((android.widget.FrameLayout) view, shapeableImageView, lottieAnimationView, cardView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
