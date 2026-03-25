package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dMB extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.view.View EZpvd;
    public final RecyclerView KWHzl;
    public final wYC OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.ImageView isConnected;
    public final android.widget.TextView valueOf;

    public dMB(java.lang.Object obj, android.view.View view, int i, android.view.View view2, wYC wyc, android.view.View view3, RecyclerView recyclerView, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.ImageView imageView) {
        super(obj, view, i);
        this.AEQbTJ = view2;
        this.OLrzqt = wyc;
        this.EZpvd = view3;
        this.KWHzl = recyclerView;
        this.copydefault = linearLayout;
        this.valueOf = textView;
        this.djBIcL = textView2;
        this.AYXKKw = textView3;
        this.AhwBna = textView4;
        this.gEmmrt = textView5;
        this.isConnected = imageView;
    }

    public static dMB EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static dMB OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (dMB) ViewDataBinding.inflateInternal(layoutInflater, dLX.Fragment.iwGUEr, viewGroup, z, obj);
    }
}
