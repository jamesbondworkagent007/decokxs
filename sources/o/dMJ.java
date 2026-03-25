package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dMJ extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final wYC EZpvd;
    public final wYC KWHzl;
    public final android.view.View OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final RecyclerView gEmmrt;
    public final android.widget.TextView valueOf;

    public dMJ(java.lang.Object obj, android.view.View view, int i, wYC wyc, android.view.View view2, wYC wyc2, ConstraintLayout constraintLayout, android.widget.ImageView imageView, android.widget.TextView textView, RecyclerView recyclerView, android.widget.TextView textView2, android.widget.LinearLayout linearLayout, android.widget.TextView textView3) {
        super(obj, view, i);
        this.EZpvd = wyc;
        this.OLrzqt = view2;
        this.KWHzl = wyc2;
        this.copydefault = constraintLayout;
        this.AEQbTJ = imageView;
        this.djBIcL = textView;
        this.gEmmrt = recyclerView;
        this.valueOf = textView2;
        this.AhwBna = linearLayout;
        this.AYXKKw = textView3;
    }

    public static dMJ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static dMJ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (dMJ) ViewDataBinding.inflateInternal(layoutInflater, dLX.Fragment.hDKMBd, viewGroup, z, obj);
    }
}
