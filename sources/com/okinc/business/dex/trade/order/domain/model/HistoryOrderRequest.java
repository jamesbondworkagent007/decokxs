package com.okinc.business.dex.trade.order.domain.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class HistoryOrderRequest {
    public static final int $stable = 8;
    private final String accountId;
    private final List<String> chainIdList;
    private final String cursor;
    private final List<Integer> orderStatusList;
    private final List<Integer> orderTypeList;
    private final int pageSize;
    private final List<TokenAddress> tokenAddressList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryOrderRequest copy$default(HistoryOrderRequest historyOrderRequest, String str, List list, List list2, List list3, String str2, List list4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = historyOrderRequest.accountId;
        }
        if ((i2 & 2) != 0) {
            list = historyOrderRequest.orderStatusList;
        }
        List list5 = list;
        if ((i2 & 4) != 0) {
            list2 = historyOrderRequest.orderTypeList;
        }
        List list6 = list2;
        if ((i2 & 8) != 0) {
            list3 = historyOrderRequest.chainIdList;
        }
        List list7 = list3;
        if ((i2 & 16) != 0) {
            str2 = historyOrderRequest.cursor;
        }
        String str3 = str2;
        if ((i2 & 32) != 0) {
            list4 = historyOrderRequest.tokenAddressList;
        }
        List list8 = list4;
        if ((i2 & 64) != 0) {
            i = historyOrderRequest.pageSize;
        }
        return historyOrderRequest.copy(str, list5, list6, list7, str3, list8, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component2() {
        return this.orderStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component3() {
        return this.orderTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.chainIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenAddress> component6() {
        return this.tokenAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryOrderRequest copy(@NotNull String str, List<Integer> list, List<Integer> list2, List<String> list3, String str2, List<TokenAddress> list4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HistoryOrderRequest(str, list, list2, list3, str2, list4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryOrderRequest)) {
            return false;
        }
        HistoryOrderRequest historyOrderRequest = (HistoryOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) historyOrderRequest.accountId) && Intrinsics.EZpvd(this.orderStatusList, historyOrderRequest.orderStatusList) && Intrinsics.EZpvd(this.orderTypeList, historyOrderRequest.orderTypeList) && Intrinsics.EZpvd(this.chainIdList, historyOrderRequest.chainIdList) && Intrinsics.EZpvd((Object) this.cursor, (Object) historyOrderRequest.cursor) && Intrinsics.EZpvd(this.tokenAddressList, historyOrderRequest.tokenAddressList) && this.pageSize == historyOrderRequest.pageSize;
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
    public final List<Integer> getOrderStatusList() {
        return this.orderStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getOrderTypeList() {
        return this.orderTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenAddress> getTokenAddressList() {
        return this.tokenAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        List<Integer> list = this.orderStatusList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<Integer> list2 = this.orderTypeList;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.chainIdList;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        String str = this.cursor;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        List<TokenAddress> list4 = this.tokenAddressList;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list4 != null ? list4.hashCode() : 0)) * 31) + Integer.hashCode(this.pageSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryOrderRequest(accountId=" + this.accountId + ", orderStatusList=" + this.orderStatusList + ", orderTypeList=" + this.orderTypeList + ", chainIdList=" + this.chainIdList + ", cursor=" + this.cursor + ", tokenAddressList=" + this.tokenAddressList + ", pageSize=" + this.pageSize + ")";
    }

    public HistoryOrderRequest(@NotNull String str, List<Integer> list, List<Integer> list2, List<String> list3, String str2, List<TokenAddress> list4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.orderStatusList = list;
        this.orderTypeList = list2;
        this.chainIdList = list3;
        this.cursor = str2;
        this.tokenAddressList = list4;
        this.pageSize = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.util.List) : (null java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0023: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r13v0 int))
 A[MD:(java.lang.String, java.util.List<java.lang.Integer>, java.util.List<java.lang.Integer>, java.util.List<java.lang.String>, java.lang.String, java.util.List<com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest$TokenAddress>, int):void (m)] (LINE:18) call: com.okinc.business.dex.trade.order.domain.model.HistoryOrderRequest.<init>(java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, int):void type: THIS */
    public /* synthetic */ HistoryOrderRequest(String str, List list, List list2, List list3, String str2, List list4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : str2, (i2 & 32) == 0 ? list4 : null, (i2 & 64) != 0 ? 20 : i);
    }

    public static final class TokenAddress {
        public static final int $stable = 0;
        private final String chainId;
        private final String tokenAddress;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TokenAddress copy$default(TokenAddress tokenAddress, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokenAddress.chainId;
            }
            if ((i & 2) != 0) {
                str2 = tokenAddress.tokenAddress;
            }
            return tokenAddress.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenAddress copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TokenAddress(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenAddress)) {
                return false;
            }
            TokenAddress tokenAddress = (TokenAddress) obj;
            return Intrinsics.EZpvd((Object) this.chainId, (Object) tokenAddress.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) tokenAddress.tokenAddress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.chainId.hashCode() * 31) + this.tokenAddress.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenAddress(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ")";
        }

        public TokenAddress(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.chainId = str;
            this.tokenAddress = str2;
        }
    }
}
