package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42747rcJ implements ViewBinding {
    public final android.widget.FrameLayout KWHzl;
    public final C40499qYc OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.OLrzqt;
    }

    public C42747rcJ(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout) {
        this.OLrzqt = c40499qYc;
        this.KWHzl = frameLayout;
    }

    public static C42747rcJ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.HJWChPRGtXKC;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new C42747rcJ((C40499qYc) view, frameLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
