package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42644raM implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final RecyclerView EZpvd;
    public final C40505qYi KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40505qYi getRoot() {
        return this.KWHzl;
    }

    public C42644raM(@androidx.annotation.NonNull C40505qYi c40505qYi, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.KWHzl = c40505qYi;
        this.OLrzqt = c52794wYp;
        this.EZpvd = recyclerView;
        this.AEQbTJ = recyclerView2;
        this.copydefault = textView;
        this.AhwBna = textView2;
    }

    public static C42644raM EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.OJuSTm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C42644raM copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DAIeex;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.DtnWsU;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.sEcTXd;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView2 != null) {
                    i = qZH.StateListAnimator.svUkWZ;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = qZH.StateListAnimator.onResult;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C42644raM((C40505qYi) view, c52794wYp, recyclerView, recyclerView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
