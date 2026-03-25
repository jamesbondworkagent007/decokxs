package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42723rbm implements ViewBinding {
    public final C41381qpj EZpvd;
    public final FragmentContainerView OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.EZpvd;
    }

    public C42723rbm(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout) {
        this.EZpvd = c41381qpj;
        this.OLrzqt = fragmentContainerView;
        this.copydefault = frameLayout;
    }

    public static C42723rbm EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.ihnvzI;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = qZH.StateListAnimator.zLAIeZ;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                return new C42723rbm((C41381qpj) view, fragmentContainerView, frameLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
