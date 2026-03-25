package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nIF implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ViewPager2 AhwBna;
    public final C52794wYp EZpvd;
    public final ConstraintLayout KWHzl;
    public final wYK OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public nIF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.KWHzl = constraintLayout;
        this.EZpvd = c52794wYp;
        this.OLrzqt = wyk;
        this.AEQbTJ = constraintLayout2;
        this.copydefault = imageView;
        this.AhwBna = viewPager2;
    }

    public static nIF EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static nIF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.zLjUOn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static nIF OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.gGvvIC;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C35399nuc.StateListAnimator.igXuih;
            wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
            if (wyk != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C35399nuc.StateListAnimator.RbVjfb;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C35399nuc.StateListAnimator.validateAndPutInMap;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new nIF(constraintLayout, c52794wYp, wyk, constraintLayout, imageView, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
