package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48931uew;

/* JADX INFO: renamed from: o.ufY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48960ufY implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C48960ufY(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3) {
        this.copydefault = frameLayout;
        this.AEQbTJ = frameLayout2;
        this.KWHzl = imageView;
        this.EZpvd = frameLayout3;
    }

    public static C48960ufY KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i = C48931uew.StateListAnimator.UeEOUB;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C48931uew.StateListAnimator.giSNqX;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                return new C48960ufY(frameLayout, frameLayout, imageView, frameLayout2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
