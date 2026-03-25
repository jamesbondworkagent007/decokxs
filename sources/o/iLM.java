package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iLM implements ViewBinding {
    public final ConstraintLayout EZpvd;
    public final C27200jqh OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public iLM(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27200jqh c27200jqh) {
        this.EZpvd = constraintLayout;
        this.OLrzqt = c27200jqh;
    }

    public static iLM AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.DPhTBN;
        C27200jqh c27200jqh = (C27200jqh) ViewBindings.findChildViewById(view, i);
        if (c27200jqh != null) {
            return new iLM((ConstraintLayout) view, c27200jqh);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
