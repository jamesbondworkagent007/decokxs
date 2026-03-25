package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rbG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42691rbG implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final RecyclerView EZpvd;
    public final C55244xgL KWHzl;
    public final C41002qib OLrzqt;
    public final ViewPager2 copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C42691rbG(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C41002qib c41002qib, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55244xgL c55244xgL, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = c41002qib;
        this.EZpvd = recyclerView;
        this.KWHzl = c55244xgL;
        this.copydefault = viewPager2;
    }

    public static C42691rbG EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.values;
        C41002qib c41002qib = (C41002qib) ViewBindings.findChildViewById(view, i);
        if (c41002qib != null) {
            i = qZH.StateListAnimator.fBE;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.zzQwtT;
                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL != null) {
                    i = qZH.StateListAnimator.getDescription;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C42691rbG((ConstraintLayout) view, c41002qib, recyclerView, c55244xgL, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
