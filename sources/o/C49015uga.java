package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48931uew;

/* JADX INFO: renamed from: o.uga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49015uga implements ViewBinding {
    public final NestedScrollView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final NestedScrollView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.copydefault;
    }

    public C49015uga(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull NestedScrollView nestedScrollView2) {
        this.copydefault = nestedScrollView;
        this.OLrzqt = imageView;
        this.KWHzl = frameLayout;
        this.EZpvd = nestedScrollView2;
    }

    public static C49015uga copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C48931uew.StateListAnimator.UeEOUB;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C48931uew.StateListAnimator.giSNqX;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                return new C49015uga(nestedScrollView, imageView, frameLayout, nestedScrollView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
