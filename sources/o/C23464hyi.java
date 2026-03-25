package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23464hyi implements ViewBinding {
    public final RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.OLrzqt;
    }

    public C23464hyi(@androidx.annotation.NonNull RecyclerView recyclerView) {
        this.OLrzqt = recyclerView;
    }

    public static C23464hyi copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.flVtFt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23464hyi EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C23464hyi((RecyclerView) view);
    }
}
