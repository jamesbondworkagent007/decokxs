package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.raU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42652raU implements ViewBinding {
    public final Group AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C55173xeu KWHzl;
    public final ViewPager2 OLrzqt;
    public final C55244xgL copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C42652raU(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.EZpvd = constraintLayout;
        this.KWHzl = c55173xeu;
        this.AEQbTJ = group;
        this.copydefault = c55244xgL;
        this.OLrzqt = viewPager2;
    }

    public static C42652raU AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.Swccd;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.YFmri;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = qZH.StateListAnimator.OqhRBM;
                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL != null) {
                    i = qZH.StateListAnimator.addSubscription;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C42652raU((ConstraintLayout) view, c55173xeu, group, c55244xgL, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
