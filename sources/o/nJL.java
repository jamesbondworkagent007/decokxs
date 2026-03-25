package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes23.dex */
public final class nJL implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.LinearLayout KWHzl;
    public final AbstractC33963nMi OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public nJL(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull AbstractC33963nMi abstractC33963nMi, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.KWHzl = linearLayout;
        this.OLrzqt = abstractC33963nMi;
        this.copydefault = recyclerView;
        this.AEQbTJ = recyclerView2;
    }

    public static nJL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.QHmsKR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static nJL EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C35399nuc.StateListAnimator.cancel;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            AbstractC33963nMi abstractC33963nMiOLrzqt = AbstractC33963nMi.OLrzqt(viewFindChildViewById);
            int i2 = C35399nuc.StateListAnimator.GiPPlL;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
            if (recyclerView != null) {
                i2 = C35399nuc.StateListAnimator.OmJATG;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i2);
                if (recyclerView2 != null) {
                    return new nJL((android.widget.LinearLayout) view, abstractC33963nMiOLrzqt, recyclerView, recyclerView2);
                }
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
