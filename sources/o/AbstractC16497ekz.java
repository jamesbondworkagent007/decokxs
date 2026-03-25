package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.wallet.transfer.segwit.AddressAggregationData;

/* JADX INFO: renamed from: o.ekz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16497ekz extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.view.View DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.ImageView copydefault;

    @Bindable
    public AddressAggregationData djBIcL;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView isConnected;

    @Bindable
    public C14079deg valueOf;

    public AbstractC16497ekz(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView, android.widget.ImageView imageView2, ConstraintLayout constraintLayout, android.widget.LinearLayout linearLayout, android.view.View view2, android.widget.TextView textView3, android.widget.TextView textView4, android.view.View view3) {
        super(obj, view, i);
        this.OLrzqt = c52794wYp;
        this.KWHzl = textView;
        this.EZpvd = textView2;
        this.AEQbTJ = imageView;
        this.copydefault = imageView2;
        this.gEmmrt = constraintLayout;
        this.AhwBna = linearLayout;
        this.AYXKKw = view2;
        this.AkhnZx = textView3;
        this.isConnected = textView4;
        this.DbNXlk = view3;
    }
}
