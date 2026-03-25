package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C54948xah implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final android.widget.FrameLayout AhwBna;
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.FrameLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AhwBna;
    }

    public C54948xah(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3) {
        this.AhwBna = frameLayout;
        this.OLrzqt = frameLayout2;
        this.copydefault = imageView;
        this.AEQbTJ = lottieAnimationView;
        this.EZpvd = view;
        this.KWHzl = view2;
        this.djBIcL = textView;
        this.gEmmrt = frameLayout3;
    }

    public static C54948xah AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.wlaJM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C54948xah OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i = C52761wXj.FragmentManager.AhwBna;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C52761wXj.FragmentManager.djBIcL;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C52761wXj.FragmentManager.AYXKKw))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C52761wXj.FragmentManager.valueOf))) != null) {
                i = C52761wXj.FragmentManager.AkhnZx;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C52761wXj.FragmentManager.AxsJAY;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        return new C54948xah(frameLayout, frameLayout, imageView, lottieAnimationView, viewFindChildViewById, viewFindChildViewById2, textView, frameLayout2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
