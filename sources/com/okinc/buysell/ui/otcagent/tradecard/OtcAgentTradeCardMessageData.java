package com.okinc.buysell.ui.otcagent.tradecard;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class OtcAgentTradeCardMessageData {
    public static final int $stable = 0;
    private final String baseAmount;
    private final String baseCurrency;
    private final String baseCurrencyDarkIconUrl;
    private final String baseCurrencyIconUrl;
    private final String feeAmount;
    private final boolean isPegged;
    private final boolean isStablecoin;
    private final String orderId;
    private final String paymentChannel;
    private final String peggedCurrency;
    private final String price;
    private final String quoteAmount;
    private final String quoteCurrency;
    private final String quoteCurrencyDarkIconUrl;
    private final String quoteCurrencyIconUrl;
    private final String quoteExpireMs;
    private final String quoteTime;
    private final String quoteToken;
    private final String requestId;
    private final OtcAgentTradeCardStatus status;
    private final OtcAgentTradeCardType type;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardType", OtcAgentTradeCardType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus", OtcAgentTradeCardStatus.values()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OtcAgentTradeCardMessageData() {
        this((OtcAgentTradeCardType) null, (OtcAgentTradeCardStatus) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtcAgentTradeCardType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.quoteCurrencyIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.baseCurrencyDarkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.quoteCurrencyDarkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.paymentChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.feeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.quoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.quoteExpireMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isStablecoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtcAgentTradeCardStatus component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.isPegged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.peggedCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.baseCurrencyIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtcAgentTradeCardMessageData copy(@NotNull OtcAgentTradeCardType otcAgentTradeCardType, @NotNull OtcAgentTradeCardStatus otcAgentTradeCardStatus, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, boolean z2, @NotNull String str17) {
        Intrinsics.checkNotNullParameter(otcAgentTradeCardType, "");
        Intrinsics.checkNotNullParameter(otcAgentTradeCardStatus, "");
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
        return new OtcAgentTradeCardMessageData(otcAgentTradeCardType, otcAgentTradeCardStatus, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z, z2, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtcAgentTradeCardMessageData)) {
            return false;
        }
        OtcAgentTradeCardMessageData otcAgentTradeCardMessageData = (OtcAgentTradeCardMessageData) obj;
        return this.type == otcAgentTradeCardMessageData.type && this.status == otcAgentTradeCardMessageData.status && Intrinsics.EZpvd((Object) this.orderId, (Object) otcAgentTradeCardMessageData.orderId) && Intrinsics.EZpvd((Object) this.requestId, (Object) otcAgentTradeCardMessageData.requestId) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) otcAgentTradeCardMessageData.baseCurrency) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) otcAgentTradeCardMessageData.quoteCurrency) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) otcAgentTradeCardMessageData.baseAmount) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) otcAgentTradeCardMessageData.quoteAmount) && Intrinsics.EZpvd((Object) this.baseCurrencyIconUrl, (Object) otcAgentTradeCardMessageData.baseCurrencyIconUrl) && Intrinsics.EZpvd((Object) this.quoteCurrencyIconUrl, (Object) otcAgentTradeCardMessageData.quoteCurrencyIconUrl) && Intrinsics.EZpvd((Object) this.baseCurrencyDarkIconUrl, (Object) otcAgentTradeCardMessageData.baseCurrencyDarkIconUrl) && Intrinsics.EZpvd((Object) this.quoteCurrencyDarkIconUrl, (Object) otcAgentTradeCardMessageData.quoteCurrencyDarkIconUrl) && Intrinsics.EZpvd((Object) this.quoteToken, (Object) otcAgentTradeCardMessageData.quoteToken) && Intrinsics.EZpvd((Object) this.price, (Object) otcAgentTradeCardMessageData.price) && Intrinsics.EZpvd((Object) this.paymentChannel, (Object) otcAgentTradeCardMessageData.paymentChannel) && Intrinsics.EZpvd((Object) this.feeAmount, (Object) otcAgentTradeCardMessageData.feeAmount) && Intrinsics.EZpvd((Object) this.quoteTime, (Object) otcAgentTradeCardMessageData.quoteTime) && Intrinsics.EZpvd((Object) this.quoteExpireMs, (Object) otcAgentTradeCardMessageData.quoteExpireMs) && this.isStablecoin == otcAgentTradeCardMessageData.isStablecoin && this.isPegged == otcAgentTradeCardMessageData.isPegged && Intrinsics.EZpvd((Object) this.peggedCurrency, (Object) otcAgentTradeCardMessageData.peggedCurrency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyDarkIconUrl() {
        return this.baseCurrencyDarkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyIconUrl() {
        return this.baseCurrencyIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentChannel() {
        return this.paymentChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeggedCurrency() {
        return this.peggedCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencyDarkIconUrl() {
        return this.quoteCurrencyDarkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencyIconUrl() {
        return this.quoteCurrencyIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteExpireMs() {
        return this.quoteExpireMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteTime() {
        return this.quoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteToken() {
        return this.quoteToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtcAgentTradeCardStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OtcAgentTradeCardType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.type.hashCode() * 31) + this.status.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.baseCurrency.hashCode()) * 31) + this.quoteCurrency.hashCode()) * 31) + this.baseAmount.hashCode()) * 31) + this.quoteAmount.hashCode()) * 31) + this.baseCurrencyIconUrl.hashCode()) * 31) + this.quoteCurrencyIconUrl.hashCode()) * 31) + this.baseCurrencyDarkIconUrl.hashCode()) * 31) + this.quoteCurrencyDarkIconUrl.hashCode()) * 31) + this.quoteToken.hashCode()) * 31) + this.price.hashCode()) * 31) + this.paymentChannel.hashCode()) * 31) + this.feeAmount.hashCode()) * 31) + this.quoteTime.hashCode()) * 31) + this.quoteExpireMs.hashCode()) * 31) + Boolean.hashCode(this.isStablecoin)) * 31) + Boolean.hashCode(this.isPegged)) * 31) + this.peggedCurrency.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPegged() {
        return this.isPegged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isStablecoin() {
        return this.isStablecoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OtcAgentTradeCardMessageData(type=" + this.type + ", status=" + this.status + ", orderId=" + this.orderId + ", requestId=" + this.requestId + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", baseAmount=" + this.baseAmount + ", quoteAmount=" + this.quoteAmount + ", baseCurrencyIconUrl=" + this.baseCurrencyIconUrl + ", quoteCurrencyIconUrl=" + this.quoteCurrencyIconUrl + ", baseCurrencyDarkIconUrl=" + this.baseCurrencyDarkIconUrl + ", quoteCurrencyDarkIconUrl=" + this.quoteCurrencyDarkIconUrl + ", quoteToken=" + this.quoteToken + ", price=" + this.price + ", paymentChannel=" + this.paymentChannel + ", feeAmount=" + this.feeAmount + ", quoteTime=" + this.quoteTime + ", quoteExpireMs=" + this.quoteExpireMs + ", isStablecoin=" + this.isStablecoin + ", isPegged=" + this.isPegged + ", peggedCurrency=" + this.peggedCurrency + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OtcAgentTradeCardMessageData> serializer() {
            return OtcAgentTradeCardMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OtcAgentTradeCardMessageData(int i, OtcAgentTradeCardType otcAgentTradeCardType, OtcAgentTradeCardStatus otcAgentTradeCardStatus, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, boolean z2, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i & 1) == 0 ? OtcAgentTradeCardType.BUY : otcAgentTradeCardType;
        this.status = (i & 2) == 0 ? OtcAgentTradeCardStatus.QUOTE_READY : otcAgentTradeCardStatus;
        if ((i & 4) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        if ((i & 8) == 0) {
            this.requestId = "";
        } else {
            this.requestId = str2;
        }
        if ((i & 16) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str3;
        }
        if ((i & 32) == 0) {
            this.quoteCurrency = "";
        } else {
            this.quoteCurrency = str4;
        }
        if ((i & 64) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str5;
        }
        if ((i & 128) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str6;
        }
        if ((i & 256) == 0) {
            this.baseCurrencyIconUrl = "";
        } else {
            this.baseCurrencyIconUrl = str7;
        }
        if ((i & 512) == 0) {
            this.quoteCurrencyIconUrl = "";
        } else {
            this.quoteCurrencyIconUrl = str8;
        }
        if ((i & 1024) == 0) {
            this.baseCurrencyDarkIconUrl = "";
        } else {
            this.baseCurrencyDarkIconUrl = str9;
        }
        if ((i & 2048) == 0) {
            this.quoteCurrencyDarkIconUrl = "";
        } else {
            this.quoteCurrencyDarkIconUrl = str10;
        }
        if ((i & 4096) == 0) {
            this.quoteToken = "";
        } else {
            this.quoteToken = str11;
        }
        if ((i & 8192) == 0) {
            this.price = "";
        } else {
            this.price = str12;
        }
        if ((i & 16384) == 0) {
            this.paymentChannel = "";
        } else {
            this.paymentChannel = str13;
        }
        if ((32768 & i) == 0) {
            this.feeAmount = "";
        } else {
            this.feeAmount = str14;
        }
        if ((65536 & i) == 0) {
            this.quoteTime = "";
        } else {
            this.quoteTime = str15;
        }
        if ((131072 & i) == 0) {
            this.quoteExpireMs = "";
        } else {
            this.quoteExpireMs = str16;
        }
        if ((262144 & i) == 0) {
            this.isStablecoin = false;
        } else {
            this.isStablecoin = z;
        }
        if ((524288 & i) == 0) {
            this.isPegged = false;
        } else {
            this.isPegged = z2;
        }
        if ((i & 1048576) == 0) {
            this.peggedCurrency = "";
        } else {
            this.peggedCurrency = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(OtcAgentTradeCardMessageData otcAgentTradeCardMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || otcAgentTradeCardMessageData.type != OtcAgentTradeCardType.BUY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], otcAgentTradeCardMessageData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || otcAgentTradeCardMessageData.status != OtcAgentTradeCardStatus.QUOTE_READY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], otcAgentTradeCardMessageData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, otcAgentTradeCardMessageData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.requestId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, otcAgentTradeCardMessageData.requestId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, otcAgentTradeCardMessageData.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.quoteCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, otcAgentTradeCardMessageData.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, otcAgentTradeCardMessageData.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, otcAgentTradeCardMessageData.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.baseCurrencyIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, otcAgentTradeCardMessageData.baseCurrencyIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.quoteCurrencyIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, otcAgentTradeCardMessageData.quoteCurrencyIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.baseCurrencyDarkIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, otcAgentTradeCardMessageData.baseCurrencyDarkIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.quoteCurrencyDarkIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, otcAgentTradeCardMessageData.quoteCurrencyDarkIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.quoteToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, otcAgentTradeCardMessageData.quoteToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, otcAgentTradeCardMessageData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.paymentChannel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, otcAgentTradeCardMessageData.paymentChannel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.feeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, otcAgentTradeCardMessageData.feeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.quoteTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, otcAgentTradeCardMessageData.quoteTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.quoteExpireMs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, otcAgentTradeCardMessageData.quoteExpireMs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || otcAgentTradeCardMessageData.isStablecoin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, otcAgentTradeCardMessageData.isStablecoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || otcAgentTradeCardMessageData.isPegged) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, otcAgentTradeCardMessageData.isPegged);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd((Object) otcAgentTradeCardMessageData.peggedCurrency, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 20, otcAgentTradeCardMessageData.peggedCurrency);
    }

    public OtcAgentTradeCardMessageData(@NotNull OtcAgentTradeCardType otcAgentTradeCardType, @NotNull OtcAgentTradeCardStatus otcAgentTradeCardStatus, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, boolean z2, @NotNull String str17) {
        Intrinsics.checkNotNullParameter(otcAgentTradeCardType, "");
        Intrinsics.checkNotNullParameter(otcAgentTradeCardStatus, "");
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
        this.type = otcAgentTradeCardType;
        this.status = otcAgentTradeCardStatus;
        this.orderId = str;
        this.requestId = str2;
        this.baseCurrency = str3;
        this.quoteCurrency = str4;
        this.baseAmount = str5;
        this.quoteAmount = str6;
        this.baseCurrencyIconUrl = str7;
        this.quoteCurrencyIconUrl = str8;
        this.baseCurrencyDarkIconUrl = str9;
        this.quoteCurrencyDarkIconUrl = str10;
        this.quoteToken = str11;
        this.price = str12;
        this.paymentChannel = str13;
        this.feeAmount = str14;
        this.quoteTime = str15;
        this.quoteExpireMs = str16;
        this.isStablecoin = z;
        this.isPegged = z2;
        this.peggedCurrency = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f0: CONSTRUCTOR 
  (wrap:com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:9) com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardType.BUY com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardType) : (r23v0 com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardType))
  (wrap:com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus:?: TERNARY null = ((wrap:int:0x000b: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] (LINE:10) com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus.QUOTE_READY com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus) : (r24v0 com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b2: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) == (0 int)) ? (r42v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
 A[MD:(com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardType, com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:8) call: com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageData.<init>(com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardType, com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ OtcAgentTradeCardMessageData(OtcAgentTradeCardType otcAgentTradeCardType, OtcAgentTradeCardStatus otcAgentTradeCardStatus, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, boolean z2, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OtcAgentTradeCardType.BUY : otcAgentTradeCardType, (i & 2) != 0 ? OtcAgentTradeCardStatus.QUOTE_READY : otcAgentTradeCardStatus, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? false : z, (i & 524288) == 0 ? z2 : false, (i & 1048576) != 0 ? "" : str17);
    }

    public final boolean isBuyType() {
        return this.type == OtcAgentTradeCardType.BUY;
    }
}
