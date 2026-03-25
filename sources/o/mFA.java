package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mFA extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final wYC AYXKKw;
    public final wYC AhwBna;
    public final C55251xgS AkhnZx;
    public final ConstraintLayout DbNXlk;
    public final C52794wYp EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final wYC isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    public mFA(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView, wYC wyc, wYC wyc2, wYC wyc3, C55251xgS c55251xgS, ConstraintLayout constraintLayout5, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
        this.AEQbTJ = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.OLrzqt = constraintLayout3;
        this.copydefault = constraintLayout4;
        this.djBIcL = textView;
        this.valueOf = textView2;
        this.gEmmrt = imageView;
        this.AhwBna = wyc;
        this.AYXKKw = wyc2;
        this.isConnected = wyc3;
        this.AkhnZx = c55251xgS;
        this.DbNXlk = constraintLayout5;
        this.fetchVPNInfo = textView3;
        this.values = textView4;
        this.fARcdN = textView5;
    }

    public static mFA OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static mFA OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (mFA) ViewDataBinding.inflateInternal(layoutInflater, mDC.TaskDescription.copydefault, viewGroup, z, obj);
    }
}
