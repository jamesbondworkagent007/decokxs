package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nJT extends ViewDataBinding {
    public final C34041nPf AEQbTJ;
    public final C35887oHj AYXKKw;
    public final ConstraintLayout AhwBna;
    public final android.view.View EZpvd;
    public final android.view.View KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final RecyclerView djBIcL;
    public final C34036nPa fetchVPNInfo;
    public final C33603mza gEmmrt;
    public final C33546myW valueOf;
    public final android.widget.TextView values;

    public nJT(java.lang.Object obj, android.view.View view, int i, LinearLayoutCompat linearLayoutCompat, android.widget.FrameLayout frameLayout, android.view.View view2, android.view.View view3, C34041nPf c34041nPf, ConstraintLayout constraintLayout, C35887oHj c35887oHj, C33603mza c33603mza, C33546myW c33546myW, RecyclerView recyclerView, C34036nPa c34036nPa, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = linearLayoutCompat;
        this.copydefault = frameLayout;
        this.KWHzl = view2;
        this.EZpvd = view3;
        this.AEQbTJ = c34041nPf;
        this.AhwBna = constraintLayout;
        this.AYXKKw = c35887oHj;
        this.gEmmrt = c33603mza;
        this.valueOf = c33546myW;
        this.djBIcL = recyclerView;
        this.fetchVPNInfo = c34036nPa;
        this.values = textView;
    }

    public static nJT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nJT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nJT) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.OHqIaq, viewGroup, z, obj);
    }
}
