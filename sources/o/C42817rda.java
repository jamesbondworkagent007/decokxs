package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rda, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42817rda implements ViewBinding {
    public final C41387qpp AEQbTJ;
    public final ViewPager2 EZpvd;
    public final C55254xgV KWHzl;
    public final C40499qYc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.copydefault;
    }

    public C42817rda(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C41387qpp c41387qpp) {
        this.copydefault = c40499qYc;
        this.KWHzl = c55254xgV;
        this.EZpvd = viewPager2;
        this.AEQbTJ = c41387qpp;
    }

    public static C42817rda copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.hBUiXU;
        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
        if (c55254xgV != null) {
            i = qZH.StateListAnimator.writeToParcel;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = qZH.StateListAnimator.isPlayable;
                C41387qpp c41387qpp = (C41387qpp) ViewBindings.findChildViewById(view, i);
                if (c41387qpp != null) {
                    return new C42817rda((C40499qYc) view, c55254xgV, viewPager2, c41387qpp);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
