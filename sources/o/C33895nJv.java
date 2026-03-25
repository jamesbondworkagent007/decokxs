package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nJv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33895nJv implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final FragmentContainerView AYXKKw;
    public final FragmentContainerView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final FragmentContainerView OLrzqt;
    public final FragmentContainerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C33895nJv(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView3, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView4, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView5) {
        this.KWHzl = linearLayout;
        this.OLrzqt = fragmentContainerView;
        this.EZpvd = fragmentContainerView2;
        this.copydefault = fragmentContainerView3;
        this.AEQbTJ = fragmentContainerView4;
        this.AYXKKw = fragmentContainerView5;
    }

    public static C33895nJv OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.iRxXKY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C33895nJv AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.RSmiaq;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35399nuc.StateListAnimator.HJWChPRGtXKCDKRTZD;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                i = C35399nuc.StateListAnimator.iqeXgQ;
                FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView3 != null) {
                    i = C35399nuc.StateListAnimator.QSAYLr;
                    FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView4 != null) {
                        i = C35399nuc.StateListAnimator.HJWChPfvRMlC;
                        FragmentContainerView fragmentContainerView5 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                        if (fragmentContainerView5 != null) {
                            return new C33895nJv((android.widget.LinearLayout) view, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4, fragmentContainerView5);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
