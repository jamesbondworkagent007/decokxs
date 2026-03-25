package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderSubStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.ProductCode;
import com.okinc.business.web3pay.lib.core.model.ReceiverType;
import com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo;
import com.okinc.business.web3pay.lib.core.model.SaCardAuthLimit;
import com.okinc.business.web3pay.lib.core.model.UserFundStatus;
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
import o.C31335lsA;
import o.C31340lsF;
import o.C31381lsu;
import o.InterfaceC31382lsv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TransactionOrderApiModel implements InterfaceC31382lsv<C31340lsF> {
    private final String areaCode;
    private final Integer authorizeType;
    private final String chainIndex;
    private final ConvertInfoApiModel convertInfo;
    private final long createTime;
    private final String currencyAmount;
    private final JsonObject extInfo;
    private final Long firstPackTime;
    private final String from;
    private final int gasFeeType;
    private final String merchantId;
    private final String orderId;
    private final int orderType;
    private final String productCode;
    private final Integer receiverType;
    private final int status;
    private final Integer subStatus;
    private final String to;
    private final String toTokenAmount;
    private final Integer toTokenDecimal;
    private final String toTokenSymbol;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenSymbol;
    private final String txHash;
    private final Integer userFundStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component16() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.receiverType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.subStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.gasFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component21() {
        return this.firstPackTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertInfoApiModel component23() {
        return this.convertInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.authorizeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component25() {
        return this.extInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component29() {
        return this.userFundStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionOrderApiModel copy(@NotNull String str, int i, String str2, String str3, @NotNull String str4, int i2, String str5, @NotNull String str6, String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, String str12, int i3, long j, Integer num, Integer num2, int i4, String str13, Long l, @NotNull String str14, ConvertInfoApiModel convertInfoApiModel, Integer num3, JsonObject jsonObject, String str15, Integer num4, String str16, Integer num5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return new TransactionOrderApiModel(str, i, str2, str3, str4, i2, str5, str6, str7, str8, str9, str10, str11, str12, i3, j, num, num2, i4, str13, l, str14, convertInfoApiModel, num3, jsonObject, str15, num4, str16, num5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionOrderApiModel)) {
            return false;
        }
        TransactionOrderApiModel transactionOrderApiModel = (TransactionOrderApiModel) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) transactionOrderApiModel.orderId) && this.orderType == transactionOrderApiModel.orderType && Intrinsics.EZpvd((Object) this.merchantId, (Object) transactionOrderApiModel.merchantId) && Intrinsics.EZpvd((Object) this.productCode, (Object) transactionOrderApiModel.productCode) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) transactionOrderApiModel.tokenSymbol) && this.tokenDecimal == transactionOrderApiModel.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) transactionOrderApiModel.tokenLogo) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) transactionOrderApiModel.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) transactionOrderApiModel.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) transactionOrderApiModel.tokenAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) transactionOrderApiModel.currencyAmount) && Intrinsics.EZpvd((Object) this.from, (Object) transactionOrderApiModel.from) && Intrinsics.EZpvd((Object) this.to, (Object) transactionOrderApiModel.to) && Intrinsics.EZpvd((Object) this.areaCode, (Object) transactionOrderApiModel.areaCode) && this.status == transactionOrderApiModel.status && this.createTime == transactionOrderApiModel.createTime && Intrinsics.EZpvd(this.receiverType, transactionOrderApiModel.receiverType) && Intrinsics.EZpvd(this.subStatus, transactionOrderApiModel.subStatus) && this.gasFeeType == transactionOrderApiModel.gasFeeType && Intrinsics.EZpvd((Object) this.txHash, (Object) transactionOrderApiModel.txHash) && Intrinsics.EZpvd(this.firstPackTime, transactionOrderApiModel.firstPackTime) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) transactionOrderApiModel.tokenCoinTypeNo) && Intrinsics.EZpvd(this.convertInfo, transactionOrderApiModel.convertInfo) && Intrinsics.EZpvd(this.authorizeType, transactionOrderApiModel.authorizeType) && Intrinsics.EZpvd(this.extInfo, transactionOrderApiModel.extInfo) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) transactionOrderApiModel.toTokenAmount) && Intrinsics.EZpvd(this.toTokenDecimal, transactionOrderApiModel.toTokenDecimal) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) transactionOrderApiModel.toTokenSymbol) && Intrinsics.EZpvd(this.userFundStatus, transactionOrderApiModel.userFundStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAuthorizeType() {
        return this.authorizeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertInfoApiModel getConvertInfo() {
        return this.convertInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getExtInfo() {
        return this.extInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFirstPackTime() {
        return this.firstPackTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGasFeeType() {
        return this.gasFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getReceiverType() {
        return this.receiverType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubStatus() {
        return this.subStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
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
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUserFundStatus() {
        return this.userFundStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = Integer.hashCode(this.orderType);
        String str = this.merchantId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.productCode;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = this.tokenSymbol.hashCode();
        int iHashCode6 = Integer.hashCode(this.tokenDecimal);
        String str3 = this.tokenLogo;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        int iHashCode8 = this.chainIndex.hashCode();
        String str4 = this.tokenAddress;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenAmount;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        int iHashCode11 = this.currencyAmount.hashCode();
        int iHashCode12 = this.from.hashCode();
        int iHashCode13 = this.to.hashCode();
        String str6 = this.areaCode;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        int iHashCode15 = Integer.hashCode(this.status);
        int i = iHashCode14;
        int iHashCode16 = Long.hashCode(this.createTime);
        Integer num = this.receiverType;
        int iHashCode17 = num == null ? 0 : num.hashCode();
        Integer num2 = this.subStatus;
        int iHashCode18 = num2 == null ? 0 : num2.hashCode();
        int iHashCode19 = Integer.hashCode(this.gasFeeType);
        String str7 = this.txHash;
        int iHashCode20 = str7 == null ? 0 : str7.hashCode();
        Long l = this.firstPackTime;
        int iHashCode21 = l == null ? 0 : l.hashCode();
        int iHashCode22 = this.tokenCoinTypeNo.hashCode();
        ConvertInfoApiModel convertInfoApiModel = this.convertInfo;
        int iHashCode23 = convertInfoApiModel == null ? 0 : convertInfoApiModel.hashCode();
        Integer num3 = this.authorizeType;
        int iHashCode24 = num3 == null ? 0 : num3.hashCode();
        JsonObject jsonObject = this.extInfo;
        int iHashCode25 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str8 = this.toTokenAmount;
        int iHashCode26 = str8 == null ? 0 : str8.hashCode();
        Integer num4 = this.toTokenDecimal;
        int iHashCode27 = num4 == null ? 0 : num4.hashCode();
        String str9 = this.toTokenSymbol;
        int iHashCode28 = str9 == null ? 0 : str9.hashCode();
        Integer num5 = this.userFundStatus;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (num5 == null ? 0 : num5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionOrderApiModel(orderId=" + this.orderId + ", orderType=" + this.orderType + ", merchantId=" + this.merchantId + ", productCode=" + this.productCode + ", tokenSymbol=" + this.tokenSymbol + ", tokenDecimal=" + this.tokenDecimal + ", tokenLogo=" + this.tokenLogo + ", chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", currencyAmount=" + this.currencyAmount + ", from=" + this.from + ", to=" + this.to + ", areaCode=" + this.areaCode + ", status=" + this.status + ", createTime=" + this.createTime + ", receiverType=" + this.receiverType + ", subStatus=" + this.subStatus + ", gasFeeType=" + this.gasFeeType + ", txHash=" + this.txHash + ", firstPackTime=" + this.firstPackTime + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", convertInfo=" + this.convertInfo + ", authorizeType=" + this.authorizeType + ", extInfo=" + this.extInfo + ", toTokenAmount=" + this.toTokenAmount + ", toTokenDecimal=" + this.toTokenDecimal + ", toTokenSymbol=" + this.toTokenSymbol + ", userFundStatus=" + this.userFundStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionOrderApiModel> serializer() {
            return TransactionOrderApiModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionOrderApiModel(int i, String str, int i2, String str2, String str3, String str4, int i3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i4, long j, Integer num, Integer num2, int i5, String str13, Long l, String str14, ConvertInfoApiModel convertInfoApiModel, Integer num3, JsonObject jsonObject, String str15, Integer num4, String str16, Integer num5, SerializationConstructorMarker serializationConstructorMarker) {
        if (33554367 != (i & 33554367)) {
            PluginExceptionsKt.throwMissingFieldException(i, 33554367, TransactionOrderApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.orderType = i2;
        this.merchantId = str2;
        this.productCode = str3;
        this.tokenSymbol = str4;
        this.tokenDecimal = i3;
        if ((i & 64) == 0) {
            this.tokenLogo = null;
        } else {
            this.tokenLogo = str5;
        }
        this.chainIndex = str6;
        this.tokenAddress = str7;
        this.tokenAmount = str8;
        this.currencyAmount = str9;
        this.from = str10;
        this.to = str11;
        this.areaCode = str12;
        this.status = i4;
        this.createTime = j;
        this.receiverType = num;
        this.subStatus = num2;
        this.gasFeeType = i5;
        this.txHash = str13;
        this.firstPackTime = l;
        this.tokenCoinTypeNo = str14;
        this.convertInfo = convertInfoApiModel;
        this.authorizeType = num3;
        this.extInfo = jsonObject;
        if ((33554432 & i) == 0) {
            this.toTokenAmount = null;
        } else {
            this.toTokenAmount = str15;
        }
        if ((67108864 & i) == 0) {
            this.toTokenDecimal = null;
        } else {
            this.toTokenDecimal = num4;
        }
        if ((134217728 & i) == 0) {
            this.toTokenSymbol = null;
        } else {
            this.toTokenSymbol = str16;
        }
        if ((i & 268435456) == 0) {
            this.userFundStatus = null;
        } else {
            this.userFundStatus = num5;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TransactionOrderApiModel transactionOrderApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, transactionOrderApiModel.getOrderId());
        compositeEncoder.encodeIntElement(serialDescriptor, 1, transactionOrderApiModel.orderType);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, transactionOrderApiModel.merchantId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, transactionOrderApiModel.productCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, transactionOrderApiModel.tokenSymbol);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, transactionOrderApiModel.tokenDecimal);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || transactionOrderApiModel.tokenLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, transactionOrderApiModel.tokenLogo);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, transactionOrderApiModel.chainIndex);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, transactionOrderApiModel.tokenAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, transactionOrderApiModel.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, transactionOrderApiModel.currencyAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, transactionOrderApiModel.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, transactionOrderApiModel.to);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, transactionOrderApiModel.areaCode);
        compositeEncoder.encodeIntElement(serialDescriptor, 14, transactionOrderApiModel.status);
        compositeEncoder.encodeLongElement(serialDescriptor, 15, transactionOrderApiModel.createTime);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, intSerializer, transactionOrderApiModel.receiverType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, intSerializer, transactionOrderApiModel.subStatus);
        compositeEncoder.encodeIntElement(serialDescriptor, 18, transactionOrderApiModel.gasFeeType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, transactionOrderApiModel.txHash);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, LongSerializer.INSTANCE, transactionOrderApiModel.firstPackTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 21, transactionOrderApiModel.tokenCoinTypeNo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, ConvertInfoApiModel$$serializer.INSTANCE, transactionOrderApiModel.convertInfo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, intSerializer, transactionOrderApiModel.authorizeType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, JsonObjectSerializer.INSTANCE, transactionOrderApiModel.extInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || transactionOrderApiModel.toTokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, transactionOrderApiModel.toTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || transactionOrderApiModel.toTokenDecimal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, intSerializer, transactionOrderApiModel.toTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || transactionOrderApiModel.toTokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, stringSerializer, transactionOrderApiModel.toTokenSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && transactionOrderApiModel.userFundStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, intSerializer, transactionOrderApiModel.userFundStatus);
    }

    public TransactionOrderApiModel(@NotNull String str, int i, String str2, String str3, @NotNull String str4, int i2, String str5, @NotNull String str6, String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, String str12, int i3, long j, Integer num, Integer num2, int i4, String str13, Long l, @NotNull String str14, ConvertInfoApiModel convertInfoApiModel, Integer num3, JsonObject jsonObject, String str15, Integer num4, String str16, Integer num5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.orderId = str;
        this.orderType = i;
        this.merchantId = str2;
        this.productCode = str3;
        this.tokenSymbol = str4;
        this.tokenDecimal = i2;
        this.tokenLogo = str5;
        this.chainIndex = str6;
        this.tokenAddress = str7;
        this.tokenAmount = str8;
        this.currencyAmount = str9;
        this.from = str10;
        this.to = str11;
        this.areaCode = str12;
        this.status = i3;
        this.createTime = j;
        this.receiverType = num;
        this.subStatus = num2;
        this.gasFeeType = i4;
        this.txHash = str13;
        this.firstPackTime = l;
        this.tokenCoinTypeNo = str14;
        this.convertInfo = convertInfoApiModel;
        this.authorizeType = num3;
        this.extInfo = jsonObject;
        this.toTokenAmount = str15;
        this.toTokenDecimal = num4;
        this.toTokenSymbol = str16;
        this.userFundStatus = num5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0067: CONSTRUCTOR 
  (r34v0 java.lang.String)
  (r35v0 int)
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r64v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (r43v0 java.lang.String)
  (r44v0 java.lang.String)
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 java.lang.String)
  (r48v0 int)
  (r49v0 long)
  (r51v0 java.lang.Integer)
  (r52v0 java.lang.Integer)
  (r53v0 int)
  (r54v0 java.lang.String)
  (r55v0 java.lang.Long)
  (r56v0 java.lang.String)
  (r57v0 com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertInfoApiModel)
  (r58v0 java.lang.Integer)
  (r59v0 kotlinx.serialization.json.JsonObject)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r64v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r64v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r61v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r64v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r64v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r63v0 java.lang.Integer))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.Integer, java.lang.Integer, int, java.lang.String, java.lang.Long, java.lang.String, com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertInfoApiModel, java.lang.Integer, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer):void (m)] (LINE:21) call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderApiModel.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.Integer, java.lang.Integer, int, java.lang.String, java.lang.Long, java.lang.String, com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertInfoApiModel, java.lang.Integer, kotlinx.serialization.json.JsonObject, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ TransactionOrderApiModel(String str, int i, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i3, long j, Integer num, Integer num2, int i4, String str13, Long l, String str14, ConvertInfoApiModel convertInfoApiModel, Integer num3, JsonObject jsonObject, String str15, Integer num4, String str16, Integer num5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, i2, (i5 & 64) != 0 ? null : str5, str6, str7, str8, str9, str10, str11, str12, i3, j, num, num2, i4, str13, l, str14, convertInfoApiModel, num3, jsonObject, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str15, (i5 & 67108864) != 0 ? null : num4, (i5 & 134217728) != 0 ? null : str16, (i5 & 268435456) != 0 ? null : num5);
    }

    /* JADX DEBUG: Method merged with bridge method: toDomainModel()Ljava/lang/Object; */
    @Override // o.InterfaceC31382lsv
    public C31340lsF toDomainModel() {
        String orderId = getOrderId();
        OrderType orderTypeOLrzqt = OrderType.Companion.OLrzqt(this.orderType);
        ProductCode productCodeAEQbTJ = ProductCode.Companion.AEQbTJ(this.productCode);
        String str = this.merchantId;
        String str2 = this.tokenSymbol;
        int i = this.tokenDecimal;
        String str3 = this.tokenLogo;
        String str4 = this.chainIndex;
        String str5 = this.tokenAddress;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.tokenAmount;
        String str8 = str7 == null ? "" : str7;
        String str9 = this.currencyAmount;
        String str10 = this.from;
        String str11 = this.to;
        String str12 = this.areaCode;
        OrderStatus orderStatusEZpvd = OrderStatus.Companion.EZpvd(this.status);
        long j = this.createTime;
        Integer num = this.receiverType;
        ReceiverType receiverTypeEZpvd = num == null ? null : ReceiverType.Companion.EZpvd(num);
        Integer num2 = this.subStatus;
        OrderSubStatus orderSubStatusAEQbTJ = num2 != null ? OrderSubStatus.Companion.AEQbTJ(num2.intValue()) : null;
        String str13 = this.tokenCoinTypeNo;
        ConvertInfoApiModel convertInfoApiModel = this.convertInfo;
        return new C31340lsF(orderId, orderTypeOLrzqt, str2, i, str4, str6, str8, str3, str9, str10, str11, str12, orderStatusEZpvd, j, receiverTypeEZpvd, orderSubStatusAEQbTJ, str13, productCodeAEQbTJ, str, convertInfoApiModel != null ? C31335lsA.OLrzqt(convertInfoApiModel) : null, SaCardAuthLimit.Companion.AEQbTJ(this.authorizeType), SACardOrderExtInfo.Companion.OLrzqt(this.extInfo), this.toTokenAmount, this.toTokenDecimal, this.toTokenSymbol, UserFundStatus.Companion.OLrzqt(this.userFundStatus));
    }

    public final C31381lsu toTransactionOrderEmbeddedEntity() {
        String orderId = getOrderId();
        int i = this.orderType;
        String str = this.productCode;
        String str2 = this.merchantId;
        String str3 = this.tokenSymbol;
        int i2 = this.tokenDecimal;
        String str4 = this.chainIndex;
        String str5 = this.tokenAddress;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.tokenAmount;
        return new C31381lsu(orderId, i, str2, str, str3, i2, str4, str6, str7 == null ? "" : str7, this.currencyAmount, this.from, this.to, this.areaCode, this.status, this.createTime, this.receiverType, this.subStatus, this.tokenCoinTypeNo, this.convertInfo);
    }
}
