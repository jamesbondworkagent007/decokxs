package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iHC implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C57591ylM AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final ViewPager2 djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.valueOf;
    }

    public iHC(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C57591ylM c57591ylM, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.valueOf = linearLayout;
        this.AEQbTJ = imageView;
        this.OLrzqt = textView;
        this.copydefault = imageView2;
        this.KWHzl = imageView3;
        this.EZpvd = textView2;
        this.AhwBna = c57591ylM;
        this.gEmmrt = constraintLayout;
        this.djBIcL = viewPager2;
    }

    public static iHC KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.ORxRYg;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.dIjzlO;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C25493ixk.ActionBar.DRGLNw;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C25493ixk.ActionBar.aQtmcU;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C25493ixk.ActionBar.fRNHEq;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C25493ixk.ActionBar.zagaMW;
                            C57591ylM c57591ylM = (C57591ylM) ViewBindings.findChildViewById(view, i);
                            if (c57591ylM != null) {
                                i = C25493ixk.ActionBar.UnZVfq;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = C25493ixk.ActionBar.onShuffleModeChangedRemoved;
                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                    if (viewPager2 != null) {
                                        return new iHC((android.widget.LinearLayout) view, imageView, textView, imageView2, imageView3, textView2, c57591ylM, constraintLayout, viewPager2);
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
