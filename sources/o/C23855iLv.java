package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iLv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23855iLv implements ViewBinding {
    public final C27167jqA EZpvd;
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C23855iLv(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27167jqA c27167jqA) {
        this.OLrzqt = constraintLayout;
        this.EZpvd = c27167jqA;
    }

    public static C23855iLv EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.OAjjVP;
        C27167jqA c27167jqA = (C27167jqA) ViewBindings.findChildViewById(view, i);
        if (c27167jqA != null) {
            return new C23855iLv((ConstraintLayout) view, c27167jqA);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
