package com.okinc.business.dex.trade.order.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class GetOrderCountRequest {
    public static final int $stable = 8;
    private final String accountId;
    private final List<Integer> orderStatusList;
    private final List<String> walletAddressList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.order.domain.model.GetOrderCountRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetOrderCountRequest copy$default(GetOrderCountRequest getOrderCountRequest, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOrderCountRequest.accountId;
        }
        if ((i & 2) != 0) {
            list = getOrderCountRequest.walletAddressList;
        }
        if ((i & 4) != 0) {
            list2 = getOrderCountRequest.orderStatusList;
        }
        return getOrderCountRequest.copy(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component3() {
        return this.orderStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetOrderCountRequest copy(@NotNull String str, @NotNull List<String> list, List<Integer> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new GetOrderCountRequest(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOrderCountRequest)) {
            return false;
        }
        GetOrderCountRequest getOrderCountRequest = (GetOrderCountRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) getOrderCountRequest.accountId) && Intrinsics.EZpvd(this.walletAddressList, getOrderCountRequest.walletAddressList) && Intrinsics.EZpvd(this.orderStatusList, getOrderCountRequest.orderStatusList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getOrderStatusList() {
        return this.orderStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.walletAddressList.hashCode();
        List<Integer> list = this.orderStatusList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetOrderCountRequest(accountId=" + this.accountId + ", walletAddressList=" + this.walletAddressList + ", orderStatusList=" + this.orderStatusList + ")";
    }

    public GetOrderCountRequest(@NotNull String str, @NotNull List<String> list, List<Integer> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountId = str;
        this.walletAddressList = list;
        this.orderStatusList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.Integer>):void (m)] (LINE:6) call: com.okinc.business.dex.trade.order.domain.model.GetOrderCountRequest.<init>(java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ GetOrderCountRequest(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : list2);
    }
}
