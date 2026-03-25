package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.raE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42636raE implements ViewBinding {
    public final RecyclerView KWHzl;
    public final RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.OLrzqt;
    }

    public C42636raE(@androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.OLrzqt = recyclerView;
        this.KWHzl = recyclerView2;
    }

    public static C42636raE AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C42636raE(recyclerView, recyclerView);
    }
}
