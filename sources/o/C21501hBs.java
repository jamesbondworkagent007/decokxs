package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21501hBs implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final C55249xgQ EZpvd;
    public final C22281hcR KWHzl;
    public final FragmentContainerView OLrzqt;
    public final ViewPager2 copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C22281hcR getRoot() {
        return this.KWHzl;
    }

    public C21501hBs(@androidx.annotation.NonNull C22281hcR c22281hcR, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull C55249xgQ c55249xgQ, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.KWHzl = c22281hcR;
        this.OLrzqt = fragmentContainerView;
        this.AEQbTJ = fragmentContainerView2;
        this.EZpvd = c55249xgQ;
        this.copydefault = viewPager2;
    }

    public static C21501hBs OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DPHsZd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21501hBs AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ExKek;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C23274hvD.Application.FHvxmb;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                i = C23274hvD.Application.update;
                C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                if (c55249xgQ != null) {
                    i = C23274hvD.Application.getIntent;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C21501hBs((C22281hcR) view, fragmentContainerView, fragmentContainerView2, c55249xgQ, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
