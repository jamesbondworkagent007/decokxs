package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rcX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42761rcX implements ViewBinding {
    public final C55254xgV AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final C40369qTh KWHzl;
    public final C41387qpp OLrzqt;
    public final ViewPager2 copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.KWHzl;
    }

    public C42761rcX(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C41387qpp c41387qpp) {
        this.KWHzl = c40369qTh;
        this.EZpvd = frameLayout;
        this.AEQbTJ = c55254xgV;
        this.copydefault = viewPager2;
        this.OLrzqt = c41387qpp;
    }

    public static C42761rcX OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.zLAIeZ;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.hBUiXU;
            C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
            if (c55254xgV != null) {
                i = qZH.StateListAnimator.writeToParcel;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    i = qZH.StateListAnimator.isPlayable;
                    C41387qpp c41387qpp = (C41387qpp) ViewBindings.findChildViewById(view, i);
                    if (c41387qpp != null) {
                        return new C42761rcX((C40369qTh) view, frameLayout, c55254xgV, viewPager2, c41387qpp);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
