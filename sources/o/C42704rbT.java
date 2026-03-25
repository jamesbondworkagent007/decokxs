package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rbT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42704rbT implements ViewBinding {
    public final C55244xgL AEQbTJ;
    public final C41381qpj EZpvd;
    public final ViewPager2 KWHzl;
    public final C41387qpp OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.EZpvd;
    }

    public C42704rbT(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C41387qpp c41387qpp) {
        this.EZpvd = c41381qpj;
        this.copydefault = appCompatImageView;
        this.AEQbTJ = c55244xgL;
        this.KWHzl = viewPager2;
        this.OLrzqt = c41387qpp;
    }

    public static C42704rbT OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.sendBehavioSecData;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = qZH.StateListAnimator.hBUiXU;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                i = qZH.StateListAnimator.writeToParcel;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    i = qZH.StateListAnimator.isPlayable;
                    C41387qpp c41387qpp = (C41387qpp) ViewBindings.findChildViewById(view, i);
                    if (c41387qpp != null) {
                        return new C42704rbT((C41381qpj) view, appCompatImageView, c55244xgL, viewPager2, c41387qpp);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
