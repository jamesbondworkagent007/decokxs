package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C23274hvD;

/* JADX INFO: loaded from: classes15.dex */
public final class hDG implements ViewBinding {
    public final ViewPager2 AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final RecyclerView KWHzl;
    public final C33537myN OLrzqt;
    public final C55173xeu copydefault;
    public final C55254xgV gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public hDG(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55254xgV c55254xgV) {
        this.EZpvd = linearLayoutCompat;
        this.OLrzqt = c33537myN;
        this.AEQbTJ = viewPager2;
        this.copydefault = c55173xeu;
        this.KWHzl = recyclerView;
        this.gEmmrt = c55254xgV;
    }

    public static hDG EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static hDG EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QKDJJA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hDG copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dxcTrN;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C23274hvD.Application.toBundle;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                i = C23274hvD.Application.addContentView;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C23274hvD.Application.r8lambda9oQ81VFq3e0CkAqj9HHhVQeVeY;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C23274hvD.Application.withContextAvailableforInline;
                        C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
                        if (c55254xgV != null) {
                            return new hDG((LinearLayoutCompat) view, c33537myN, viewPager2, c55173xeu, recyclerView, c55254xgV);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
