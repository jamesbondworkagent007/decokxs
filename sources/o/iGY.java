package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iGY implements ViewBinding {
    public final TabLayout AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final android.widget.FrameLayout EZpvd;
    public final C33537myN KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C27529jws copydefault;
    public final ViewPager2 valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public iGY(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C27529jws c27529jws, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.OLrzqt = constraintLayout;
        this.KWHzl = c33537myN;
        this.copydefault = c27529jws;
        this.EZpvd = frameLayout;
        this.AEQbTJ = tabLayout;
        this.AYXKKw = linearLayoutCompat;
        this.valueOf = viewPager2;
    }

    public static iGY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static iGY OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.AYXKKw, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static iGY AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.iwGUEr;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C25493ixk.ActionBar.HJWChPRGtXKCDKRTZD;
            C27529jws c27529jws = (C27529jws) ViewBindings.findChildViewById(view, i);
            if (c27529jws != null) {
                i = C25493ixk.ActionBar.OhcwxsRkSIEV;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C25493ixk.ActionBar.fObYrO;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                    if (tabLayout != null) {
                        i = C25493ixk.ActionBar.UnZVfq;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = C25493ixk.ActionBar.onShuffleModeChangedRemoved;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                            if (viewPager2 != null) {
                                return new iGY((ConstraintLayout) view, c33537myN, c27529jws, frameLayout, tabLayout, linearLayoutCompat, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
