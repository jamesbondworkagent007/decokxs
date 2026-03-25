package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.divider.MaterialDivider;
import o.qZH;

/* JADX INFO: renamed from: o.rdc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42819rdc implements ViewBinding {
    public final MaterialDivider AEQbTJ;
    public final C55244xgL EZpvd;
    public final ViewPager2 KWHzl;
    public final C40369qTh OLrzqt;
    public final C41387qpp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.OLrzqt;
    }

    public C42819rdc(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull MaterialDivider materialDivider, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C41387qpp c41387qpp) {
        this.OLrzqt = c40369qTh;
        this.AEQbTJ = materialDivider;
        this.EZpvd = c55244xgL;
        this.KWHzl = viewPager2;
        this.copydefault = c41387qpp;
    }

    public static C42819rdc EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.hrjNmC;
        MaterialDivider materialDivider = (MaterialDivider) ViewBindings.findChildViewById(view, i);
        if (materialDivider != null) {
            i = qZH.StateListAnimator.hBUiXU;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                i = qZH.StateListAnimator.writeToParcel;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    i = qZH.StateListAnimator.isPlayable;
                    C41387qpp c41387qpp = (C41387qpp) ViewBindings.findChildViewById(view, i);
                    if (c41387qpp != null) {
                        return new C42819rdc((C40369qTh) view, materialDivider, c55244xgL, viewPager2, c41387qpp);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
