package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.okinc.business.web3pay.lib.core.model.FromToType;
import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo;
import com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit;
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
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C31337lsC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CardAuthOrderDetailApiModel extends BaseOrderDetailApiModel {
    private final String activationFeeTokenAmount;
    private final String activationFeeUsdAmount;
    private final String areaCode;
    private final Integer authorizeType;
    private final String chainIndex;
    private final long createTime;
    private final String errMsg;
    private final JsonObject extInfo;
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
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

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
        return this.feeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.feeTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.feeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.feeTokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component22() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component23() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.errMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.transferComment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component26() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component27() {
        return this.timeToCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component28() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.activationFeeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.activationFeeUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component33() {
        return this.authorizeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component34() {
        return this.extInfo;
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
    public final CardAuthOrderDetailApiModel copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, Integer num, String str7, String str8, Integer num2, @NotNull String str9, int i2, @NotNull String str10, @NotNull String str11, @NotNull String str12, String str13, @NotNull String str14, int i3, @NotNull String str15, @NotNull String str16, int i4, Integer num3, String str17, String str18, long j, Long l, int i5, @NotNull String str19, @NotNull String str20, String str21, String str22, Integer num4, JsonObject jsonObject, String str23, String str24) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        return new CardAuthOrderDetailApiModel(str, str2, str3, str4, str5, i, str6, num, str7, str8, num2, str9, i2, str10, str11, str12, str13, str14, i3, str15, str16, i4, num3, str17, str18, j, l, i5, str19, str20, str21, str22, num4, jsonObject, str23, str24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardAuthOrderDetailApiModel)) {
            return false;
        }
        CardAuthOrderDetailApiModel cardAuthOrderDetailApiModel = (CardAuthOrderDetailApiModel) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) cardAuthOrderDetailApiModel.orderId) && Intrinsics.EZpvd((Object) this.parentOrderId, (Object) cardAuthOrderDetailApiModel.parentOrderId) && Intrinsics.EZpvd((Object) this.uopHash, (Object) cardAuthOrderDetailApiModel.uopHash) && Intrinsics.EZpvd((Object) this.txHash, (Object) cardAuthOrderDetailApiModel.txHash) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) cardAuthOrderDetailApiModel.chainIndex) && this.orderType == cardAuthOrderDetailApiModel.orderType && Intrinsics.EZpvd((Object) this.from, (Object) cardAuthOrderDetailApiModel.from) && Intrinsics.EZpvd(this.fromType, cardAuthOrderDetailApiModel.fromType) && Intrinsics.EZpvd((Object) this.to, (Object) cardAuthOrderDetailApiModel.to) && Intrinsics.EZpvd((Object) this.areaCode, (Object) cardAuthOrderDetailApiModel.areaCode) && Intrinsics.EZpvd(this.toType, cardAuthOrderDetailApiModel.toType) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) cardAuthOrderDetailApiModel.tokenAmount) && this.tokenDecimal == cardAuthOrderDetailApiModel.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenUsdAmount, (Object) cardAuthOrderDetailApiModel.tokenUsdAmount) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) cardAuthOrderDetailApiModel.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) cardAuthOrderDetailApiModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) cardAuthOrderDetailApiModel.tokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) cardAuthOrderDetailApiModel.feeTokenSymbol) && this.feeTokenDecimal == cardAuthOrderDetailApiModel.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeTokenAmount, (Object) cardAuthOrderDetailApiModel.feeTokenAmount) && Intrinsics.EZpvd((Object) this.feeTokenUsdAmount, (Object) cardAuthOrderDetailApiModel.feeTokenUsdAmount) && this.status == cardAuthOrderDetailApiModel.status && Intrinsics.EZpvd(this.failedType, cardAuthOrderDetailApiModel.failedType) && Intrinsics.EZpvd((Object) this.errMsg, (Object) cardAuthOrderDetailApiModel.errMsg) && Intrinsics.EZpvd((Object) this.transferComment, (Object) cardAuthOrderDetailApiModel.transferComment) && this.createTime == cardAuthOrderDetailApiModel.createTime && Intrinsics.EZpvd(this.timeToCancel, cardAuthOrderDetailApiModel.timeToCancel) && this.gasPayType == cardAuthOrderDetailApiModel.gasPayType && Intrinsics.EZpvd((Object) this.networkName, (Object) cardAuthOrderDetailApiModel.networkName) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) cardAuthOrderDetailApiModel.networkLogo) && Intrinsics.EZpvd((Object) this.activationFeeTokenAmount, (Object) cardAuthOrderDetailApiModel.activationFeeTokenAmount) && Intrinsics.EZpvd((Object) this.activationFeeUsdAmount, (Object) cardAuthOrderDetailApiModel.activationFeeUsdAmount) && Intrinsics.EZpvd(this.authorizeType, cardAuthOrderDetailApiModel.authorizeType) && Intrinsics.EZpvd(this.extInfo, cardAuthOrderDetailApiModel.extInfo) && Intrinsics.EZpvd((Object) this.merchantId, (Object) cardAuthOrderDetailApiModel.merchantId) && Intrinsics.EZpvd((Object) this.productCode, (Object) cardAuthOrderDetailApiModel.productCode);
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
    public final Integer getAuthorizeType() {
        return this.authorizeType;
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
    public final JsonObject getExtInfo() {
        return this.extInfo;
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
        int iHashCode19 = this.feeTokenSymbol.hashCode();
        int iHashCode20 = Integer.hashCode(this.feeTokenDecimal);
        int iHashCode21 = this.feeTokenAmount.hashCode();
        int iHashCode22 = this.feeTokenUsdAmount.hashCode();
        int iHashCode23 = Integer.hashCode(this.status);
        Integer num3 = this.failedType;
        int iHashCode24 = num3 == null ? 0 : num3.hashCode();
        String str7 = this.errMsg;
        int iHashCode25 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.transferComment;
        if (str8 == null) {
            i = iHashCode14;
            i2 = iHashCode15;
            iHashCode = 0;
        } else {
            iHashCode = str8.hashCode();
            i = iHashCode14;
            i2 = iHashCode15;
        }
        int iHashCode26 = Long.hashCode(this.createTime);
        Long l = this.timeToCancel;
        int iHashCode27 = l == null ? 0 : l.hashCode();
        int iHashCode28 = Integer.hashCode(this.gasPayType);
        int iHashCode29 = this.networkName.hashCode();
        int iHashCode30 = this.networkLogo.hashCode();
        String str9 = this.activationFeeTokenAmount;
        int iHashCode31 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.activationFeeUsdAmount;
        int iHashCode32 = str10 == null ? 0 : str10.hashCode();
        Integer num4 = this.authorizeType;
        int iHashCode33 = num4 == null ? 0 : num4.hashCode();
        JsonObject jsonObject = this.extInfo;
        int iHashCode34 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str11 = this.merchantId;
        int iHashCode35 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.productCode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + (str12 == null ? 0 : str12.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardAuthOrderDetailApiModel(orderId=" + this.orderId + ", parentOrderId=" + this.parentOrderId + ", uopHash=" + this.uopHash + ", txHash=" + this.txHash + ", chainIndex=" + this.chainIndex + ", orderType=" + this.orderType + ", from=" + this.from + ", fromType=" + this.fromType + ", to=" + this.to + ", areaCode=" + this.areaCode + ", toType=" + this.toType + ", tokenAmount=" + this.tokenAmount + ", tokenDecimal=" + this.tokenDecimal + ", tokenUsdAmount=" + this.tokenUsdAmount + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenAmount=" + this.feeTokenAmount + ", feeTokenUsdAmount=" + this.feeTokenUsdAmount + ", status=" + this.status + ", failedType=" + this.failedType + ", errMsg=" + this.errMsg + ", transferComment=" + this.transferComment + ", createTime=" + this.createTime + ", timeToCancel=" + this.timeToCancel + ", gasPayType=" + this.gasPayType + ", networkName=" + this.networkName + ", networkLogo=" + this.networkLogo + ", activationFeeTokenAmount=" + this.activationFeeTokenAmount + ", activationFeeUsdAmount=" + this.activationFeeUsdAmount + ", authorizeType=" + this.authorizeType + ", extInfo=" + this.extInfo + ", merchantId=" + this.merchantId + ", productCode=" + this.productCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.CardAuthOrderDetailApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CardAuthOrderDetailApiModel> serializer() {
            return CardAuthOrderDetailApiModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardAuthOrderDetailApiModel(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, Integer num, String str7, String str8, Integer num2, String str9, int i4, String str10, String str11, String str12, String str13, String str14, int i5, String str15, String str16, int i6, Integer num3, String str17, String str18, long j, Long l, int i7, String str19, String str20, String str21, String str22, Integer num4, JsonObject jsonObject, String str23, String str24, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((977271155 != (i & 977271155)) | (13 != (i2 & 13))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{977271155, 13}, CardAuthOrderDetailApiModel$$serializer.INSTANCE.getDescriptor());
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
        this.from = str6;
        if ((i & 128) == 0) {
            this.fromType = null;
        } else {
            this.fromType = num;
        }
        this.to = str7;
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
        this.tokenAddress = str13;
        this.feeTokenSymbol = str14;
        this.feeTokenDecimal = i5;
        this.feeTokenAmount = str15;
        this.feeTokenUsdAmount = str16;
        this.status = i6;
        this.failedType = (4194304 & i) == 0 ? 0 : num3;
        if ((8388608 & i) == 0) {
            this.errMsg = null;
        } else {
            this.errMsg = str17;
        }
        if ((16777216 & i) == 0) {
            this.transferComment = null;
        } else {
            this.transferComment = str18;
        }
        this.createTime = j;
        if ((67108864 & i) == 0) {
            this.timeToCancel = null;
        } else {
            this.timeToCancel = l;
        }
        this.gasPayType = i7;
        this.networkName = str19;
        this.networkLogo = str20;
        if ((1073741824 & i) == 0) {
            this.activationFeeTokenAmount = "0";
        } else {
            this.activationFeeTokenAmount = str21;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.activationFeeUsdAmount = "0";
        } else {
            this.activationFeeUsdAmount = str22;
        }
        this.authorizeType = num4;
        if ((i2 & 2) == 0) {
            this.extInfo = null;
        } else {
            this.extInfo = jsonObject;
        }
        this.merchantId = str23;
        this.productCode = str24;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel.write$Self(com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CardAuthOrderDetailApiModel cardAuthOrderDetailApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer failedType;
        BaseOrderDetailApiModel.write$Self(cardAuthOrderDetailApiModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cardAuthOrderDetailApiModel.getOrderId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cardAuthOrderDetailApiModel.getParentOrderId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cardAuthOrderDetailApiModel.getUopHash() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cardAuthOrderDetailApiModel.getUopHash());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cardAuthOrderDetailApiModel.getTxHash() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cardAuthOrderDetailApiModel.getTxHash());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, cardAuthOrderDetailApiModel.getChainIndex());
        compositeEncoder.encodeIntElement(serialDescriptor, 5, cardAuthOrderDetailApiModel.getOrderType());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, cardAuthOrderDetailApiModel.getFrom());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || cardAuthOrderDetailApiModel.getFromType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, cardAuthOrderDetailApiModel.getFromType());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, cardAuthOrderDetailApiModel.getTo());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || cardAuthOrderDetailApiModel.getAreaCode() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, cardAuthOrderDetailApiModel.getAreaCode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || cardAuthOrderDetailApiModel.getToType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, cardAuthOrderDetailApiModel.getToType());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, cardAuthOrderDetailApiModel.getTokenAmount());
        compositeEncoder.encodeIntElement(serialDescriptor, 12, cardAuthOrderDetailApiModel.getTokenDecimal());
        compositeEncoder.encodeStringElement(serialDescriptor, 13, cardAuthOrderDetailApiModel.getTokenUsdAmount());
        compositeEncoder.encodeStringElement(serialDescriptor, 14, cardAuthOrderDetailApiModel.getTokenLogo());
        compositeEncoder.encodeStringElement(serialDescriptor, 15, cardAuthOrderDetailApiModel.getTokenSymbol());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, cardAuthOrderDetailApiModel.getTokenAddress());
        compositeEncoder.encodeStringElement(serialDescriptor, 17, cardAuthOrderDetailApiModel.getFeeTokenSymbol());
        compositeEncoder.encodeIntElement(serialDescriptor, 18, cardAuthOrderDetailApiModel.getFeeTokenDecimal());
        compositeEncoder.encodeStringElement(serialDescriptor, 19, cardAuthOrderDetailApiModel.getFeeTokenAmount());
        compositeEncoder.encodeStringElement(serialDescriptor, 20, cardAuthOrderDetailApiModel.getFeeTokenUsdAmount());
        compositeEncoder.encodeIntElement(serialDescriptor, 21, cardAuthOrderDetailApiModel.getStatus());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || (failedType = cardAuthOrderDetailApiModel.getFailedType()) == null || failedType.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, IntSerializer.INSTANCE, cardAuthOrderDetailApiModel.getFailedType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || cardAuthOrderDetailApiModel.getErrMsg() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, cardAuthOrderDetailApiModel.getErrMsg());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || cardAuthOrderDetailApiModel.getTransferComment() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, cardAuthOrderDetailApiModel.getTransferComment());
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 25, cardAuthOrderDetailApiModel.getCreateTime());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || cardAuthOrderDetailApiModel.getTimeToCancel() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, LongSerializer.INSTANCE, cardAuthOrderDetailApiModel.getTimeToCancel());
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 27, cardAuthOrderDetailApiModel.getGasPayType());
        compositeEncoder.encodeStringElement(serialDescriptor, 28, cardAuthOrderDetailApiModel.getNetworkName());
        compositeEncoder.encodeStringElement(serialDescriptor, 29, cardAuthOrderDetailApiModel.getNetworkLogo());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) cardAuthOrderDetailApiModel.getActivationFeeTokenAmount(), (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, stringSerializer, cardAuthOrderDetailApiModel.getActivationFeeTokenAmount());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) cardAuthOrderDetailApiModel.getActivationFeeUsdAmount(), (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, stringSerializer, cardAuthOrderDetailApiModel.getActivationFeeUsdAmount());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, IntSerializer.INSTANCE, cardAuthOrderDetailApiModel.authorizeType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || cardAuthOrderDetailApiModel.extInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, JsonObjectSerializer.INSTANCE, cardAuthOrderDetailApiModel.extInfo);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, stringSerializer, cardAuthOrderDetailApiModel.getMerchantId());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, stringSerializer, cardAuthOrderDetailApiModel.getProductCode());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a9: CONSTRUCTOR 
  (r42v0 java.lang.String)
  (r43v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r79v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r79v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (r46v0 java.lang.String)
  (r47v0 int)
  (r48v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0013: ARITH (r79v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r49v0 java.lang.Integer))
  (r50v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r79v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r79v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r52v0 java.lang.Integer))
  (r53v0 java.lang.String)
  (r54v0 int)
  (r55v0 java.lang.String)
  (r56v0 java.lang.String)
  (r57v0 java.lang.String)
  (r58v0 java.lang.String)
  (r59v0 java.lang.String)
  (r60v0 int)
  (r61v0 java.lang.String)
  (r62v0 java.lang.String)
  (r63v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (4194304 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r64v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (8388608 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (16777216 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (r67v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0050: ARITH (67108864 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r69v0 java.lang.Long))
  (r70v0 int)
  (r71v0 java.lang.String)
  (r72v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (1073741824 int) & (r79v0 int) A[WRAPPED]) != (0 int)) ? ("0") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r79v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("0") : (r74v0 java.lang.String))
  (r75v0 java.lang.Integer)
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x006e: ARITH (r80v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r76v0 kotlinx.serialization.json.JsonObject))
  (r77v0 java.lang.String)
  (r78v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String):void (m)] (LINE:326) call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.CardAuthOrderDetailApiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CardAuthOrderDetailApiModel(String str, String str2, String str3, String str4, String str5, int i, String str6, Integer num, String str7, String str8, Integer num2, String str9, int i2, String str10, String str11, String str12, String str13, String str14, int i3, String str15, String str16, int i4, Integer num3, String str17, String str18, long j, Long l, int i5, String str19, String str20, String str21, String str22, Integer num4, JsonObject jsonObject, String str23, String str24, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, str5, i, str6, (i6 & 128) != 0 ? null : num, str7, (i6 & 512) != 0 ? null : str8, (i6 & 1024) != 0 ? null : num2, str9, i2, str10, str11, str12, str13, str14, i3, str15, str16, i4, (4194304 & i6) != 0 ? 0 : num3, (8388608 & i6) != 0 ? null : str17, (16777216 & i6) != 0 ? null : str18, j, (67108864 & i6) != 0 ? null : l, i5, str19, str20, (1073741824 & i6) != 0 ? "0" : str21, (i6 & Integer.MIN_VALUE) != 0 ? "0" : str22, num4, (i7 & 2) != 0 ? null : jsonObject, str23, str24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardAuthOrderDetailApiModel(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, Integer num, String str7, String str8, Integer num2, @NotNull String str9, int i2, @NotNull String str10, @NotNull String str11, @NotNull String str12, String str13, @NotNull String str14, int i3, @NotNull String str15, @NotNull String str16, int i4, Integer num3, String str17, String str18, long j, Long l, int i5, @NotNull String str19, @NotNull String str20, String str21, String str22, Integer num4, JsonObject jsonObject, String str23, String str24) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
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
        this.feeTokenSymbol = str14;
        this.feeTokenDecimal = i3;
        this.feeTokenAmount = str15;
        this.feeTokenUsdAmount = str16;
        this.status = i4;
        this.failedType = num3;
        this.errMsg = str17;
        this.transferComment = str18;
        this.createTime = j;
        this.timeToCancel = l;
        this.gasPayType = i5;
        this.networkName = str19;
        this.networkLogo = str20;
        this.activationFeeTokenAmount = str21;
        this.activationFeeUsdAmount = str22;
        this.authorizeType = num4;
        this.extInfo = jsonObject;
        this.merchantId = str23;
        this.productCode = str24;
    }

    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public C31337lsC toDomainModel() {
        String orderId = getOrderId();
        String parentOrderId = getParentOrderId();
        String uopHash = getUopHash();
        String str = (uopHash == null && (uopHash = getTxHash()) == null) ? "" : uopHash;
        String chainIndex = getChainIndex();
        OrderType orderTypeOLrzqt = OrderType.Companion.OLrzqt(getOrderType());
        String from = getFrom();
        String str2 = from == null ? "" : from;
        FromToType.StateListAnimator stateListAnimator = FromToType.Companion;
        FromToType fromToTypeCopydefault = stateListAnimator.copydefault(getFromType());
        String to = getTo();
        if (to == null) {
            to = "";
        }
        String areaCode = getAreaCode();
        FromToType fromToTypeCopydefault2 = stateListAnimator.copydefault(getToType());
        String tokenAmount = getTokenAmount();
        int tokenDecimal = getTokenDecimal();
        String tokenUsdAmount = getTokenUsdAmount();
        String tokenLogo = getTokenLogo();
        String tokenSymbol = getTokenSymbol();
        String tokenAddress = getTokenAddress();
        String feeTokenAmount = getFeeTokenAmount();
        int feeTokenDecimal = getFeeTokenDecimal();
        String feeTokenSymbol = getFeeTokenSymbol();
        String feeTokenUsdAmount = getFeeTokenUsdAmount();
        OrderStatus orderStatusEZpvd = OrderStatus.Companion.EZpvd(getStatus());
        String errMsg = getErrMsg();
        String transferComment = getTransferComment();
        long createTime = getCreateTime();
        Long timeToCancel = getTimeToCancel();
        return new C31337lsC(orderId, parentOrderId, str, chainIndex, orderTypeOLrzqt, str2, fromToTypeCopydefault, to, areaCode, fromToTypeCopydefault2, tokenAmount, tokenDecimal, tokenUsdAmount, tokenLogo, tokenSymbol, tokenAddress, feeTokenAmount, feeTokenDecimal, feeTokenSymbol, feeTokenUsdAmount, orderStatusEZpvd, errMsg, null, transferComment, createTime, timeToCancel != null ? timeToCancel.longValue() : 0L, GasPayType.Companion.copydefault(getGasPayType()), getNetworkName(), getNetworkLogo(), getActivationFeeTokenAmount(), getActivationFeeUsdAmount(), null, null, null, null, null, SaCardAuthLimit.Companion.AEQbTJ(this.authorizeType), SACardOrderExtInfo.Companion.OLrzqt(this.extInfo), null, -2143289344, 79, null);
    }
}
