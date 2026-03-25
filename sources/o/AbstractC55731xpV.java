package o;

import com.okinc.unify_trade.biz.StrategyListReqGroup;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55731xpV {
    public final java.lang.String AEQbTJ;
    public StrategyListReqGroup KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    public abstract void EZpvd(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyListReqGroup KWHzl() {
        return this.KWHzl;
    }

    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull java.util.ArrayList<BizTradeStrategyInfo> arrayList, @NotNull InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }
}
