package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import o.qZH;

/* JADX INFO: renamed from: o.rce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42768rce implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final TabLayout AYXKKw;
    public final C33537myN EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.view.View OLrzqt;
    public final C38420pYc copydefault;
    public final C38420pYc gEmmrt;
    public final ViewPager2 valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C38420pYc getRoot() {
        return this.gEmmrt;
    }

    public C42768rce(@androidx.annotation.NonNull C38420pYc c38420pYc, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C38420pYc c38420pYc2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.gEmmrt = c38420pYc;
        this.EZpvd = c33537myN;
        this.AEQbTJ = fragmentContainerView;
        this.KWHzl = linearLayout;
        this.copydefault = c38420pYc2;
        this.OLrzqt = view;
        this.AYXKKw = tabLayout;
        this.valueOf = viewPager2;
    }

    public static C42768rce EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.isConnected;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = qZH.StateListAnimator.alsFma;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = qZH.StateListAnimator.aQtmcU;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    C38420pYc c38420pYc = (C38420pYc) view;
                    i = qZH.StateListAnimator.iLWfRf;
                    android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById != null) {
                        i = qZH.StateListAnimator.hBUiXU;
                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                        if (tabLayout != null) {
                            i = qZH.StateListAnimator.writeToParcel;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                            if (viewPager2 != null) {
                                return new C42768rce(c38420pYc, c33537myN, fragmentContainerView, linearLayout, c38420pYc, viewFindChildViewById, tabLayout, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
