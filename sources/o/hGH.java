package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes23.dex */
public final class hGH implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final LinearLayoutCompat OLrzqt;
    public final hWF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public hGH(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull hWF hwf) {
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = recyclerView;
        this.copydefault = hwf;
    }

    public static hGH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.dpErvT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static hGH copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.setPipParamsSourceRectHint;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C23274hvD.Application.getAlphabeticShortcut;
            hWF hwf = (hWF) ViewBindings.findChildViewById(view, i);
            if (hwf != null) {
                return new hGH((LinearLayoutCompat) view, recyclerView, hwf);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
