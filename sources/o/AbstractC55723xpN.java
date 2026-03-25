package o;

import com.okinc.unify_trade.api.subscribe.orders.BizAllOrderReq;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55723xpN {
    public BizAllOrderReq AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull TradeAllOrderApi tradeAllOrderApi) {
        Intrinsics.checkNotNullParameter(tradeAllOrderApi, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizAllOrderReq KWHzl() {
        return this.AEQbTJ;
    }

    public abstract void KWHzl(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    public abstract void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<? extends TradeAllOrderApi> list, @NotNull InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.EZpvd;
    }

    public AbstractC55723xpN(@NotNull BizAllOrderReq bizAllOrderReq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bizAllOrderReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = bizAllOrderReq;
        this.OLrzqt = str;
        this.copydefault = "TradeAllOrderListener";
        this.valueOf = "TradeAllOrderListener-" + bizAllOrderReq.getInstId() + "-" + this.AEQbTJ.getInstType() + "-" + this.AEQbTJ.isHistory();
        this.EZpvd = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r1v0 com.okinc.unify_trade.api.subscribe.orders.BizAllOrderReq)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000c: INVOKE 
  (wrap:java.lang.Long:0x0008: INVOKE (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:8)) STATIC call: java.lang.Long.valueOf(long):java.lang.Long A[MD:(long):java.lang.Long (c), WRAPPED] (LINE:8))
 STATIC call: o.mqd.gEmmrt(java.lang.Object):java.lang.String A[MD:(java.lang.Object):java.lang.String (m), WRAPPED] (LINE:8)) : (r2v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.api.subscribe.orders.BizAllOrderReq, java.lang.String):void (m)] (LINE:8) call: o.xpN.<init>(com.okinc.unify_trade.api.subscribe.orders.BizAllOrderReq, java.lang.String):void type: THIS */
    public /* synthetic */ AbstractC55723xpN(BizAllOrderReq bizAllOrderReq, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bizAllOrderReq, (i & 2) != 0 ? C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())) : str);
    }
}
