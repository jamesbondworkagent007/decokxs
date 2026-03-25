package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class HourlyAverageHistoricalRatesResponse {
    public static final int $stable = 0;
    private final String rate;
    private final String timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HourlyAverageHistoricalRatesResponse copy$default(HourlyAverageHistoricalRatesResponse hourlyAverageHistoricalRatesResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hourlyAverageHistoricalRatesResponse.rate;
        }
        if ((i & 2) != 0) {
            str2 = hourlyAverageHistoricalRatesResponse.timestamp;
        }
        return hourlyAverageHistoricalRatesResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HourlyAverageHistoricalRatesResponse copy(String str, String str2) {
        return new HourlyAverageHistoricalRatesResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HourlyAverageHistoricalRatesResponse)) {
            return false;
        }
        HourlyAverageHistoricalRatesResponse hourlyAverageHistoricalRatesResponse = (HourlyAverageHistoricalRatesResponse) obj;
        return Intrinsics.EZpvd((Object) this.rate, (Object) hourlyAverageHistoricalRatesResponse.rate) && Intrinsics.EZpvd((Object) this.timestamp, (Object) hourlyAverageHistoricalRatesResponse.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rate;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.timestamp;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HourlyAverageHistoricalRatesResponse(rate=" + this.rate + ", timestamp=" + this.timestamp + ")";
    }

    public HourlyAverageHistoricalRatesResponse(String str, String str2) {
        this.rate = str;
        this.timestamp = str2;
    }
}
