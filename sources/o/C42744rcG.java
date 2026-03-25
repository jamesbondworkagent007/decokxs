package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42744rcG implements ViewBinding {
    public final qIE AEQbTJ;
    public final RecyclerView KWHzl;
    public final C40499qYc copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.copydefault;
    }

    public C42744rcG(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull qIE qie) {
        this.copydefault = c40499qYc;
        this.KWHzl = recyclerView;
        this.AEQbTJ = qie;
    }

    public static C42744rcG copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.fmdvVn;
            qIE qie = (qIE) ViewBindings.findChildViewById(view, i);
            if (qie != null) {
                return new C42744rcG((C40499qYc) view, recyclerView, qie);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
