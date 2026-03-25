package com.okinc.business.dexlogic.main.limmitorder.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class FromChildOrderDetailVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String childOrderId;
    private final Integer exchangeDirection;
    private final String exploreUrl;
    private final String failureReason;
    private final String fromAmount;
    private final String fromChainId;
    private final String fromChainLogoUrl;
    private final String fromChainName;
    private final String fromTokenContractAddress;
    private final String fromTokenIcon;
    private final boolean fromTokenIsDisplay;
    private final String fromTokenName;
    private final String fromTokenSymbol;
    private final String fromTokenUsd;
    private final Integer limitMemeOrderStrategyType;
    private final Integer limitOrderSourceType;
    private final String status;
    private final String toAmount;
    private final String toChainId;
    private final String toChainLogoUrl;
    private final String toChainName;
    private final String toTokenContractAddress;
    private final String toTokenIcon;
    private final boolean toTokenIsDisplay;
    private final String toTokenName;
    private final String toTokenSymbol;
    private final String toTokenUsd;
    private final String transactionHash;
    private final String triggerMarketCapacity;
    private final String triggerPrice;
    private final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FromChildOrderDetailVO() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    @SerialName("exchangeDirection")
    public static /* synthetic */ void getExchangeDirection$annotations() {
    }

    @SerialName("strategyType")
    public static /* synthetic */ void getLimitMemeOrderStrategyType$annotations() {
    }

    @SerialName("sourceType")
    public static /* synthetic */ void getLimitOrderSourceType$annotations() {
    }

    @SerialName("triggerMarketCapacity")
    public static /* synthetic */ void getTriggerMarketCapacity$annotations() {
    }

    @SerialName("triggerPrice")
    public static /* synthetic */ void getTriggerPrice$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.childOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.fromTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.fromTokenIsDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.failureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.toTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.toTokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.toTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.toTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.toTokenIsDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component30() {
        return this.limitMemeOrderStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component31() {
        return this.limitOrderSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromTokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.fromTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromChildOrderDetailVO copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, boolean z2, @NotNull String str23, @NotNull String str24, Integer num, @NotNull String str25, @NotNull String str26, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        return new FromChildOrderDetailVO(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, z2, str23, str24, num, str25, str26, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromChildOrderDetailVO)) {
            return false;
        }
        FromChildOrderDetailVO fromChildOrderDetailVO = (FromChildOrderDetailVO) obj;
        return Intrinsics.EZpvd((Object) this.childOrderId, (Object) fromChildOrderDetailVO.childOrderId) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) fromChildOrderDetailVO.exploreUrl) && Intrinsics.EZpvd((Object) this.fromTokenContractAddress, (Object) fromChildOrderDetailVO.fromTokenContractAddress) && Intrinsics.EZpvd((Object) this.fromTokenName, (Object) fromChildOrderDetailVO.fromTokenName) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) fromChildOrderDetailVO.fromAmount) && Intrinsics.EZpvd((Object) this.fromChainId, (Object) fromChildOrderDetailVO.fromChainId) && Intrinsics.EZpvd((Object) this.fromChainLogoUrl, (Object) fromChildOrderDetailVO.fromChainLogoUrl) && Intrinsics.EZpvd((Object) this.fromChainName, (Object) fromChildOrderDetailVO.fromChainName) && Intrinsics.EZpvd((Object) this.fromTokenIcon, (Object) fromChildOrderDetailVO.fromTokenIcon) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) fromChildOrderDetailVO.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.fromTokenUsd, (Object) fromChildOrderDetailVO.fromTokenUsd) && this.fromTokenIsDisplay == fromChildOrderDetailVO.fromTokenIsDisplay && Intrinsics.EZpvd((Object) this.failureReason, (Object) fromChildOrderDetailVO.failureReason) && Intrinsics.EZpvd((Object) this.status, (Object) fromChildOrderDetailVO.status) && Intrinsics.EZpvd((Object) this.toTokenContractAddress, (Object) fromChildOrderDetailVO.toTokenContractAddress) && Intrinsics.EZpvd((Object) this.toTokenName, (Object) fromChildOrderDetailVO.toTokenName) && Intrinsics.EZpvd((Object) this.toAmount, (Object) fromChildOrderDetailVO.toAmount) && Intrinsics.EZpvd((Object) this.toChainId, (Object) fromChildOrderDetailVO.toChainId) && Intrinsics.EZpvd((Object) this.toChainLogoUrl, (Object) fromChildOrderDetailVO.toChainLogoUrl) && Intrinsics.EZpvd((Object) this.toChainName, (Object) fromChildOrderDetailVO.toChainName) && Intrinsics.EZpvd((Object) this.toTokenIcon, (Object) fromChildOrderDetailVO.toTokenIcon) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) fromChildOrderDetailVO.toTokenSymbol) && Intrinsics.EZpvd((Object) this.toTokenUsd, (Object) fromChildOrderDetailVO.toTokenUsd) && this.toTokenIsDisplay == fromChildOrderDetailVO.toTokenIsDisplay && Intrinsics.EZpvd((Object) this.transactionHash, (Object) fromChildOrderDetailVO.transactionHash) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) fromChildOrderDetailVO.userWalletAddress) && Intrinsics.EZpvd(this.exchangeDirection, fromChildOrderDetailVO.exchangeDirection) && Intrinsics.EZpvd((Object) this.triggerPrice, (Object) fromChildOrderDetailVO.triggerPrice) && Intrinsics.EZpvd((Object) this.triggerMarketCapacity, (Object) fromChildOrderDetailVO.triggerMarketCapacity) && Intrinsics.EZpvd(this.limitMemeOrderStrategyType, fromChildOrderDetailVO.limitMemeOrderStrategyType) && Intrinsics.EZpvd(this.limitOrderSourceType, fromChildOrderDetailVO.limitOrderSourceType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChildOrderId() {
        return this.childOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getExchangeDirection() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainLogoUrl() {
        return this.fromChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainName() {
        return this.fromChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenContractAddress() {
        return this.fromTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenIcon() {
        return this.fromTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFromTokenIsDisplay() {
        return this.fromTokenIsDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenName() {
        return this.fromTokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenUsd() {
        return this.fromTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLimitMemeOrderStrategyType() {
        return this.limitMemeOrderStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLimitOrderSourceType() {
        return this.limitOrderSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainLogoUrl() {
        return this.toChainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainName() {
        return this.toChainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenContractAddress() {
        return this.toTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenIcon() {
        return this.toTokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getToTokenIsDisplay() {
        return this.toTokenIsDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenName() {
        return this.toTokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenUsd() {
        return this.toTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerMarketCapacity() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.childOrderId.hashCode();
        int iHashCode2 = this.exploreUrl.hashCode();
        int iHashCode3 = this.fromTokenContractAddress.hashCode();
        int iHashCode4 = this.fromTokenName.hashCode();
        int iHashCode5 = this.fromAmount.hashCode();
        int iHashCode6 = this.fromChainId.hashCode();
        int iHashCode7 = this.fromChainLogoUrl.hashCode();
        int iHashCode8 = this.fromChainName.hashCode();
        int iHashCode9 = this.fromTokenIcon.hashCode();
        int iHashCode10 = this.fromTokenSymbol.hashCode();
        int iHashCode11 = this.fromTokenUsd.hashCode();
        int iHashCode12 = Boolean.hashCode(this.fromTokenIsDisplay);
        int iHashCode13 = this.failureReason.hashCode();
        int iHashCode14 = this.status.hashCode();
        int iHashCode15 = this.toTokenContractAddress.hashCode();
        int iHashCode16 = this.toTokenName.hashCode();
        int iHashCode17 = this.toAmount.hashCode();
        int iHashCode18 = this.toChainId.hashCode();
        int iHashCode19 = this.toChainLogoUrl.hashCode();
        int iHashCode20 = this.toChainName.hashCode();
        int iHashCode21 = this.toTokenIcon.hashCode();
        int iHashCode22 = this.toTokenSymbol.hashCode();
        int iHashCode23 = this.toTokenUsd.hashCode();
        int iHashCode24 = Boolean.hashCode(this.toTokenIsDisplay);
        int iHashCode25 = this.transactionHash.hashCode();
        int iHashCode26 = this.userWalletAddress.hashCode();
        Integer num = this.exchangeDirection;
        int iHashCode27 = num == null ? 0 : num.hashCode();
        int iHashCode28 = this.triggerPrice.hashCode();
        int iHashCode29 = this.triggerMarketCapacity.hashCode();
        Integer num2 = this.limitMemeOrderStrategyType;
        int iHashCode30 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.limitOrderSourceType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FromChildOrderDetailVO(childOrderId=" + this.childOrderId + ", exploreUrl=" + this.exploreUrl + ", fromTokenContractAddress=" + this.fromTokenContractAddress + ", fromTokenName=" + this.fromTokenName + ", fromAmount=" + this.fromAmount + ", fromChainId=" + this.fromChainId + ", fromChainLogoUrl=" + this.fromChainLogoUrl + ", fromChainName=" + this.fromChainName + ", fromTokenIcon=" + this.fromTokenIcon + ", fromTokenSymbol=" + this.fromTokenSymbol + ", fromTokenUsd=" + this.fromTokenUsd + ", fromTokenIsDisplay=" + this.fromTokenIsDisplay + ", failureReason=" + this.failureReason + ", status=" + this.status + ", toTokenContractAddress=" + this.toTokenContractAddress + ", toTokenName=" + this.toTokenName + ", toAmount=" + this.toAmount + ", toChainId=" + this.toChainId + ", toChainLogoUrl=" + this.toChainLogoUrl + ", toChainName=" + this.toChainName + ", toTokenIcon=" + this.toTokenIcon + ", toTokenSymbol=" + this.toTokenSymbol + ", toTokenUsd=" + this.toTokenUsd + ", toTokenIsDisplay=" + this.toTokenIsDisplay + ", transactionHash=" + this.transactionHash + ", userWalletAddress=" + this.userWalletAddress + ", exchangeDirection=" + this.exchangeDirection + ", triggerPrice=" + this.triggerPrice + ", triggerMarketCapacity=" + this.triggerMarketCapacity + ", limitMemeOrderStrategyType=" + this.limitMemeOrderStrategyType + ", limitOrderSourceType=" + this.limitOrderSourceType + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FromChildOrderDetailVO> serializer() {
            return FromChildOrderDetailVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FromChildOrderDetailVO(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z2, String str23, String str24, Integer num, String str25, String str26, Integer num2, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.childOrderId = "";
        } else {
            this.childOrderId = str;
        }
        if ((i & 2) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str2;
        }
        if ((i & 4) == 0) {
            this.fromTokenContractAddress = "";
        } else {
            this.fromTokenContractAddress = str3;
        }
        if ((i & 8) == 0) {
            this.fromTokenName = "";
        } else {
            this.fromTokenName = str4;
        }
        if ((i & 16) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str5;
        }
        if ((i & 32) == 0) {
            this.fromChainId = "";
        } else {
            this.fromChainId = str6;
        }
        if ((i & 64) == 0) {
            this.fromChainLogoUrl = "";
        } else {
            this.fromChainLogoUrl = str7;
        }
        if ((i & 128) == 0) {
            this.fromChainName = "";
        } else {
            this.fromChainName = str8;
        }
        if ((i & 256) == 0) {
            this.fromTokenIcon = "";
        } else {
            this.fromTokenIcon = str9;
        }
        if ((i & 512) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str10;
        }
        if ((i & 1024) == 0) {
            this.fromTokenUsd = "";
        } else {
            this.fromTokenUsd = str11;
        }
        if ((i & 2048) == 0) {
            this.fromTokenIsDisplay = false;
        } else {
            this.fromTokenIsDisplay = z;
        }
        if ((i & 4096) == 0) {
            this.failureReason = "";
        } else {
            this.failureReason = str12;
        }
        if ((i & 8192) == 0) {
            this.status = "";
        } else {
            this.status = str13;
        }
        if ((i & 16384) == 0) {
            this.toTokenContractAddress = "";
        } else {
            this.toTokenContractAddress = str14;
        }
        if ((32768 & i) == 0) {
            this.toTokenName = "";
        } else {
            this.toTokenName = str15;
        }
        if ((65536 & i) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str16;
        }
        if ((131072 & i) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str17;
        }
        if ((262144 & i) == 0) {
            this.toChainLogoUrl = "";
        } else {
            this.toChainLogoUrl = str18;
        }
        if ((524288 & i) == 0) {
            this.toChainName = "";
        } else {
            this.toChainName = str19;
        }
        if ((1048576 & i) == 0) {
            this.toTokenIcon = "";
        } else {
            this.toTokenIcon = str20;
        }
        if ((2097152 & i) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str21;
        }
        if ((4194304 & i) == 0) {
            this.toTokenUsd = "";
        } else {
            this.toTokenUsd = str22;
        }
        if ((8388608 & i) == 0) {
            this.toTokenIsDisplay = false;
        } else {
            this.toTokenIsDisplay = z2;
        }
        if ((16777216 & i) == 0) {
            this.transactionHash = "";
        } else {
            this.transactionHash = str23;
        }
        if ((33554432 & i) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str24;
        }
        this.exchangeDirection = (67108864 & i) == 0 ? Integer.valueOf(LimitMemeExchangeDirection.BUY.getValue()) : num;
        if ((134217728 & i) == 0) {
            this.triggerPrice = "";
        } else {
            this.triggerPrice = str25;
        }
        if ((268435456 & i) == 0) {
            this.triggerMarketCapacity = "";
        } else {
            this.triggerMarketCapacity = str26;
        }
        this.limitMemeOrderStrategyType = (536870912 & i) == 0 ? Integer.valueOf(LimitMemeOrderStrategyType.BUY_DIP.getValue()) : num2;
        this.limitOrderSourceType = (i & 1073741824) == 0 ? Integer.valueOf(LimitOrderSourceType.ADVANCED_LIMIT_ORDER.getValue()) : num3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [474=4] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(FromChildOrderDetailVO fromChildOrderDetailVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.childOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fromChildOrderDetailVO.childOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.exploreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fromChildOrderDetailVO.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromTokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fromChildOrderDetailVO.fromTokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromTokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, fromChildOrderDetailVO.fromTokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fromChildOrderDetailVO.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fromChildOrderDetailVO.fromChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromChainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fromChildOrderDetailVO.fromChainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, fromChildOrderDetailVO.fromChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromTokenIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, fromChildOrderDetailVO.fromTokenIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, fromChildOrderDetailVO.fromTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.fromTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, fromChildOrderDetailVO.fromTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || fromChildOrderDetailVO.fromTokenIsDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, fromChildOrderDetailVO.fromTokenIsDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.failureReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, fromChildOrderDetailVO.failureReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, fromChildOrderDetailVO.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toTokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, fromChildOrderDetailVO.toTokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toTokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, fromChildOrderDetailVO.toTokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, fromChildOrderDetailVO.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, fromChildOrderDetailVO.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toChainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, fromChildOrderDetailVO.toChainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toChainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, fromChildOrderDetailVO.toChainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toTokenIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, fromChildOrderDetailVO.toTokenIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, fromChildOrderDetailVO.toTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.toTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, fromChildOrderDetailVO.toTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || fromChildOrderDetailVO.toTokenIsDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, fromChildOrderDetailVO.toTokenIsDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.transactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, fromChildOrderDetailVO.transactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, fromChildOrderDetailVO.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, fromChildOrderDetailVO.exchangeDirection);
        } else {
            Integer num = fromChildOrderDetailVO.exchangeDirection;
            int value = LimitMemeExchangeDirection.BUY.getValue();
            if (num == null || num.intValue() != value) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.triggerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, fromChildOrderDetailVO.triggerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) fromChildOrderDetailVO.triggerMarketCapacity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, fromChildOrderDetailVO.triggerMarketCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, IntSerializer.INSTANCE, fromChildOrderDetailVO.limitMemeOrderStrategyType);
        } else {
            Integer num2 = fromChildOrderDetailVO.limitMemeOrderStrategyType;
            int value2 = LimitMemeOrderStrategyType.BUY_DIP.getValue();
            if (num2 == null || num2.intValue() != value2) {
            }
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30)) {
            Integer num3 = fromChildOrderDetailVO.limitOrderSourceType;
            int value3 = LimitOrderSourceType.ADVANCED_LIMIT_ORDER.getValue();
            if (num3 != null && num3.intValue() == value3) {
                return;
            }
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, IntSerializer.INSTANCE, fromChildOrderDetailVO.limitOrderSourceType);
    }

    public FromChildOrderDetailVO(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, boolean z2, @NotNull String str23, @NotNull String str24, Integer num, @NotNull String str25, @NotNull String str26, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        this.childOrderId = str;
        this.exploreUrl = str2;
        this.fromTokenContractAddress = str3;
        this.fromTokenName = str4;
        this.fromAmount = str5;
        this.fromChainId = str6;
        this.fromChainLogoUrl = str7;
        this.fromChainName = str8;
        this.fromTokenIcon = str9;
        this.fromTokenSymbol = str10;
        this.fromTokenUsd = str11;
        this.fromTokenIsDisplay = z;
        this.failureReason = str12;
        this.status = str13;
        this.toTokenContractAddress = str14;
        this.toTokenName = str15;
        this.toAmount = str16;
        this.toChainId = str17;
        this.toChainLogoUrl = str18;
        this.toChainName = str19;
        this.toTokenIcon = str20;
        this.toTokenSymbol = str21;
        this.toTokenUsd = str22;
        this.toTokenIsDisplay = z2;
        this.transactionHash = str23;
        this.userWalletAddress = str24;
        this.exchangeDirection = num;
        this.triggerPrice = str25;
        this.triggerMarketCapacity = str26;
        this.limitMemeOrderStrategyType = num2;
        this.limitOrderSourceType = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0188: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r64v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r64v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r64v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r64v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r64v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r64v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r64v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r64v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r64v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r64v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r64v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r44v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r64v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r64v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r64v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r64v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r64v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r64v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r64v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r64v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r64v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r64v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r64v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00da: ARITH (r64v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r56v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r64v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0105: INVOKE 
  (wrap:int:0x0101: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeExchangeDirection:0x00ff: SGET  A[WRAPPED] (LINE:504) com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeExchangeDirection.BUY com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeExchangeDirection)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeExchangeDirection.getValue():int A[MD:():int (m), WRAPPED] (LINE:504))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:504)) : (r59v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010e: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0119: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0124: ARITH (r64v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x012e: INVOKE 
  (wrap:int:0x012a: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType:0x0128: SGET  A[WRAPPED] (LINE:510) com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType.BUY_DIP com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeOrderStrategyType.getValue():int A[MD:():int (m), WRAPPED] (LINE:510))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:510)) : (r62v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0137: ARITH (r64v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0141: INVOKE 
  (wrap:int:0x013d: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderSourceType:0x013b: SGET  A[WRAPPED] (LINE:512) com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderSourceType.ADVANCED_LIMIT_ORDER com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderSourceType)
 VIRTUAL call: com.okinc.business.dexlogic.main.limmitorder.bean.LimitOrderSourceType.getValue():int A[MD:():int (m), WRAPPED] (LINE:512))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:512)) : (r63v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:476) call: com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ FromChildOrderDetailVO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z2, String str23, String str24, Integer num, String str25, String str26, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? "" : str22, (i & 8388608) != 0 ? false : z2, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? Integer.valueOf(LimitMemeExchangeDirection.BUY.getValue()) : num, (i & 134217728) != 0 ? "" : str25, (i & 268435456) != 0 ? "" : str26, (i & 536870912) != 0 ? Integer.valueOf(LimitMemeOrderStrategyType.BUY_DIP.getValue()) : num2, (i & 1073741824) != 0 ? Integer.valueOf(LimitOrderSourceType.ADVANCED_LIMIT_ORDER.getValue()) : num3);
    }
}
