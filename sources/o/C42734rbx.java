package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rbx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42734rbx implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ViewPager2 EZpvd;
    public final C41002qib copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42734rbx(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C41002qib c41002qib, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = c41002qib;
        this.EZpvd = viewPager2;
    }

    public static C42734rbx EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.values;
        C41002qib c41002qib = (C41002qib) ViewBindings.findChildViewById(view, i);
        if (c41002qib != null) {
            i = qZH.StateListAnimator.getDescription;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new C42734rbx((ConstraintLayout) view, c41002qib, viewPager2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
