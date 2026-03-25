package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46229tMp implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final C33546myW EZpvd;
    public final C33604mzb KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final RecyclerView copydefault;
    public final C55237xgE djBIcL;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.OLrzqt;
    }

    public C46229tMp(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = linearLayout;
        this.AEQbTJ = c33537myN;
        this.KWHzl = c33604mzb;
        this.copydefault = recyclerView;
        this.EZpvd = c33546myW;
        this.djBIcL = c55237xgE;
        this.AhwBna = linearLayout2;
        this.AYXKKw = imageView;
        this.gEmmrt = textView;
    }

    public static C46229tMp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C46229tMp OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.AhwBna, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C46229tMp AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.valueOf;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C47501trL.TaskDescription.OijiEz;
            C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
            if (c33604mzb != null) {
                i = C47501trL.TaskDescription.NRYds;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C47501trL.TaskDescription.QnnRaN;
                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                    if (c33546myW != null) {
                        i = C47501trL.TaskDescription.RFmUsE;
                        C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                        if (c55237xgE != null) {
                            i = C47501trL.TaskDescription.sRzUNh;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C47501trL.TaskDescription.hGuIrQ;
                                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C47501trL.TaskDescription.pXZxY;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        return new C46229tMp((android.widget.LinearLayout) view, c33537myN, c33604mzb, recyclerView, c33546myW, c55237xgE, linearLayout, imageView, textView);
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
