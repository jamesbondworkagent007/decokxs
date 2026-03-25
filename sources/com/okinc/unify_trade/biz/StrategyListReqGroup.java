package com.okinc.unify_trade.biz;

import com.okinc.biz.StrategyType;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class StrategyListReqGroup implements Serializable {
    public static final int $stable = 8;
    private boolean hasWs;
    private StrategyHistoryListReq historyReq;
    private boolean isHistory;
    private StrategyType originalType;
    private StrategyPendingListReq pendingReq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StrategyListReqGroup copy$default(StrategyListReqGroup strategyListReqGroup, boolean z, boolean z2, StrategyPendingListReq strategyPendingListReq, StrategyHistoryListReq strategyHistoryListReq, StrategyType strategyType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = strategyListReqGroup.isHistory;
        }
        if ((i & 2) != 0) {
            z2 = strategyListReqGroup.hasWs;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            strategyPendingListReq = strategyListReqGroup.pendingReq;
        }
        StrategyPendingListReq strategyPendingListReq2 = strategyPendingListReq;
        if ((i & 8) != 0) {
            strategyHistoryListReq = strategyListReqGroup.historyReq;
        }
        StrategyHistoryListReq strategyHistoryListReq2 = strategyHistoryListReq;
        if ((i & 16) != 0) {
            strategyType = strategyListReqGroup.originalType;
        }
        return strategyListReqGroup.copy(z, z3, strategyPendingListReq2, strategyHistoryListReq2, strategyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPendingListReq component3() {
        return this.pendingReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyHistoryListReq component4() {
        return this.historyReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyType component5() {
        return this.originalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyListReqGroup copy(boolean z, boolean z2, @NotNull StrategyPendingListReq strategyPendingListReq, @NotNull StrategyHistoryListReq strategyHistoryListReq, @NotNull StrategyType strategyType) {
        Intrinsics.checkNotNullParameter(strategyPendingListReq, "");
        Intrinsics.checkNotNullParameter(strategyHistoryListReq, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        return new StrategyListReqGroup(z, z2, strategyPendingListReq, strategyHistoryListReq, strategyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyListReqGroup)) {
            return false;
        }
        StrategyListReqGroup strategyListReqGroup = (StrategyListReqGroup) obj;
        return this.isHistory == strategyListReqGroup.isHistory && this.hasWs == strategyListReqGroup.hasWs && Intrinsics.EZpvd(this.pendingReq, strategyListReqGroup.pendingReq) && Intrinsics.EZpvd(this.historyReq, strategyListReqGroup.historyReq) && this.originalType == strategyListReqGroup.originalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasWs() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyHistoryListReq getHistoryReq() {
        return this.historyReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyType getOriginalType() {
        return this.originalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyPendingListReq getPendingReq() {
        return this.pendingReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Boolean.hashCode(this.isHistory) * 31) + Boolean.hashCode(this.hasWs)) * 31) + this.pendingReq.hashCode()) * 31) + this.historyReq.hashCode()) * 31) + this.originalType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistory() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasWs(boolean z) {
        this.hasWs = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistory(boolean z) {
        this.isHistory = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistoryReq(@NotNull StrategyHistoryListReq strategyHistoryListReq) {
        Intrinsics.checkNotNullParameter(strategyHistoryListReq, "");
        this.historyReq = strategyHistoryListReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalType(@NotNull StrategyType strategyType) {
        Intrinsics.checkNotNullParameter(strategyType, "");
        this.originalType = strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingReq(@NotNull StrategyPendingListReq strategyPendingListReq) {
        Intrinsics.checkNotNullParameter(strategyPendingListReq, "");
        this.pendingReq = strategyPendingListReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StrategyListReqGroup(isHistory=" + this.isHistory + ", hasWs=" + this.hasWs + ", pendingReq=" + this.pendingReq + ", historyReq=" + this.historyReq + ", originalType=" + this.originalType + ")";
    }

    public StrategyListReqGroup(boolean z, boolean z2, @NotNull StrategyPendingListReq strategyPendingListReq, @NotNull StrategyHistoryListReq strategyHistoryListReq, @NotNull StrategyType strategyType) {
        Intrinsics.checkNotNullParameter(strategyPendingListReq, "");
        Intrinsics.checkNotNullParameter(strategyHistoryListReq, "");
        Intrinsics.checkNotNullParameter(strategyType, "");
        this.isHistory = z;
        this.hasWs = z2;
        this.pendingReq = strategyPendingListReq;
        this.historyReq = strategyHistoryListReq;
        this.originalType = strategyType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:com.okinc.unify_trade.biz.StrategyPendingListReq:0x0018: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.StrategyPendingListReq:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1295) call: com.okinc.unify_trade.biz.StrategyPendingListReq.<init>():void type: CONSTRUCTOR) : (r10v0 com.okinc.unify_trade.biz.StrategyPendingListReq))
  (wrap:com.okinc.unify_trade.biz.StrategyHistoryListReq:?: TERNARY null = ((wrap:int:0x0019: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.StrategyHistoryListReq:0x001f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1296) call: com.okinc.unify_trade.biz.StrategyHistoryListReq.<init>():void type: CONSTRUCTOR) : (r11v0 com.okinc.unify_trade.biz.StrategyHistoryListReq))
  (r12v0 com.okinc.biz.StrategyType)
 A[MD:(boolean, boolean, com.okinc.unify_trade.biz.StrategyPendingListReq, com.okinc.unify_trade.biz.StrategyHistoryListReq, com.okinc.biz.StrategyType):void (m)] (LINE:1292) call: com.okinc.unify_trade.biz.StrategyListReqGroup.<init>(boolean, boolean, com.okinc.unify_trade.biz.StrategyPendingListReq, com.okinc.unify_trade.biz.StrategyHistoryListReq, com.okinc.biz.StrategyType):void type: THIS */
    public /* synthetic */ StrategyListReqGroup(boolean z, boolean z2, StrategyPendingListReq strategyPendingListReq, StrategyHistoryListReq strategyHistoryListReq, StrategyType strategyType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new StrategyPendingListReq() : strategyPendingListReq, (i & 8) != 0 ? new StrategyHistoryListReq() : strategyHistoryListReq, strategyType);
    }
}
