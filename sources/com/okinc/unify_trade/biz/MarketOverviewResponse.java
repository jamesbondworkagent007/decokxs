package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MarketOverviewResponse {
    public static final int $stable = 8;
    private final List<CurrentMarketRateResponse> currentMarketRate;
    private final List<HourlyAverageHistoricalRatesResponse> historicalRate;
    private final String latestHourAvgRate;
    private final String latestHourTimestamp;
    private final String totalAvgRate;
    private final String totalLendingAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.biz.MarketOverviewResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketOverviewResponse copy$default(MarketOverviewResponse marketOverviewResponse, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketOverviewResponse.latestHourAvgRate;
        }
        if ((i & 2) != 0) {
            str2 = marketOverviewResponse.latestHourTimestamp;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = marketOverviewResponse.totalLendingAmount;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = marketOverviewResponse.totalAvgRate;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = marketOverviewResponse.historicalRate;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = marketOverviewResponse.currentMarketRate;
        }
        return marketOverviewResponse.copy(str, str5, str6, str7, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.latestHourAvgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.latestHourTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalLendingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalAvgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HourlyAverageHistoricalRatesResponse> component5() {
        return this.historicalRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurrentMarketRateResponse> component6() {
        return this.currentMarketRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketOverviewResponse copy(String str, String str2, String str3, String str4, List<HourlyAverageHistoricalRatesResponse> list, List<CurrentMarketRateResponse> list2) {
        return new MarketOverviewResponse(str, str2, str3, str4, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketOverviewResponse)) {
            return false;
        }
        MarketOverviewResponse marketOverviewResponse = (MarketOverviewResponse) obj;
        return Intrinsics.EZpvd((Object) this.latestHourAvgRate, (Object) marketOverviewResponse.latestHourAvgRate) && Intrinsics.EZpvd((Object) this.latestHourTimestamp, (Object) marketOverviewResponse.latestHourTimestamp) && Intrinsics.EZpvd((Object) this.totalLendingAmount, (Object) marketOverviewResponse.totalLendingAmount) && Intrinsics.EZpvd((Object) this.totalAvgRate, (Object) marketOverviewResponse.totalAvgRate) && Intrinsics.EZpvd(this.historicalRate, marketOverviewResponse.historicalRate) && Intrinsics.EZpvd(this.currentMarketRate, marketOverviewResponse.currentMarketRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurrentMarketRateResponse> getCurrentMarketRate() {
        return this.currentMarketRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HourlyAverageHistoricalRatesResponse> getHistoricalRate() {
        return this.historicalRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestHourAvgRate() {
        return this.latestHourAvgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestHourTimestamp() {
        return this.latestHourTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAvgRate() {
        return this.totalAvgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalLendingAmount() {
        return this.totalLendingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.latestHourAvgRate;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.latestHourTimestamp;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totalLendingAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.totalAvgRate;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        List<HourlyAverageHistoricalRatesResponse> list = this.historicalRate;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        List<CurrentMarketRateResponse> list2 = this.currentMarketRate;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketOverviewResponse(latestHourAvgRate=" + this.latestHourAvgRate + ", latestHourTimestamp=" + this.latestHourTimestamp + ", totalLendingAmount=" + this.totalLendingAmount + ", totalAvgRate=" + this.totalAvgRate + ", historicalRate=" + this.historicalRate + ", currentMarketRate=" + this.currentMarketRate + ")";
    }

    public MarketOverviewResponse(String str, String str2, String str3, String str4, List<HourlyAverageHistoricalRatesResponse> list, List<CurrentMarketRateResponse> list2) {
        this.latestHourAvgRate = str;
        this.latestHourTimestamp = str2;
        this.totalLendingAmount = str3;
        this.totalAvgRate = str4;
        this.historicalRate = list;
        this.currentMarketRate = list2;
    }
}
