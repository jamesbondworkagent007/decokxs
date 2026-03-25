package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hCj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21519hCj implements ViewBinding {
    public final ViewPager2 AEQbTJ;
    public final FragmentContainerView EZpvd;
    public final FragmentContainerView KWHzl;
    public final C22281hcR OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C21519hCj(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull C22281hcR c22281hcR, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.copydefault = constraintLayout;
        this.KWHzl = fragmentContainerView;
        this.EZpvd = fragmentContainerView2;
        this.OLrzqt = c22281hcR;
        this.AEQbTJ = viewPager2;
    }

    public static C21519hCj AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ROgMPW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21519hCj OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.unregisterMediaButtonEventReceiver;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C23274hvD.Application.MediaSessionCompatApi24CallbackProxy;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                i = C23274hvD.Application.removeCancellable;
                C22281hcR c22281hcR = (C22281hcR) ViewBindings.findChildViewById(view, i);
                if (c22281hcR != null) {
                    i = C23274hvD.Application.getIntent;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C21519hCj((ConstraintLayout) view, fragmentContainerView, fragmentContainerView2, c22281hcR, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
