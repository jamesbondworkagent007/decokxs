package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hHE implements ViewBinding {
    public final RecyclerView KWHzl;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.KWHzl;
    }

    public hHE(@androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.KWHzl = recyclerView;
        this.copydefault = recyclerView2;
    }

    public static hHE KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.getConnectivityMgr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hHE EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new hHE(recyclerView, recyclerView);
    }
}
