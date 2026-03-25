package com.okinc.assets.backend.api.model.tax.receivedasset;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class UpdateCostBasisTransactionDetailsRequest {
    public static final int $stable = 8;
    private final List<CostBasisDetailWithRequiredFields> purchases;
    private final String sumAmountPaid;
    private final String transactionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.tax.receivedasset.UpdateCostBasisTransactionDetailsRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateCostBasisTransactionDetailsRequest copy$default(UpdateCostBasisTransactionDetailsRequest updateCostBasisTransactionDetailsRequest, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateCostBasisTransactionDetailsRequest.transactionId;
        }
        if ((i & 2) != 0) {
            list = updateCostBasisTransactionDetailsRequest.purchases;
        }
        if ((i & 4) != 0) {
            str2 = updateCostBasisTransactionDetailsRequest.sumAmountPaid;
        }
        return updateCostBasisTransactionDetailsRequest.copy(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CostBasisDetailWithRequiredFields> component2() {
        return this.purchases;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sumAmountPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateCostBasisTransactionDetailsRequest copy(@NotNull String str, @NotNull List<CostBasisDetailWithRequiredFields> list, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new UpdateCostBasisTransactionDetailsRequest(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateCostBasisTransactionDetailsRequest)) {
            return false;
        }
        UpdateCostBasisTransactionDetailsRequest updateCostBasisTransactionDetailsRequest = (UpdateCostBasisTransactionDetailsRequest) obj;
        return Intrinsics.EZpvd((Object) this.transactionId, (Object) updateCostBasisTransactionDetailsRequest.transactionId) && Intrinsics.EZpvd(this.purchases, updateCostBasisTransactionDetailsRequest.purchases) && Intrinsics.EZpvd((Object) this.sumAmountPaid, (Object) updateCostBasisTransactionDetailsRequest.sumAmountPaid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CostBasisDetailWithRequiredFields> getPurchases() {
        return this.purchases;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSumAmountPaid() {
        return this.sumAmountPaid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.transactionId.hashCode();
        int iHashCode2 = this.purchases.hashCode();
        String str = this.sumAmountPaid;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateCostBasisTransactionDetailsRequest(transactionId=" + this.transactionId + ", purchases=" + this.purchases + ", sumAmountPaid=" + this.sumAmountPaid + ")";
    }

    public UpdateCostBasisTransactionDetailsRequest(@NotNull String str, @NotNull List<CostBasisDetailWithRequiredFields> list, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.transactionId = str;
        this.purchases = list;
        this.sumAmountPaid = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.assets.backend.api.model.tax.receivedasset.CostBasisDetailWithRequiredFields>, java.lang.String):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.tax.receivedasset.UpdateCostBasisTransactionDetailsRequest.<init>(java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ UpdateCostBasisTransactionDetailsRequest(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2);
    }
}
