package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hDU implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final ViewPager2 OLrzqt;
    public final C55254xgV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public hDU(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.AEQbTJ = linearLayoutCompat;
        this.copydefault = c55254xgV;
        this.OLrzqt = viewPager2;
    }

    public static hDU OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DFbvW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static hDU OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.sanrWj;
        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
        if (c55254xgV != null) {
            i = C23274hvD.Application.ilfrrN;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new hDU((LinearLayoutCompat) view, c55254xgV, viewPager2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
