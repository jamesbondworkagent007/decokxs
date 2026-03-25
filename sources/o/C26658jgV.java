package o;

import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel;
import com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26658jgV {
    public final InvestSubscriptionProtocolModel EZpvd;
    public final InvestSubscriptionState copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C26658jgV() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26658jgV copy$default(C26658jgV c26658jgV, InvestSubscriptionProtocolModel investSubscriptionProtocolModel, InvestSubscriptionState investSubscriptionState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            investSubscriptionProtocolModel = c26658jgV.EZpvd;
        }
        if ((i & 2) != 0) {
            investSubscriptionState = c26658jgV.copydefault;
        }
        return c26658jgV.AEQbTJ(investSubscriptionProtocolModel, investSubscriptionState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26658jgV AEQbTJ(InvestSubscriptionProtocolModel investSubscriptionProtocolModel, @NotNull InvestSubscriptionState investSubscriptionState) {
        Intrinsics.checkNotNullParameter(investSubscriptionState, "");
        return new C26658jgV(investSubscriptionProtocolModel, investSubscriptionState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26658jgV)) {
            return false;
        }
        C26658jgV c26658jgV = (C26658jgV) obj;
        return Intrinsics.EZpvd(this.EZpvd, c26658jgV.EZpvd) && this.copydefault == c26658jgV.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestSubscriptionProtocolModel investSubscriptionProtocolModel = this.EZpvd;
        return ((investSubscriptionProtocolModel == null ? 0 : investSubscriptionProtocolModel.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestSubscriptionProtocolState(model=" + this.EZpvd + ", state=" + this.copydefault + ")";
    }

    public C26658jgV(InvestSubscriptionProtocolModel investSubscriptionProtocolModel, @NotNull InvestSubscriptionState investSubscriptionState) {
        Intrinsics.checkNotNullParameter(investSubscriptionState, "");
        this.EZpvd = investSubscriptionProtocolModel;
        this.copydefault = investSubscriptionState;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel) : (r1v0 com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel))
  (wrap:com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionState:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionState:0x0009: SGET  A[WRAPPED] (LINE:58) com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionState.Success com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionState) : (r2v0 com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionState))
 A[MD:(com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel, com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionState):void (m)] (LINE:56) call: o.jgV.<init>(com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionProtocolModel, com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestSubscriptionState):void type: THIS */
    public /* synthetic */ C26658jgV(InvestSubscriptionProtocolModel investSubscriptionProtocolModel, InvestSubscriptionState investSubscriptionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investSubscriptionProtocolModel, (i & 2) != 0 ? InvestSubscriptionState.Success : investSubscriptionState);
    }
}
