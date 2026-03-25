package com.okinc.dexkline.market.data.model.holder;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class HolderChartData {
    public static final int $stable = 8;
    private final String chainId;
    private final String chainLogo;
    private final List<HoldingItemData> devHolderList;
    private final List<HoldingItemData> greaterThan10uHoldingList;
    private final List<HolderChartItemData> holderChangeList1Day;
    private final List<HolderChartItemData> holderChangeList7Day;
    private final List<HoldingItemData> suspectedRatTradingHolderList;
    private final List<HoldingItemData> suspiciousHolderList;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenSymbol;
    private final List<HoldingItemData> top100AvgHoldingList;
    private final List<HolderTopChartItemData> top100HolderList;
    private final List<HolderTopChartItemData> top10HolderList;
    private final List<HolderTopChartItemData> top50HolderList;
    private final String totalHolderAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderChartData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderTopChartItemData> component10() {
        return this.top10HolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderTopChartItemData> component11() {
        return this.top50HolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> component12() {
        return this.greaterThan10uHoldingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> component13() {
        return this.suspiciousHolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> component14() {
        return this.suspectedRatTradingHolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> component15() {
        return this.devHolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> component16() {
        return this.top100AvgHoldingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderChartItemData> component3() {
        return this.holderChangeList1Day;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderChartItemData> component4() {
        return this.holderChangeList7Day;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalHolderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderTopChartItemData> component9() {
        return this.top100HolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderChartData copy(String str, String str2, @NotNull List<HolderChartItemData> list, @NotNull List<HolderChartItemData> list2, String str3, String str4, String str5, String str6, @NotNull List<HolderTopChartItemData> list3, @NotNull List<HolderTopChartItemData> list4, @NotNull List<HolderTopChartItemData> list5, @NotNull List<HoldingItemData> list6, @NotNull List<HoldingItemData> list7, @NotNull List<HoldingItemData> list8, @NotNull List<HoldingItemData> list9, @NotNull List<HoldingItemData> list10) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        return new HolderChartData(str, str2, list, list2, str3, str4, str5, str6, list3, list4, list5, list6, list7, list8, list9, list10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HolderChartData)) {
            return false;
        }
        HolderChartData holderChartData = (HolderChartData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) holderChartData.chainId) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) holderChartData.chainLogo) && Intrinsics.EZpvd(this.holderChangeList1Day, holderChartData.holderChangeList1Day) && Intrinsics.EZpvd(this.holderChangeList7Day, holderChartData.holderChangeList7Day) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) holderChartData.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) holderChartData.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) holderChartData.tokenSymbol) && Intrinsics.EZpvd((Object) this.totalHolderAmount, (Object) holderChartData.totalHolderAmount) && Intrinsics.EZpvd(this.top100HolderList, holderChartData.top100HolderList) && Intrinsics.EZpvd(this.top10HolderList, holderChartData.top10HolderList) && Intrinsics.EZpvd(this.top50HolderList, holderChartData.top50HolderList) && Intrinsics.EZpvd(this.greaterThan10uHoldingList, holderChartData.greaterThan10uHoldingList) && Intrinsics.EZpvd(this.suspiciousHolderList, holderChartData.suspiciousHolderList) && Intrinsics.EZpvd(this.suspectedRatTradingHolderList, holderChartData.suspectedRatTradingHolderList) && Intrinsics.EZpvd(this.devHolderList, holderChartData.devHolderList) && Intrinsics.EZpvd(this.top100AvgHoldingList, holderChartData.top100AvgHoldingList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> getDevHolderList() {
        return this.devHolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> getGreaterThan10uHoldingList() {
        return this.greaterThan10uHoldingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderChartItemData> getHolderChangeList1Day() {
        return this.holderChangeList1Day;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderChartItemData> getHolderChangeList7Day() {
        return this.holderChangeList7Day;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> getSuspectedRatTradingHolderList() {
        return this.suspectedRatTradingHolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> getSuspiciousHolderList() {
        return this.suspiciousHolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingItemData> getTop100AvgHoldingList() {
        return this.top100AvgHoldingList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderTopChartItemData> getTop100HolderList() {
        return this.top100HolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderTopChartItemData> getTop10HolderList() {
        return this.top10HolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HolderTopChartItemData> getTop50HolderList() {
        return this.top50HolderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalHolderAmount() {
        return this.totalHolderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chainLogo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.holderChangeList1Day.hashCode();
        int iHashCode4 = this.holderChangeList7Day.hashCode();
        String str3 = this.tokenAddress;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenLogo;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenSymbol;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalHolderAmount;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.top100HolderList.hashCode()) * 31) + this.top10HolderList.hashCode()) * 31) + this.top50HolderList.hashCode()) * 31) + this.greaterThan10uHoldingList.hashCode()) * 31) + this.suspiciousHolderList.hashCode()) * 31) + this.suspectedRatTradingHolderList.hashCode()) * 31) + this.devHolderList.hashCode()) * 31) + this.top100AvgHoldingList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderChartData(chainId=" + this.chainId + ", chainLogo=" + this.chainLogo + ", holderChangeList1Day=" + this.holderChangeList1Day + ", holderChangeList7Day=" + this.holderChangeList7Day + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", totalHolderAmount=" + this.totalHolderAmount + ", top100HolderList=" + this.top100HolderList + ", top10HolderList=" + this.top10HolderList + ", top50HolderList=" + this.top50HolderList + ", greaterThan10uHoldingList=" + this.greaterThan10uHoldingList + ", suspiciousHolderList=" + this.suspiciousHolderList + ", suspectedRatTradingHolderList=" + this.suspectedRatTradingHolderList + ", devHolderList=" + this.devHolderList + ", top100AvgHoldingList=" + this.top100AvgHoldingList + ")";
    }

    public HolderChartData(String str, String str2, @NotNull List<HolderChartItemData> list, @NotNull List<HolderChartItemData> list2, String str3, String str4, String str5, String str6, @NotNull List<HolderTopChartItemData> list3, @NotNull List<HolderTopChartItemData> list4, @NotNull List<HolderTopChartItemData> list5, @NotNull List<HoldingItemData> list6, @NotNull List<HoldingItemData> list7, @NotNull List<HoldingItemData> list8, @NotNull List<HoldingItemData> list9, @NotNull List<HoldingItemData> list10) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        this.chainId = str;
        this.chainLogo = str2;
        this.holderChangeList1Day = list;
        this.holderChangeList7Day = list2;
        this.tokenAddress = str3;
        this.tokenLogo = str4;
        this.tokenSymbol = str5;
        this.totalHolderAmount = str6;
        this.top100HolderList = list3;
        this.top10HolderList = list4;
        this.top50HolderList = list5;
        this.greaterThan10uHoldingList = list6;
        this.suspiciousHolderList = list7;
        this.suspectedRatTradingHolderList = list8;
        this.devHolderList = list9;
        this.top100AvgHoldingList = list10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c6: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r20v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0049: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r26v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r27v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005f: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0063: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r28v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006a: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r29v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0075: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0079: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r30v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0080: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0084: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r31v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008b: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r32v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0099: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r33v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.dexkline.market.data.model.holder.HolderChartItemData>, java.util.List<com.okinc.dexkline.market.data.model.holder.HolderChartItemData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.dexkline.market.data.model.holder.HolderTopChartItemData>, java.util.List<com.okinc.dexkline.market.data.model.holder.HolderTopChartItemData>, java.util.List<com.okinc.dexkline.market.data.model.holder.HolderTopChartItemData>, java.util.List<com.okinc.dexkline.market.data.model.holder.HoldingItemData>, java.util.List<com.okinc.dexkline.market.data.model.holder.HoldingItemData>, java.util.List<com.okinc.dexkline.market.data.model.holder.HoldingItemData>, java.util.List<com.okinc.dexkline.market.data.model.holder.HoldingItemData>, java.util.List<com.okinc.dexkline.market.data.model.holder.HoldingItemData>):void (m)] (LINE:6) call: com.okinc.dexkline.market.data.model.holder.HolderChartData.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ HolderChartData(String str, String str2, List list, List list2, String str3, String str4, String str5, String str6, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) == 0 ? str6 : "", (i & 256) != 0 ? yDY.AhwBna() : list3, (i & 512) != 0 ? yDY.AhwBna() : list4, (i & 1024) != 0 ? yDY.AhwBna() : list5, (i & 2048) != 0 ? yDY.AhwBna() : list6, (i & 4096) != 0 ? yDY.AhwBna() : list7, (i & 8192) != 0 ? yDY.AhwBna() : list8, (i & 16384) != 0 ? yDY.AhwBna() : list9, (i & 32768) != 0 ? yDY.AhwBna() : list10);
    }
}
