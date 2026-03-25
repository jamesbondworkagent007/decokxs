package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.robinhood.ticker.TickerView;

/* JADX INFO: renamed from: o.vbt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50850vbt extends ViewDataBinding {
    public final Flow AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final C55320xhi AhwBna;
    public final AppCompatTextView AkhnZx;
    public final ViewStubProxy DbNXlk;
    public final AppCompatTextView EZpvd;
    public final android.view.View KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatTextView copydefault;
    public final Barrier djBIcL;
    public final C52705wVh gEmmrt;
    public final Flow isConnected;
    public final TickerView valueOf;

    public AbstractC50850vbt(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, Flow flow, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView2, android.view.View view2, Barrier barrier, C52705wVh c52705wVh, C55320xhi c55320xhi, TickerView tickerView, AppCompatImageView appCompatImageView, Flow flow2, AppCompatTextView appCompatTextView3, ViewStubProxy viewStubProxy) {
        super(obj, view, i);
        this.copydefault = appCompatTextView;
        this.AEQbTJ = flow;
        this.OLrzqt = constraintLayout;
        this.EZpvd = appCompatTextView2;
        this.KWHzl = view2;
        this.djBIcL = barrier;
        this.gEmmrt = c52705wVh;
        this.AhwBna = c55320xhi;
        this.valueOf = tickerView;
        this.AYXKKw = appCompatImageView;
        this.isConnected = flow2;
        this.AkhnZx = appCompatTextView3;
        this.DbNXlk = viewStubProxy;
    }
}
