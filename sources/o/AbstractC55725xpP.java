package o;

import com.okinc.unify_trade.biz.StrategyGridDealOrderGroup;
import com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55725xpP {
    public StrategyGridDealOrderGroup AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyGridDealOrderGroup AEQbTJ() {
        return this.AEQbTJ;
    }

    public abstract void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<StrategyGridTradeOrderDetailsResponse> list, @NotNull InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    public abstract void EZpvd(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    public AbstractC55725xpP(@NotNull StrategyGridDealOrderGroup strategyGridDealOrderGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(strategyGridDealOrderGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = strategyGridDealOrderGroup;
        this.KWHzl = str;
        this.copydefault = "trade_grid_deal_order_listener_key-" + strategyGridDealOrderGroup.getAlgoId();
        this.OLrzqt = "trade_grid_deal_order_listener_key";
    }
}
