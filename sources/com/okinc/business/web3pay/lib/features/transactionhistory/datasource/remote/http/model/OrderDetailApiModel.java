package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.web3pay.lib.core.model.UserFundStatus;
import com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo;
import com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo$$serializer;
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
public final class OrderDetailApiModel extends BaseOrderDetailApiModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String acquireLogo;
    private final String acquireName;
    private final String activationFeeTokenAmount;
    private final String activationFeeUsdAmount;
    private final String areaCode;
    private final String bidPx;
    private final String chainIndex;
    private final long createTime;
    private final String errMsg;
    private final ExternalFeeInfo externalFeeInfo;
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
    private final int status;
    private final Long timeToCancel;
    private final String to;
    private final String toTokenAmount;
    private final Integer toTokenDecimal;
    private final String toTokenSymbol;
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
    private final Integer userFundStatus;

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
    public final String component35() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component37() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component39() {
        return this.userFundStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.acquireLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.acquireName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExternalFeeInfo component42() {
        return this.externalFeeInfo;
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
    public final OrderDetailApiModel copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, int i2, String str12, @NotNull String str13, @NotNull String str14, String str15, @NotNull String str16, int i3, String str17, String str18, int i4, String str19, Integer num3, String str20, long j, Long l, int i5, @NotNull String str21, @NotNull String str22, String str23, String str24, String str25, String str26, Integer num4, String str27, Integer num5, String str28, String str29, ExternalFeeInfo externalFeeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        return new OrderDetailApiModel(str, str2, str3, str4, str5, i, str6, str7, str8, num, str9, str10, num2, str11, i2, str12, str13, str14, str15, str16, i3, str17, str18, i4, str19, num3, str20, j, l, i5, str21, str22, str23, str24, str25, str26, num4, str27, num5, str28, str29, externalFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailApiModel)) {
            return false;
        }
        OrderDetailApiModel orderDetailApiModel = (OrderDetailApiModel) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) orderDetailApiModel.orderId) && Intrinsics.EZpvd((Object) this.parentOrderId, (Object) orderDetailApiModel.parentOrderId) && Intrinsics.EZpvd((Object) this.uopHash, (Object) orderDetailApiModel.uopHash) && Intrinsics.EZpvd((Object) this.txHash, (Object) orderDetailApiModel.txHash) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) orderDetailApiModel.chainIndex) && this.orderType == orderDetailApiModel.orderType && Intrinsics.EZpvd((Object) this.merchantId, (Object) orderDetailApiModel.merchantId) && Intrinsics.EZpvd((Object) this.productCode, (Object) orderDetailApiModel.productCode) && Intrinsics.EZpvd((Object) this.from, (Object) orderDetailApiModel.from) && Intrinsics.EZpvd(this.fromType, orderDetailApiModel.fromType) && Intrinsics.EZpvd((Object) this.to, (Object) orderDetailApiModel.to) && Intrinsics.EZpvd((Object) this.areaCode, (Object) orderDetailApiModel.areaCode) && Intrinsics.EZpvd(this.toType, orderDetailApiModel.toType) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) orderDetailApiModel.tokenAmount) && this.tokenDecimal == orderDetailApiModel.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenUsdAmount, (Object) orderDetailApiModel.tokenUsdAmount) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) orderDetailApiModel.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) orderDetailApiModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) orderDetailApiModel.tokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) orderDetailApiModel.feeTokenSymbol) && this.feeTokenDecimal == orderDetailApiModel.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeTokenAmount, (Object) orderDetailApiModel.feeTokenAmount) && Intrinsics.EZpvd((Object) this.feeTokenUsdAmount, (Object) orderDetailApiModel.feeTokenUsdAmount) && this.status == orderDetailApiModel.status && Intrinsics.EZpvd((Object) this.errMsg, (Object) orderDetailApiModel.errMsg) && Intrinsics.EZpvd(this.failedType, orderDetailApiModel.failedType) && Intrinsics.EZpvd((Object) this.transferComment, (Object) orderDetailApiModel.transferComment) && this.createTime == orderDetailApiModel.createTime && Intrinsics.EZpvd(this.timeToCancel, orderDetailApiModel.timeToCancel) && this.gasPayType == orderDetailApiModel.gasPayType && Intrinsics.EZpvd((Object) this.networkName, (Object) orderDetailApiModel.networkName) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) orderDetailApiModel.networkLogo) && Intrinsics.EZpvd((Object) this.activationFeeTokenAmount, (Object) orderDetailApiModel.activationFeeTokenAmount) && Intrinsics.EZpvd((Object) this.activationFeeUsdAmount, (Object) orderDetailApiModel.activationFeeUsdAmount) && Intrinsics.EZpvd((Object) this.bidPx, (Object) orderDetailApiModel.bidPx) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) orderDetailApiModel.toTokenAmount) && Intrinsics.EZpvd(this.toTokenDecimal, orderDetailApiModel.toTokenDecimal) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) orderDetailApiModel.toTokenSymbol) && Intrinsics.EZpvd(this.userFundStatus, orderDetailApiModel.userFundStatus) && Intrinsics.EZpvd((Object) this.acquireLogo, (Object) orderDetailApiModel.acquireLogo) && Intrinsics.EZpvd((Object) this.acquireName, (Object) orderDetailApiModel.acquireName) && Intrinsics.EZpvd(this.externalFeeInfo, orderDetailApiModel.externalFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcquireLogo() {
        return this.acquireLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAcquireName() {
        return this.acquireName;
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
    public final String getBidPx() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public String getChainIndex() {
        return this.chainIndex;
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
    public final ExternalFeeInfo getExternalFeeInfo() {
        return this.externalFeeInfo;
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
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getToTokenDecimal() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
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
    public final Integer getUserFundStatus() {
        return this.userFundStatus;
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
        String str8 = this.tokenAmount;
        int iHashCode15 = str8 == null ? 0 : str8.hashCode();
        int iHashCode16 = Integer.hashCode(this.tokenDecimal);
        String str9 = this.tokenUsdAmount;
        int iHashCode17 = str9 == null ? 0 : str9.hashCode();
        int iHashCode18 = this.tokenLogo.hashCode();
        int iHashCode19 = this.tokenSymbol.hashCode();
        String str10 = this.tokenAddress;
        int iHashCode20 = str10 == null ? 0 : str10.hashCode();
        int iHashCode21 = this.feeTokenSymbol.hashCode();
        int iHashCode22 = Integer.hashCode(this.feeTokenDecimal);
        String str11 = this.feeTokenAmount;
        int iHashCode23 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.feeTokenUsdAmount;
        int iHashCode24 = str12 == null ? 0 : str12.hashCode();
        int iHashCode25 = Integer.hashCode(this.status);
        String str13 = this.errMsg;
        int iHashCode26 = str13 == null ? 0 : str13.hashCode();
        Integer num3 = this.failedType;
        int iHashCode27 = num3 == null ? 0 : num3.hashCode();
        String str14 = this.transferComment;
        if (str14 == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = str14.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode28 = Long.hashCode(this.createTime);
        Long l = this.timeToCancel;
        int iHashCode29 = l == null ? 0 : l.hashCode();
        int iHashCode30 = Integer.hashCode(this.gasPayType);
        int iHashCode31 = this.networkName.hashCode();
        int iHashCode32 = this.networkLogo.hashCode();
        String str15 = this.activationFeeTokenAmount;
        int iHashCode33 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.activationFeeUsdAmount;
        int iHashCode34 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.bidPx;
        int iHashCode35 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.toTokenAmount;
        int iHashCode36 = str18 == null ? 0 : str18.hashCode();
        Integer num4 = this.toTokenDecimal;
        int iHashCode37 = num4 == null ? 0 : num4.hashCode();
        String str19 = this.toTokenSymbol;
        int iHashCode38 = str19 == null ? 0 : str19.hashCode();
        Integer num5 = this.userFundStatus;
        int iHashCode39 = num5 == null ? 0 : num5.hashCode();
        String str20 = this.acquireLogo;
        int iHashCode40 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.acquireName;
        int iHashCode41 = str21 == null ? 0 : str21.hashCode();
        ExternalFeeInfo externalFeeInfo = this.externalFeeInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + (externalFeeInfo == null ? 0 : externalFeeInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderDetailApiModel(orderId=" + this.orderId + ", parentOrderId=" + this.parentOrderId + ", uopHash=" + this.uopHash + ", txHash=" + this.txHash + ", chainIndex=" + this.chainIndex + ", orderType=" + this.orderType + ", merchantId=" + this.merchantId + ", productCode=" + this.productCode + ", from=" + this.from + ", fromType=" + this.fromType + ", to=" + this.to + ", areaCode=" + this.areaCode + ", toType=" + this.toType + ", tokenAmount=" + this.tokenAmount + ", tokenDecimal=" + this.tokenDecimal + ", tokenUsdAmount=" + this.tokenUsdAmount + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenAmount=" + this.feeTokenAmount + ", feeTokenUsdAmount=" + this.feeTokenUsdAmount + ", status=" + this.status + ", errMsg=" + this.errMsg + ", failedType=" + this.failedType + ", transferComment=" + this.transferComment + ", createTime=" + this.createTime + ", timeToCancel=" + this.timeToCancel + ", gasPayType=" + this.gasPayType + ", networkName=" + this.networkName + ", networkLogo=" + this.networkLogo + ", activationFeeTokenAmount=" + this.activationFeeTokenAmount + ", activationFeeUsdAmount=" + this.activationFeeUsdAmount + ", bidPx=" + this.bidPx + ", toTokenAmount=" + this.toTokenAmount + ", toTokenDecimal=" + this.toTokenDecimal + ", toTokenSymbol=" + this.toTokenSymbol + ", userFundStatus=" + this.userFundStatus + ", acquireLogo=" + this.acquireLogo + ", acquireName=" + this.acquireName + ", externalFeeInfo=" + this.externalFeeInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.OrderDetailApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderDetailApiModel> serializer() {
            return OrderDetailApiModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderDetailApiModel(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, int i4, String str12, String str13, String str14, String str15, String str16, int i5, String str17, String str18, int i6, String str19, Integer num3, String str20, long j, Long l, int i7, String str21, String str22, String str23, String str24, String str25, String str26, Integer num4, String str27, Integer num5, String str28, String str29, ExternalFeeInfo externalFeeInfo, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (-385882637 != (i & (-385882637))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{-385882637, 0}, OrderDetailApiModel$$serializer.INSTANCE.getDescriptor());
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
        if ((i2 & 4) == 0) {
            this.bidPx = null;
        } else {
            this.bidPx = str25;
        }
        if ((i2 & 8) == 0) {
            this.toTokenAmount = null;
        } else {
            this.toTokenAmount = str26;
        }
        if ((i2 & 16) == 0) {
            this.toTokenDecimal = null;
        } else {
            this.toTokenDecimal = num4;
        }
        if ((i2 & 32) == 0) {
            this.toTokenSymbol = null;
        } else {
            this.toTokenSymbol = str27;
        }
        if ((i2 & 64) == 0) {
            this.userFundStatus = null;
        } else {
            this.userFundStatus = num5;
        }
        if ((i2 & 128) == 0) {
            this.acquireLogo = null;
        } else {
            this.acquireLogo = str28;
        }
        if ((i2 & 256) == 0) {
            this.acquireName = null;
        } else {
            this.acquireName = str29;
        }
        if ((i2 & 512) == 0) {
            this.externalFeeInfo = null;
        } else {
            this.externalFeeInfo = externalFeeInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OrderDetailApiModel orderDetailApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer failedType;
        BaseOrderDetailApiModel.write$Self(orderDetailApiModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, orderDetailApiModel.getOrderId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, orderDetailApiModel.getParentOrderId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || orderDetailApiModel.getUopHash() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, orderDetailApiModel.getUopHash());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || orderDetailApiModel.getTxHash() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, orderDetailApiModel.getTxHash());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, orderDetailApiModel.getChainIndex());
        compositeEncoder.encodeIntElement(serialDescriptor, 5, orderDetailApiModel.getOrderType());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, orderDetailApiModel.getMerchantId());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, orderDetailApiModel.getProductCode());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, orderDetailApiModel.getFrom());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || orderDetailApiModel.getFromType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, orderDetailApiModel.getFromType());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, orderDetailApiModel.getTo());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || orderDetailApiModel.getAreaCode() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, orderDetailApiModel.getAreaCode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || orderDetailApiModel.getToType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, orderDetailApiModel.getToType());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, orderDetailApiModel.getTokenAmount());
        compositeEncoder.encodeIntElement(serialDescriptor, 14, orderDetailApiModel.getTokenDecimal());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, orderDetailApiModel.getTokenUsdAmount());
        compositeEncoder.encodeStringElement(serialDescriptor, 16, orderDetailApiModel.getTokenLogo());
        compositeEncoder.encodeStringElement(serialDescriptor, 17, orderDetailApiModel.getTokenSymbol());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, orderDetailApiModel.getTokenAddress());
        compositeEncoder.encodeStringElement(serialDescriptor, 19, orderDetailApiModel.getFeeTokenSymbol());
        compositeEncoder.encodeIntElement(serialDescriptor, 20, orderDetailApiModel.getFeeTokenDecimal());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, orderDetailApiModel.getFeeTokenAmount());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, orderDetailApiModel.getFeeTokenUsdAmount());
        compositeEncoder.encodeIntElement(serialDescriptor, 23, orderDetailApiModel.getStatus());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || orderDetailApiModel.getErrMsg() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, orderDetailApiModel.getErrMsg());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || (failedType = orderDetailApiModel.getFailedType()) == null || failedType.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, orderDetailApiModel.getFailedType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || orderDetailApiModel.getTransferComment() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, orderDetailApiModel.getTransferComment());
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 27, orderDetailApiModel.getCreateTime());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || orderDetailApiModel.getTimeToCancel() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, LongSerializer.INSTANCE, orderDetailApiModel.getTimeToCancel());
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 29, orderDetailApiModel.getGasPayType());
        compositeEncoder.encodeStringElement(serialDescriptor, 30, orderDetailApiModel.getNetworkName());
        compositeEncoder.encodeStringElement(serialDescriptor, 31, orderDetailApiModel.getNetworkLogo());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) orderDetailApiModel.getActivationFeeTokenAmount(), (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, stringSerializer, orderDetailApiModel.getActivationFeeTokenAmount());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) orderDetailApiModel.getActivationFeeUsdAmount(), (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, stringSerializer, orderDetailApiModel.getActivationFeeUsdAmount());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || orderDetailApiModel.bidPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, stringSerializer, orderDetailApiModel.bidPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || orderDetailApiModel.toTokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, stringSerializer, orderDetailApiModel.toTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || orderDetailApiModel.toTokenDecimal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, IntSerializer.INSTANCE, orderDetailApiModel.toTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || orderDetailApiModel.toTokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, stringSerializer, orderDetailApiModel.toTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || orderDetailApiModel.userFundStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, IntSerializer.INSTANCE, orderDetailApiModel.userFundStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || orderDetailApiModel.acquireLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, stringSerializer, orderDetailApiModel.acquireLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || orderDetailApiModel.acquireName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, stringSerializer, orderDetailApiModel.acquireName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) && orderDetailApiModel.externalFeeInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, ExternalFeeInfo$$serializer.INSTANCE, orderDetailApiModel.externalFeeInfo);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e8: CONSTRUCTOR 
  (r49v0 java.lang.String)
  (r50v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r92v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r92v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (r53v0 java.lang.String)
  (r54v0 int)
  (r55v0 java.lang.String)
  (r56v0 java.lang.String)
  (r57v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r92v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r58v0 java.lang.Integer))
  (r59v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r92v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r92v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r61v0 java.lang.Integer))
  (r62v0 java.lang.String)
  (r63v0 int)
  (r64v0 java.lang.String)
  (r65v0 java.lang.String)
  (r66v0 java.lang.String)
  (r67v0 java.lang.String)
  (r68v0 java.lang.String)
  (r69v0 int)
  (r70v0 java.lang.String)
  (r71v0 java.lang.String)
  (r72v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (16777216 int) & (r92v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r73v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003b: ARITH (33554432 int) & (r92v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r74v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (67108864 int) & (r92v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r75v0 java.lang.String))
  (r76v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0054: ARITH (r92v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r78v0 java.lang.Long))
  (r79v0 int)
  (r80v0 java.lang.String)
  (r81v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r93v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r93v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r93v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r93v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r85v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0082: ARITH (r93v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r86v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r93v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r87v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0094: ARITH (r93v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r88v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r93v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r93v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r90v0 java.lang.String))
  (wrap:com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo:?: TERNARY null = ((wrap:int:0x00af: ARITH (r93v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo) : (r91v0 com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo):void (m)] (LINE:106) call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.OrderDetailApiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo):void type: THIS */
    public /* synthetic */ OrderDetailApiModel(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, int i2, String str12, String str13, String str14, String str15, String str16, int i3, String str17, String str18, int i4, String str19, Integer num3, String str20, long j, Long l, int i5, String str21, String str22, String str23, String str24, String str25, String str26, Integer num4, String str27, Integer num5, String str28, String str29, ExternalFeeInfo externalFeeInfo, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, str5, i, str6, str7, str8, (i6 & 512) != 0 ? null : num, str9, (i6 & 2048) != 0 ? null : str10, (i6 & 4096) != 0 ? null : num2, str11, i2, str12, str13, str14, str15, str16, i3, str17, str18, i4, (16777216 & i6) != 0 ? null : str19, (33554432 & i6) != 0 ? 0 : num3, (67108864 & i6) != 0 ? null : str20, j, (i6 & 268435456) != 0 ? null : l, i5, str21, str22, (i7 & 1) != 0 ? "0" : str23, (i7 & 2) != 0 ? "0" : str24, (i7 & 4) != 0 ? null : str25, (i7 & 8) != 0 ? null : str26, (i7 & 16) != 0 ? null : num4, (i7 & 32) != 0 ? null : str27, (i7 & 64) != 0 ? null : num5, (i7 & 128) != 0 ? null : str28, (i7 & 256) != 0 ? null : str29, (i7 & 512) != 0 ? null : externalFeeInfo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailApiModel(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, int i2, String str12, @NotNull String str13, @NotNull String str14, String str15, @NotNull String str16, int i3, String str17, String str18, int i4, String str19, Integer num3, String str20, long j, Long l, int i5, @NotNull String str21, @NotNull String str22, String str23, String str24, String str25, String str26, Integer num4, String str27, Integer num5, String str28, String str29, ExternalFeeInfo externalFeeInfo) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
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
        this.bidPx = str25;
        this.toTokenAmount = str26;
        this.toTokenDecimal = num4;
        this.toTokenSymbol = str27;
        this.userFundStatus = num5;
        this.acquireLogo = str28;
        this.acquireName = str29;
        this.externalFeeInfo = externalFeeInfo;
    }

    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public C31337lsC applyExtraFields(@NotNull C31337lsC c31337lsC) {
        Intrinsics.checkNotNullParameter(c31337lsC, "");
        return c31337lsC.EZpvd(((-1) & 1) != 0 ? c31337lsC.hDKMBd : null, ((-1) & 2) != 0 ? c31337lsC.AuCTelauCTel : null, ((-1) & 4) != 0 ? c31337lsC.QOLQEE : null, ((-1) & 8) != 0 ? c31337lsC.djBIcL : null, ((-1) & 16) != 0 ? c31337lsC.iwGUEr : null, ((-1) & 32) != 0 ? c31337lsC.fIwbmz : null, ((-1) & 64) != 0 ? c31337lsC.fJNWhG : null, ((-1) & 128) != 0 ? c31337lsC.wlaJM : null, ((-1) & 256) != 0 ? c31337lsC.copydefault : null, ((-1) & 512) != 0 ? c31337lsC.AwvSrB : null, ((-1) & 1024) != 0 ? c31337lsC.gHZMYf : null, ((-1) & 2048) != 0 ? c31337lsC.AxsJAY : 0, ((-1) & 4096) != 0 ? c31337lsC.QKVWgx : null, ((-1) & 8192) != 0 ? c31337lsC.zuBGHE : null, ((-1) & 16384) != 0 ? c31337lsC.OcIXYQ : null, ((-1) & 32768) != 0 ? c31337lsC.sSMYrx : null, ((-1) & 65536) != 0 ? c31337lsC.DbNXlk : null, ((-1) & 131072) != 0 ? c31337lsC.isConnected : 0, ((-1) & 262144) != 0 ? c31337lsC.fARcdN : null, ((-1) & 524288) != 0 ? c31337lsC.ejfBZ : null, ((-1) & 1048576) != 0 ? c31337lsC.AubY : null, ((-1) & 2097152) != 0 ? c31337lsC.AhwBna : null, ((-1) & 4194304) != 0 ? c31337lsC.AkhnZx : null, ((-1) & 8388608) != 0 ? c31337lsC.ORxRYg : null, ((-1) & 16777216) != 0 ? c31337lsC.AYXKKw : 0L, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? c31337lsC.zsXlph : 0L, ((-1) & 67108864) != 0 ? c31337lsC.AuCTel : null, (134217728 & (-1)) != 0 ? c31337lsC.getNewProxyInstance : null, ((-1) & 268435456) != 0 ? c31337lsC.uzCIH : null, ((-1) & 536870912) != 0 ? c31337lsC.KWHzl : null, ((-1) & 1073741824) != 0 ? c31337lsC.OLrzqt : null, ((-1) & Integer.MIN_VALUE) != 0 ? c31337lsC.values : null, (125 & 1) != 0 ? c31337lsC.valueOf : null, (125 & 2) != 0 ? c31337lsC.EZpvd : new C2BExt(this.toTokenAmount, this.toTokenDecimal, this.toTokenSymbol, this.bidPx, UserFundStatus.Companion.OLrzqt(this.userFundStatus), this.acquireLogo, this.acquireName, this.externalFeeInfo), (125 & 4) != 0 ? c31337lsC.getFieldNames : null, (125 & 8) != 0 ? c31337lsC.zLjUOn : null, (125 & 16) != 0 ? c31337lsC.AEQbTJ : null, (125 & 32) != 0 ? c31337lsC.gEmmrt : null, (125 & 64) != 0 ? c31337lsC.fetchVPNInfo : null);
    }
}
