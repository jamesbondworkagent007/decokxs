package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rcY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42762rcY implements ViewBinding {
    public final C55254xgV AEQbTJ;
    public final C40369qTh EZpvd;
    public final android.view.View KWHzl;
    public final C55230xfy OLrzqt;
    public final ConstraintLayout copydefault;
    public final ViewPager2 gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C42762rcY(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.copydefault = constraintLayout;
        this.OLrzqt = c55230xfy;
        this.EZpvd = c40369qTh;
        this.AEQbTJ = c55254xgV;
        this.KWHzl = view;
        this.gEmmrt = viewPager2;
    }

    public static C42762rcY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.DQzvGNdrmXxu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C42762rcY OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.RAQtXZ;
        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
        if (c55230xfy != null) {
            i = qZH.StateListAnimator.fRNHEq;
            C40369qTh c40369qTh = (C40369qTh) ViewBindings.findChildViewById(view, i);
            if (c40369qTh != null) {
                i = qZH.StateListAnimator.hBUiXU;
                C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                if (c55254xgV != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2))) != null) {
                    i = qZH.StateListAnimator.writeToParcel;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                    if (viewPager2 != null) {
                        return new C42762rcY((ConstraintLayout) view, c55230xfy, c40369qTh, c55254xgV, viewFindChildViewById, viewPager2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
