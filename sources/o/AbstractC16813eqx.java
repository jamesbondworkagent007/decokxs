package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;

/* JADX INFO: renamed from: o.eqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16813eqx extends ViewDataBinding {

    @Bindable
    public DappBTCUTXOInfo AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55251xgS AhwBna;
    public final RecyclerView EZpvd;
    public final C57440yiU KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC16813eqx(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, C57440yiU c57440yiU, RecyclerView recyclerView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, C55251xgS c55251xgS, android.widget.TextView textView4) {
        super(obj, view, i);
        this.copydefault = appCompatImageView;
        this.OLrzqt = constraintLayout;
        this.KWHzl = c57440yiU;
        this.EZpvd = recyclerView;
        this.AYXKKw = textView;
        this.djBIcL = textView2;
        this.valueOf = textView3;
        this.AhwBna = c55251xgS;
        this.gEmmrt = textView4;
    }
}
