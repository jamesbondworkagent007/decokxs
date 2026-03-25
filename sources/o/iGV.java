package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iGV implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final C55173xeu OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public iGV(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55173xeu c55173xeu) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c33537myN;
        this.copydefault = recyclerView;
        this.OLrzqt = c55173xeu;
    }

    public static iGV OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static iGV copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.EZpvd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static iGV OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.isReflectionWorking;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C25493ixk.ActionBar.DVmcag;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C25493ixk.ActionBar.OKvQBs;
                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                if (c55173xeu != null) {
                    return new iGV((ConstraintLayout) view, c33537myN, recyclerView, c55173xeu);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
