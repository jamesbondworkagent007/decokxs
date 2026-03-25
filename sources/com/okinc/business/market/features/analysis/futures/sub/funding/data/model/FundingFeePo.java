package com.okinc.business.market.features.analysis.futures.sub.funding.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FundingFeePo {
    public static final int $stable = 8;

    @SerializedName("everyTimeStepFundingFeeList")
    private final List<EveryTimeStepFundingFeePo> everyTimeStepFundingFeeList;

    @SerializedName("fundingFee")
    private final String fundingFee;

    @SerializedName("lossFundingFee")
    private final String lossFundingFee;

    @SerializedName("lossFundingFeeList")
    private final List<FundingFeeInfoPo> lossFundingFeeList;

    @SerializedName("winFundingFee")
    private final String winFundingFee;

    @SerializedName("winFundingFeeList")
    private final List<FundingFeeInfoPo> winFundingFeeList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingFeePo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeePo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FundingFeePo copy$default(FundingFeePo fundingFeePo, List list, String str, String str2, String str3, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fundingFeePo.everyTimeStepFundingFeeList;
        }
        if ((i & 2) != 0) {
            str = fundingFeePo.fundingFee;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = fundingFeePo.winFundingFee;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = fundingFeePo.lossFundingFee;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list2 = fundingFeePo.lossFundingFeeList;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            list3 = fundingFeePo.winFundingFeeList;
        }
        return fundingFeePo.copy(list, str4, str5, str6, list4, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EveryTimeStepFundingFeePo> component1() {
        return this.everyTimeStepFundingFeeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.winFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lossFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeInfoPo> component5() {
        return this.lossFundingFeeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeInfoPo> component6() {
        return this.winFundingFeeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingFeePo copy(@NotNull List<EveryTimeStepFundingFeePo> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<FundingFeeInfoPo> list2, @NotNull List<FundingFeeInfoPo> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new FundingFeePo(list, str, str2, str3, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingFeePo)) {
            return false;
        }
        FundingFeePo fundingFeePo = (FundingFeePo) obj;
        return Intrinsics.EZpvd(this.everyTimeStepFundingFeeList, fundingFeePo.everyTimeStepFundingFeeList) && Intrinsics.EZpvd((Object) this.fundingFee, (Object) fundingFeePo.fundingFee) && Intrinsics.EZpvd((Object) this.winFundingFee, (Object) fundingFeePo.winFundingFee) && Intrinsics.EZpvd((Object) this.lossFundingFee, (Object) fundingFeePo.lossFundingFee) && Intrinsics.EZpvd(this.lossFundingFeeList, fundingFeePo.lossFundingFeeList) && Intrinsics.EZpvd(this.winFundingFeeList, fundingFeePo.winFundingFeeList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EveryTimeStepFundingFeePo> getEveryTimeStepFundingFeeList() {
        return this.everyTimeStepFundingFeeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFee() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLossFundingFee() {
        return this.lossFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeInfoPo> getLossFundingFeeList() {
        return this.lossFundingFeeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWinFundingFee() {
        return this.winFundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeInfoPo> getWinFundingFeeList() {
        return this.winFundingFeeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.everyTimeStepFundingFeeList.hashCode() * 31) + this.fundingFee.hashCode()) * 31) + this.winFundingFee.hashCode()) * 31) + this.lossFundingFee.hashCode()) * 31) + this.lossFundingFeeList.hashCode()) * 31) + this.winFundingFeeList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingFeePo(everyTimeStepFundingFeeList=" + this.everyTimeStepFundingFeeList + ", fundingFee=" + this.fundingFee + ", winFundingFee=" + this.winFundingFee + ", lossFundingFee=" + this.lossFundingFee + ", lossFundingFeeList=" + this.lossFundingFeeList + ", winFundingFeeList=" + this.winFundingFeeList + ")";
    }

    public FundingFeePo(@NotNull List<EveryTimeStepFundingFeePo> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<FundingFeeInfoPo> list2, @NotNull List<FundingFeeInfoPo> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.everyTimeStepFundingFeeList = list;
        this.fundingFee = str;
        this.winFundingFee = str2;
        this.lossFundingFee = str3;
        this.lossFundingFeeList = list2;
        this.winFundingFeeList = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r5v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.util.List:0x0026: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0022: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r10v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.analysis.futures.sub.funding.data.model.EveryTimeStepFundingFeePo>, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeeInfoPo>, java.util.List<com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeeInfoPo>):void (m)] (LINE:7) call: com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeePo.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ FundingFeePo(List list, String str, String str2, String str3, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? yDY.AhwBna() : list2, (i & 32) != 0 ? yDY.AhwBna() : list3);
    }
}
