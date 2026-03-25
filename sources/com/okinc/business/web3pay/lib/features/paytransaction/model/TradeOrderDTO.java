package com.okinc.business.web3pay.lib.features.paytransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TradeOrderDTO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long createTime;
    private final Long expireTime;
    private final ExternalFeeInfo externalFeeInfo;
    private final String fiatCurrencyCode;
    private final String maxLimitAmount;
    private final String merchantId;
    private final String minLimitAmount;
    private final FiatAmountDTO orderFiatAmount;
    private final String productCode;
    private final QRCodeAcquire qrCodeAcquire;
    private final RateInfo rateInfo;
    private final String receiverInfo;
    private final String tradeOrderId;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCodeAcquire component11() {
        return this.qrCodeAcquire;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateInfo component13() {
        return this.rateInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExternalFeeInfo component14() {
        return this.externalFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.receiverInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatAmountDTO component5() {
        return this.orderFiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fiatCurrencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.maxLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.minLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderDTO copy(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, FiatAmountDTO fiatAmountDTO, String str5, String str6, String str7, Long l, Long l2, QRCodeAcquire qRCodeAcquire, String str8, RateInfo rateInfo, ExternalFeeInfo externalFeeInfo) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TradeOrderDTO(str, str2, str3, str4, fiatAmountDTO, str5, str6, str7, l, l2, qRCodeAcquire, str8, rateInfo, externalFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeOrderDTO)) {
            return false;
        }
        TradeOrderDTO tradeOrderDTO = (TradeOrderDTO) obj;
        return Intrinsics.EZpvd((Object) this.tradeOrderId, (Object) tradeOrderDTO.tradeOrderId) && Intrinsics.EZpvd((Object) this.merchantId, (Object) tradeOrderDTO.merchantId) && Intrinsics.EZpvd((Object) this.productCode, (Object) tradeOrderDTO.productCode) && Intrinsics.EZpvd((Object) this.receiverInfo, (Object) tradeOrderDTO.receiverInfo) && Intrinsics.EZpvd(this.orderFiatAmount, tradeOrderDTO.orderFiatAmount) && Intrinsics.EZpvd((Object) this.fiatCurrencyCode, (Object) tradeOrderDTO.fiatCurrencyCode) && Intrinsics.EZpvd((Object) this.maxLimitAmount, (Object) tradeOrderDTO.maxLimitAmount) && Intrinsics.EZpvd((Object) this.minLimitAmount, (Object) tradeOrderDTO.minLimitAmount) && Intrinsics.EZpvd(this.createTime, tradeOrderDTO.createTime) && Intrinsics.EZpvd(this.expireTime, tradeOrderDTO.expireTime) && Intrinsics.EZpvd(this.qrCodeAcquire, tradeOrderDTO.qrCodeAcquire) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) tradeOrderDTO.usdAmount) && Intrinsics.EZpvd(this.rateInfo, tradeOrderDTO.rateInfo) && Intrinsics.EZpvd(this.externalFeeInfo, tradeOrderDTO.externalFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExternalFeeInfo getExternalFeeInfo() {
        return this.externalFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatCurrencyCode() {
        return this.fiatCurrencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLimitAmount() {
        return this.maxLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLimitAmount() {
        return this.minLimitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatAmountDTO getOrderFiatAmount() {
        return this.orderFiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCodeAcquire getQrCodeAcquire() {
        return this.qrCodeAcquire;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateInfo getRateInfo() {
        return this.rateInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiverInfo() {
        return this.receiverInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeOrderId() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tradeOrderId;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.merchantId.hashCode();
        int iHashCode3 = this.productCode.hashCode();
        int iHashCode4 = this.receiverInfo.hashCode();
        FiatAmountDTO fiatAmountDTO = this.orderFiatAmount;
        int iHashCode5 = fiatAmountDTO == null ? 0 : fiatAmountDTO.hashCode();
        String str2 = this.fiatCurrencyCode;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxLimitAmount;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minLimitAmount;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        Long l = this.createTime;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        Long l2 = this.expireTime;
        int iHashCode10 = l2 == null ? 0 : l2.hashCode();
        QRCodeAcquire qRCodeAcquire = this.qrCodeAcquire;
        int iHashCode11 = qRCodeAcquire == null ? 0 : qRCodeAcquire.hashCode();
        String str5 = this.usdAmount;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        RateInfo rateInfo = this.rateInfo;
        int iHashCode13 = rateInfo == null ? 0 : rateInfo.hashCode();
        ExternalFeeInfo externalFeeInfo = this.externalFeeInfo;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (externalFeeInfo != null ? externalFeeInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeOrderDTO(tradeOrderId=" + this.tradeOrderId + ", merchantId=" + this.merchantId + ", productCode=" + this.productCode + ", receiverInfo=" + this.receiverInfo + ", orderFiatAmount=" + this.orderFiatAmount + ", fiatCurrencyCode=" + this.fiatCurrencyCode + ", maxLimitAmount=" + this.maxLimitAmount + ", minLimitAmount=" + this.minLimitAmount + ", createTime=" + this.createTime + ", expireTime=" + this.expireTime + ", qrCodeAcquire=" + this.qrCodeAcquire + ", usdAmount=" + this.usdAmount + ", rateInfo=" + this.rateInfo + ", externalFeeInfo=" + this.externalFeeInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.TradeOrderDTO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeOrderDTO> serializer() {
            return TradeOrderDTO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeOrderDTO(int i, String str, String str2, String str3, String str4, FiatAmountDTO fiatAmountDTO, String str5, String str6, String str7, Long l, Long l2, QRCodeAcquire qRCodeAcquire, String str8, RateInfo rateInfo, ExternalFeeInfo externalFeeInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, TradeOrderDTO$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.tradeOrderId = null;
        } else {
            this.tradeOrderId = str;
        }
        this.merchantId = str2;
        this.productCode = str3;
        this.receiverInfo = str4;
        if ((i & 16) == 0) {
            this.orderFiatAmount = null;
        } else {
            this.orderFiatAmount = fiatAmountDTO;
        }
        if ((i & 32) == 0) {
            this.fiatCurrencyCode = null;
        } else {
            this.fiatCurrencyCode = str5;
        }
        if ((i & 64) == 0) {
            this.maxLimitAmount = null;
        } else {
            this.maxLimitAmount = str6;
        }
        if ((i & 128) == 0) {
            this.minLimitAmount = null;
        } else {
            this.minLimitAmount = str7;
        }
        if ((i & 256) == 0) {
            this.createTime = null;
        } else {
            this.createTime = l;
        }
        if ((i & 512) == 0) {
            this.expireTime = null;
        } else {
            this.expireTime = l2;
        }
        if ((i & 1024) == 0) {
            this.qrCodeAcquire = null;
        } else {
            this.qrCodeAcquire = qRCodeAcquire;
        }
        if ((i & 2048) == 0) {
            this.usdAmount = null;
        } else {
            this.usdAmount = str8;
        }
        if ((i & 4096) == 0) {
            this.rateInfo = null;
        } else {
            this.rateInfo = rateInfo;
        }
        if ((i & 8192) == 0) {
            this.externalFeeInfo = null;
        } else {
            this.externalFeeInfo = externalFeeInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TradeOrderDTO tradeOrderDTO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeOrderDTO.tradeOrderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeOrderDTO.tradeOrderId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeOrderDTO.merchantId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeOrderDTO.productCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeOrderDTO.receiverInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradeOrderDTO.orderFiatAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FiatAmountDTO$$serializer.INSTANCE, tradeOrderDTO.orderFiatAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeOrderDTO.fiatCurrencyCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeOrderDTO.fiatCurrencyCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeOrderDTO.maxLimitAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradeOrderDTO.maxLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tradeOrderDTO.minLimitAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tradeOrderDTO.minLimitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradeOrderDTO.createTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, tradeOrderDTO.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tradeOrderDTO.expireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, tradeOrderDTO.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tradeOrderDTO.qrCodeAcquire != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, QRCodeAcquire$$serializer.INSTANCE, tradeOrderDTO.qrCodeAcquire);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || tradeOrderDTO.usdAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tradeOrderDTO.usdAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tradeOrderDTO.rateInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, RateInfo$$serializer.INSTANCE, tradeOrderDTO.rateInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && tradeOrderDTO.externalFeeInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, ExternalFeeInfo$$serializer.INSTANCE, tradeOrderDTO.externalFeeInfo);
    }

    public TradeOrderDTO(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, FiatAmountDTO fiatAmountDTO, String str5, String str6, String str7, Long l, Long l2, QRCodeAcquire qRCodeAcquire, String str8, RateInfo rateInfo, ExternalFeeInfo externalFeeInfo) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tradeOrderId = str;
        this.merchantId = str2;
        this.productCode = str3;
        this.receiverInfo = str4;
        this.orderFiatAmount = fiatAmountDTO;
        this.fiatCurrencyCode = str5;
        this.maxLimitAmount = str6;
        this.minLimitAmount = str7;
        this.createTime = l;
        this.expireTime = l2;
        this.qrCodeAcquire = qRCodeAcquire;
        this.usdAmount = str8;
        this.rateInfo = rateInfo;
        this.externalFeeInfo = externalFeeInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (wrap:com.okinc.business.web3pay.lib.features.paytransaction.model.FiatAmountDTO:?: TERNARY null = ((wrap:int:0x000b: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.paytransaction.model.FiatAmountDTO) : (r23v0 com.okinc.business.web3pay.lib.features.paytransaction.model.FiatAmountDTO))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002b: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r27v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0033: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
  (wrap:com.okinc.business.web3pay.lib.features.paytransaction.model.QRCodeAcquire:?: TERNARY null = ((wrap:int:0x003b: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.paytransaction.model.QRCodeAcquire) : (r29v0 com.okinc.business.web3pay.lib.features.paytransaction.model.QRCodeAcquire))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:com.okinc.business.web3pay.lib.features.paytransaction.model.RateInfo:?: TERNARY null = ((wrap:int:0x004b: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.paytransaction.model.RateInfo) : (r31v0 com.okinc.business.web3pay.lib.features.paytransaction.model.RateInfo))
  (wrap:com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo:?: TERNARY null = ((wrap:int:0x0054: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo) : (r32v0 com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.features.paytransaction.model.FiatAmountDTO, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, com.okinc.business.web3pay.lib.features.paytransaction.model.QRCodeAcquire, java.lang.String, com.okinc.business.web3pay.lib.features.paytransaction.model.RateInfo, com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo):void (m)] (LINE:16) call: com.okinc.business.web3pay.lib.features.paytransaction.model.TradeOrderDTO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.lib.features.paytransaction.model.FiatAmountDTO, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, com.okinc.business.web3pay.lib.features.paytransaction.model.QRCodeAcquire, java.lang.String, com.okinc.business.web3pay.lib.features.paytransaction.model.RateInfo, com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo):void type: THIS */
    public /* synthetic */ TradeOrderDTO(String str, String str2, String str3, String str4, FiatAmountDTO fiatAmountDTO, String str5, String str6, String str7, Long l, Long l2, QRCodeAcquire qRCodeAcquire, String str8, RateInfo rateInfo, ExternalFeeInfo externalFeeInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3, str4, (i & 16) != 0 ? null : fiatAmountDTO, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : qRCodeAcquire, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : rateInfo, (i & 8192) != 0 ? null : externalFeeInfo);
    }
}
