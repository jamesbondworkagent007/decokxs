package o;

import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalConfigUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.TimeframeModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uGU {
    public final MarketSignalConfigUiModel AEQbTJ;
    public final java.util.List<Indicator> AYXKKw;
    public final java.util.List<IndicatorSectionUiModel> AhwBna;
    public final java.util.List<IndicatorSectionUiModel> EZpvd;
    public final java.util.List<TimeframeModel> KWHzl;
    public final java.util.List<Indicator> OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;
    public final java.util.List<TimeframeModel> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TimeframeModel> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uGU AEQbTJ(@NotNull MarketSignalConfigUiModel marketSignalConfigUiModel, java.lang.String str, @NotNull java.util.List<TimeframeModel> list, @NotNull java.util.List<? extends Indicator> list2, @NotNull java.util.List<IndicatorSectionUiModel> list3, @NotNull java.util.List<IndicatorSectionUiModel> list4, java.lang.String str2, @NotNull java.util.List<TimeframeModel> list5, @NotNull java.util.List<? extends Indicator> list6) {
        Intrinsics.checkNotNullParameter(marketSignalConfigUiModel, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        return new uGU(marketSignalConfigUiModel, str, list, list2, list3, list4, str2, list5, list6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<IndicatorSectionUiModel> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TimeframeModel> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketSignalConfigUiModel EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Indicator> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<IndicatorSectionUiModel> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uGU)) {
            return false;
        }
        uGU ugu = (uGU) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, ugu.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) ugu.gEmmrt) && Intrinsics.EZpvd(this.valueOf, ugu.valueOf) && Intrinsics.EZpvd(this.AYXKKw, ugu.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, ugu.AhwBna) && Intrinsics.EZpvd(this.EZpvd, ugu.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ugu.copydefault) && Intrinsics.EZpvd(this.KWHzl, ugu.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, ugu.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        java.lang.String str = this.gEmmrt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.valueOf.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        int iHashCode6 = this.EZpvd.hashCode();
        java.lang.String str2 = this.copydefault;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EditMarketSignalUiState(config=" + this.AEQbTJ + ", selectedThinkingInterval=" + this.gEmmrt + ", selectedChartTimeframes=" + this.valueOf + ", selectedIndicators=" + this.AYXKKw + ", indicatorSections=" + this.AhwBna + ", defaultIndicatorSections=" + this.EZpvd + ", defaultThinkingInterval=" + this.copydefault + ", defaultChartTimeframes=" + this.KWHzl + ", defaultSelectedIndicators=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Indicator> valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends com.okinc.tradingbot.impl.aiBot.domain.model.Indicator> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.okinc.tradingbot.impl.aiBot.domain.model.Indicator> */
    /* JADX WARN: Multi-variable type inference failed */
    public uGU(@NotNull MarketSignalConfigUiModel marketSignalConfigUiModel, java.lang.String str, @NotNull java.util.List<TimeframeModel> list, @NotNull java.util.List<? extends Indicator> list2, @NotNull java.util.List<IndicatorSectionUiModel> list3, @NotNull java.util.List<IndicatorSectionUiModel> list4, java.lang.String str2, @NotNull java.util.List<TimeframeModel> list5, @NotNull java.util.List<? extends Indicator> list6) {
        Intrinsics.checkNotNullParameter(marketSignalConfigUiModel, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        this.AEQbTJ = marketSignalConfigUiModel;
        this.gEmmrt = str;
        this.valueOf = list;
        this.AYXKKw = list2;
        this.AhwBna = list3;
        this.EZpvd = list4;
        this.copydefault = str2;
        this.KWHzl = list5;
        this.OLrzqt = list6;
    }

    public final boolean KWHzl() {
        return this.gEmmrt != null && (this.valueOf.isEmpty() ^ true) && (this.AYXKKw.isEmpty() ^ true);
    }
}
