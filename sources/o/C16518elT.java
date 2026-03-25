package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16518elT implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C55173xeu EZpvd;
    public final RecyclerView KWHzl;
    public final C55230xfy OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C16518elT(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = c52794wYp;
        this.KWHzl = recyclerView;
        this.EZpvd = c55173xeu;
        this.OLrzqt = c55230xfy;
    }

    public static C16518elT copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.AubY;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.zDGrpR;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C13754dXa.ActionBar.hGuIrQ;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C13754dXa.ActionBar.MediaControllerCompatApi24TransportControls;
                    C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                    if (c55230xfy != null) {
                        return new C16518elT((ConstraintLayout) view, c52794wYp, recyclerView, c55173xeu, c55230xfy);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
