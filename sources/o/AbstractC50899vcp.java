package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.tradingbot.impl.strategy.view.TickerIconView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50899vcp extends ViewDataBinding {
    public final TickerIconView AEQbTJ;
    public final C55251xgS EZpvd;
    public final C55251xgS KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final Barrier djBIcL;
    public final TickerIconView valueOf;

    public AbstractC50899vcp(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, C55251xgS c55251xgS, TickerIconView tickerIconView, android.widget.TextView textView2, C55251xgS c55251xgS2, TickerIconView tickerIconView2, Barrier barrier) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.KWHzl = c55251xgS;
        this.AEQbTJ = tickerIconView;
        this.copydefault = textView2;
        this.EZpvd = c55251xgS2;
        this.valueOf = tickerIconView2;
        this.djBIcL = barrier;
    }

    public static AbstractC50899vcp KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50899vcp AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50899vcp) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.dYepVG, viewGroup, z, obj);
    }
}
