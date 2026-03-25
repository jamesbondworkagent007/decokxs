package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46230tMq implements ViewBinding {
    public final C55254xgV AEQbTJ;
    public final tUD KWHzl;
    public final ViewPager2 OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C46230tMq(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull tUD tud, @androidx.annotation.NonNull C55254xgV c55254xgV, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.copydefault = linearLayout;
        this.KWHzl = tud;
        this.AEQbTJ = c55254xgV;
        this.OLrzqt = viewPager2;
    }

    public static C46230tMq copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C46230tMq OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.isConnected, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C46230tMq KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DsL;
        tUD tud = (tUD) ViewBindings.findChildViewById(view, i);
        if (tud != null) {
            i = C47501trL.TaskDescription.GQzpsZgQzpsZ;
            C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
            if (c55254xgV != null) {
                i = C47501trL.TaskDescription.Ohcwxs;
                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                if (viewPager2 != null) {
                    return new C46230tMq((android.widget.LinearLayout) view, tud, c55254xgV, viewPager2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
