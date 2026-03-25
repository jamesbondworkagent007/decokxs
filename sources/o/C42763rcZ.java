package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42763rcZ implements ViewBinding {
    public final C40369qTh AEQbTJ;
    public final C55244xgL KWHzl;
    public final qSV OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C40369qTh getRoot() {
        return this.AEQbTJ;
    }

    public C42763rcZ(@androidx.annotation.NonNull C40369qTh c40369qTh, @androidx.annotation.NonNull qSV qsv, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55244xgL c55244xgL) {
        this.AEQbTJ = c40369qTh;
        this.OLrzqt = qsv;
        this.copydefault = recyclerView;
        this.KWHzl = c55244xgL;
    }

    public static C42763rcZ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.RSmiaq;
        qSV qsv = (qSV) ViewBindings.findChildViewById(view, i);
        if (qsv != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.PUZqN;
                C55244xgL c55244xgL = (C55244xgL) ViewBindings.findChildViewById(view, i);
                if (c55244xgL != null) {
                    return new C42763rcZ((C40369qTh) view, qsv, recyclerView, c55244xgL);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
