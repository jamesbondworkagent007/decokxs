package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42641raJ implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final RecyclerView EZpvd;
    public final RecyclerView KWHzl;
    public final RecyclerView OLrzqt;
    public final C40505qYi copydefault;
    public final RecyclerView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C40505qYi getRoot() {
        return this.copydefault;
    }

    public C42641raJ(@androidx.annotation.NonNull C40505qYi c40505qYi, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull RecyclerView recyclerView3, @androidx.annotation.NonNull RecyclerView recyclerView4, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.copydefault = c40505qYi;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = recyclerView;
        this.KWHzl = recyclerView2;
        this.EZpvd = recyclerView3;
        this.djBIcL = recyclerView4;
        this.AhwBna = textView;
        this.AYXKKw = textView2;
        this.gEmmrt = textView3;
        this.valueOf = textView4;
    }

    public static C42641raJ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.QVsKAR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42641raJ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DAIeex;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.aWJMta;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.apLTlu;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView2 != null) {
                    i = qZH.StateListAnimator.DtnWsU;
                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView3 != null) {
                        i = qZH.StateListAnimator.sEcTXd;
                        RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView4 != null) {
                            i = qZH.StateListAnimator.svUkWZ;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = qZH.StateListAnimator.UimiPOhkCVbT;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = qZH.StateListAnimator.ITrustedWebActivityServiceStubProxy;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = qZH.StateListAnimator.onResult;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new C42641raJ((C40505qYi) view, c52794wYp, recyclerView, recyclerView2, recyclerView3, recyclerView4, textView, textView2, textView3, textView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
