package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16626enV implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final C55173xeu EZpvd;
    public final C55230xfy KWHzl;
    public final C33537myN OLrzqt;
    public final ConstraintLayout copydefault;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C16626enV(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.copydefault = constraintLayout;
        this.OLrzqt = c33537myN;
        this.AEQbTJ = c52794wYp;
        this.EZpvd = c55173xeu;
        this.KWHzl = c55230xfy;
        this.valueOf = recyclerView;
    }

    public static C16626enV copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.iZzfmt;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C13754dXa.ActionBar.RKcVTr;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C13754dXa.ActionBar.fqaWRL;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    i = C13754dXa.ActionBar.iFnJKK;
                    C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                    if (c55230xfy != null) {
                        i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new C16626enV((ConstraintLayout) view, c33537myN, c52794wYp, c55173xeu, c55230xfy, recyclerView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
