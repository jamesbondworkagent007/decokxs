package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rcM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42750rcM implements ViewBinding {
    public final qIH AEQbTJ;
    public final C40499qYc EZpvd;
    public final RecyclerView KWHzl;
    public final C40503qYg OLrzqt;
    public final qIM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C40499qYc getRoot() {
        return this.EZpvd;
    }

    public C42750rcM(@androidx.annotation.NonNull C40499qYc c40499qYc, @androidx.annotation.NonNull qIH qih, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C40503qYg c40503qYg, @androidx.annotation.NonNull qIM qim) {
        this.EZpvd = c40499qYc;
        this.AEQbTJ = qih;
        this.KWHzl = recyclerView;
        this.OLrzqt = c40503qYg;
        this.copydefault = qim;
    }

    public static C42750rcM EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.HJWChPfrwjPh;
        qIH qih = (qIH) ViewBindings.findChildViewById(view, i);
        if (qih != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.fRNHEq;
                C40503qYg c40503qYg = (C40503qYg) ViewBindings.findChildViewById(view, i);
                if (c40503qYg != null) {
                    i = qZH.StateListAnimator.fGsPTM;
                    qIM qim = (qIM) ViewBindings.findChildViewById(view, i);
                    if (qim != null) {
                        return new C42750rcM((C40499qYc) view, qih, recyclerView, c40503qYg, qim);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
