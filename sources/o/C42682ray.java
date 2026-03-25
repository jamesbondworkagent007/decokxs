package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.ray, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42682ray implements ViewBinding {
    public final FragmentContainerView EZpvd;
    public final FragmentContainerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView getRoot() {
        return this.OLrzqt;
    }

    public C42682ray(@androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2) {
        this.OLrzqt = fragmentContainerView;
        this.EZpvd = fragmentContainerView2;
    }

    public static C42682ray KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C42682ray KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.QSBOWP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42682ray KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new C42682ray(fragmentContainerView, fragmentContainerView);
    }
}
