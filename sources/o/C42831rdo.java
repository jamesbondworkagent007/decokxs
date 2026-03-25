package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rdo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42831rdo implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C55230xfy AYXKKw;
    public final C40499qYc AhwBna;
    public final android.widget.Space EZpvd;
    public final qXN KWHzl;
    public final C55113xdn OLrzqt;
    public final FragmentContainerView copydefault;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.AhwBna;
    }

    public C42831rdo(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull qXN qxn, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AhwBna = c40499qYc;
        this.EZpvd = space;
        this.copydefault = fragmentContainerView;
        this.AEQbTJ = frameLayout;
        this.KWHzl = qxn;
        this.OLrzqt = c55113xdn;
        this.AYXKKw = c55230xfy;
        this.valueOf = textView;
    }

    public static C42831rdo OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.djBIcL;
        android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = qZH.StateListAnimator.aHXSQp;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = qZH.StateListAnimator.akftKQ;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = qZH.StateListAnimator.dzkkkq;
                    qXN qxn = (qXN) ViewBindings.findChildViewById(view, i);
                    if (qxn != null) {
                        i = qZH.StateListAnimator.pXZxY;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = qZH.StateListAnimator.QzqeNH;
                            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                            if (c55230xfy != null) {
                                i = qZH.StateListAnimator.onServiceDisconnected;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    return new C42831rdo((C40499qYc) view, space, fragmentContainerView, frameLayout, qxn, c55113xdn, c55230xfy, textView);
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
