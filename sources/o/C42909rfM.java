package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rfM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42909rfM implements ViewBinding {
    public final ConstraintLayout EZpvd;
    public final ViewPager2 KWHzl;
    public final C55254xgV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C42909rfM(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.EZpvd = constraintLayout;
        this.copydefault = c55254xgV;
        this.KWHzl = viewPager2;
    }

    public static C42909rfM KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.hBUiXU;
        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
        if (c55254xgV != null) {
            i = qZH.StateListAnimator.writeToParcel;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new C42909rfM((ConstraintLayout) view, c55254xgV, viewPager2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
