package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.pVX;

/* JADX INFO: loaded from: classes19.dex */
public final class pXN implements ViewBinding {
    public final android.widget.Button AEQbTJ;
    public final ConstraintLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public pXN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.Button button) {
        this.KWHzl = constraintLayout;
        this.AEQbTJ = button;
    }

    public static pXN copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(pVX.Application.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static pXN EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = pVX.ActionBar.OLrzqt;
        android.widget.Button button = (android.widget.Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            return new pXN((ConstraintLayout) view, button);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
