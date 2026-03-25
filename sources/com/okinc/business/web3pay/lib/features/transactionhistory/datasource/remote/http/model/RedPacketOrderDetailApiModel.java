package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C31337lsC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RedPacketOrderDetailApiModel extends BaseOrderDetailApiModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String activationFeeTokenAmount;
    private final String activationFeeUsdAmount;
    private final String areaCode;
    private final String chainIndex;
    private final String claimedAmount;
    private final int claimedUser;
    private final long createTime;
    private final String errMsg;
    private final Integer failedType;
    private final String feeTokenAmount;
    private final int feeTokenDecimal;
    private final String feeTokenSymbol;
    private final String feeTokenUsdAmount;
    private final String from;
    private final Integer fromType;
    private final int gasPayType;
    private final String merchantId;
    private final String networkLogo;
    private final String networkName;
    private final String orderId;
    private final int orderType;
    private final String parentOrderId;
    private final String productCode;
    private final String remainAmount;
    private final String remainUsdAmount;
    private final int status;
    private final Long timeToCancel;
    private final String to;
    private final Integer toType;
    private final String tokenAddress;
    private final String tokenAmount;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenSymbol;
    private final String tokenUsdAmount;
    private final String transferComment;
    private final String txHash;
    private final String uopHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.fromType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.toType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.feeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.feeTokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.errMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component26() {
        return this.failedType;
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
    public final int component35() {
        return this.claimedUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.claimedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.remainAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.remainUsdAmount;
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
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedPacketOrderDetailApiModel copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, @NotNull String str11, int i2, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15, @NotNull String str16, int i3, @NotNull String str17, @NotNull String str18, int i4, String str19, Integer num3, String str20, long j, Long l, int i5, @NotNull String str21, @NotNull String str22, String str23, String str24, int i6, @NotNull String str25, @NotNull String str26, @NotNull String str27) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        return new RedPacketOrderDetailApiModel(str, str2, str3, str4, str5, i, str6, str7, str8, num, str9, str10, num2, str11, i2, str12, str13, str14, str15, str16, i3, str17, str18, i4, str19, num3, str20, j, l, i5, str21, str22, str23, str24, i6, str25, str26, str27);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedPacketOrderDetailApiModel)) {
            return false;
        }
        RedPacketOrderDetailApiModel redPacketOrderDetailApiModel = (RedPacketOrderDetailApiModel) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) redPacketOrderDetailApiModel.orderId) && Intrinsics.EZpvd((Object) this.parentOrderId, (Object) redPacketOrderDetailApiModel.parentOrderId) && Intrinsics.EZpvd((Object) this.uopHash, (Object) redPacketOrderDetailApiModel.uopHash) && Intrinsics.EZpvd((Object) this.txHash, (Object) redPacketOrderDetailApiModel.txHash) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) redPacketOrderDetailApiModel.chainIndex) && this.orderType == redPacketOrderDetailApiModel.orderType && Intrinsics.EZpvd((Object) this.merchantId, (Object) redPacketOrderDetailApiModel.merchantId) && Intrinsics.EZpvd((Object) this.productCode, (Object) redPacketOrderDetailApiModel.productCode) && Intrinsics.EZpvd((Object) this.from, (Object) redPacketOrderDetailApiModel.from) && Intrinsics.EZpvd(this.fromType, redPacketOrderDetailApiModel.fromType) && Intrinsics.EZpvd((Object) this.to, (Object) redPacketOrderDetailApiModel.to) && Intrinsics.EZpvd((Object) this.areaCode, (Object) redPacketOrderDetailApiModel.areaCode) && Intrinsics.EZpvd(this.toType, redPacketOrderDetailApiModel.toType) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) redPacketOrderDetailApiModel.tokenAmount) && this.tokenDecimal == redPacketOrderDetailApiModel.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenUsdAmount, (Object) redPacketOrderDetailApiModel.tokenUsdAmount) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) redPacketOrderDetailApiModel.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) redPacketOrderDetailApiModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) redPacketOrderDetailApiModel.tokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) redPacketOrderDetailApiModel.feeTokenSymbol) && this.feeTokenDecimal == redPacketOrderDetailApiModel.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeTokenAmount, (Object) redPacketOrderDetailApiModel.feeTokenAmount) && Intrinsics.EZpvd((Object) this.feeTokenUsdAmount, (Object) redPacketOrderDetailApiModel.feeTokenUsdAmount) && this.status == redPacketOrderDetailApiModel.status && Intrinsics.EZpvd((Object) this.errMsg, (Object) redPacketOrderDetailApiModel.errMsg) && Intrinsics.EZpvd(this.failedType, redPacketOrderDetailApiModel.failedType) && Intrinsics.EZpvd((Object) this.transferComment, (Object) redPacketOrderDetailApiModel.transferComment) && this.createTime == redPacketOrderDetailApiModel.createTime && Intrinsics.EZpvd(this.timeToCancel, redPacketOrderDetailApiModel.timeToCancel) && this.gasPayType == redPacketOrderDetailApiModel.gasPayType && Intrinsics.EZpvd((Object) this.networkName, (Object) redPacketOrderDetailApiModel.networkName) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) redPacketOrderDetailApiModel.networkLogo) && Intrinsics.EZpvd((Object) this.activationFeeTokenAmount, (Object) redPacketOrderDetailApiModel.activationFeeTokenAmount) && Intrinsics.EZpvd((Object) this.activationFeeUsdAmount, (Object) redPacketOrderDetailApiModel.activationFeeUsdAmount) && this.claimedUser == redPacketOrderDetailApiModel.claimedUser && Intrinsics.EZpvd((Object) this.claimedAmount, (Object) redPacketOrderDetailApiModel.claimedAmount) && Intrinsics.EZpvd((Object) this.remainAmount, (Object) redPacketOrderDetailApiModel.remainAmount) && Intrinsics.EZpvd((Object) this.remainUsdAmount, (Object) redPacketOrderDetailApiModel.remainUsdAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getActivationFeeTokenAmount() {
        return this.activationFeeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getActivationFeeUsdAmount() {
        return this.activationFeeUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClaimedAmount() {
        return this.claimedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getClaimedUser() {
        return this.claimedUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getErrMsg() {
        return this.errMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public Integer getFailedType() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getFeeTokenAmount() {
        return this.feeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public int getFeeTokenDecimal() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getFeeTokenSymbol() {
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getFeeTokenUsdAmount() {
        return this.feeTokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public Integer getFromType() {
        return this.fromType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public int getGasPayType() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getMerchantId() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getParentOrderId() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getProductCode() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainAmount() {
        return this.remainAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainUsdAmount() {
        return this.remainUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public Long getTimeToCancel() {
        return this.timeToCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public Integer getToType() {
        return this.toType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getTokenUsdAmount() {
        return this.tokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getTransferComment() {
        return this.transferComment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getUopHash() {
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
        String str3 = this.merchantId;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.productCode;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.from;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.fromType;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        String str6 = this.to;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.areaCode;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        Integer num2 = this.toType;
        int iHashCode14 = num2 == null ? 0 : num2.hashCode();
        int iHashCode15 = this.tokenAmount.hashCode();
        int iHashCode16 = Integer.hashCode(this.tokenDecimal);
        int iHashCode17 = this.tokenUsdAmount.hashCode();
        int iHashCode18 = this.tokenLogo.hashCode();
        int iHashCode19 = this.tokenSymbol.hashCode();
        String str8 = this.tokenAddress;
        int iHashCode20 = str8 == null ? 0 : str8.hashCode();
        int iHashCode21 = this.feeTokenSymbol.hashCode();
        int iHashCode22 = Integer.hashCode(this.feeTokenDecimal);
        int iHashCode23 = this.feeTokenAmount.hashCode();
        int iHashCode24 = this.feeTokenUsdAmount.hashCode();
        int iHashCode25 = Integer.hashCode(this.status);
        String str9 = this.errMsg;
        int iHashCode26 = str9 == null ? 0 : str9.hashCode();
        Integer num3 = this.failedType;
        int iHashCode27 = num3 == null ? 0 : num3.hashCode();
        String str10 = this.transferComment;
        if (str10 == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = str10.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode28 = Long.hashCode(this.createTime);
        Long l = this.timeToCancel;
        int iHashCode29 = l == null ? 0 : l.hashCode();
        int iHashCode30 = Integer.hashCode(this.gasPayType);
        int iHashCode31 = this.networkName.hashCode();
        int iHashCode32 = this.networkLogo.hashCode();
        String str11 = this.activationFeeTokenAmount;
        int iHashCode33 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.activationFeeUsdAmount;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.claimedUser)) * 31) + this.claimedAmount.hashCode()) * 31) + this.remainAmount.hashCode()) * 31) + this.remainUsdAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RedPacketOrderDetailApiModel(orderId=" + this.orderId + ", parentOrderId=" + this.parentOrderId + ", uopHash=" + this.uopHash + ", txHash=" + this.txHash + ", chainIndex=" + this.chainIndex + ", orderType=" + this.orderType + ", merchantId=" + this.merchantId + ", productCode=" + this.productCode + ", from=" + this.from + ", fromType=" + this.fromType + ", to=" + this.to + ", areaCode=" + this.areaCode + ", toType=" + this.toType + ", tokenAmount=" + this.tokenAmount + ", tokenDecimal=" + this.tokenDecimal + ", tokenUsdAmount=" + this.tokenUsdAmount + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenAmount=" + this.feeTokenAmount + ", feeTokenUsdAmount=" + this.feeTokenUsdAmount + ", status=" + this.status + ", errMsg=" + this.errMsg + ", failedType=" + this.failedType + ", transferComment=" + this.transferComment + ", createTime=" + this.createTime + ", timeToCancel=" + this.timeToCancel + ", gasPayType=" + this.gasPayType + ", networkName=" + this.networkName + ", networkLogo=" + this.networkLogo + ", activationFeeTokenAmount=" + this.activationFeeTokenAmount + ", activationFeeUsdAmount=" + this.activationFeeUsdAmount + ", claimedUser=" + this.claimedUser + ", claimedAmount=" + this.claimedAmount + ", remainAmount=" + this.remainAmount + ", remainUsdAmount=" + this.remainUsdAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketOrderDetailApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RedPacketOrderDetailApiModel> serializer() {
            return RedPacketOrderDetailApiModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RedPacketOrderDetailApiModel(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, int i4, String str12, String str13, String str14, String str15, String str16, int i5, String str17, String str18, int i6, String str19, Integer num3, String str20, long j, Long l, int i7, String str21, String str22, String str23, String str24, int i8, String str25, String str26, String str27, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((-385882637 != (i & (-385882637))) | (60 != (i2 & 60))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{-385882637, 60}, RedPacketOrderDetailApiModel$$serializer.INSTANCE.getDescriptor());
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
        this.merchantId = str6;
        this.productCode = str7;
        this.from = str8;
        if ((i & 512) == 0) {
            this.fromType = null;
        } else {
            this.fromType = num;
        }
        this.to = str9;
        if ((i & 2048) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str10;
        }
        if ((i & 4096) == 0) {
            this.toType = null;
        } else {
            this.toType = num2;
        }
        this.tokenAmount = str11;
        this.tokenDecimal = i4;
        this.tokenUsdAmount = str12;
        this.tokenLogo = str13;
        this.tokenSymbol = str14;
        this.tokenAddress = str15;
        this.feeTokenSymbol = str16;
        this.feeTokenDecimal = i5;
        this.feeTokenAmount = str17;
        this.feeTokenUsdAmount = str18;
        this.status = i6;
        if ((16777216 & i) == 0) {
            this.errMsg = null;
        } else {
            this.errMsg = str19;
        }
        this.failedType = (33554432 & i) == 0 ? 0 : num3;
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
        this.gasPayType = i7;
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
        this.claimedUser = i8;
        this.claimedAmount = str25;
        this.remainAmount = str26;
        this.remainUsdAmount = str27;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(RedPacketOrderDetailApiModel redPacketOrderDetailApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer failedType;
        BaseOrderDetailApiModel.write$Self(redPacketOrderDetailApiModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, redPacketOrderDetailApiModel.getOrderId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, redPacketOrderDetailApiModel.getParentOrderId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || redPacketOrderDetailApiModel.getUopHash() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, redPacketOrderDetailApiModel.getUopHash());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || redPacketOrderDetailApiModel.getTxHash() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, redPacketOrderDetailApiModel.getTxHash());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, redPacketOrderDetailApiModel.getChainIndex());
        compositeEncoder.encodeIntElement(serialDescriptor, 5, redPacketOrderDetailApiModel.getOrderType());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, redPacketOrderDetailApiModel.getMerchantId());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, redPacketOrderDetailApiModel.getProductCode());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, redPacketOrderDetailApiModel.getFrom());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || redPacketOrderDetailApiModel.getFromType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, redPacketOrderDetailApiModel.getFromType());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, redPacketOrderDetailApiModel.getTo());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || redPacketOrderDetailApiModel.getAreaCode() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, redPacketOrderDetailApiModel.getAreaCode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || redPacketOrderDetailApiModel.getToType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, redPacketOrderDetailApiModel.getToType());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, redPacketOrderDetailApiModel.getTokenAmount());
        compositeEncoder.encodeIntElement(serialDescriptor, 14, redPacketOrderDetailApiModel.getTokenDecimal());
        compositeEncoder.encodeStringElement(serialDescriptor, 15, redPacketOrderDetailApiModel.getTokenUsdAmount());
        compositeEncoder.encodeStringElement(serialDescriptor, 16, redPacketOrderDetailApiModel.getTokenLogo());
        compositeEncoder.encodeStringElement(serialDescriptor, 17, redPacketOrderDetailApiModel.getTokenSymbol());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, redPacketOrderDetailApiModel.getTokenAddress());
        compositeEncoder.encodeStringElement(serialDescriptor, 19, redPacketOrderDetailApiModel.getFeeTokenSymbol());
        compositeEncoder.encodeIntElement(serialDescriptor, 20, redPacketOrderDetailApiModel.getFeeTokenDecimal());
        compositeEncoder.encodeStringElement(serialDescriptor, 21, redPacketOrderDetailApiModel.getFeeTokenAmount());
        compositeEncoder.encodeStringElement(serialDescriptor, 22, redPacketOrderDetailApiModel.getFeeTokenUsdAmount());
        compositeEncoder.encodeIntElement(serialDescriptor, 23, redPacketOrderDetailApiModel.getStatus());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || redPacketOrderDetailApiModel.getErrMsg() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, redPacketOrderDetailApiModel.getErrMsg());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || (failedType = redPacketOrderDetailApiModel.getFailedType()) == null || failedType.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, redPacketOrderDetailApiModel.getFailedType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || redPacketOrderDetailApiModel.getTransferComment() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, redPacketOrderDetailApiModel.getTransferComment());
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 27, redPacketOrderDetailApiModel.getCreateTime());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || redPacketOrderDetailApiModel.getTimeToCancel() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, LongSerializer.INSTANCE, redPacketOrderDetailApiModel.getTimeToCancel());
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 29, redPacketOrderDetailApiModel.getGasPayType());
        compositeEncoder.encodeStringElement(serialDescriptor, 30, redPacketOrderDetailApiModel.getNetworkName());
        compositeEncoder.encodeStringElement(serialDescriptor, 31, redPacketOrderDetailApiModel.getNetworkLogo());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) redPacketOrderDetailApiModel.getActivationFeeTokenAmount(), (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, stringSerializer, redPacketOrderDetailApiModel.getActivationFeeTokenAmount());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) redPacketOrderDetailApiModel.getActivationFeeUsdAmount(), (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, stringSerializer, redPacketOrderDetailApiModel.getActivationFeeUsdAmount());
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 34, redPacketOrderDetailApiModel.claimedUser);
        compositeEncoder.encodeStringElement(serialDescriptor, 35, redPacketOrderDetailApiModel.claimedAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 36, redPacketOrderDetailApiModel.remainAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 37, redPacketOrderDetailApiModel.remainUsdAmount);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a5: CONSTRUCTOR 
  (r44v0 java.lang.String)
  (r45v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r83v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r83v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (r48v0 java.lang.String)
  (r49v0 int)
  (r50v0 java.lang.String)
  (r51v0 java.lang.String)
  (r52v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0013: ARITH (r83v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r53v0 java.lang.Integer))
  (r54v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r83v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r83v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r56v0 java.lang.Integer))
  (r57v0 java.lang.String)
  (r58v0 int)
  (r59v0 java.lang.String)
  (r60v0 java.lang.String)
  (r61v0 java.lang.String)
  (r62v0 java.lang.String)
  (r63v0 java.lang.String)
  (r64v0 int)
  (r65v0 java.lang.String)
  (r66v0 java.lang.String)
  (r67v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (16777216 int) & (r83v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0038: ARITH (33554432 int) & (r83v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r69v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (67108864 int) & (r83v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (r71v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0051: ARITH (r83v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r73v0 java.lang.Long))
  (r74v0 int)
  (r75v0 java.lang.String)
  (r76v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r84v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r84v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r78v0 java.lang.String))
  (r79v0 int)
  (r80v0 java.lang.String)
  (r81v0 java.lang.String)
  (r82v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:166) call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.RedPacketOrderDetailApiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RedPacketOrderDetailApiModel(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, int i2, String str12, String str13, String str14, String str15, String str16, int i3, String str17, String str18, int i4, String str19, Integer num3, String str20, long j, Long l, int i5, String str21, String str22, String str23, String str24, int i6, String str25, String str26, String str27, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, str5, i, str6, str7, str8, (i7 & 512) != 0 ? null : num, str9, (i7 & 2048) != 0 ? null : str10, (i7 & 4096) != 0 ? null : num2, str11, i2, str12, str13, str14, str15, str16, i3, str17, str18, i4, (16777216 & i7) != 0 ? null : str19, (33554432 & i7) != 0 ? 0 : num3, (67108864 & i7) != 0 ? null : str20, j, (i7 & 268435456) != 0 ? null : l, i5, str21, str22, (i8 & 1) != 0 ? "0" : str23, (i8 & 2) != 0 ? "0" : str24, i6, str25, str26, str27);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedPacketOrderDetailApiModel(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, @NotNull String str11, int i2, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15, @NotNull String str16, int i3, @NotNull String str17, @NotNull String str18, int i4, String str19, Integer num3, String str20, long j, Long l, int i5, @NotNull String str21, @NotNull String str22, String str23, String str24, int i6, @NotNull String str25, @NotNull String str26, @NotNull String str27) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        this.orderId = str;
        this.parentOrderId = str2;
        this.uopHash = str3;
        this.txHash = str4;
        this.chainIndex = str5;
        this.orderType = i;
        this.merchantId = str6;
        this.productCode = str7;
        this.from = str8;
        this.fromType = num;
        this.to = str9;
        this.areaCode = str10;
        this.toType = num2;
        this.tokenAmount = str11;
        this.tokenDecimal = i2;
        this.tokenUsdAmount = str12;
        this.tokenLogo = str13;
        this.tokenSymbol = str14;
        this.tokenAddress = str15;
        this.feeTokenSymbol = str16;
        this.feeTokenDecimal = i3;
        this.feeTokenAmount = str17;
        this.feeTokenUsdAmount = str18;
        this.status = i4;
        this.errMsg = str19;
        this.failedType = num3;
        this.transferComment = str20;
        this.createTime = j;
        this.timeToCancel = l;
        this.gasPayType = i5;
        this.networkName = str21;
        this.networkLogo = str22;
        this.activationFeeTokenAmount = str23;
        this.activationFeeUsdAmount = str24;
        this.claimedUser = i6;
        this.claimedAmount = str25;
        this.remainAmount = str26;
        this.remainUsdAmount = str27;
    }

    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public C31337lsC applyExtraFields(@NotNull C31337lsC c31337lsC) {
        Intrinsics.checkNotNullParameter(c31337lsC, "");
        return c31337lsC.EZpvd(((-1) & 1) != 0 ? c31337lsC.hDKMBd : null, ((-1) & 2) != 0 ? c31337lsC.AuCTelauCTel : null, ((-1) & 4) != 0 ? c31337lsC.QOLQEE : null, ((-1) & 8) != 0 ? c31337lsC.djBIcL : null, ((-1) & 16) != 0 ? c31337lsC.iwGUEr : null, ((-1) & 32) != 0 ? c31337lsC.fIwbmz : null, ((-1) & 64) != 0 ? c31337lsC.fJNWhG : null, ((-1) & 128) != 0 ? c31337lsC.wlaJM : null, ((-1) & 256) != 0 ? c31337lsC.copydefault : null, ((-1) & 512) != 0 ? c31337lsC.AwvSrB : null, ((-1) & 1024) != 0 ? c31337lsC.gHZMYf : null, ((-1) & 2048) != 0 ? c31337lsC.AxsJAY : 0, ((-1) & 4096) != 0 ? c31337lsC.QKVWgx : null, ((-1) & 8192) != 0 ? c31337lsC.zuBGHE : null, ((-1) & 16384) != 0 ? c31337lsC.OcIXYQ : null, ((-1) & 32768) != 0 ? c31337lsC.sSMYrx : null, ((-1) & 65536) != 0 ? c31337lsC.DbNXlk : null, ((-1) & 131072) != 0 ? c31337lsC.isConnected : 0, ((-1) & 262144) != 0 ? c31337lsC.fARcdN : null, ((-1) & 524288) != 0 ? c31337lsC.ejfBZ : null, ((-1) & 1048576) != 0 ? c31337lsC.AubY : null, ((-1) & 2097152) != 0 ? c31337lsC.AhwBna : null, ((-1) & 4194304) != 0 ? c31337lsC.AkhnZx : null, ((-1) & 8388608) != 0 ? c31337lsC.ORxRYg : null, ((-1) & 16777216) != 0 ? c31337lsC.AYXKKw : 0L, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? c31337lsC.zsXlph : 0L, ((-1) & 67108864) != 0 ? c31337lsC.AuCTel : null, (134217728 & (-1)) != 0 ? c31337lsC.getNewProxyInstance : null, ((-1) & 268435456) != 0 ? c31337lsC.uzCIH : null, ((-1) & 536870912) != 0 ? c31337lsC.KWHzl : null, ((-1) & 1073741824) != 0 ? c31337lsC.OLrzqt : null, ((-1) & Integer.MIN_VALUE) != 0 ? c31337lsC.values : new RedPacketInfo(this.claimedUser, this.claimedAmount, this.remainAmount, this.remainUsdAmount), (125 & 1) != 0 ? c31337lsC.valueOf : null, (125 & 2) != 0 ? c31337lsC.EZpvd : null, (125 & 4) != 0 ? c31337lsC.getFieldNames : null, (125 & 8) != 0 ? c31337lsC.zLjUOn : null, (125 & 16) != 0 ? c31337lsC.AEQbTJ : null, (125 & 32) != 0 ? c31337lsC.gEmmrt : null, (125 & 64) != 0 ? c31337lsC.fetchVPNInfo : null);
    }
}
