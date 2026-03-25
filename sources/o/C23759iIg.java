package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iIg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23759iIg implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C27335jtJ OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23759iIg(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C27335jtJ c27335jtJ, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.copydefault = constraintLayout;
        this.EZpvd = constraintLayout2;
        this.OLrzqt = c27335jtJ;
        this.AEQbTJ = recyclerView;
    }

    public static C23759iIg KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.fvQaOB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23759iIg AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.RdAHlO;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C25493ixk.ActionBar.DGOPHZDGOPHZ;
            C27335jtJ c27335jtJ = (C27335jtJ) ViewBindings.findChildViewById(view, i);
            if (c27335jtJ != null) {
                i = C25493ixk.ActionBar.UCQKYV;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new C23759iIg((ConstraintLayout) view, constraintLayout, c27335jtJ, recyclerView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
