package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42778rco implements ViewBinding {
    public final FragmentContainerView EZpvd;
    public final C40499qYc KWHzl;
    public final FragmentContainerView OLrzqt;
    public final C40499qYc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.copydefault;
    }

    public C42778rco(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull C40499qYc c40499qYc2) {
        this.copydefault = c40499qYc;
        this.EZpvd = fragmentContainerView;
        this.OLrzqt = fragmentContainerView2;
        this.KWHzl = c40499qYc2;
    }

    public static C42778rco EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.invokespecialODCBUN;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = qZH.StateListAnimator.invokespecialRtjmuc;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                i = qZH.StateListAnimator.getLocation;
                C40499qYc c40499qYc = (C40499qYc) ViewBindings.findChildViewById(view, i);
                if (c40499qYc != null) {
                    return new C42778rco((C40499qYc) view, fragmentContainerView, fragmentContainerView2, c40499qYc);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
