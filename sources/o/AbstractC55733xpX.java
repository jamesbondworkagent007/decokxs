package o;

import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReqGroup;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55733xpX {
    public final java.lang.String EZpvd;
    public StrategyOrderBillDetailsReqGroup KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    public abstract void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<StrategyOrderBillDetailsResponse> list, @NotNull InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    public abstract void KWHzl(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyOrderBillDetailsReqGroup copydefault() {
        return this.KWHzl;
    }

    public AbstractC55733xpX(@NotNull StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(strategyOrderBillDetailsReqGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = strategyOrderBillDetailsReqGroup;
        this.EZpvd = str;
        this.copydefault = "trade_strategy_order_bill_details_listener_key-" + strategyOrderBillDetailsReqGroup.getReq().getAlgoId();
        this.OLrzqt = "trade_strategy_order_bill_details_listener_key";
    }
}
