package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nKF extends ViewDataBinding {
    public final C34042nPg AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final LinearLayoutCompat AkhnZx;
    public final C55113xdn EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C34042nPg copydefault;
    public final C35887oHj djBIcL;
    public final RecyclerView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final RecyclerView isConnected;
    public final C33546myW valueOf;

    public nKF(java.lang.Object obj, android.view.View view, int i, LinearLayoutCompat linearLayoutCompat, C34042nPg c34042nPg, C55113xdn c55113xdn, C34042nPg c34042nPg2, LinearLayoutCompat linearLayoutCompat2, android.widget.TextView textView, C35887oHj c35887oHj, android.widget.ImageView imageView, C33546myW c33546myW, LinearLayoutCompat linearLayoutCompat3, LinearLayoutCompat linearLayoutCompat4, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.KWHzl = linearLayoutCompat;
        this.copydefault = c34042nPg;
        this.EZpvd = c55113xdn;
        this.AEQbTJ = c34042nPg2;
        this.OLrzqt = linearLayoutCompat2;
        this.gEmmrt = textView;
        this.djBIcL = c35887oHj;
        this.AYXKKw = imageView;
        this.valueOf = c33546myW;
        this.AhwBna = linearLayoutCompat3;
        this.AkhnZx = linearLayoutCompat4;
        this.fetchVPNInfo = recyclerView;
        this.isConnected = recyclerView2;
    }

    public static nKF AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nKF OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nKF) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.run, viewGroup, z, obj);
    }
}
