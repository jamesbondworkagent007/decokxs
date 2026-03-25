package o;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42719rbi implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final C33603mza AYXKKw;
    public final C33546myW AhwBna;
    public final FragmentContainerView EZpvd;
    public final FragmentContainerView KWHzl;
    public final FragmentContainerView OLrzqt;
    public final FragmentContainerView copydefault;
    public final C41318qoZ djBIcL;
    public final FragmentContainerView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C41318qoZ getRoot() {
        return this.djBIcL;
    }

    public C42719rbi(@androidx.annotation.NonNull C41318qoZ c41318qoZ, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView3, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView4, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView5, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.djBIcL = c41318qoZ;
        this.AEQbTJ = nestedScrollView;
        this.KWHzl = fragmentContainerView;
        this.EZpvd = fragmentContainerView2;
        this.OLrzqt = fragmentContainerView3;
        this.copydefault = fragmentContainerView4;
        this.gEmmrt = fragmentContainerView5;
        this.AYXKKw = c33603mza;
        this.AhwBna = c33546myW;
    }

    public static C42719rbi copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.gwwfep;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
        if (nestedScrollView != null) {
            i = qZH.StateListAnimator.RzdrRQ;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = qZH.StateListAnimator.iHkeWl;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView2 != null) {
                    i = qZH.StateListAnimator.invokespecialdPnHjp;
                    FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView3 != null) {
                        i = qZH.StateListAnimator.invokespecialhOMIpD;
                        FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                        if (fragmentContainerView4 != null) {
                            i = qZH.StateListAnimator.invokespecialhlXVux;
                            FragmentContainerView fragmentContainerView5 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                            if (fragmentContainerView5 != null) {
                                i = qZH.StateListAnimator.DAgZj;
                                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                if (c33603mza != null) {
                                    i = qZH.StateListAnimator.onProviderEnabled;
                                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                    if (c33546myW != null) {
                                        return new C42719rbi((C41318qoZ) view, nestedScrollView, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4, fragmentContainerView5, c33603mza, c33546myW);
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
