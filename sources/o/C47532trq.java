package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C47315tni;

/* JADX INFO: renamed from: o.trq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47532trq implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final LottieAnimationView EZpvd;
    public final android.widget.ImageView KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public C47532trq(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.AEQbTJ = frameLayout;
        this.EZpvd = lottieAnimationView;
        this.KWHzl = imageView;
    }

    public static C47532trq AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.RbVjfb;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C47315tni.TaskDescription.RzdrRQ;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new C47532trq((android.widget.FrameLayout) view, lottieAnimationView, imageView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
