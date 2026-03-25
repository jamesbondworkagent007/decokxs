package o;

import com.okinc.market.discover.features.markets.sub.overview.data.po.MarketDiscoverOverallTrendPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallTrendPeriod;
import com.okinc.market.discover.features.markets.sub.overview.ui.MarketDiscoverOverallType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41092qkL {
    public final java.util.List<MarketDiscoverOverallTrendPo.LineChartItemPo> AEQbTJ;
    public final java.lang.String EZpvd;
    public final MarketDiscoverOverallTrendPeriod KWHzl;
    public final MarketDiscoverOverallType OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.qkL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41092qkL copy$default(C41092qkL c41092qkL, java.lang.String str, int i, java.util.List list, MarketDiscoverOverallTrendPeriod marketDiscoverOverallTrendPeriod, MarketDiscoverOverallType marketDiscoverOverallType, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c41092qkL.EZpvd;
        }
        if ((i2 & 2) != 0) {
            i = c41092qkL.copydefault;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = c41092qkL.AEQbTJ;
        }
        java.util.List list2 = list;
        if ((i2 & 8) != 0) {
            marketDiscoverOverallTrendPeriod = c41092qkL.KWHzl;
        }
        MarketDiscoverOverallTrendPeriod marketDiscoverOverallTrendPeriod2 = marketDiscoverOverallTrendPeriod;
        if ((i2 & 16) != 0) {
            marketDiscoverOverallType = c41092qkL.OLrzqt;
        }
        return c41092qkL.AEQbTJ(str, i3, list2, marketDiscoverOverallTrendPeriod2, marketDiscoverOverallType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<MarketDiscoverOverallTrendPo.LineChartItemPo> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41092qkL AEQbTJ(@NotNull java.lang.String str, int i, @NotNull java.util.List<MarketDiscoverOverallTrendPo.LineChartItemPo> list, @NotNull MarketDiscoverOverallTrendPeriod marketDiscoverOverallTrendPeriod, @NotNull MarketDiscoverOverallType marketDiscoverOverallType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(marketDiscoverOverallTrendPeriod, "");
        Intrinsics.checkNotNullParameter(marketDiscoverOverallType, "");
        return new C41092qkL(str, i, list, marketDiscoverOverallTrendPeriod, marketDiscoverOverallType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketDiscoverOverallType EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketDiscoverOverallTrendPeriod copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41092qkL)) {
            return false;
        }
        C41092qkL c41092qkL = (C41092qkL) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c41092qkL.EZpvd) && this.copydefault == c41092qkL.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c41092qkL.AEQbTJ) && this.KWHzl == c41092qkL.KWHzl && this.OLrzqt == c41092qkL.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketDiscoverOverallTrendVo(changePercent=" + this.EZpvd + ", changePercentColor=" + this.copydefault + ", lineChartItemsList=" + this.AEQbTJ + ", period=" + this.KWHzl + ", overallType=" + this.OLrzqt + ")";
    }

    public C41092qkL(@NotNull java.lang.String str, int i, @NotNull java.util.List<MarketDiscoverOverallTrendPo.LineChartItemPo> list, @NotNull MarketDiscoverOverallTrendPeriod marketDiscoverOverallTrendPeriod, @NotNull MarketDiscoverOverallType marketDiscoverOverallType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(marketDiscoverOverallTrendPeriod, "");
        Intrinsics.checkNotNullParameter(marketDiscoverOverallType, "");
        this.EZpvd = str;
        this.copydefault = i;
        this.AEQbTJ = list;
        this.KWHzl = marketDiscoverOverallTrendPeriod;
        this.OLrzqt = marketDiscoverOverallType;
    }
}
