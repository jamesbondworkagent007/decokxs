package com.okinc.assets.backend.api.model.tax.receivedasset;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;

/* JADX INFO: loaded from: classes22.dex */
public final class CostBasisEstimatesResponse {
    public static final int $stable = 8;
    private final List<CostBasisEstimate> transactions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CostBasisEstimatesResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.tax.receivedasset.CostBasisEstimatesResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CostBasisEstimatesResponse copy$default(CostBasisEstimatesResponse costBasisEstimatesResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = costBasisEstimatesResponse.transactions;
        }
        return costBasisEstimatesResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CostBasisEstimate> component1() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CostBasisEstimatesResponse copy(List<CostBasisEstimate> list) {
        return new CostBasisEstimatesResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CostBasisEstimatesResponse) && Intrinsics.EZpvd(this.transactions, ((CostBasisEstimatesResponse) obj).transactions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CostBasisEstimate> getTransactions() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<CostBasisEstimate> list = this.transactions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CostBasisEstimatesResponse(transactions=" + this.transactions + ")";
    }

    public CostBasisEstimatesResponse(List<CostBasisEstimate> list) {
        this.transactions = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.tax.receivedasset.CostBasisEstimate>):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.tax.receivedasset.CostBasisEstimatesResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ CostBasisEstimatesResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
