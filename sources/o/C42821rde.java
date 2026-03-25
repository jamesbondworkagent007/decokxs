package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rde, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42821rde implements ViewBinding {
    public final qXN AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final qSQ OLrzqt;
    public final C55254xgV copydefault;
    public final ViewPager2 valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public qSQ getRoot() {
        return this.OLrzqt;
    }

    public C42821rde(@androidx.annotation.NonNull qSQ qsq, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull qXN qxn, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.OLrzqt = qsq;
        this.KWHzl = frameLayout;
        this.EZpvd = frameLayout2;
        this.AEQbTJ = qxn;
        this.copydefault = c55254xgV;
        this.valueOf = viewPager2;
    }

    public static C42821rde EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.RbVjfb, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42821rde copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.Ufzxmz;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = qZH.StateListAnimator.fXHmeK;
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = qZH.StateListAnimator.DQzvGNdrmXxu;
                qXN qxn = (qXN) ViewBindings.findChildViewById(view, i);
                if (qxn != null) {
                    i = qZH.StateListAnimator.hBUiXU;
                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                    if (c55254xgV != null) {
                        i = qZH.StateListAnimator.writeToParcel;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null) {
                            return new C42821rde((qSQ) view, frameLayout, frameLayout2, qxn, c55254xgV, viewPager2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
