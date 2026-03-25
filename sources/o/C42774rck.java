package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import o.qZH;

/* JADX INFO: renamed from: o.rck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42774rck implements ViewBinding {
    public final ViewPager AEQbTJ;
    public final C40505qYi EZpvd;
    public final C55254xgV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40505qYi getRoot() {
        return this.EZpvd;
    }

    public C42774rck(@androidx.annotation.NonNull C40505qYi c40505qYi, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager viewPager) {
        this.EZpvd = c40505qYi;
        this.copydefault = c55254xgV;
        this.AEQbTJ = viewPager;
    }

    public static C42774rck OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.hBUiXU;
        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
        if (c55254xgV != null) {
            i = qZH.StateListAnimator.writeToParcel;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
            if (viewPager != null) {
                return new C42774rck((C40505qYi) view, c55254xgV, viewPager);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
