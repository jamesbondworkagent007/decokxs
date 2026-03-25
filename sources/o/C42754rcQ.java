package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42754rcQ implements ViewBinding {
    public final C40369qTh EZpvd;
    public final qSA OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.EZpvd;
    }

    public C42754rcQ(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull qSA qsa) {
        this.EZpvd = c40369qTh;
        this.copydefault = recyclerView;
        this.OLrzqt = qsa;
    }

    public static C42754rcQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.onStatusChanged;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = qZH.StateListAnimator.fmdvVn;
            qSA qsa = (qSA) ViewBindings.findChildViewById(view, i);
            if (qsa != null) {
                return new C42754rcQ((C40369qTh) view, recyclerView, qsa);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
