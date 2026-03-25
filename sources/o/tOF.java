package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOF implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public tOF(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = linearLayout;
        this.copydefault = recyclerView;
    }

    public static tOF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.hCLrkq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static tOF EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.gCZUJG;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new tOF((android.widget.LinearLayout) view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
