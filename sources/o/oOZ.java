package o;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public final class oOZ implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final FragmentContainerView AYXKKw;
    public final FragmentContainerView AhwBna;
    public final FragmentContainerView EZpvd;
    public final C55237xgE KWHzl;
    public final C33546myW OLrzqt;
    public final NestedScrollView copydefault;
    public final FragmentContainerView djBIcL;
    public final FragmentContainerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public oOZ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView3, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView4, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView5) {
        this.AEQbTJ = linearLayout;
        this.EZpvd = fragmentContainerView;
        this.copydefault = nestedScrollView;
        this.OLrzqt = c33546myW;
        this.KWHzl = c55237xgE;
        this.AhwBna = fragmentContainerView2;
        this.AYXKKw = fragmentContainerView3;
        this.djBIcL = fragmentContainerView4;
        this.valueOf = fragmentContainerView5;
    }

    public static oOZ copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.iFnJKK;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35964oKf.StateListAnimator.getInterfaceDescriptor;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
            if (nestedScrollView != null) {
                i = C35964oKf.StateListAnimator.getSessionToken;
                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                if (c33546myW != null) {
                    i = C35964oKf.StateListAnimator.search;
                    C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                    if (c55237xgE != null) {
                        i = C35964oKf.StateListAnimator.MediaSessionCompat2;
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                        if (fragmentContainerView2 != null) {
                            i = C35964oKf.StateListAnimator.onAddQueueItem;
                            FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                            if (fragmentContainerView3 != null) {
                                i = C35964oKf.StateListAnimator.onCustomAction;
                                FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                if (fragmentContainerView4 != null) {
                                    i = C35964oKf.StateListAnimator.handleMediaPlayPauseKeySingleTapIfPending;
                                    FragmentContainerView fragmentContainerView5 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                    if (fragmentContainerView5 != null) {
                                        return new oOZ((android.widget.LinearLayout) view, fragmentContainerView, nestedScrollView, c33546myW, c55237xgE, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4, fragmentContainerView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
