package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23844iLk implements ViewBinding {
    public final ConstraintLayout KWHzl;
    public final C27176jqJ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C23844iLk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27176jqJ c27176jqJ) {
        this.KWHzl = constraintLayout;
        this.copydefault = c27176jqJ;
    }

    public static C23844iLk AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.YqksP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23844iLk OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.hpmliR;
        C27176jqJ c27176jqJ = (C27176jqJ) ViewBindings.findChildViewById(view, i);
        if (c27176jqJ != null) {
            return new C23844iLk((ConstraintLayout) view, c27176jqJ);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
