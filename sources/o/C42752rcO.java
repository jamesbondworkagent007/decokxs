package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42752rcO implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final qXZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public qXZ getRoot() {
        return this.copydefault;
    }

    public C42752rcO(@androidx.annotation.NonNull qXZ qxz, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout) {
        this.copydefault = qxz;
        this.AEQbTJ = frameLayout;
    }

    public static C42752rcO copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DMb;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new C42752rcO((qXZ) view, frameLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
