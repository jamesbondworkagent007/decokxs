package o;

import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.TradeStrategyPositionReqGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55715xpF {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public TradeStrategyPositionReqGroup KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyPositionReqGroup AEQbTJ() {
        return this.KWHzl;
    }

    public abstract void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.ArrayList<StrategyPositionResponse> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    public abstract void OLrzqt(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public AbstractC55715xpF(@NotNull TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(tradeStrategyPositionReqGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = tradeStrategyPositionReqGroup;
        this.OLrzqt = str;
        this.AEQbTJ = "trade_strategy_position_listener_key-" + tradeStrategyPositionReqGroup.getAlgoId();
        this.EZpvd = "trade_strategy_position_listener_key";
    }
}
