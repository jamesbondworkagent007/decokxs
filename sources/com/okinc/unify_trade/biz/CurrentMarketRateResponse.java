package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class CurrentMarketRateResponse {
    public static final int $stable = 0;
    private final String amount;
    private final String avgRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrentMarketRateResponse copy$default(CurrentMarketRateResponse currentMarketRateResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentMarketRateResponse.amount;
        }
        if ((i & 2) != 0) {
            str2 = currentMarketRateResponse.avgRate;
        }
        return currentMarketRateResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrentMarketRateResponse copy(String str, String str2) {
        return new CurrentMarketRateResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentMarketRateResponse)) {
            return false;
        }
        CurrentMarketRateResponse currentMarketRateResponse = (CurrentMarketRateResponse) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) currentMarketRateResponse.amount) && Intrinsics.EZpvd((Object) this.avgRate, (Object) currentMarketRateResponse.avgRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgRate() {
        return this.avgRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.avgRate;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrentMarketRateResponse(amount=" + this.amount + ", avgRate=" + this.avgRate + ")";
    }

    public CurrentMarketRateResponse(String str, String str2) {
        this.amount = str;
        this.avgRate = str2;
    }
}
