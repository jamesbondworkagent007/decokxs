package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iId, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23756iId implements ViewBinding {
    public final C27335jtJ EZpvd;
    public final C27334jtI KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23756iId(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C27334jtI c27334jtI, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C27335jtJ c27335jtJ) {
        this.copydefault = constraintLayout;
        this.KWHzl = c27334jtI;
        this.OLrzqt = constraintLayout2;
        this.EZpvd = c27335jtJ;
    }

    public static C23756iId OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.gGvvIC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23756iId KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.dNCPSb;
        C27334jtI c27334jtI = (C27334jtI) ViewBindings.findChildViewById(view, i);
        if (c27334jtI != null) {
            i = C25493ixk.ActionBar.RdAHlO;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C25493ixk.ActionBar.DGOPHZDGOPHZ;
                C27335jtJ c27335jtJ = (C27335jtJ) ViewBindings.findChildViewById(view, i);
                if (c27335jtJ != null) {
                    return new C23756iId((ConstraintLayout) view, c27334jtI, constraintLayout, c27335jtJ);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
