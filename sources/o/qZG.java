package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes16.dex */
public final class qZG implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final androidx.appcompat.widget.Toolbar AkhnZx;
    public final android.widget.LinearLayout EZpvd;
    public final wYK KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final C55237xgE djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.FrameLayout gEmmrt;
    public final RecyclerView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AYXKKw;
    }

    public qZG(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull androidx.appcompat.widget.Toolbar toolbar, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.AYXKKw = linearLayout;
        this.copydefault = textView;
        this.AEQbTJ = c52794wYp;
        this.OLrzqt = textView2;
        this.KWHzl = wyk;
        this.EZpvd = linearLayout2;
        this.gEmmrt = frameLayout;
        this.AhwBna = linearLayout3;
        this.valueOf = recyclerView;
        this.djBIcL = c55237xgE;
        this.fetchVPNInfo = textView3;
        this.AkhnZx = toolbar;
        this.values = textView4;
    }

    public static qZG EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static qZG KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.KWHzl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static qZG OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.copydefault;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = qZH.StateListAnimator.RlQdEF;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = qZH.StateListAnimator.getPostValueLengthLimit;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = qZH.StateListAnimator.hrNTAI;
                    wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
                    if (wyk != null) {
                        i = qZH.StateListAnimator.QwvEab;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = qZH.StateListAnimator.DuXjdv;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view;
                                i = qZH.StateListAnimator.IKQXqd;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = qZH.StateListAnimator.OKvQBs;
                                    C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                                    if (c55237xgE != null) {
                                        i = qZH.StateListAnimator.OeZisf;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = qZH.StateListAnimator.QezThh;
                                            androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) ViewBindings.findChildViewById(view, i);
                                            if (toolbar != null) {
                                                i = qZH.StateListAnimator.QYvkLl;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    return new qZG(linearLayout2, textView, c52794wYp, textView2, wyk, linearLayout, frameLayout, linearLayout2, recyclerView, c55237xgE, textView3, toolbar, textView4);
                                                }
                                            }
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
