package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo;

/* JADX INFO: renamed from: o.eoN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16671eoN extends ViewDataBinding {
    public final C57440yiU AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;

    @Bindable
    public DappBTCUTXOInfo KWHzl;
    public final AppCompatImageView OLrzqt;
    public final RecyclerView copydefault;
    public final C55251xgS djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC16671eoN(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, C57440yiU c57440yiU, RecyclerView recyclerView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, C55251xgS c55251xgS, android.widget.TextView textView4) {
        super(obj, view, i);
        this.OLrzqt = appCompatImageView;
        this.EZpvd = constraintLayout;
        this.AEQbTJ = c57440yiU;
        this.copydefault = recyclerView;
        this.valueOf = textView;
        this.AYXKKw = textView2;
        this.gEmmrt = textView3;
        this.djBIcL = c55251xgS;
        this.AhwBna = textView4;
    }
}
