package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: loaded from: classes19.dex */
public final class qZQ implements ViewBinding {
    public final C55244xgL AEQbTJ;
    public final ViewPager2 KWHzl;
    public final C41381qpj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.copydefault;
    }

    public qZQ(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55244xgL c55244xgL) {
        this.copydefault = c41381qpj;
        this.KWHzl = viewPager2;
        this.AEQbTJ = c55244xgL;
    }

    public static qZQ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.OHqIaq;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
        if (viewPager2 != null) {
            i = qZH.StateListAnimator.hBUiXU;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                return new qZQ((C41381qpj) view, viewPager2, c55244xgL);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
