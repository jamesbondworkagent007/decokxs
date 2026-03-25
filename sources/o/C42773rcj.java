package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42773rcj implements ViewBinding {
    public final qSA AEQbTJ;
    public final RecyclerView OLrzqt;
    public final C41381qpj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C41381qpj getRoot() {
        return this.copydefault;
    }

    public C42773rcj(@androidx.annotation.NonNull C41381qpj c41381qpj, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull qSA qsa) {
        this.copydefault = c41381qpj;
        this.OLrzqt = recyclerView;
        this.AEQbTJ = qsa;
    }

    public static C42773rcj AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.fmdvVn;
            qSA qsa = (qSA) ViewBindings.findChildViewById(view, i);
            if (qsa != null) {
                return new C42773rcj((C41381qpj) view, recyclerView, qsa);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
