package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import o.qZH;

/* JADX INFO: renamed from: o.rdn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42830rdn implements ViewBinding {
    public final C55237xgE AEQbTJ;
    public final ViewPager2 AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C55237xgE copydefault;
    public final android.widget.TextView djBIcL;
    public final TabLayout gEmmrt;
    public final androidx.appcompat.widget.Toolbar valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55237xgE getRoot() {
        return this.copydefault;
    }

    public C42830rdn(@androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55237xgE c55237xgE2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.copydefault = c55237xgE;
        this.OLrzqt = imageView;
        this.AEQbTJ = c55237xgE2;
        this.KWHzl = constraintLayout;
        this.EZpvd = imageView2;
        this.gEmmrt = tabLayout;
        this.djBIcL = textView;
        this.valueOf = toolbar;
        this.AhwBna = textView2;
        this.AYXKKw = viewPager2;
    }

    public static C42830rdn KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DcMfJKsgNvtZ;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            C55237xgE c55237xgE = (C55237xgE) view;
            i = qZH.StateListAnimator.DsfknC;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = qZH.StateListAnimator.zbGDDc;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = qZH.StateListAnimator.OqhRBMiKdSzF;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
                    if (tabLayout != null) {
                        i = qZH.StateListAnimator.OtZEmZ;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = qZH.StateListAnimator.QezThh;
                            androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) ViewBindings.findChildViewById(view, i);
                            if (toolbar != null) {
                                i = qZH.StateListAnimator.getNotifyChildrenChangedOptions;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = qZH.StateListAnimator.isBrowsable;
                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                    if (viewPager2 != null) {
                                        return new C42830rdn(c55237xgE, imageView, c55237xgE, constraintLayout, imageView2, tabLayout, textView, toolbar, textView2, viewPager2);
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
