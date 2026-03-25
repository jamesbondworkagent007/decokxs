package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.ufW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48958ufW implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final RecyclerView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.AEQbTJ;
    }

    public C48958ufW(@androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.AEQbTJ = recyclerView;
        this.EZpvd = recyclerView2;
    }

    public static C48958ufW OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C48958ufW(recyclerView, recyclerView);
    }
}
