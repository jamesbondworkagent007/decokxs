package o;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oMZ implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final FragmentContainerView EZpvd;
    public final NestedScrollView KWHzl;
    public final FragmentContainerView OLrzqt;
    public final C55113xdn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public oMZ(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull NestedScrollView nestedScrollView) {
        this.AEQbTJ = frameLayout;
        this.EZpvd = fragmentContainerView;
        this.copydefault = c55113xdn;
        this.OLrzqt = fragmentContainerView2;
        this.KWHzl = nestedScrollView;
    }

    public static oMZ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.getPriority;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C35964oKf.StateListAnimator.closeSocket;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView2 != null) {
                    i = C35964oKf.StateListAnimator.getSmallIconBitmap;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                    if (nestedScrollView != null) {
                        return new oMZ((android.widget.FrameLayout) view, fragmentContainerView, c55113xdn, fragmentContainerView2, nestedScrollView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
