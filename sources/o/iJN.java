package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public final class iJN implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final RecyclerView AYXKKw;
    public final Group EZpvd;
    public final C27385juG KWHzl;
    public final C55173xeu OLrzqt;
    public final C55024xcD copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public iJN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull C27385juG c27385juG, @androidx.annotation.NonNull C55024xcD c55024xcD, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = group;
        this.KWHzl = c27385juG;
        this.copydefault = c55024xcD;
        this.OLrzqt = c55173xeu;
        this.AYXKKw = recyclerView;
    }

    public static iJN KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.zvzmfz;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = C25493ixk.ActionBar.setLocationManually;
            C27385juG c27385juG = (C27385juG) ViewBindings.findChildViewById(view, i);
            if (c27385juG != null) {
                i = C25493ixk.ActionBar.GiPPlLgiPPlL;
                C55024xcD c55024xcD = (C55024xcD) ViewBindings.findChildViewById(view, i);
                if (c55024xcD != null) {
                    i = C25493ixk.ActionBar.onReceive;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C25493ixk.ActionBar.OtZEmZ;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new iJN((ConstraintLayout) view, group, c27385juG, c55024xcD, c55173xeu, recyclerView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
