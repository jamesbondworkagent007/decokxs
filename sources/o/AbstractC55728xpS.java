package o;

import com.okinc.unify_trade.biz.subscribe.BizDexOrderReq;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55728xpS {
    public BizDexOrderReq KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizDexOrderReq KWHzl() {
        return this.KWHzl;
    }

    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<TradeOrderData> list, @NotNull InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull TradeOrderData tradeOrderData) {
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
    }

    public abstract void OLrzqt(@NotNull java.lang.String str);
}
