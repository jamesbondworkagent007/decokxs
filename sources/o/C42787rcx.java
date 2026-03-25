package o;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.qZH;

/* JADX INFO: renamed from: o.rcx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42787rcx implements ViewBinding {
    public final C28005kLj AEQbTJ;
    public final C33546myW AYXKKw;
    public final NestedScrollView AhwBna;
    public final C33546myW AkhnZx;
    public final FragmentContainerView EZpvd;
    public final FragmentContainerView KWHzl;
    public final FragmentContainerView OLrzqt;
    public final C28005kLj copydefault;
    public final C40499qYc djBIcL;
    public final OKReminder gEmmrt;
    public final android.widget.HorizontalScrollView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.AkhnZx;
    }

    public C42787rcx(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C28005kLj c28005kLj, @androidx.annotation.NonNull C28005kLj c28005kLj2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView3, @androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.HorizontalScrollView horizontalScrollView, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull OKReminder oKReminder) {
        this.AkhnZx = c33546myW;
        this.copydefault = c28005kLj;
        this.AEQbTJ = c28005kLj2;
        this.KWHzl = fragmentContainerView;
        this.EZpvd = fragmentContainerView2;
        this.OLrzqt = fragmentContainerView3;
        this.djBIcL = c40499qYc;
        this.AhwBna = nestedScrollView;
        this.valueOf = horizontalScrollView;
        this.AYXKKw = c33546myW2;
        this.gEmmrt = oKReminder;
    }

    public static C42787rcx copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.KWHzl;
        C28005kLj c28005kLj = (C28005kLj) ViewBindings.findChildViewById(view, i);
        if (c28005kLj != null) {
            i = qZH.StateListAnimator.zhUgOk;
            C28005kLj c28005kLj2 = (C28005kLj) ViewBindings.findChildViewById(view, i);
            if (c28005kLj2 != null) {
                i = qZH.StateListAnimator.invokespecialDPHOMC;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView != null) {
                    i = qZH.StateListAnimator.invokespecialaKhcqp;
                    FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView2 != null) {
                        i = qZH.StateListAnimator.invokespecialRuDPQV;
                        FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                        if (fragmentContainerView3 != null) {
                            i = qZH.StateListAnimator.getLocation;
                            C40499qYc c40499qYc = (C40499qYc) ViewBindings.findChildViewById(view, i);
                            if (c40499qYc != null) {
                                i = qZH.StateListAnimator.HJWChPOZOJIj;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                if (nestedScrollView != null) {
                                    i = qZH.StateListAnimator.QSAYLr;
                                    android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) ViewBindings.findChildViewById(view, i);
                                    if (horizontalScrollView != null) {
                                        C33546myW c33546myW = (C33546myW) view;
                                        i = qZH.StateListAnimator.QOeQqh;
                                        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                                        if (oKReminder != null) {
                                            return new C42787rcx(c33546myW, c28005kLj, c28005kLj2, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, c40499qYc, nestedScrollView, horizontalScrollView, c33546myW, oKReminder);
                                        }
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
