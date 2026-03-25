package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42783rct implements ViewBinding {
    public final C55052xcf AEQbTJ;
    public final C55258xgZ AYXKKw;
    public final C55113xdn EZpvd;
    public final C40499qYc KWHzl;
    public final C55173xeu OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.KWHzl;
    }

    public C42783rct(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55052xcf c55052xcf, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.KWHzl = c40499qYc;
        this.OLrzqt = c55173xeu;
        this.EZpvd = c55113xdn;
        this.AEQbTJ = c55052xcf;
        this.copydefault = recyclerView;
        this.AYXKKw = c55258xgZ;
    }

    public static C42783rct OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.Swccd;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = qZH.StateListAnimator.pXZxY;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = qZH.StateListAnimator.DeEinT;
                C55052xcf c55052xcf = (C55052xcf) ViewBindings.findChildViewById(view, i);
                if (c55052xcf != null) {
                    i = qZH.StateListAnimator.gwwzsY;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = qZH.StateListAnimator.onNavigationEvent;
                        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
                        if (c55258xgZ != null) {
                            return new C42783rct((C40499qYc) view, c55173xeu, c55113xdn, c55052xcf, recyclerView, c55258xgZ);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
