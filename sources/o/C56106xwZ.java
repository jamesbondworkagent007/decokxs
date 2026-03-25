package o;

import com.okinc.unify_trade.biz.TradeInfo;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xwZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56106xwZ {
    public TradeInfo EZpvd;
    public UserTradeConfigInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56106xwZ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C56106xwZ copy$default(C56106xwZ c56106xwZ, UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userTradeConfigInfo = c56106xwZ.copydefault;
        }
        if ((i & 2) != 0) {
            tradeInfo = c56106xwZ.EZpvd;
        }
        return c56106xwZ.AEQbTJ(userTradeConfigInfo, tradeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56106xwZ AEQbTJ(UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo) {
        return new C56106xwZ(userTradeConfigInfo, tradeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeInfo EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserTradeConfigInfo KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(TradeInfo tradeInfo) {
        this.EZpvd = tradeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(UserTradeConfigInfo userTradeConfigInfo) {
        this.copydefault = userTradeConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56106xwZ)) {
            return false;
        }
        C56106xwZ c56106xwZ = (C56106xwZ) obj;
        return Intrinsics.EZpvd(this.copydefault, c56106xwZ.copydefault) && Intrinsics.EZpvd(this.EZpvd, c56106xwZ.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        UserTradeConfigInfo userTradeConfigInfo = this.copydefault;
        int iHashCode = userTradeConfigInfo == null ? 0 : userTradeConfigInfo.hashCode();
        TradeInfo tradeInfo = this.EZpvd;
        return (iHashCode * 31) + (tradeInfo != null ? tradeInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UserData(userInfo=" + this.copydefault + ", tradeInfo=" + this.EZpvd + ")";
    }

    public C56106xwZ(UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo) {
        this.copydefault = userTradeConfigInfo;
        this.EZpvd = tradeInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.UserTradeConfigInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.UserTradeConfigInfo) : (r2v0 com.okinc.unify_trade.biz.UserTradeConfigInfo))
  (wrap:com.okinc.unify_trade.biz.TradeInfo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TradeInfo) : (r3v0 com.okinc.unify_trade.biz.TradeInfo))
 A[MD:(com.okinc.unify_trade.biz.UserTradeConfigInfo, com.okinc.unify_trade.biz.TradeInfo):void (m)] (LINE:131) call: o.xwZ.<init>(com.okinc.unify_trade.biz.UserTradeConfigInfo, com.okinc.unify_trade.biz.TradeInfo):void type: THIS */
    public /* synthetic */ C56106xwZ(UserTradeConfigInfo userTradeConfigInfo, TradeInfo tradeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userTradeConfigInfo, (i & 2) != 0 ? null : tradeInfo);
    }
}
