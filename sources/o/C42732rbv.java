package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rbv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42732rbv implements ViewBinding {
    public final C55244xgL AEQbTJ;
    public final ViewPager2 EZpvd;
    public final ConstraintLayout KWHzl;
    public final C33537myN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C42732rbv(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.KWHzl = constraintLayout;
        this.copydefault = c33537myN;
        this.AEQbTJ = c55244xgL;
        this.EZpvd = viewPager2;
    }

    public static C42732rbv KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.values;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = qZH.StateListAnimator.zzQwtT;
            C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
            if (c55244xgL != null) {
                i = qZH.StateListAnimator.getDescription;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    return new C42732rbv((ConstraintLayout) view, c33537myN, c55244xgL, viewPager2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
