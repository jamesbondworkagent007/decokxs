package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hFA implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.LinearLayout KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public hFA(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2) {
        this.KWHzl = linearLayout;
        this.AEQbTJ = recyclerView;
        this.OLrzqt = appCompatTextView;
        this.copydefault = appCompatTextView2;
    }

    public static hFA OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.QMuEJi, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hFA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ComponentActivityApi19Impl;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C23274hvD.Application.setHasEmbeddedTabs;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C23274hvD.Application.parseItem;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null) {
                    return new hFA((android.widget.LinearLayout) view, recyclerView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
