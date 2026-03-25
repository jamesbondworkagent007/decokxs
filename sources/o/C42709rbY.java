package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rbY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42709rbY implements ViewBinding {
    public final C41387qpp AEQbTJ;
    public final ViewPager2 EZpvd;
    public final C55244xgL KWHzl;
    public final C40781qeS OLrzqt;
    public final C41381qpj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.copydefault;
    }

    public C42709rbY(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull C40781qeS c40781qeS, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C41387qpp c41387qpp) {
        this.copydefault = c41381qpj;
        this.KWHzl = c55244xgL;
        this.OLrzqt = c40781qeS;
        this.EZpvd = viewPager2;
        this.AEQbTJ = c41387qpp;
    }

    public static C42709rbY KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.hBUiXU;
        C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
        if (c55244xgL != null) {
            i = qZH.StateListAnimator.getDefaultImpl;
            C40781qeS c40781qeS = (C40781qeS) ViewBindings.findChildViewById(view, i);
            if (c40781qeS != null) {
                i = qZH.StateListAnimator.writeToParcel;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    i = qZH.StateListAnimator.isPlayable;
                    C41387qpp c41387qpp = (C41387qpp) ViewBindings.findChildViewById(view, i);
                    if (c41387qpp != null) {
                        return new C42709rbY((C41381qpj) view, c55244xgL, c40781qeS, viewPager2, c41387qpp);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
