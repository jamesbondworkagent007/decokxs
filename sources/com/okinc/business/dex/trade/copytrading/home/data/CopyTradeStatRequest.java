package com.okinc.business.dex.trade.copytrading.home.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradeStatRequest {
    public static final int $stable = 8;
    private final String accountId;
    private final String chainId;
    private final String strategyOrderId;
    private final Integer timeRange;
    private final List<String> walletAddressList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyTradeStatRequest() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CopyTradeStatRequest copy$default(CopyTradeStatRequest copyTradeStatRequest, String str, List list, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copyTradeStatRequest.accountId;
        }
        if ((i & 2) != 0) {
            list = copyTradeStatRequest.walletAddressList;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = copyTradeStatRequest.chainId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = copyTradeStatRequest.strategyOrderId;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            num = copyTradeStatRequest.timeRange;
        }
        return copyTradeStatRequest.copy(str, list2, str4, str5, num);
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
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.strategyOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.timeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradeStatRequest copy(String str, List<String> list, String str2, String str3, Integer num) {
        return new CopyTradeStatRequest(str, list, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradeStatRequest)) {
            return false;
        }
        CopyTradeStatRequest copyTradeStatRequest = (CopyTradeStatRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) copyTradeStatRequest.accountId) && Intrinsics.EZpvd(this.walletAddressList, copyTradeStatRequest.walletAddressList) && Intrinsics.EZpvd((Object) this.chainId, (Object) copyTradeStatRequest.chainId) && Intrinsics.EZpvd((Object) this.strategyOrderId, (Object) copyTradeStatRequest.strategyOrderId) && Intrinsics.EZpvd(this.timeRange, copyTradeStatRequest.timeRange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyOrderId() {
        return this.strategyOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTimeRange() {
        return this.timeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.walletAddressList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str2 = this.chainId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.strategyOrderId;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.timeRange;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradeStatRequest(accountId=" + this.accountId + ", walletAddressList=" + this.walletAddressList + ", chainId=" + this.chainId + ", strategyOrderId=" + this.strategyOrderId + ", timeRange=" + this.timeRange + ")";
    }

    public CopyTradeStatRequest(String str, List<String> list, String str2, String str3, Integer num) {
        this.accountId = str;
        this.walletAddressList = list;
        this.chainId = str2;
        this.strategyOrderId = str3;
        this.timeRange = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:6) call: com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatRequest.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ CopyTradeStatRequest(String str, List list, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TimeRange {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TimeRange[] $VALUES;
        private final int code;
        public static final TimeRange LastSevenDay = new TimeRange("LastSevenDay", 0, 1);
        public static final TimeRange LastOneMonth = new TimeRange("LastOneMonth", 1, 2);
        public static final TimeRange LastThreeMonth = new TimeRange("LastThreeMonth", 2, 3);
        public static final TimeRange LastOneYear = new TimeRange("LastOneYear", 3, 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TimeRange[] $values() {
            return new TimeRange[]{LastSevenDay, LastOneMonth, LastThreeMonth, LastOneYear};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TimeRange> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCode() {
            return this.code;
        }

        private TimeRange(String str, int i, int i2) {
            this.code = i2;
        }

        static {
            TimeRange[] timeRangeArr$values = $values();
            $VALUES = timeRangeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(timeRangeArr$values);
        }

        public static TimeRange valueOf(String str) {
            return (TimeRange) Enum.valueOf(TimeRange.class, str);
        }

        public static TimeRange[] values() {
            return (TimeRange[]) $VALUES.clone();
        }
    }
}
