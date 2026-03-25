package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C33160mrH;

/* JADX INFO: renamed from: o.mth, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33292mth implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final C55089xdP EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C33292mth(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55089xdP c55089xdP, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout3, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout4) {
        this.KWHzl = frameLayout;
        this.EZpvd = c55089xdP;
        this.OLrzqt = frameLayout2;
        this.AEQbTJ = fragmentContainerView;
        this.copydefault = frameLayout3;
        this.valueOf = frameLayout4;
    }

    public static C33292mth copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C33292mth OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C33160mrH.Application.EZpvd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C33292mth copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C33160mrH.StateListAnimator.KWHzl;
        C55089xdP c55089xdP = (C55089xdP) ViewBindings.findChildViewById(view, i);
        if (c55089xdP != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
            i = C33160mrH.StateListAnimator.DbNXlk;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = C33160mrH.StateListAnimator.wlaJM;
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = C33160mrH.StateListAnimator.AubY;
                    android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout3 != null) {
                        return new C33292mth(frameLayout, c55089xdP, frameLayout, fragmentContainerView, frameLayout2, frameLayout3);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
