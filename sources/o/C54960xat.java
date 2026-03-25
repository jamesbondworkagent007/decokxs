package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xat, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54960xat implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.view.View KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.KWHzl;
    }

    public C54960xat(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = view;
        this.AEQbTJ = recyclerView;
    }

    public static C54960xat KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.aKErDB, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C54960xat EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.finit;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C54960xat(view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
