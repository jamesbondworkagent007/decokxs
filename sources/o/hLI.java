package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.ChangeType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hLI implements hLH {
    public final hLL AEQbTJ;
    public final hLP KWHzl;
    public final hLS OLrzqt;
    public final C22495hgT copydefault;

    public hLI(@NotNull C22495hgT c22495hgT, @NotNull hLS hls) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        Intrinsics.checkNotNullParameter(hls, "");
        this.copydefault = c22495hgT;
        this.OLrzqt = hls;
        this.KWHzl = new hLP(c22495hgT);
        this.AEQbTJ = new hLL(c22495hgT);
    }

    public final hLH OLrzqt() {
        return this.copydefault.AubY() == ChangeType.FromChange ? this.KWHzl : this.AEQbTJ;
    }

    @Override // o.hLH
    public TradeInputGroup EZpvd(@NotNull LimitCalResult limitCalResult) {
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        TradeInputGroup tradeInputGroupEZpvd = OLrzqt().EZpvd(limitCalResult);
        this.copydefault.getPostValueLengthLimit().setValue(tradeInputGroupEZpvd != null ? C22332hdP.EZpvd(tradeInputGroupEZpvd) : null);
        return tradeInputGroupEZpvd;
    }

    public final void KWHzl() {
        this.OLrzqt.KWHzl(this.KWHzl.KWHzl(), this.KWHzl.AEQbTJ());
    }

    public final void AhwBna() {
        this.OLrzqt.AEQbTJ(this.KWHzl.KWHzl(), this.KWHzl.AEQbTJ());
    }

    public final void EZpvd() {
        this.OLrzqt.copydefault(this.AEQbTJ.EZpvd(), this.AEQbTJ.OLrzqt());
    }

    public final void AYXKKw() {
        this.OLrzqt.EZpvd(this.AEQbTJ.EZpvd(), this.AEQbTJ.OLrzqt());
    }

    @Override // o.hLH
    public java.lang.Boolean copydefault() {
        return OLrzqt().copydefault();
    }

    public boolean AEQbTJ() {
        return this.KWHzl.EZpvd();
    }
}
