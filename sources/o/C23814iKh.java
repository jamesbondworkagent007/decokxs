package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23814iKh implements ViewBinding {
    public final RecyclerView EZpvd;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C23814iKh(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.OLrzqt = frameLayout;
        this.EZpvd = recyclerView;
    }

    public static C23814iKh KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, null, false);
    }

    public static C23814iKh AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.fLIjIY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23814iKh copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.zAGdSp;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C23814iKh((android.widget.FrameLayout) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
