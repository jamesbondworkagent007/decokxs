package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.mDC;

/* JADX INFO: renamed from: o.mHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31881mHj implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final LottieAnimationView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.RelativeLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.gEmmrt;
    }

    public C31881mHj(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView) {
        this.gEmmrt = relativeLayout;
        this.copydefault = imageView;
        this.EZpvd = frameLayout;
        this.AEQbTJ = linearLayout;
        this.KWHzl = imageView2;
        this.OLrzqt = lottieAnimationView;
    }

    public static C31881mHj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(mDC.TaskDescription.QbewEr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C31881mHj EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = mDC.ActionBar.OLrzqt;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = mDC.ActionBar.AwvSrB;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = mDC.ActionBar.AxsJAY;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = mDC.ActionBar.zuBGHE;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = mDC.ActionBar.sSMYrx;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            return new C31881mHj((android.widget.RelativeLayout) view, imageView, frameLayout, linearLayout, imageView2, lottieAnimationView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
