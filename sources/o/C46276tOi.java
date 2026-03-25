package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46276tOi implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final tOI KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C46276tOi(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull tOI toi) {
        this.AEQbTJ = constraintLayout;
        this.KWHzl = toi;
    }

    public static C46276tOi AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.QCjLjM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C46276tOi EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.QslYrK;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            return new C46276tOi((ConstraintLayout) view, tOI.AEQbTJ(viewFindChildViewById));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
