package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36061oNv implements ViewBinding {
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.copydefault;
    }

    public C36061oNv(@androidx.annotation.NonNull RecyclerView recyclerView) {
        this.copydefault = recyclerView;
    }

    public static C36061oNv AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.run, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36061oNv KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C36061oNv((RecyclerView) view);
    }
}
