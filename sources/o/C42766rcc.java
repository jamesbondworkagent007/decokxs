package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42766rcc implements ViewBinding {
    public final C40499qYc AEQbTJ;
    public final RecyclerView EZpvd;
    public final qIE KWHzl;
    public final C55173xeu OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.AEQbTJ;
    }

    public C42766rcc(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull qIE qie) {
        this.AEQbTJ = c40499qYc;
        this.OLrzqt = c55173xeu;
        this.EZpvd = recyclerView;
        this.KWHzl = qie;
    }

    public static C42766rcc EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.Swccd;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.fmdvVn;
                qIE qie = (qIE) ViewBindings.findChildViewById(view, i);
                if (qie != null) {
                    return new C42766rcc((C40499qYc) view, c55173xeu, recyclerView, qie);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
