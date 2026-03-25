package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.qZH;

/* JADX INFO: renamed from: o.rcV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42759rcV implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final ViewPager2 AYXKKw;
    public final qSQ EZpvd;
    public final FragmentContainerView KWHzl;
    public final C55254xgV OLrzqt;
    public final C55230xfy copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public qSQ getRoot() {
        return this.EZpvd;
    }

    public C42759rcV(@androidx.annotation.NonNull qSQ qsq, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.EZpvd = qsq;
        this.copydefault = c55230xfy;
        this.AEQbTJ = fragmentContainerView;
        this.KWHzl = fragmentContainerView2;
        this.OLrzqt = c55254xgV;
        this.AYXKKw = viewPager2;
    }

    public static C42759rcV copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.isReflectionWorking, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C42759rcV AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RAQtXZ;
        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
        if (c55230xfy != null) {
            i = qZH.StateListAnimator.iqMDAV;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = qZH.StateListAnimator.invokespecialgBtXYZ;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView2 != null) {
                    i = qZH.StateListAnimator.hBUiXU;
                    C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                    if (c55254xgV != null) {
                        i = qZH.StateListAnimator.writeToParcel;
                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                        if (viewPager2 != null) {
                            return new C42759rcV((qSQ) view, c55230xfy, fragmentContainerView, fragmentContainerView2, c55254xgV, viewPager2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
