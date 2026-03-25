package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.divider.MaterialDivider;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNT implements ViewBinding {
    public final MaterialDivider EZpvd;
    public final RecyclerView KWHzl;
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public tNT(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull MaterialDivider materialDivider, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.OLrzqt = constraintLayout;
        this.EZpvd = materialDivider;
        this.KWHzl = recyclerView;
    }

    public static tNT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.getPostValueLengthLimit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static tNT KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.ULRxlR;
        MaterialDivider materialDivider = (MaterialDivider) ViewBindings.findChildViewById(view, i);
        if (materialDivider != null) {
            i = C47501trL.TaskDescription.DxnCrt;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new tNT((ConstraintLayout) view, materialDivider, recyclerView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
