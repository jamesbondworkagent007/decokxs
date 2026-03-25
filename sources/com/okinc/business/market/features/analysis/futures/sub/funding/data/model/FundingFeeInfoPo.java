package com.okinc.business.market.features.analysis.futures.sub.funding.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FundingFeeInfoPo {
    public static final int $stable = 0;

    @SerializedName("fundingFee")
    private final String fundingFee;

    @SerializedName("instId")
    private final String instId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FundingFeeInfoPo copy$default(FundingFeeInfoPo fundingFeeInfoPo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingFeeInfoPo.fundingFee;
        }
        if ((i & 2) != 0) {
            str2 = fundingFeeInfoPo.instId;
        }
        return fundingFeeInfoPo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingFeeInfoPo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FundingFeeInfoPo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingFeeInfoPo)) {
            return false;
        }
        FundingFeeInfoPo fundingFeeInfoPo = (FundingFeeInfoPo) obj;
        return Intrinsics.EZpvd((Object) this.fundingFee, (Object) fundingFeeInfoPo.fundingFee) && Intrinsics.EZpvd((Object) this.instId, (Object) fundingFeeInfoPo.instId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFee() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.fundingFee.hashCode() * 31) + this.instId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingFeeInfoPo(fundingFee=" + this.fundingFee + ", instId=" + this.instId + ")";
    }

    public FundingFeeInfoPo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fundingFee = str;
        this.instId = str2;
    }
}
