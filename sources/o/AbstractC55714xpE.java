package o;

import com.okinc.unify_trade.biz.TradeStrategyPositionReqGroup;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55714xpE {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public TradeStrategyPositionReqGroup OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<? extends BizTradeStrategyInfo> list);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStrategyPositionReqGroup copydefault() {
        return this.OLrzqt;
    }

    public AbstractC55714xpE(@NotNull TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(tradeStrategyPositionReqGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = tradeStrategyPositionReqGroup;
        this.AEQbTJ = str;
        this.KWHzl = "bot_single_order_listener_key-" + tradeStrategyPositionReqGroup.getAlgoId();
    }
}
