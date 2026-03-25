package com.okinc.find_ui.features.opportunity.overall.data.model;

import com.google.gson.annotations.SerializedName;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDataPo {
    public static final int $stable = 8;

    @SerializedName("calendarDataList")
    private final List<TradingCalendarPo> calendarDataList;

    @SerializedName("marketStats")
    private final MarketOverallStatsPo marketStats;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketDataPo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.find_ui.features.opportunity.overall.data.model.MarketDataPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketDataPo copy$default(MarketDataPo marketDataPo, MarketOverallStatsPo marketOverallStatsPo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            marketOverallStatsPo = marketDataPo.marketStats;
        }
        if ((i & 2) != 0) {
            list = marketDataPo.calendarDataList;
        }
        return marketDataPo.copy(marketOverallStatsPo, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketOverallStatsPo component1() {
        return this.marketStats;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradingCalendarPo> component2() {
        return this.calendarDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketDataPo copy(MarketOverallStatsPo marketOverallStatsPo, List<TradingCalendarPo> list) {
        return new MarketDataPo(marketOverallStatsPo, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDataPo)) {
            return false;
        }
        MarketDataPo marketDataPo = (MarketDataPo) obj;
        return Intrinsics.EZpvd(this.marketStats, marketDataPo.marketStats) && Intrinsics.EZpvd(this.calendarDataList, marketDataPo.calendarDataList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradingCalendarPo> getCalendarDataList() {
        return this.calendarDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketOverallStatsPo getMarketStats() {
        return this.marketStats;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MarketOverallStatsPo marketOverallStatsPo = this.marketStats;
        int iHashCode = marketOverallStatsPo == null ? 0 : marketOverallStatsPo.hashCode();
        List<TradingCalendarPo> list = this.calendarDataList;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketDataPo(marketStats=" + this.marketStats + ", calendarDataList=" + this.calendarDataList + ")";
    }

    public MarketDataPo(MarketOverallStatsPo marketOverallStatsPo, List<TradingCalendarPo> list) {
        this.marketStats = marketOverallStatsPo;
        this.calendarDataList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo) : (r2v0 com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo, java.util.List<com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo>):void (m)] (LINE:8) call: com.okinc.find_ui.features.opportunity.overall.data.model.MarketDataPo.<init>(com.okinc.find_ui.features.opportunity.overall.data.model.MarketOverallStatsPo, java.util.List):void type: THIS */
    public /* synthetic */ MarketDataPo(MarketOverallStatsPo marketOverallStatsPo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marketOverallStatsPo, (i & 2) != 0 ? null : list);
    }
}
