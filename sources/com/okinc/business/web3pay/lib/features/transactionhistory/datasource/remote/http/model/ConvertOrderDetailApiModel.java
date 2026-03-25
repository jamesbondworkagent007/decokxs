package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.web3pay.lib.core.model.ConvertExt;
import com.okinc.business.web3pay.lib.core.model.ConvertFailedType;
import com.okinc.business.web3pay.lib.core.model.ConvertOrderType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C31337lsC;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ConvertOrderDetailApiModel extends BaseOrderDetailApiModel {
    private final String activationFeeTokenAmount;
    private final String activationFeeUsdAmount;
    private final String areaCode;
    private final String bidPx;
    private final String chainIndex;
    private final int convertOrderType;
    private final boolean convertStageFinished;
    private final long createTime;
    private final String errMsg;
    private final Integer estimatedSeconds;
    private final Integer failedType;
    private final String feeTokenAmount;
    private final int feeTokenDecimal;
    private final String feeTokenSymbol;
    private final String feeTokenUsdAmount;
    private final String from;
    private final String fromChainLogo;
    private final Integer fromType;
    private final int gasPayType;
    private final String merchantId;
    private final String networkLogo;
    private final String networkName;
    private final String orderId;
    private final int orderType;
    private final String parentOrderId;
    private final String productCode;
    private final List<Stage> stages;
    private final int status;
    private final Long timeToCancel;
    private final String to;
    private final String toChainLogo;
    private final String toNetworkName;
    private final String toTokenAddress;
    private final String toTokenAmount;
    private final int toTokenDecimal;
    private final String toTokenLogo;
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
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(Stage$$serializer.INSTANCE), null, null, null};

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
    public final String component26() {
        return this.transferComment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component27() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component28() {
        return this.timeToCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component29() {
        return this.gasPayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.activationFeeTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.activationFeeUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component35() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.toTokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.toNetworkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.fromChainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.toChainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component43() {
        return this.convertStageFinished;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Stage> component44() {
        return this.stages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component45() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component46() {
        return this.convertOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component47() {
        return this.estimatedSeconds;
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
    public final ConvertOrderDetailApiModel copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, @NotNull String str11, int i2, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15, @NotNull String str16, int i3, @NotNull String str17, @NotNull String str18, int i4, String str19, String str20, long j, Long l, int i5, @NotNull String str21, @NotNull String str22, String str23, String str24, @NotNull String str25, int i6, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, boolean z, @NotNull List<Stage> list, Integer num3, int i7, Integer num4) {
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
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ConvertOrderDetailApiModel(str, str2, str3, str4, str5, i, str6, str7, str8, num, str9, str10, num2, str11, i2, str12, str13, str14, str15, str16, i3, str17, str18, i4, str19, str20, j, l, i5, str21, str22, str23, str24, str25, i6, str26, str27, str28, str29, str30, str31, str32, z, list, num3, i7, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertOrderDetailApiModel)) {
            return false;
        }
        ConvertOrderDetailApiModel convertOrderDetailApiModel = (ConvertOrderDetailApiModel) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) convertOrderDetailApiModel.orderId) && Intrinsics.EZpvd((Object) this.parentOrderId, (Object) convertOrderDetailApiModel.parentOrderId) && Intrinsics.EZpvd((Object) this.uopHash, (Object) convertOrderDetailApiModel.uopHash) && Intrinsics.EZpvd((Object) this.txHash, (Object) convertOrderDetailApiModel.txHash) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) convertOrderDetailApiModel.chainIndex) && this.orderType == convertOrderDetailApiModel.orderType && Intrinsics.EZpvd((Object) this.merchantId, (Object) convertOrderDetailApiModel.merchantId) && Intrinsics.EZpvd((Object) this.productCode, (Object) convertOrderDetailApiModel.productCode) && Intrinsics.EZpvd((Object) this.from, (Object) convertOrderDetailApiModel.from) && Intrinsics.EZpvd(this.fromType, convertOrderDetailApiModel.fromType) && Intrinsics.EZpvd((Object) this.to, (Object) convertOrderDetailApiModel.to) && Intrinsics.EZpvd((Object) this.areaCode, (Object) convertOrderDetailApiModel.areaCode) && Intrinsics.EZpvd(this.toType, convertOrderDetailApiModel.toType) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) convertOrderDetailApiModel.tokenAmount) && this.tokenDecimal == convertOrderDetailApiModel.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenUsdAmount, (Object) convertOrderDetailApiModel.tokenUsdAmount) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) convertOrderDetailApiModel.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) convertOrderDetailApiModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) convertOrderDetailApiModel.tokenAddress) && Intrinsics.EZpvd((Object) this.feeTokenSymbol, (Object) convertOrderDetailApiModel.feeTokenSymbol) && this.feeTokenDecimal == convertOrderDetailApiModel.feeTokenDecimal && Intrinsics.EZpvd((Object) this.feeTokenAmount, (Object) convertOrderDetailApiModel.feeTokenAmount) && Intrinsics.EZpvd((Object) this.feeTokenUsdAmount, (Object) convertOrderDetailApiModel.feeTokenUsdAmount) && this.status == convertOrderDetailApiModel.status && Intrinsics.EZpvd((Object) this.errMsg, (Object) convertOrderDetailApiModel.errMsg) && Intrinsics.EZpvd((Object) this.transferComment, (Object) convertOrderDetailApiModel.transferComment) && this.createTime == convertOrderDetailApiModel.createTime && Intrinsics.EZpvd(this.timeToCancel, convertOrderDetailApiModel.timeToCancel) && this.gasPayType == convertOrderDetailApiModel.gasPayType && Intrinsics.EZpvd((Object) this.networkName, (Object) convertOrderDetailApiModel.networkName) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) convertOrderDetailApiModel.networkLogo) && Intrinsics.EZpvd((Object) this.activationFeeTokenAmount, (Object) convertOrderDetailApiModel.activationFeeTokenAmount) && Intrinsics.EZpvd((Object) this.activationFeeUsdAmount, (Object) convertOrderDetailApiModel.activationFeeUsdAmount) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) convertOrderDetailApiModel.toTokenAmount) && this.toTokenDecimal == convertOrderDetailApiModel.toTokenDecimal && Intrinsics.EZpvd((Object) this.toTokenLogo, (Object) convertOrderDetailApiModel.toTokenLogo) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) convertOrderDetailApiModel.toTokenSymbol) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) convertOrderDetailApiModel.toTokenAddress) && Intrinsics.EZpvd((Object) this.toNetworkName, (Object) convertOrderDetailApiModel.toNetworkName) && Intrinsics.EZpvd((Object) this.fromChainLogo, (Object) convertOrderDetailApiModel.fromChainLogo) && Intrinsics.EZpvd((Object) this.toChainLogo, (Object) convertOrderDetailApiModel.toChainLogo) && Intrinsics.EZpvd((Object) this.bidPx, (Object) convertOrderDetailApiModel.bidPx) && this.convertStageFinished == convertOrderDetailApiModel.convertStageFinished && Intrinsics.EZpvd(this.stages, convertOrderDetailApiModel.stages) && Intrinsics.EZpvd(this.failedType, convertOrderDetailApiModel.failedType) && this.convertOrderType == convertOrderDetailApiModel.convertOrderType && Intrinsics.EZpvd(this.estimatedSeconds, convertOrderDetailApiModel.estimatedSeconds);
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
    public final int getConvertOrderType() {
        return this.convertOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getConvertStageFinished() {
        return this.convertStageFinished;
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
    public final Integer getEstimatedSeconds() {
        return this.estimatedSeconds;
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
    public final String getFromChainLogo() {
        return this.fromChainLogo;
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
    public final List<Stage> getStages() {
        return this.stages;
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
    public final String getToChainLogo() {
        return this.toChainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToNetworkName() {
        return this.toNetworkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getToTokenDecimal() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenLogo() {
        return this.toTokenLogo;
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
        int iHashCode27 = Long.hashCode(this.createTime);
        Long l = this.timeToCancel;
        int iHashCode28 = l == null ? 0 : l.hashCode();
        int iHashCode29 = Integer.hashCode(this.gasPayType);
        int iHashCode30 = this.networkName.hashCode();
        int iHashCode31 = this.networkLogo.hashCode();
        String str11 = this.activationFeeTokenAmount;
        int iHashCode32 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.activationFeeUsdAmount;
        int iHashCode33 = str12 == null ? 0 : str12.hashCode();
        int iHashCode34 = this.toTokenAmount.hashCode();
        int iHashCode35 = Integer.hashCode(this.toTokenDecimal);
        int iHashCode36 = this.toTokenLogo.hashCode();
        int iHashCode37 = this.toTokenSymbol.hashCode();
        int iHashCode38 = this.toTokenAddress.hashCode();
        int iHashCode39 = this.toNetworkName.hashCode();
        int iHashCode40 = this.fromChainLogo.hashCode();
        int iHashCode41 = this.toChainLogo.hashCode();
        int iHashCode42 = this.bidPx.hashCode();
        int iHashCode43 = Boolean.hashCode(this.convertStageFinished);
        int iHashCode44 = this.stages.hashCode();
        Integer num3 = this.failedType;
        int iHashCode45 = num3 == null ? 0 : num3.hashCode();
        int iHashCode46 = Integer.hashCode(this.convertOrderType);
        Integer num4 = this.estimatedSeconds;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + (num4 == null ? 0 : num4.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertOrderDetailApiModel(orderId=" + this.orderId + ", parentOrderId=" + this.parentOrderId + ", uopHash=" + this.uopHash + ", txHash=" + this.txHash + ", chainIndex=" + this.chainIndex + ", orderType=" + this.orderType + ", merchantId=" + this.merchantId + ", productCode=" + this.productCode + ", from=" + this.from + ", fromType=" + this.fromType + ", to=" + this.to + ", areaCode=" + this.areaCode + ", toType=" + this.toType + ", tokenAmount=" + this.tokenAmount + ", tokenDecimal=" + this.tokenDecimal + ", tokenUsdAmount=" + this.tokenUsdAmount + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", feeTokenSymbol=" + this.feeTokenSymbol + ", feeTokenDecimal=" + this.feeTokenDecimal + ", feeTokenAmount=" + this.feeTokenAmount + ", feeTokenUsdAmount=" + this.feeTokenUsdAmount + ", status=" + this.status + ", errMsg=" + this.errMsg + ", transferComment=" + this.transferComment + ", createTime=" + this.createTime + ", timeToCancel=" + this.timeToCancel + ", gasPayType=" + this.gasPayType + ", networkName=" + this.networkName + ", networkLogo=" + this.networkLogo + ", activationFeeTokenAmount=" + this.activationFeeTokenAmount + ", activationFeeUsdAmount=" + this.activationFeeUsdAmount + ", toTokenAmount=" + this.toTokenAmount + ", toTokenDecimal=" + this.toTokenDecimal + ", toTokenLogo=" + this.toTokenLogo + ", toTokenSymbol=" + this.toTokenSymbol + ", toTokenAddress=" + this.toTokenAddress + ", toNetworkName=" + this.toNetworkName + ", fromChainLogo=" + this.fromChainLogo + ", toChainLogo=" + this.toChainLogo + ", bidPx=" + this.bidPx + ", convertStageFinished=" + this.convertStageFinished + ", stages=" + this.stages + ", failedType=" + this.failedType + ", convertOrderType=" + this.convertOrderType + ", estimatedSeconds=" + this.estimatedSeconds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertOrderDetailApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertOrderDetailApiModel> serializer() {
            return ConvertOrderDetailApiModel$$serializer.INSTANCE;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ConvertOrderDetailApiModel convertOrderDetailApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer failedType;
        BaseOrderDetailApiModel.write$Self(convertOrderDetailApiModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, convertOrderDetailApiModel.getOrderId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, convertOrderDetailApiModel.getParentOrderId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || convertOrderDetailApiModel.getUopHash() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, convertOrderDetailApiModel.getUopHash());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || convertOrderDetailApiModel.getTxHash() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, convertOrderDetailApiModel.getTxHash());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, convertOrderDetailApiModel.getChainIndex());
        compositeEncoder.encodeIntElement(serialDescriptor, 5, convertOrderDetailApiModel.getOrderType());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, convertOrderDetailApiModel.getMerchantId());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, convertOrderDetailApiModel.getProductCode());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, convertOrderDetailApiModel.getFrom());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || convertOrderDetailApiModel.getFromType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, convertOrderDetailApiModel.getFromType());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, convertOrderDetailApiModel.getTo());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || convertOrderDetailApiModel.getAreaCode() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, convertOrderDetailApiModel.getAreaCode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || convertOrderDetailApiModel.getToType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, convertOrderDetailApiModel.getToType());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, convertOrderDetailApiModel.getTokenAmount());
        compositeEncoder.encodeIntElement(serialDescriptor, 14, convertOrderDetailApiModel.getTokenDecimal());
        compositeEncoder.encodeStringElement(serialDescriptor, 15, convertOrderDetailApiModel.getTokenUsdAmount());
        compositeEncoder.encodeStringElement(serialDescriptor, 16, convertOrderDetailApiModel.getTokenLogo());
        compositeEncoder.encodeStringElement(serialDescriptor, 17, convertOrderDetailApiModel.getTokenSymbol());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, convertOrderDetailApiModel.getTokenAddress());
        compositeEncoder.encodeStringElement(serialDescriptor, 19, convertOrderDetailApiModel.getFeeTokenSymbol());
        compositeEncoder.encodeIntElement(serialDescriptor, 20, convertOrderDetailApiModel.getFeeTokenDecimal());
        compositeEncoder.encodeStringElement(serialDescriptor, 21, convertOrderDetailApiModel.getFeeTokenAmount());
        compositeEncoder.encodeStringElement(serialDescriptor, 22, convertOrderDetailApiModel.getFeeTokenUsdAmount());
        compositeEncoder.encodeIntElement(serialDescriptor, 23, convertOrderDetailApiModel.getStatus());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || convertOrderDetailApiModel.getErrMsg() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, convertOrderDetailApiModel.getErrMsg());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || convertOrderDetailApiModel.getTransferComment() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, convertOrderDetailApiModel.getTransferComment());
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 26, convertOrderDetailApiModel.getCreateTime());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || convertOrderDetailApiModel.getTimeToCancel() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, LongSerializer.INSTANCE, convertOrderDetailApiModel.getTimeToCancel());
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 28, convertOrderDetailApiModel.getGasPayType());
        compositeEncoder.encodeStringElement(serialDescriptor, 29, convertOrderDetailApiModel.getNetworkName());
        compositeEncoder.encodeStringElement(serialDescriptor, 30, convertOrderDetailApiModel.getNetworkLogo());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) convertOrderDetailApiModel.getActivationFeeTokenAmount(), (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, stringSerializer, convertOrderDetailApiModel.getActivationFeeTokenAmount());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) convertOrderDetailApiModel.getActivationFeeUsdAmount(), (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, stringSerializer, convertOrderDetailApiModel.getActivationFeeUsdAmount());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 33, convertOrderDetailApiModel.toTokenAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 34, convertOrderDetailApiModel.toTokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 35, convertOrderDetailApiModel.toTokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 36, convertOrderDetailApiModel.toTokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 37, convertOrderDetailApiModel.toTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 38, convertOrderDetailApiModel.toNetworkName);
        compositeEncoder.encodeStringElement(serialDescriptor, 39, convertOrderDetailApiModel.fromChainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 40, convertOrderDetailApiModel.toChainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 41, convertOrderDetailApiModel.bidPx);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 42, convertOrderDetailApiModel.convertStageFinished);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 43, kSerializerArr[43], convertOrderDetailApiModel.stages);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || (failedType = convertOrderDetailApiModel.getFailedType()) == null || failedType.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, IntSerializer.INSTANCE, convertOrderDetailApiModel.getFailedType());
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 45, convertOrderDetailApiModel.convertOrderType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || (num = convertOrderDetailApiModel.estimatedSeconds) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, IntSerializer.INSTANCE, convertOrderDetailApiModel.estimatedSeconds);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConvertOrderDetailApiModel(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, int i4, String str12, String str13, String str14, String str15, String str16, int i5, String str17, String str18, int i6, String str19, String str20, long j, Long l, int i7, String str21, String str22, String str23, String str24, String str25, int i8, String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z, List list, Integer num3, int i9, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((12286 != (i2 & 12286)) | (1962927603 != (i & 1962927603))) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{1962927603, 12286}, ConvertOrderDetailApiModel$$serializer.INSTANCE.getDescriptor());
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
        if ((33554432 & i) == 0) {
            this.transferComment = null;
        } else {
            this.transferComment = str20;
        }
        this.createTime = j;
        if ((134217728 & i) == 0) {
            this.timeToCancel = null;
        } else {
            this.timeToCancel = l;
        }
        this.gasPayType = i7;
        this.networkName = str21;
        this.networkLogo = str22;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.activationFeeTokenAmount = "0";
        } else {
            this.activationFeeTokenAmount = str23;
        }
        if ((i2 & 1) == 0) {
            this.activationFeeUsdAmount = "0";
        } else {
            this.activationFeeUsdAmount = str24;
        }
        this.toTokenAmount = str25;
        this.toTokenDecimal = i8;
        this.toTokenLogo = str26;
        this.toTokenSymbol = str27;
        this.toTokenAddress = str28;
        this.toNetworkName = str29;
        this.fromChainLogo = str30;
        this.toChainLogo = str31;
        this.bidPx = str32;
        this.convertStageFinished = z;
        this.stages = list;
        if ((i2 & 4096) == 0) {
            this.failedType = 0;
        } else {
            this.failedType = num3;
        }
        this.convertOrderType = i9;
        if ((i2 & 16384) == 0) {
            this.estimatedSeconds = 0;
        } else {
            this.estimatedSeconds = num4;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c5: CONSTRUCTOR 
  (r54v0 java.lang.String)
  (r55v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r102v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r102v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (r58v0 java.lang.String)
  (r59v0 int)
  (r60v0 java.lang.String)
  (r61v0 java.lang.String)
  (r62v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r102v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r63v0 java.lang.Integer))
  (r64v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r102v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r102v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r66v0 java.lang.Integer))
  (r67v0 java.lang.String)
  (r68v0 int)
  (r69v0 java.lang.String)
  (r70v0 java.lang.String)
  (r71v0 java.lang.String)
  (r72v0 java.lang.String)
  (r73v0 java.lang.String)
  (r74v0 int)
  (r75v0 java.lang.String)
  (r76v0 java.lang.String)
  (r77v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (16777216 int) & (r102v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (33554432 int) & (r102v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (r80v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0045: ARITH (134217728 int) & (r102v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r82v0 java.lang.Long))
  (r83v0 int)
  (r84v0 java.lang.String)
  (r85v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r102v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("0") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r103v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r87v0 java.lang.String))
  (r88v0 java.lang.String)
  (r89v0 int)
  (r90v0 java.lang.String)
  (r91v0 java.lang.String)
  (r92v0 java.lang.String)
  (r93v0 java.lang.String)
  (r94v0 java.lang.String)
  (r95v0 java.lang.String)
  (r96v0 java.lang.String)
  (r97v0 boolean)
  (r98v0 java.util.List)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0062: ARITH (r103v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r99v0 java.lang.Integer))
  (r100v0 int)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0070: ARITH (r103v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r101v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.Stage>, java.lang.Integer, int, java.lang.Integer):void (m)] (LINE:218) call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertOrderDetailApiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, long, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.Integer, int, java.lang.Integer):void type: THIS */
    public /* synthetic */ ConvertOrderDetailApiModel(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, String str11, int i2, String str12, String str13, String str14, String str15, String str16, int i3, String str17, String str18, int i4, String str19, String str20, long j, Long l, int i5, String str21, String str22, String str23, String str24, String str25, int i6, String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z, List list, Integer num3, int i7, Integer num4, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, str5, i, str6, str7, str8, (i8 & 512) != 0 ? null : num, str9, (i8 & 2048) != 0 ? null : str10, (i8 & 4096) != 0 ? null : num2, str11, i2, str12, str13, str14, str15, str16, i3, str17, str18, i4, (16777216 & i8) != 0 ? null : str19, (33554432 & i8) != 0 ? null : str20, j, (134217728 & i8) != 0 ? null : l, i5, str21, str22, (i8 & Integer.MIN_VALUE) != 0 ? "0" : str23, (i9 & 1) != 0 ? "0" : str24, str25, i6, str26, str27, str28, str29, str30, str31, str32, z, list, (i9 & 4096) != 0 ? 0 : num3, i7, (i9 & 16384) != 0 ? 0 : num4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertOrderDetailApiModel(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, int i, String str6, String str7, String str8, Integer num, String str9, String str10, Integer num2, @NotNull String str11, int i2, @NotNull String str12, @NotNull String str13, @NotNull String str14, String str15, @NotNull String str16, int i3, @NotNull String str17, @NotNull String str18, int i4, String str19, String str20, long j, Long l, int i5, @NotNull String str21, @NotNull String str22, String str23, String str24, @NotNull String str25, int i6, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, boolean z, @NotNull List<Stage> list, Integer num3, int i7, Integer num4) {
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
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        this.transferComment = str20;
        this.createTime = j;
        this.timeToCancel = l;
        this.gasPayType = i5;
        this.networkName = str21;
        this.networkLogo = str22;
        this.activationFeeTokenAmount = str23;
        this.activationFeeUsdAmount = str24;
        this.toTokenAmount = str25;
        this.toTokenDecimal = i6;
        this.toTokenLogo = str26;
        this.toTokenSymbol = str27;
        this.toTokenAddress = str28;
        this.toNetworkName = str29;
        this.fromChainLogo = str30;
        this.toChainLogo = str31;
        this.bidPx = str32;
        this.convertStageFinished = z;
        this.stages = list;
        this.failedType = num3;
        this.convertOrderType = i7;
        this.estimatedSeconds = num4;
    }

    @Override // com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.BaseOrderDetailApiModel
    public C31337lsC applyExtraFields(@NotNull C31337lsC c31337lsC) {
        Intrinsics.checkNotNullParameter(c31337lsC, "");
        String str = this.toTokenAmount;
        int i = this.toTokenDecimal;
        String str2 = this.toTokenLogo;
        String str3 = this.toTokenSymbol;
        String str4 = this.toTokenAddress;
        String str5 = this.toNetworkName;
        String str6 = this.fromChainLogo;
        String str7 = this.toChainLogo;
        String str8 = this.bidPx;
        List<Stage> list = this.stages;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Stage) it.next()).toConvertStage());
        }
        ConvertFailedType.ActionBar actionBar = ConvertFailedType.Companion;
        Integer failedType = getFailedType();
        ConvertFailedType convertFailedTypeKWHzl = actionBar.KWHzl(failedType != null ? failedType.intValue() : 0);
        if (convertFailedTypeKWHzl == null) {
            convertFailedTypeKWHzl = ConvertFailedType.CONVERT_FAILED_TYPE_UNKNOWN;
        }
        boolean z = this.convertStageFinished;
        ConvertOrderType convertOrderTypeCopydefault = ConvertOrderType.Companion.copydefault(this.convertOrderType);
        if (convertOrderTypeCopydefault == null) {
            convertOrderTypeCopydefault = ConvertOrderType.CONVERT_ORDER_TYPE_CONVERT;
        }
        ConvertOrderType convertOrderType = convertOrderTypeCopydefault;
        Integer num = this.estimatedSeconds;
        return c31337lsC.EZpvd(((-1) & 1) != 0 ? c31337lsC.hDKMBd : null, ((-1) & 2) != 0 ? c31337lsC.AuCTelauCTel : null, ((-1) & 4) != 0 ? c31337lsC.QOLQEE : null, ((-1) & 8) != 0 ? c31337lsC.djBIcL : null, ((-1) & 16) != 0 ? c31337lsC.iwGUEr : null, ((-1) & 32) != 0 ? c31337lsC.fIwbmz : null, ((-1) & 64) != 0 ? c31337lsC.fJNWhG : null, ((-1) & 128) != 0 ? c31337lsC.wlaJM : null, ((-1) & 256) != 0 ? c31337lsC.copydefault : null, ((-1) & 512) != 0 ? c31337lsC.AwvSrB : null, ((-1) & 1024) != 0 ? c31337lsC.gHZMYf : null, ((-1) & 2048) != 0 ? c31337lsC.AxsJAY : 0, ((-1) & 4096) != 0 ? c31337lsC.QKVWgx : null, ((-1) & 8192) != 0 ? c31337lsC.zuBGHE : null, ((-1) & 16384) != 0 ? c31337lsC.OcIXYQ : null, ((-1) & 32768) != 0 ? c31337lsC.sSMYrx : null, ((-1) & 65536) != 0 ? c31337lsC.DbNXlk : null, ((-1) & 131072) != 0 ? c31337lsC.isConnected : 0, ((-1) & 262144) != 0 ? c31337lsC.fARcdN : null, ((-1) & 524288) != 0 ? c31337lsC.ejfBZ : null, ((-1) & 1048576) != 0 ? c31337lsC.AubY : null, ((-1) & 2097152) != 0 ? c31337lsC.AhwBna : null, ((-1) & 4194304) != 0 ? c31337lsC.AkhnZx : null, ((-1) & 8388608) != 0 ? c31337lsC.ORxRYg : null, ((-1) & 16777216) != 0 ? c31337lsC.AYXKKw : 0L, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? c31337lsC.zsXlph : 0L, ((-1) & 67108864) != 0 ? c31337lsC.AuCTel : null, (134217728 & (-1)) != 0 ? c31337lsC.getNewProxyInstance : null, ((-1) & 268435456) != 0 ? c31337lsC.uzCIH : null, ((-1) & 536870912) != 0 ? c31337lsC.KWHzl : null, ((-1) & 1073741824) != 0 ? c31337lsC.OLrzqt : null, ((-1) & Integer.MIN_VALUE) != 0 ? c31337lsC.values : null, (125 & 1) != 0 ? c31337lsC.valueOf : new ConvertExt(str, i, str2, str3, str4, str5, str6, str7, str8, arrayList, convertFailedTypeKWHzl, z, convertOrderType, num != null ? num.intValue() : 0), (125 & 2) != 0 ? c31337lsC.EZpvd : null, (125 & 4) != 0 ? c31337lsC.getFieldNames : null, (125 & 8) != 0 ? c31337lsC.zLjUOn : null, (125 & 16) != 0 ? c31337lsC.AEQbTJ : null, (125 & 32) != 0 ? c31337lsC.gEmmrt : null, (125 & 64) != 0 ? c31337lsC.fetchVPNInfo : null);
    }
}
