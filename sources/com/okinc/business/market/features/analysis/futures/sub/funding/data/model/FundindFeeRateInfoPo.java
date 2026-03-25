package com.okinc.business.market.features.analysis.futures.sub.funding.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FundindFeeRateInfoPo {
    public static final int $stable = 0;

    @SerializedName("ccy")
    private final String ccy;

    @SerializedName("estimatedFiatCcyFundingFee")
    private final String estimatedFiatCcyFundingFee;

    @SerializedName("estimatedFundingFee")
    private final String estimatedFundingFee;

    @SerializedName("fundingFeeRate")
    private final String fundingFeeRate;

    @SerializedName("instId")
    private final String instId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FundindFeeRateInfoPo copy$default(FundindFeeRateInfoPo fundindFeeRateInfoPo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundindFeeRateInfoPo.estimatedFiatCcyFundingFee;
        }
        if ((i & 2) != 0) {
            str2 = fundindFeeRateInfoPo.estimatedFundingFee;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = fundindFeeRateInfoPo.fundingFeeRate;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = fundindFeeRateInfoPo.instId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = fundindFeeRateInfoPo.ccy;
        }
        return fundindFeeRateInfoPo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estimatedFiatCcyFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estimatedFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fundingFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundindFeeRateInfoPo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new FundindFeeRateInfoPo(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundindFeeRateInfoPo)) {
            return false;
        }
        FundindFeeRateInfoPo fundindFeeRateInfoPo = (FundindFeeRateInfoPo) obj;
        return Intrinsics.EZpvd((Object) this.estimatedFiatCcyFundingFee, (Object) fundindFeeRateInfoPo.estimatedFiatCcyFundingFee) && Intrinsics.EZpvd((Object) this.estimatedFundingFee, (Object) fundindFeeRateInfoPo.estimatedFundingFee) && Intrinsics.EZpvd((Object) this.fundingFeeRate, (Object) fundindFeeRateInfoPo.fundingFeeRate) && Intrinsics.EZpvd((Object) this.instId, (Object) fundindFeeRateInfoPo.instId) && Intrinsics.EZpvd((Object) this.ccy, (Object) fundindFeeRateInfoPo.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedFiatCcyFundingFee() {
        return this.estimatedFiatCcyFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedFundingFee() {
        return this.estimatedFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFeeRate() {
        return this.fundingFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.estimatedFiatCcyFundingFee.hashCode() * 31) + this.estimatedFundingFee.hashCode()) * 31) + this.fundingFeeRate.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.ccy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundindFeeRateInfoPo(estimatedFiatCcyFundingFee=" + this.estimatedFiatCcyFundingFee + ", estimatedFundingFee=" + this.estimatedFundingFee + ", fundingFeeRate=" + this.fundingFeeRate + ", instId=" + this.instId + ", ccy=" + this.ccy + ")";
    }

    public FundindFeeRateInfoPo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.estimatedFiatCcyFundingFee = str;
        this.estimatedFundingFee = str2;
        this.fundingFeeRate = str3;
        this.instId = str4;
        this.ccy = str5;
    }
}
