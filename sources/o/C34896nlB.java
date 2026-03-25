package o;

import com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nlB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34896nlB {
    public final MarketOverallStatsVo KWHzl;
    public final java.util.List<MarketDiscoverOverviewTradeCalendarVo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34896nlB() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nlB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C34896nlB copy$default(C34896nlB c34896nlB, MarketOverallStatsVo marketOverallStatsVo, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            marketOverallStatsVo = c34896nlB.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c34896nlB.copydefault;
        }
        return c34896nlB.KWHzl(marketOverallStatsVo, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34896nlB KWHzl(MarketOverallStatsVo marketOverallStatsVo, java.util.List<MarketDiscoverOverviewTradeCalendarVo> list) {
        return new C34896nlB(marketOverallStatsVo, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<MarketDiscoverOverviewTradeCalendarVo> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketOverallStatsVo copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34896nlB)) {
            return false;
        }
        C34896nlB c34896nlB = (C34896nlB) obj;
        return Intrinsics.EZpvd(this.KWHzl, c34896nlB.KWHzl) && Intrinsics.EZpvd(this.copydefault, c34896nlB.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MarketOverallStatsVo marketOverallStatsVo = this.KWHzl;
        int iHashCode = marketOverallStatsVo == null ? 0 : marketOverallStatsVo.hashCode();
        java.util.List<MarketDiscoverOverviewTradeCalendarVo> list = this.copydefault;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketDataVo(marketStats=" + this.KWHzl + ", calendarDataList=" + this.copydefault + ")";
    }

    public C34896nlB(MarketOverallStatsVo marketOverallStatsVo, java.util.List<MarketDiscoverOverviewTradeCalendarVo> list) {
        this.KWHzl = marketOverallStatsVo;
        this.copydefault = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo) : (r2v0 com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo, java.util.List<com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo>):void (m)] (LINE:5) call: o.nlB.<init>(com.okinc.find_ui.features.opportunity.overall.ui.model.MarketOverallStatsVo, java.util.List):void type: THIS */
    public /* synthetic */ C34896nlB(MarketOverallStatsVo marketOverallStatsVo, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marketOverallStatsVo, (i & 2) != 0 ? null : list);
    }
}
