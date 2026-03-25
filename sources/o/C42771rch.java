package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42771rch implements ViewBinding {
    public final qIM AEQbTJ;
    public final RecyclerView KWHzl;
    public final qIH OLrzqt;
    public final C40503qYg copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40503qYg getRoot() {
        return this.copydefault;
    }

    public C42771rch(@androidx.annotation.NonNull C40503qYg c40503qYg, @androidx.annotation.NonNull qIH qih, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull qIM qim) {
        this.copydefault = c40503qYg;
        this.OLrzqt = qih;
        this.KWHzl = recyclerView;
        this.AEQbTJ = qim;
    }

    public static C42771rch copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.HJWChPfrwjPh;
        qIH qih = (qIH) ViewBindings.findChildViewById(view, i);
        if (qih != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.fGsPTM;
                qIM qim = (qIM) ViewBindings.findChildViewById(view, i);
                if (qim != null) {
                    return new C42771rch((C40503qYg) view, qih, recyclerView, qim);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
