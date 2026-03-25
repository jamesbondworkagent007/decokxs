package o;

import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21626hGi implements ViewBinding {
    public final NestedScrollView AEQbTJ;
    public final ViewPager2 EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55254xgV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AEQbTJ;
    }

    public C21626hGi(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout) {
        this.AEQbTJ = nestedScrollView;
        this.copydefault = c55254xgV;
        this.EZpvd = viewPager2;
        this.KWHzl = linearLayout;
    }

    public static C21626hGi AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RSmiaq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21626hGi AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sanrWj;
        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
        if (c55254xgV != null) {
            i = C23274hvD.Application.ilfrrN;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = C23274hvD.Application.getFlagsValues;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    return new C21626hGi((NestedScrollView) view, c55254xgV, viewPager2, linearLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
