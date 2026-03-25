package com.okinc.business.dex.trade.order.domain.model;

import com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenOrderRequest {
    public static final int $stable = 8;
    private final String accountId;
    private final List<String> chainIdList;
    private final String cursor;
    private final int limit;
    private final List<Integer> orderStatusList;
    private final List<Integer> orderTypeList;
    private final List<HistoryOrderRequest.TokenAddress> tokenAddressList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.dex.trade.order.domain.model.OpenOrderRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenOrderRequest copy$default(OpenOrderRequest openOrderRequest, String str, int i, String str2, List list, List list2, List list3, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = openOrderRequest.accountId;
        }
        if ((i2 & 2) != 0) {
            i = openOrderRequest.limit;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = openOrderRequest.cursor;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            list = openOrderRequest.chainIdList;
        }
        List list5 = list;
        if ((i2 & 16) != 0) {
            list2 = openOrderRequest.orderTypeList;
        }
        List list6 = list2;
        if ((i2 & 32) != 0) {
            list3 = openOrderRequest.tokenAddressList;
        }
        List list7 = list3;
        if ((i2 & 64) != 0) {
            list4 = openOrderRequest.orderStatusList;
        }
        return openOrderRequest.copy(str, i3, str3, list5, list6, list7, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.chainIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component5() {
        return this.orderTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryOrderRequest.TokenAddress> component6() {
        return this.tokenAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component7() {
        return this.orderStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OpenOrderRequest copy(@NotNull String str, int i, String str2, List<String> list, List<Integer> list2, List<HistoryOrderRequest.TokenAddress> list3, List<Integer> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new OpenOrderRequest(str, i, str2, list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOrderRequest)) {
            return false;
        }
        OpenOrderRequest openOrderRequest = (OpenOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) openOrderRequest.accountId) && this.limit == openOrderRequest.limit && Intrinsics.EZpvd((Object) this.cursor, (Object) openOrderRequest.cursor) && Intrinsics.EZpvd(this.chainIdList, openOrderRequest.chainIdList) && Intrinsics.EZpvd(this.orderTypeList, openOrderRequest.orderTypeList) && Intrinsics.EZpvd(this.tokenAddressList, openOrderRequest.tokenAddressList) && Intrinsics.EZpvd(this.orderStatusList, openOrderRequest.orderStatusList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChainIdList() {
        return this.chainIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getOrderStatusList() {
        return this.orderStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getOrderTypeList() {
        return this.orderTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HistoryOrderRequest.TokenAddress> getTokenAddressList() {
        return this.tokenAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = Integer.hashCode(this.limit);
        String str = this.cursor;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<String> list = this.chainIdList;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<Integer> list2 = this.orderTypeList;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List<HistoryOrderRequest.TokenAddress> list3 = this.tokenAddressList;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        List<Integer> list4 = this.orderStatusList;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OpenOrderRequest(accountId=" + this.accountId + ", limit=" + this.limit + ", cursor=" + this.cursor + ", chainIdList=" + this.chainIdList + ", orderTypeList=" + this.orderTypeList + ", tokenAddressList=" + this.tokenAddressList + ", orderStatusList=" + this.orderStatusList + ")";
    }

    public OpenOrderRequest(@NotNull String str, int i, String str2, List<String> list, List<Integer> list2, List<HistoryOrderRequest.TokenAddress> list3, List<Integer> list4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.limit = i;
        this.cursor = str2;
        this.chainIdList = list;
        this.orderTypeList = list2;
        this.tokenAddressList = list3;
        this.orderStatusList = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
 A[MD:(java.lang.String, int, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.Integer>, java.util.List<com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest$TokenAddress>, java.util.List<java.lang.Integer>):void (m)] (LINE:7) call: com.okinc.business.dex.trade.order.domain.model.OpenOrderRequest.<init>(java.lang.String, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ OpenOrderRequest(String str, int i, String str2, List list, List list2, List list3, List list4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : list4);
    }
}
