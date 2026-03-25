package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CardReferralRewardsOrderDetailApiModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String activationFeeTokenAmount;
    private final String activationFeeUsdAmount;
    private final String areaCode;
    private final String chainIndex;
    private final long createTime;
    private final String errMsg;
    private final Integer failedType;
    private final String feeTokenAmount;
    private final String feeTokenCoinTypeNo;
    private final Integer feeTokenDecimal;
    private final String feeTokenSymbol;
    private final String feeTokenUsdAmount;
    private final String from;
    private final Integer fromType;
    private final int gasPayType;
    private final Boolean isFreeze;
    private final String merchantId;
    private final String networkLogo;
    private final String networkName;
    private final String orderId;
    private final int orderType;
    private final String parentOrderId;
    private final String playBook;
    private final String productCode;
    private final int status;
    private final Long timeToCancel;
    private final String to;
    private final Integer toType;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenSymbol;
    private final String tokenUsdAmount;
    private final String transferComment;
    private final String travelRuleId;
    private final String txHash;
    private final String uopHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.toType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component20() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.feeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.feeTokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component25() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.errMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.transferComment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component28() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component29() {
        return this.timeToCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component30() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.activationFeeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.activationFeeUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component37() {
        return this.isFreeze;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.playBook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.fromType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardReferralRewardsOrderDetailApiModel copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, Integer num, String str7, String str8, Integer num2, @NotNull String str9, int i2, @NotNull String str10, @NotNull String str11, @NotNull String str12, String str13, String str14, String str15, Integer num3, String str16, String str17, String str18, int i3, Integer num4, String str19, String str20, long j, Long l, int i4, @NotNull String str21, @NotNull String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        return new CardReferralRewardsOrderDetailApiModel(str, str2, str3, str4, str5, i, str6, num, str7, str8, num2, str9, i2, str10, str11, str12, str13, str14, str15, num3, str16, str17, str18, i3, num4, str19, str20, j, l, i4, str21, str22, str23, str24, str25, str26, bool, str27, str28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardReferralRewardsOrderDetailApiModel)) {
            return false;
        }
        CardReferralRewardsOrderDetailApiModel cardReferralRewardsOrderDetailApiModel = (CardReferralRewardsOrderDetailApiModel) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) cardReferralRewardsOrderDetailApiModel.orderId) && Intrinsics.EZpvd((Object) this.parentOrderId, (Object) cardReferralRewardsOrderDetailApiModel.parentOrderId) && Intrinsics.EZpvd((Object) this.uopHash, (Object) cardReferralRewardsOrderDetailApiModel.uopHash) && Intrinsics.EZpvd((Object) this.txHash, (Object) cardReferralRewardsOrderDetailApiModel.txHash) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) cardReferralRewardsOrderDetailApiModel.chainIndex) && this.orderType == cardReferralRewardsOrderDetailApiModel.orderType && Intrinsics.EZpvd((Object) this.from, (Object) cardReferralRewardsOrderDetailApiModel.from) && Intrinsics.EZpvd(this.fromType, cardReferralRewardsOrderDetailApiModel.fromType) && Intrinsics.EZpvd((Object) this.to, (Object) cardReferralRewardsOrderDetailApiModel.to) && Intrinsics.EZpvd((Object) this.areaCode, (Object) cardReferralRewardsOrderDetailApiModel.areaCode) && Intrinsics.EZpvd(this.toType, cardReferralRewardsOrderDetailApiModel.toType) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) cardReferralRewardsOrderDetailApiModel.tokenAmount) && this.tokenDecimal == cardReferralRewardsOrderDetailApiModel.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenUsdAmount, (Object) cardReferralRewardsOrderDetailApiModel.tokenUsdAmount) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) cardReferralRewardsOrderDetailApiModel.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) cardReferralRewardsOrderDetailApiModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) cardReferralRewardsOrderDetailApiModel.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) cardReferralRewardsOrderDetailApiModel.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) cardReferralRewardsOrderDetailApiModel.feeTokenSymbol) && Intrinsics.EZpvd(this.feeTokenDecimal, cardReferralRewardsOrderDetailApiModel.feeTokenDecimal) && Intrinsics.EZpvd((Object) this.feeTokenAmount, (Object) cardReferralRewardsOrderDetailApiModel.feeTokenAmount) && Intrinsics.EZpvd((Object) this.feeTokenUsdAmount, (Object) cardReferralRewardsOrderDetailApiModel.feeTokenUsdAmount) && Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) cardReferralRewardsOrderDetailApiModel.feeTokenCoinTypeNo) && this.status == cardReferralRewardsOrderDetailApiModel.status && Intrinsics.EZpvd(this.failedType, cardReferralRewardsOrderDetailApiModel.failedType) && Intrinsics.EZpvd((Object) this.errMsg, (Object) cardReferralRewardsOrderDetailApiModel.errMsg) && Intrinsics.EZpvd((Object) this.transferComment, (Object) cardReferralRewardsOrderDetailApiModel.transferComment) && this.createTime == cardReferralRewardsOrderDetailApiModel.createTime && Intrinsics.EZpvd(this.timeToCancel, cardReferralRewardsOrderDetailApiModel.timeToCancel) && this.gasPayType == cardReferralRewardsOrderDetailApiModel.gasPayType && Intrinsics.EZpvd((Object) this.networkName, (Object) cardReferralRewardsOrderDetailApiModel.networkName) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) cardReferralRewardsOrderDetailApiModel.networkLogo) && Intrinsics.EZpvd((Object) this.activationFeeTokenAmount, (Object) cardReferralRewardsOrderDetailApiModel.activationFeeTokenAmount) && Intrinsics.EZpvd((Object) this.activationFeeUsdAmount, (Object) cardReferralRewardsOrderDetailApiModel.activationFeeUsdAmount) && Intrinsics.EZpvd((Object) this.merchantId, (Object) cardReferralRewardsOrderDetailApiModel.merchantId) && Intrinsics.EZpvd((Object) this.productCode, (Object) cardReferralRewardsOrderDetailApiModel.productCode) && Intrinsics.EZpvd(this.isFreeze, cardReferralRewardsOrderDetailApiModel.isFreeze) && Intrinsics.EZpvd((Object) this.playBook, (Object) cardReferralRewardsOrderDetailApiModel.playBook) && Intrinsics.EZpvd((Object) this.travelRuleId, (Object) cardReferralRewardsOrderDetailApiModel.travelRuleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivationFeeTokenAmount() {
        return this.activationFeeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivationFeeUsdAmount() {
        return this.activationFeeUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrMsg() {
        return this.errMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFailedType() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenAmount() {
        return this.feeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenCoinTypeNo() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFeeTokenDecimal() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenSymbol() {
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenUsdAmount() {
        return this.feeTokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFromType() {
        return this.fromType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGasPayType() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getParentOrderId() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlayBook() {
        return this.playBook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimeToCancel() {
        return this.timeToCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getToType() {
        return this.toType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenUsdAmount() {
        return this.tokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferComment() {
        return this.transferComment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int i2;
        int iHashCode2 = this.orderId.hashCode();
        int iHashCode3 = this.parentOrderId.hashCode();
        String str = this.uopHash;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.txHash;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.chainIndex.hashCode();
        int iHashCode7 = Integer.hashCode(this.orderType);
        String str3 = this.from;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.fromType;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        String str4 = this.to;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.areaCode;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        Integer num2 = this.toType;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        int iHashCode13 = this.tokenAmount.hashCode();
        int iHashCode14 = Integer.hashCode(this.tokenDecimal);
        int iHashCode15 = this.tokenUsdAmount.hashCode();
        int iHashCode16 = this.tokenLogo.hashCode();
        int iHashCode17 = this.tokenSymbol.hashCode();
        String str6 = this.tokenAddress;
        int iHashCode18 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenCoinTypeNo;
        int iHashCode19 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.feeTokenSymbol;
        int iHashCode20 = str8 == null ? 0 : str8.hashCode();
        Integer num3 = this.feeTokenDecimal;
        int iHashCode21 = num3 == null ? 0 : num3.hashCode();
        String str9 = this.feeTokenAmount;
        int iHashCode22 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.feeTokenUsdAmount;
        int iHashCode23 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.feeTokenCoinTypeNo;
        int iHashCode24 = str11 == null ? 0 : str11.hashCode();
        int iHashCode25 = Integer.hashCode(this.status);
        Integer num4 = this.failedType;
        int iHashCode26 = num4 == null ? 0 : num4.hashCode();
        String str12 = this.errMsg;
        int iHashCode27 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.transferComment;
        if (str13 == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = str13.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode28 = Long.hashCode(this.createTime);
        Long l = this.timeToCancel;
        int iHashCode29 = l == null ? 0 : l.hashCode();
        int iHashCode30 = Integer.hashCode(this.gasPayType);
        int iHashCode31 = this.networkName.hashCode();
        int iHashCode32 = this.networkLogo.hashCode();
        String str14 = this.activationFeeTokenAmount;
        int iHashCode33 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.activationFeeUsdAmount;
        int iHashCode34 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.merchantId;
        int iHashCode35 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.productCode;
        int iHashCode36 = str17 == null ? 0 : str17.hashCode();
        Boolean bool = this.isFreeze;
        int iHashCode37 = bool == null ? 0 : bool.hashCode();
        String str18 = this.playBook;
        int iHashCode38 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.travelRuleId;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + (str19 == null ? 0 : str19.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFreeze() {
        return this.isFreeze;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardReferralRewardsOrderDetailApiModel(orderId=" + this.orderId + ", parentOrderId=" + this.parentOrderId + ", uopHash=" + this.uopHash + ", txHash=" + this.txHash + ", chainIndex=" + this.chainIndex + ", orderType=" + this.orderType + ", from=" + this.from + ", fromType=" + this.fromType + ", to=" + this.to + ", areaCode=" + this.areaCode + ", toType=" + this.toType + ", tokenAmount=" + this.tokenAmount + ", tokenDecimal=" + this.tokenDecimal + ", tokenUsdAmount=" + this.tokenUsdAmount + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenAmount=" + this.feeTokenAmount + ", feeTokenUsdAmount=" + this.feeTokenUsdAmount + ", feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ", status=" + this.status + ", failedType=" + this.failedType + ", errMsg=" + this.errMsg + ", transferComment=" + this.transferComment + ", createTime=" + this.createTime + ", timeToCancel=" + this.timeToCancel + ", gasPayType=" + this.gasPayType + ", networkName=" + this.networkName + ", networkLogo=" + this.networkLogo + ", activationFeeTokenAmount=" + this.activationFeeTokenAmount + ", activationFeeUsdAmount=" + this.activationFeeUsdAmount + ", merchantId=" + this.merchantId + ", productCode=" + this.productCode + ", isFreeze=" + this.isFreeze + ", playBook=" + this.playBook + ", travelRuleId=" + this.travelRuleId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.CardReferralRewardsOrderDetailApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardReferralRewardsOrderDetailApiModel> serializer() {
            return CardReferralRewardsOrderDetailApiModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CardReferralRewardsOrderDetailApiModel(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, Integer num, String str7, String str8, Integer num2, String str9, int i4, String str10, String str11, String str12, String str13, String str14, String str15, Integer num3, String str16, String str17, String str18, int i5, Integer num4, String str19, String str20, long j, Long l, int i6, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28, SerializationConstructorMarker serializationConstructorMarker) {
        if (-394201037 != (i & (-394201037))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{-394201037, 0}, CardReferralRewardsOrderDetailApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.parentOrderId = str2;
        if ((i & 4) == 0) {
            this.uopHash = null;
        } else {
            this.uopHash = str3;
        }
        if ((i & 8) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str4;
        }
        this.chainIndex = str5;
        this.orderType = i3;
        if ((i & 64) == 0) {
            this.from = null;
        } else {
            this.from = str6;
        }
        if ((i & 128) == 0) {
            this.fromType = null;
        } else {
            this.fromType = num;
        }
        if ((i & 256) == 0) {
            this.to = null;
        } else {
            this.to = str7;
        }
        if ((i & 512) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str8;
        }
        if ((i & 1024) == 0) {
            this.toType = null;
        } else {
            this.toType = num2;
        }
        this.tokenAmount = str9;
        this.tokenDecimal = i4;
        this.tokenUsdAmount = str10;
        this.tokenLogo = str11;
        this.tokenSymbol = str12;
        if ((65536 & i) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str13;
        }
        if ((131072 & i) == 0) {
            this.tokenCoinTypeNo = null;
        } else {
            this.tokenCoinTypeNo = str14;
        }
        if ((262144 & i) == 0) {
            this.feeTokenSymbol = null;
        } else {
            this.feeTokenSymbol = str15;
        }
        if ((524288 & i) == 0) {
            this.feeTokenDecimal = null;
        } else {
            this.feeTokenDecimal = num3;
        }
        if ((1048576 & i) == 0) {
            this.feeTokenAmount = null;
        } else {
            this.feeTokenAmount = str16;
        }
        if ((2097152 & i) == 0) {
            this.feeTokenUsdAmount = null;
        } else {
            this.feeTokenUsdAmount = str17;
        }
        if ((4194304 & i) == 0) {
            this.feeTokenCoinTypeNo = null;
        } else {
            this.feeTokenCoinTypeNo = str18;
        }
        this.status = i5;
        this.failedType = (16777216 & i) == 0 ? 0 : num4;
        if ((33554432 & i) == 0) {
            this.errMsg = null;
        } else {
            this.errMsg = str19;
        }
        if ((67108864 & i) == 0) {
            this.transferComment = null;
        } else {
            this.transferComment = str20;
        }
        this.createTime = j;
        if ((i & 268435456) == 0) {
            this.timeToCancel = null;
        } else {
            this.timeToCancel = l;
        }
        this.gasPayType = i6;
        this.networkName = str21;
        this.networkLogo = str22;
        if ((i2 & 1) == 0) {
            this.activationFeeTokenAmount = "0";
        } else {
            this.activationFeeTokenAmount = str23;
        }
        if ((i2 & 2) == 0) {
            this.activationFeeUsdAmount = "0";
        } else {
            this.activationFeeUsdAmount = str24;
        }
        if ((i2 & 4) == 0) {
            this.merchantId = null;
        } else {
            this.merchantId = str25;
        }
        if ((i2 & 8) == 0) {
            this.productCode = null;
        } else {
            this.productCode = str26;
        }
        if ((i2 & 16) == 0) {
            this.isFreeze = null;
        } else {
            this.isFreeze = bool;
        }
        if ((i2 & 32) == 0) {
            this.playBook = null;
        } else {
            this.playBook = str27;
        }
        if ((i2 & 64) == 0) {
            this.travelRuleId = null;
        } else {
            this.travelRuleId = str28;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CardReferralRewardsOrderDetailApiModel cardReferralRewardsOrderDetailApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cardReferralRewardsOrderDetailApiModel.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cardReferralRewardsOrderDetailApiModel.parentOrderId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cardReferralRewardsOrderDetailApiModel.uopHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.uopHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cardReferralRewardsOrderDetailApiModel.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.txHash);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, cardReferralRewardsOrderDetailApiModel.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, cardReferralRewardsOrderDetailApiModel.orderType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cardReferralRewardsOrderDetailApiModel.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || cardReferralRewardsOrderDetailApiModel.fromType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.fromType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || cardReferralRewardsOrderDetailApiModel.to != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || cardReferralRewardsOrderDetailApiModel.areaCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.areaCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || cardReferralRewardsOrderDetailApiModel.toType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.toType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, cardReferralRewardsOrderDetailApiModel.tokenAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 12, cardReferralRewardsOrderDetailApiModel.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, cardReferralRewardsOrderDetailApiModel.tokenUsdAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, cardReferralRewardsOrderDetailApiModel.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 15, cardReferralRewardsOrderDetailApiModel.tokenSymbol);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || cardReferralRewardsOrderDetailApiModel.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || cardReferralRewardsOrderDetailApiModel.tokenCoinTypeNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.tokenCoinTypeNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || cardReferralRewardsOrderDetailApiModel.feeTokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.feeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || cardReferralRewardsOrderDetailApiModel.feeTokenDecimal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, IntSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.feeTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || cardReferralRewardsOrderDetailApiModel.feeTokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.feeTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || cardReferralRewardsOrderDetailApiModel.feeTokenUsdAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.feeTokenUsdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || cardReferralRewardsOrderDetailApiModel.feeTokenCoinTypeNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.feeTokenCoinTypeNo);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 23, cardReferralRewardsOrderDetailApiModel.status);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || (num = cardReferralRewardsOrderDetailApiModel.failedType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, IntSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.failedType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || cardReferralRewardsOrderDetailApiModel.errMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.errMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || cardReferralRewardsOrderDetailApiModel.transferComment != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.transferComment);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 27, cardReferralRewardsOrderDetailApiModel.createTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || cardReferralRewardsOrderDetailApiModel.timeToCancel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, LongSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.timeToCancel);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 29, cardReferralRewardsOrderDetailApiModel.gasPayType);
        compositeEncoder.encodeStringElement(serialDescriptor, 30, cardReferralRewardsOrderDetailApiModel.networkName);
        compositeEncoder.encodeStringElement(serialDescriptor, 31, cardReferralRewardsOrderDetailApiModel.networkLogo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) cardReferralRewardsOrderDetailApiModel.activationFeeTokenAmount, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.activationFeeTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) cardReferralRewardsOrderDetailApiModel.activationFeeUsdAmount, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.activationFeeUsdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || cardReferralRewardsOrderDetailApiModel.merchantId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.merchantId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || cardReferralRewardsOrderDetailApiModel.productCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.productCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || cardReferralRewardsOrderDetailApiModel.isFreeze != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, BooleanSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.isFreeze);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || cardReferralRewardsOrderDetailApiModel.playBook != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.playBook);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) && cardReferralRewardsOrderDetailApiModel.travelRuleId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, cardReferralRewardsOrderDetailApiModel.travelRuleId);
    }

    public CardReferralRewardsOrderDetailApiModel(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, Integer num, String str7, String str8, Integer num2, @NotNull String str9, int i2, @NotNull String str10, @NotNull String str11, @NotNull String str12, String str13, String str14, String str15, Integer num3, String str16, String str17, String str18, int i3, Integer num4, String str19, String str20, long j, Long l, int i4, @NotNull String str21, @NotNull String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        this.orderId = str;
        this.parentOrderId = str2;
        this.uopHash = str3;
        this.txHash = str4;
        this.chainIndex = str5;
        this.orderType = i;
        this.from = str6;
        this.fromType = num;
        this.to = str7;
        this.areaCode = str8;
        this.toType = num2;
        this.tokenAmount = str9;
        this.tokenDecimal = i2;
        this.tokenUsdAmount = str10;
        this.tokenLogo = str11;
        this.tokenSymbol = str12;
        this.tokenAddress = str13;
        this.tokenCoinTypeNo = str14;
        this.feeTokenSymbol = str15;
        this.feeTokenDecimal = num3;
        this.feeTokenAmount = str16;
        this.feeTokenUsdAmount = str17;
        this.feeTokenCoinTypeNo = str18;
        this.status = i3;
        this.failedType = num4;
        this.errMsg = str19;
        this.transferComment = str20;
        this.createTime = j;
        this.timeToCancel = l;
        this.gasPayType = i4;
        this.networkName = str21;
        this.networkLogo = str22;
        this.activationFeeTokenAmount = str23;
        this.activationFeeUsdAmount = str24;
        this.merchantId = str25;
        this.productCode = str26;
        this.isFreeze = bool;
        this.playBook = str27;
        this.travelRuleId = str28;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x010d: CONSTRUCTOR 
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r85v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r85v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (r49v0 java.lang.String)
  (r50v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r85v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001b: ARITH (r85v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r52v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r85v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r85v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0033: ARITH (r85v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r55v0 java.lang.Integer))
  (r56v0 java.lang.String)
  (r57v0 int)
  (r58v0 java.lang.String)
  (r59v0 java.lang.String)
  (r60v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (65536 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (131072 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (262144 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005b: ARITH (524288 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r64v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (1048576 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (2097152 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (4194304 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (r68v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0083: ARITH (16777216 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r69v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (33554432 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009c: ARITH (67108864 int) & (r85v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (r72v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r85v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r74v0 java.lang.Long))
  (r75v0 int)
  (r76v0 java.lang.String)
  (r77v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r86v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r86v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r86v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r86v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r86v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r82v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r86v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r86v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r84v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:402) call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.CardReferralRewardsOrderDetailApiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CardReferralRewardsOrderDetailApiModel(String str, String str2, String str3, String str4, String str5, int i, String str6, Integer num, String str7, String str8, Integer num2, String str9, int i2, String str10, String str11, String str12, String str13, String str14, String str15, Integer num3, String str16, String str17, String str18, int i3, Integer num4, String str19, String str20, long j, Long l, int i4, String str21, String str22, String str23, String str24, String str25, String str26, Boolean bool, String str27, String str28, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? null : str4, str5, i, (i5 & 64) != 0 ? null : str6, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? null : str7, (i5 & 512) != 0 ? null : str8, (i5 & 1024) != 0 ? null : num2, str9, i2, str10, str11, str12, (65536 & i5) != 0 ? null : str13, (131072 & i5) != 0 ? null : str14, (262144 & i5) != 0 ? null : str15, (524288 & i5) != 0 ? null : num3, (1048576 & i5) != 0 ? null : str16, (2097152 & i5) != 0 ? null : str17, (4194304 & i5) != 0 ? null : str18, i3, (16777216 & i5) != 0 ? 0 : num4, (33554432 & i5) != 0 ? null : str19, (67108864 & i5) != 0 ? null : str20, j, (i5 & 268435456) != 0 ? null : l, i4, str21, str22, (i6 & 1) != 0 ? "0" : str23, (i6 & 2) != 0 ? "0" : str24, (i6 & 4) != 0 ? null : str25, (i6 & 8) != 0 ? null : str26, (i6 & 16) != 0 ? null : bool, (i6 & 32) != 0 ? null : str27, (i6 & 64) != 0 ? null : str28);
    }
}
