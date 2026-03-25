package o;

import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27024jnQ {
    public final YieldState KWHzl;
    public final InvestUniv3SubscribeReceiveInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27024jnQ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27024jnQ copy$default(C27024jnQ c27024jnQ, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, YieldState yieldState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            investUniv3SubscribeReceiveInfo = c27024jnQ.copydefault;
        }
        if ((i & 2) != 0) {
            yieldState = c27024jnQ.KWHzl;
        }
        return c27024jnQ.EZpvd(investUniv3SubscribeReceiveInfo, yieldState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeReceiveInfo AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27024jnQ EZpvd(InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, @NotNull YieldState yieldState) {
        Intrinsics.checkNotNullParameter(yieldState, "");
        return new C27024jnQ(investUniv3SubscribeReceiveInfo, yieldState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YieldState copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27024jnQ)) {
            return false;
        }
        C27024jnQ c27024jnQ = (C27024jnQ) obj;
        return Intrinsics.EZpvd(this.copydefault, c27024jnQ.copydefault) && this.KWHzl == c27024jnQ.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.copydefault;
        return ((investUniv3SubscribeReceiveInfo == null ? 0 : investUniv3SubscribeReceiveInfo.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3ConfirmYieldUIBean(info=" + this.copydefault + ", state=" + this.KWHzl + ")";
    }

    public C27024jnQ(InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, @NotNull YieldState yieldState) {
        Intrinsics.checkNotNullParameter(yieldState, "");
        this.copydefault = investUniv3SubscribeReceiveInfo;
        this.KWHzl = yieldState;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo) : (r1v0 com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo))
  (wrap:com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState:0x0009: SGET  A[WRAPPED] (LINE:12) com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState.DASH com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState) : (r2v0 com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo, com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState):void (m)] (LINE:10) call: o.jnQ.<init>(com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo, com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState):void type: THIS */
    public /* synthetic */ C27024jnQ(InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, YieldState yieldState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investUniv3SubscribeReceiveInfo, (i & 2) != 0 ? YieldState.DASH : yieldState);
    }
}
