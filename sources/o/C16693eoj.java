package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16693eoj implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.copydefault;
    }

    public C16693eoj(@androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.copydefault = recyclerView;
        this.AEQbTJ = recyclerView2;
    }

    public static C16693eoj EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.aVhqwO, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16693eoj copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C16693eoj(recyclerView, recyclerView);
    }
}
