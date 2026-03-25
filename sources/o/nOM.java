package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nOM implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C33546myW AYXKKw;
    public final C55237xgE AhwBna;
    public final C33604mzb EZpvd;
    public final RecyclerView KWHzl;
    public final C34028nOt OLrzqt;
    public final FragmentContainerView copydefault;
    public final FragmentContainerView djBIcL;
    public final LinearLayoutCompat gEmmrt;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.gEmmrt;
    }

    public nOM(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C34028nOt c34028nOt, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull C55237xgE c55237xgE) {
        this.gEmmrt = linearLayoutCompat;
        this.copydefault = fragmentContainerView;
        this.KWHzl = recyclerView;
        this.OLrzqt = c34028nOt;
        this.AEQbTJ = linearLayout;
        this.EZpvd = c33604mzb;
        this.AYXKKw = c33546myW;
        this.valueOf = linearLayoutCompat2;
        this.djBIcL = fragmentContainerView2;
        this.AhwBna = c55237xgE;
    }

    public static nOM KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.AkhnZx;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35399nuc.StateListAnimator.DNMMPQ;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.RzdrRQ))) != null) {
                C34028nOt c34028nOtEZpvd = C34028nOt.EZpvd(viewFindChildViewById);
                i = C35399nuc.StateListAnimator.DsL;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C35399nuc.StateListAnimator.RihMUf;
                    C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                    if (c33604mzb != null) {
                        i = C35399nuc.StateListAnimator.fhUrPt;
                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                        if (c33546myW != null) {
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                            i = C35399nuc.StateListAnimator.iRgjgR;
                            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                            if (fragmentContainerView2 != null) {
                                i = C35399nuc.StateListAnimator.HrFqwD;
                                C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                                if (c55237xgE != null) {
                                    return new nOM(linearLayoutCompat, fragmentContainerView, recyclerView, c34028nOtEZpvd, linearLayout, c33604mzb, c33546myW, linearLayoutCompat, fragmentContainerView2, c55237xgE);
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
