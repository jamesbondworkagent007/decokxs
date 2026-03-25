package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iKp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23822iKp implements ViewBinding {
    public final C55008xbo KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C23822iKp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55008xbo c55008xbo) {
        this.OLrzqt = constraintLayout;
        this.copydefault = c52794wYp;
        this.KWHzl = c55008xbo;
    }

    public static C23822iKp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.gSBher, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23822iKp copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.ODWQjV;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C25493ixk.ActionBar.fcfzuX;
            C55008xbo c55008xbo = (C55008xbo) ViewBindings.findChildViewById(view, i);
            if (c55008xbo != null) {
                return new C23822iKp((ConstraintLayout) view, c52794wYp, c55008xbo);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
