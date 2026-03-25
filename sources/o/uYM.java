package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.okinc.tradingbot.impl.order.strategy.dcd.view.DcdPnlChartView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uYM extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final NestedScrollView AYXKKw;
    public final C50399vMz AhwBna;
    public final C52794wYp EZpvd;
    public final C50392vMs KWHzl;
    public final DcdPnlChartView OLrzqt;
    public final C50394vMu copydefault;
    public final AppCompatTextView djBIcL;
    public final android.widget.RelativeLayout valueOf;

    public uYM(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, C52794wYp c52794wYp, DcdPnlChartView dcdPnlChartView, C50394vMu c50394vMu, C50392vMs c50392vMs, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, android.widget.RelativeLayout relativeLayout, C50399vMz c50399vMz) {
        super(obj, view, i);
        this.AEQbTJ = appCompatImageView;
        this.EZpvd = c52794wYp;
        this.OLrzqt = dcdPnlChartView;
        this.copydefault = c50394vMu;
        this.KWHzl = c50392vMs;
        this.AYXKKw = nestedScrollView;
        this.djBIcL = appCompatTextView;
        this.valueOf = relativeLayout;
        this.AhwBna = c50399vMz;
    }
}
