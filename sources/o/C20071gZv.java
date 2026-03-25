package o;

import com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20071gZv {
    public final int AEQbTJ;
    public final java.util.List<DexMultiTokenInfoBean> AYXKKw;
    public final java.lang.String EZpvd;
    public final BridgeOrderSubStatus KWHzl;
    public final OrderSubStatus OLrzqt;
    public final java.util.List<OrderStrategyType> copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C20071gZv() {
        this(null, null, null, null, null, null, 0, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.gZv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C20071gZv copy$default(C20071gZv c20071gZv, java.lang.String str, OrderSubStatus orderSubStatus, BridgeOrderSubStatus bridgeOrderSubStatus, java.util.List list, java.lang.String str2, java.util.List list2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c20071gZv.EZpvd;
        }
        if ((i2 & 2) != 0) {
            orderSubStatus = c20071gZv.OLrzqt;
        }
        OrderSubStatus orderSubStatus2 = orderSubStatus;
        if ((i2 & 4) != 0) {
            bridgeOrderSubStatus = c20071gZv.KWHzl;
        }
        BridgeOrderSubStatus bridgeOrderSubStatus2 = bridgeOrderSubStatus;
        if ((i2 & 8) != 0) {
            list = c20071gZv.copydefault;
        }
        java.util.List list3 = list;
        if ((i2 & 16) != 0) {
            str2 = c20071gZv.gEmmrt;
        }
        java.lang.String str3 = str2;
        if ((i2 & 32) != 0) {
            list2 = c20071gZv.AYXKKw;
        }
        java.util.List list4 = list2;
        if ((i2 & 64) != 0) {
            i = c20071gZv.AEQbTJ;
        }
        return c20071gZv.OLrzqt(str, orderSubStatus2, bridgeOrderSubStatus2, list3, str3, list4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeOrderSubStatus AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderSubStatus EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<OrderStrategyType> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20071gZv OLrzqt(@NotNull java.lang.String str, OrderSubStatus orderSubStatus, BridgeOrderSubStatus bridgeOrderSubStatus, java.util.List<? extends OrderStrategyType> list, java.lang.String str2, java.util.List<DexMultiTokenInfoBean> list2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C20071gZv(str, orderSubStatus, bridgeOrderSubStatus, list, str2, list2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20071gZv)) {
            return false;
        }
        C20071gZv c20071gZv = (C20071gZv) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c20071gZv.EZpvd) && this.OLrzqt == c20071gZv.OLrzqt && this.KWHzl == c20071gZv.KWHzl && Intrinsics.EZpvd(this.copydefault, c20071gZv.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c20071gZv.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, c20071gZv.AYXKKw) && this.AEQbTJ == c20071gZv.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DexMultiTokenInfoBean> gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        OrderSubStatus orderSubStatus = this.OLrzqt;
        int iHashCode2 = orderSubStatus == null ? 0 : orderSubStatus.hashCode();
        BridgeOrderSubStatus bridgeOrderSubStatus = this.KWHzl;
        int iHashCode3 = bridgeOrderSubStatus == null ? 0 : bridgeOrderSubStatus.hashCode();
        java.util.List<OrderStrategyType> list = this.copydefault;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        java.lang.String str = this.gEmmrt;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        java.util.List<DexMultiTokenInfoBean> list2 = this.AYXKKw;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OrderRequestParams(cursor=" + this.EZpvd + ", orderSubStatus=" + this.OLrzqt + ", bridgeOrderSubStatus=" + this.KWHzl + ", orderStrategyType=" + this.copydefault + ", selectedChainId=" + this.gEmmrt + ", tokenList=" + this.AYXKKw + ", pageSize=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.okinc.business.dex.trade.order.domain.model.OrderStrategyType> */
    /* JADX WARN: Multi-variable type inference failed */
    public C20071gZv(@NotNull java.lang.String str, OrderSubStatus orderSubStatus, BridgeOrderSubStatus bridgeOrderSubStatus, java.util.List<? extends OrderStrategyType> list, java.lang.String str2, java.util.List<DexMultiTokenInfoBean> list2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = orderSubStatus;
        this.KWHzl = bridgeOrderSubStatus;
        this.copydefault = list;
        this.gEmmrt = str2;
        this.AYXKKw = list2;
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.order.domain.model.OrderSubStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.order.domain.model.OrderSubStatus) : (r7v0 com.okinc.business.dex.trade.order.domain.model.OrderSubStatus))
  (wrap:com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus) : (r8v0 com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.util.List) : (null java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r12v0 int))
 A[MD:(java.lang.String, com.okinc.business.dex.trade.order.domain.model.OrderSubStatus, com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus, java.util.List<? extends com.okinc.business.dex.trade.order.domain.model.OrderStrategyType>, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean>, int):void (m)] (LINE:5) call: o.gZv.<init>(java.lang.String, com.okinc.business.dex.trade.order.domain.model.OrderSubStatus, com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus, java.util.List, java.lang.String, java.util.List, int):void type: THIS */
    public /* synthetic */ C20071gZv(java.lang.String str, OrderSubStatus orderSubStatus, BridgeOrderSubStatus bridgeOrderSubStatus, java.util.List list, java.lang.String str2, java.util.List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : orderSubStatus, (i2 & 4) != 0 ? null : bridgeOrderSubStatus, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : str2, (i2 & 32) == 0 ? list2 : null, (i2 & 64) != 0 ? 20 : i);
    }
}
