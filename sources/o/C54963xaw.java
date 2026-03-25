package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54963xaw implements ViewBinding {
    public final android.view.View KWHzl;
    public final RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C54963xaw(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = view;
        this.OLrzqt = recyclerView;
    }

    public static C54963xaw AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.dxcTrN, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C54963xaw EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.fLIjIY;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C54963xaw(view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
