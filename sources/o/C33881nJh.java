package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.nJh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33881nJh implements ViewBinding {
    public final RecyclerView EZpvd;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.copydefault;
    }

    public C33881nJh(@androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2) {
        this.copydefault = recyclerView;
        this.EZpvd = recyclerView2;
    }

    public static C33881nJh AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new C33881nJh(recyclerView, recyclerView);
    }
}
