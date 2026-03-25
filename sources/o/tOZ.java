package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOZ implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55254xgV EZpvd;
    public final ViewPager2 KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public tOZ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull C55254xgV c55254xgV) {
        this.AEQbTJ = linearLayout;
        this.KWHzl = viewPager2;
        this.EZpvd = c55254xgV;
    }

    public static tOZ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.ULRxlR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static tOZ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DcMfJKfNUfqk;
        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
        if (viewPager2 != null) {
            i = C47501trL.TaskDescription.GQzpsZgQzpsZ;
            C55254xgV c55254xgV = (C55254xgV) ViewBindings.findChildViewById(view, i);
            if (c55254xgV != null) {
                return new tOZ((android.widget.LinearLayout) view, viewPager2, c55254xgV);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
