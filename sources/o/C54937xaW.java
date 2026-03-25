package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54937xaW implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final android.view.View AYXKKw;
    public final RecyclerView AhwBna;
    public final RecyclerView EZpvd;
    public final Guideline KWHzl;
    public final RecyclerView OLrzqt;
    public final android.view.View copydefault;
    public final android.view.View djBIcL;
    public final C55230xfy gEmmrt;
    public final C55237xgE valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public C54937xaW(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView recyclerView2, @androidx.annotation.NonNull RecyclerView recyclerView3, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55237xgE c55237xgE, @androidx.annotation.NonNull RecyclerView recyclerView4) {
        this.djBIcL = view;
        this.AEQbTJ = recyclerView;
        this.EZpvd = recyclerView2;
        this.OLrzqt = recyclerView3;
        this.KWHzl = guideline;
        this.copydefault = view2;
        this.AYXKKw = view3;
        this.gEmmrt = c55230xfy;
        this.valueOf = c55237xgE;
        this.AhwBna = recyclerView4;
    }

    public static C54937xaW OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.hBpjJd, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C54937xaW AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C52761wXj.FragmentManager.sSMYrx;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C52761wXj.FragmentManager.AwvSrB;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView2 != null) {
                i = C52761wXj.FragmentManager.zuBGHE;
                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView3 != null) {
                    i = C52761wXj.FragmentManager.OqFWZa;
                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                    if (guideline != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C52761wXj.FragmentManager.UlJrfe))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C52761wXj.FragmentManager.dUDNAs))) != null) {
                        i = C52761wXj.FragmentManager.zDUObI;
                        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                        if (c55230xfy != null) {
                            i = C52761wXj.FragmentManager.zAEkPU;
                            C55237xgE c55237xgE = (C55237xgE) ViewBindings.findChildViewById(view, i);
                            if (c55237xgE != null) {
                                i = C52761wXj.FragmentManager.zKcAg;
                                RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView4 != null) {
                                    return new C54937xaW(view, recyclerView, recyclerView2, recyclerView3, guideline, viewFindChildViewById, viewFindChildViewById2, c55230xfy, c55237xgE, recyclerView4);
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
