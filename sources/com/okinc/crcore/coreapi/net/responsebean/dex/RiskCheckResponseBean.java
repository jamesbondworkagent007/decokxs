package com.okinc.crcore.coreapi.net.responsebean.dex;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RiskCheckResponseBean {
    private final AllAnalysis allAnalysis;
    private final String buyTaxes;
    private final ContractAnalysis contractAnalysis;
    private final ExtraAnalysis extraAnalysis;
    private final String highRiskNum;
    private final HighestRiskBannerInfo highestRiskBannerInfo;
    private final String lowRiskNum;
    private final String middleRiskNum;
    private final String riskControlLevel;
    private final String riskLevel;
    private final String sellTaxes;
    private final SwapAnalysis swapAnalysis;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskCheckResponseBean() {
        this((AllAnalysis) null, (String) null, (ContractAnalysis) null, (ExtraAnalysis) null, (String) null, (HighestRiskBannerInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SwapAnalysis) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AllAnalysis component1() {
        return this.allAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sellTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapAnalysis component12() {
        return this.swapAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.buyTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractAnalysis component3() {
        return this.contractAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtraAnalysis component4() {
        return this.extraAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.highRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighestRiskBannerInfo component6() {
        return this.highestRiskBannerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lowRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.middleRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskCheckResponseBean copy(@NotNull AllAnalysis allAnalysis, @NotNull String str, @NotNull ContractAnalysis contractAnalysis, @NotNull ExtraAnalysis extraAnalysis, @NotNull String str2, @NotNull HighestRiskBannerInfo highestRiskBannerInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull SwapAnalysis swapAnalysis) {
        Intrinsics.checkNotNullParameter(allAnalysis, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(contractAnalysis, "");
        Intrinsics.checkNotNullParameter(extraAnalysis, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(highestRiskBannerInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(swapAnalysis, "");
        return new RiskCheckResponseBean(allAnalysis, str, contractAnalysis, extraAnalysis, str2, highestRiskBannerInfo, str3, str4, str5, str6, str7, swapAnalysis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskCheckResponseBean)) {
            return false;
        }
        RiskCheckResponseBean riskCheckResponseBean = (RiskCheckResponseBean) obj;
        return Intrinsics.EZpvd(this.allAnalysis, riskCheckResponseBean.allAnalysis) && Intrinsics.EZpvd((Object) this.buyTaxes, (Object) riskCheckResponseBean.buyTaxes) && Intrinsics.EZpvd(this.contractAnalysis, riskCheckResponseBean.contractAnalysis) && Intrinsics.EZpvd(this.extraAnalysis, riskCheckResponseBean.extraAnalysis) && Intrinsics.EZpvd((Object) this.highRiskNum, (Object) riskCheckResponseBean.highRiskNum) && Intrinsics.EZpvd(this.highestRiskBannerInfo, riskCheckResponseBean.highestRiskBannerInfo) && Intrinsics.EZpvd((Object) this.lowRiskNum, (Object) riskCheckResponseBean.lowRiskNum) && Intrinsics.EZpvd((Object) this.middleRiskNum, (Object) riskCheckResponseBean.middleRiskNum) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) riskCheckResponseBean.riskControlLevel) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) riskCheckResponseBean.riskLevel) && Intrinsics.EZpvd((Object) this.sellTaxes, (Object) riskCheckResponseBean.sellTaxes) && Intrinsics.EZpvd(this.swapAnalysis, riskCheckResponseBean.swapAnalysis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AllAnalysis getAllAnalysis() {
        return this.allAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyTaxes() {
        return this.buyTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractAnalysis getContractAnalysis() {
        return this.contractAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtraAnalysis getExtraAnalysis() {
        return this.extraAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighRiskNum() {
        return this.highRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighestRiskBannerInfo getHighestRiskBannerInfo() {
        return this.highestRiskBannerInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLowRiskNum() {
        return this.lowRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMiddleRiskNum() {
        return this.middleRiskNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskControlLevel() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellTaxes() {
        return this.sellTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapAnalysis getSwapAnalysis() {
        return this.swapAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.allAnalysis.hashCode() * 31) + this.buyTaxes.hashCode()) * 31) + this.contractAnalysis.hashCode()) * 31) + this.extraAnalysis.hashCode()) * 31) + this.highRiskNum.hashCode()) * 31) + this.highestRiskBannerInfo.hashCode()) * 31) + this.lowRiskNum.hashCode()) * 31) + this.middleRiskNum.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.sellTaxes.hashCode()) * 31) + this.swapAnalysis.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskCheckResponseBean(allAnalysis=" + this.allAnalysis + ", buyTaxes=" + this.buyTaxes + ", contractAnalysis=" + this.contractAnalysis + ", extraAnalysis=" + this.extraAnalysis + ", highRiskNum=" + this.highRiskNum + ", highestRiskBannerInfo=" + this.highestRiskBannerInfo + ", lowRiskNum=" + this.lowRiskNum + ", middleRiskNum=" + this.middleRiskNum + ", riskControlLevel=" + this.riskControlLevel + ", riskLevel=" + this.riskLevel + ", sellTaxes=" + this.sellTaxes + ", swapAnalysis=" + this.swapAnalysis + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.RiskCheckResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RiskCheckResponseBean> serializer() {
            return RiskCheckResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RiskCheckResponseBean(int i, AllAnalysis allAnalysis, String str, ContractAnalysis contractAnalysis, ExtraAnalysis extraAnalysis, String str2, HighestRiskBannerInfo highestRiskBannerInfo, String str3, String str4, String str5, String str6, String str7, SwapAnalysis swapAnalysis, SerializationConstructorMarker serializationConstructorMarker) {
        HighestRiskBannerInfo highestRiskBannerInfo2;
        this.allAnalysis = (i & 1) == 0 ? new AllAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : allAnalysis;
        if ((i & 2) == 0) {
            this.buyTaxes = "";
        } else {
            this.buyTaxes = str;
        }
        this.contractAnalysis = (i & 4) == 0 ? new ContractAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : contractAnalysis;
        this.extraAnalysis = (i & 8) == 0 ? new ExtraAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : extraAnalysis;
        if ((i & 16) == 0) {
            this.highRiskNum = "";
        } else {
            this.highRiskNum = str2;
        }
        if ((i & 32) == 0) {
            highestRiskBannerInfo2 = new HighestRiskBannerInfo((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            highestRiskBannerInfo2 = highestRiskBannerInfo;
        }
        this.highestRiskBannerInfo = highestRiskBannerInfo2;
        if ((i & 64) == 0) {
            this.lowRiskNum = "";
        } else {
            this.lowRiskNum = str3;
        }
        if ((i & 128) == 0) {
            this.middleRiskNum = "";
        } else {
            this.middleRiskNum = str4;
        }
        if ((i & 256) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str5;
        }
        if ((i & 512) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str6;
        }
        if ((i & 1024) == 0) {
            this.sellTaxes = "";
        } else {
            this.sellTaxes = str7;
        }
        this.swapAnalysis = (i & 2048) == 0 ? new SwapAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : swapAnalysis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [6=6] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RiskCheckResponseBean riskCheckResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(riskCheckResponseBean.allAnalysis, new AllAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, AllAnalysis$$serializer.INSTANCE, riskCheckResponseBean.allAnalysis);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) riskCheckResponseBean.buyTaxes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, riskCheckResponseBean.buyTaxes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(riskCheckResponseBean.contractAnalysis, new ContractAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, ContractAnalysis$$serializer.INSTANCE, riskCheckResponseBean.contractAnalysis);
        }
        int i = 3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(riskCheckResponseBean.extraAnalysis, new ExtraAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, ExtraAnalysis$$serializer.INSTANCE, riskCheckResponseBean.extraAnalysis);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) riskCheckResponseBean.highRiskNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, riskCheckResponseBean.highRiskNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(riskCheckResponseBean.highestRiskBannerInfo, new HighestRiskBannerInfo((String) null, (String) (0 == true ? 1 : 0), i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, HighestRiskBannerInfo$$serializer.INSTANCE, riskCheckResponseBean.highestRiskBannerInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) riskCheckResponseBean.lowRiskNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, riskCheckResponseBean.lowRiskNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) riskCheckResponseBean.middleRiskNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, riskCheckResponseBean.middleRiskNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) riskCheckResponseBean.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, riskCheckResponseBean.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) riskCheckResponseBean.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, riskCheckResponseBean.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) riskCheckResponseBean.sellTaxes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, riskCheckResponseBean.sellTaxes);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd(riskCheckResponseBean.swapAnalysis, new SwapAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, SwapAnalysis$$serializer.INSTANCE, riskCheckResponseBean.swapAnalysis);
    }

    public RiskCheckResponseBean(@NotNull AllAnalysis allAnalysis, @NotNull String str, @NotNull ContractAnalysis contractAnalysis, @NotNull ExtraAnalysis extraAnalysis, @NotNull String str2, @NotNull HighestRiskBannerInfo highestRiskBannerInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull SwapAnalysis swapAnalysis) {
        Intrinsics.checkNotNullParameter(allAnalysis, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(contractAnalysis, "");
        Intrinsics.checkNotNullParameter(extraAnalysis, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(highestRiskBannerInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(swapAnalysis, "");
        this.allAnalysis = allAnalysis;
        this.buyTaxes = str;
        this.contractAnalysis = contractAnalysis;
        this.extraAnalysis = extraAnalysis;
        this.highRiskNum = str2;
        this.highestRiskBannerInfo = highestRiskBannerInfo;
        this.lowRiskNum = str3;
        this.middleRiskNum = str4;
        this.riskControlLevel = str5;
        this.riskLevel = str6;
        this.sellTaxes = str7;
        this.swapAnalysis = swapAnalysis;
    }

    public /* synthetic */ RiskCheckResponseBean(AllAnalysis allAnalysis, String str, ContractAnalysis contractAnalysis, ExtraAnalysis extraAnalysis, String str2, HighestRiskBannerInfo highestRiskBannerInfo, String str3, String str4, String str5, String str6, String str7, SwapAnalysis swapAnalysis, int i, DefaultConstructorMarker defaultConstructorMarker) {
        HighestRiskBannerInfo highestRiskBannerInfo2;
        AllAnalysis allAnalysis2 = (i & 1) != 0 ? new AllAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : allAnalysis;
        String str8 = (i & 2) != 0 ? "" : str;
        ContractAnalysis contractAnalysis2 = (i & 4) != 0 ? new ContractAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : contractAnalysis;
        ExtraAnalysis extraAnalysis2 = (i & 8) != 0 ? new ExtraAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : extraAnalysis;
        String str9 = (i & 16) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            highestRiskBannerInfo2 = new HighestRiskBannerInfo((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            highestRiskBannerInfo2 = highestRiskBannerInfo;
        }
        this(allAnalysis2, str8, contractAnalysis2, extraAnalysis2, str9, highestRiskBannerInfo2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) == 0 ? str7 : "", (i & 2048) != 0 ? new SwapAnalysis((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null) : swapAnalysis);
    }
}
