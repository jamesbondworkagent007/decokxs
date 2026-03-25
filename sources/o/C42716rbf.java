package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rbf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42716rbf implements ViewBinding {
    public final android.widget.ScrollView AEQbTJ;
    public final C34932nll EZpvd;
    public final C49352umt KWHzl;
    public final FragmentContainerView OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.ScrollView getRoot() {
        return this.AEQbTJ;
    }

    public C42716rbf(@androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull C49352umt c49352umt, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C34932nll c34932nll, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.AEQbTJ = scrollView;
        this.KWHzl = c49352umt;
        this.OLrzqt = fragmentContainerView;
        this.EZpvd = c34932nll;
        this.copydefault = constraintLayout;
    }

    public static C42716rbf OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RqmePg;
        C49352umt c49352umt = (C49352umt) ViewBindings.findChildViewById(view, i);
        if (c49352umt != null) {
            i = qZH.StateListAnimator.invokespecialROgMPW;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = qZH.StateListAnimator.sanrWj;
                C34932nll c34932nll = (C34932nll) ViewBindings.findChildViewById(view, i);
                if (c34932nll != null) {
                    i = qZH.StateListAnimator.HJWChPhFGucI;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        return new C42716rbf((android.widget.ScrollView) view, c49352umt, fragmentContainerView, c34932nll, constraintLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
