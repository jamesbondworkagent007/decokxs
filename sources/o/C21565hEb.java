package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hEb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C21565hEb implements ViewBinding {
    public final C55375xik AEQbTJ;
    public final RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55375xik getRoot() {
        return this.AEQbTJ;
    }

    public C21565hEb(@androidx.annotation.NonNull C55375xik c55375xik, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = c55375xik;
        this.OLrzqt = recyclerView;
    }

    public static C21565hEb copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C21565hEb OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gqOnQv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21565hEb AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getState;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C21565hEb((C55375xik) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
