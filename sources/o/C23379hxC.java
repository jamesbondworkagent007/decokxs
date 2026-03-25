package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23379hxC implements ViewBinding {
    public final ViewPager2 EZpvd;
    public final C55254xgV KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C24246iaH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C23379hxC(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C24246iaH c24246iaH, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.OLrzqt = constraintLayout;
        this.copydefault = c24246iaH;
        this.KWHzl = c55254xgV;
        this.EZpvd = viewPager2;
    }

    public static C23379hxC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C23379hxC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.getFieldNames, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23379hxC AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dxcTrN;
        C24246iaH c24246iaH = (C24246iaH) ViewBindings.findChildViewById(view, i);
        if (c24246iaH != null) {
            i = C23274hvD.Application.ActivityResult;
            C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
            if (c55254xgV != null) {
                i = C23274hvD.Application.getIntent;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    return new C23379hxC((ConstraintLayout) view, c24246iaH, c55254xgV, viewPager2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
