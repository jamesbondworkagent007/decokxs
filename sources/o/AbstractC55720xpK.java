package o;

import com.okinc.unify_trade.biz.BotOrderListReqGroup;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55720xpK {
    public final Function0<CopyOnWriteArrayList<BizTradeStrategyInfo>> AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public BotOrderListReqGroup copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<CopyOnWriteArrayList<BizTradeStrategyInfo>> AEQbTJ() {
        return this.AEQbTJ;
    }

    public abstract void AEQbTJ(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotOrderListReqGroup KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public abstract void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<? extends BizTradeStrategyInfo> list, @NotNull InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.concurrent.CopyOnWriteArrayList<com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo>> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC55720xpK(@NotNull BotOrderListReqGroup botOrderListReqGroup, @NotNull java.lang.String str, boolean z, Function0<? extends CopyOnWriteArrayList<BizTradeStrategyInfo>> function0) {
        Intrinsics.checkNotNullParameter(botOrderListReqGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = botOrderListReqGroup;
        this.KWHzl = str;
        this.OLrzqt = z;
        this.AEQbTJ = function0;
        this.EZpvd = "BotOrderListListener";
        this.AhwBna = "BotOrderListListener-" + (botOrderListReqGroup.isHistory() ? this.copydefault.getHistoryReq() : this.copydefault.getPendingReq()).getInstId();
    }
}
