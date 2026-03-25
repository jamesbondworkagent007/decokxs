package com.okinc.business.dex.api.bean.sa_small_assets;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SmallAssetQuoteData {
    private final String chainId;
    private final String discountedServiceFeeRate;
    private final String estimateExpectedAmountOutNativeTokenUsd;
    private final String estimateMinAmountOutNativeTokenUsd;
    private final String estimateNetworkFeeNativeAmt;
    private final String estimateReserveGasTokenFee;
    private final String estimateServiceFeeNativeAmt;
    private final String estimatedGasFee;
    private final String estimatedGasFeeUsd;
    private final String expireDurationMillis;
    private final String originalServiceFeeRate;
    private final String quoteId;
    private final Map<String, QuoteDetail> quotes;
    private final String serviceFeeUsd;
    private final String targetTokenAddress;
    private final long timestamp;
    private final String totalExpectedAmountOut;
    private final String totalExpectedAmountOutUsd;
    private final String totalMinAmountOut;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, QuoteDetail$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmallAssetQuoteData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, QuoteDetail> component11() {
        return this.quotes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component12() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.expireDurationMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.discountedServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.estimateExpectedAmountOutNativeTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.estimateMinAmountOutNativeTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.estimateNetworkFeeNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.estimateServiceFeeNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.originalServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.targetTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalExpectedAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalExpectedAmountOutUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalMinAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.estimatedGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.estimatedGasFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.estimateReserveGasTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmallAssetQuoteData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull Map<String, QuoteDetail> map, long j, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new SmallAssetQuoteData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, map, j, str11, str12, str13, str14, str15, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallAssetQuoteData)) {
            return false;
        }
        SmallAssetQuoteData smallAssetQuoteData = (SmallAssetQuoteData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) smallAssetQuoteData.chainId) && Intrinsics.EZpvd((Object) this.quoteId, (Object) smallAssetQuoteData.quoteId) && Intrinsics.EZpvd((Object) this.targetTokenAddress, (Object) smallAssetQuoteData.targetTokenAddress) && Intrinsics.EZpvd((Object) this.totalExpectedAmountOut, (Object) smallAssetQuoteData.totalExpectedAmountOut) && Intrinsics.EZpvd((Object) this.totalExpectedAmountOutUsd, (Object) smallAssetQuoteData.totalExpectedAmountOutUsd) && Intrinsics.EZpvd((Object) this.totalMinAmountOut, (Object) smallAssetQuoteData.totalMinAmountOut) && Intrinsics.EZpvd((Object) this.estimatedGasFee, (Object) smallAssetQuoteData.estimatedGasFee) && Intrinsics.EZpvd((Object) this.estimatedGasFeeUsd, (Object) smallAssetQuoteData.estimatedGasFeeUsd) && Intrinsics.EZpvd((Object) this.estimateReserveGasTokenFee, (Object) smallAssetQuoteData.estimateReserveGasTokenFee) && Intrinsics.EZpvd((Object) this.serviceFeeUsd, (Object) smallAssetQuoteData.serviceFeeUsd) && Intrinsics.EZpvd(this.quotes, smallAssetQuoteData.quotes) && this.timestamp == smallAssetQuoteData.timestamp && Intrinsics.EZpvd((Object) this.expireDurationMillis, (Object) smallAssetQuoteData.expireDurationMillis) && Intrinsics.EZpvd((Object) this.discountedServiceFeeRate, (Object) smallAssetQuoteData.discountedServiceFeeRate) && Intrinsics.EZpvd((Object) this.estimateExpectedAmountOutNativeTokenUsd, (Object) smallAssetQuoteData.estimateExpectedAmountOutNativeTokenUsd) && Intrinsics.EZpvd((Object) this.estimateMinAmountOutNativeTokenUsd, (Object) smallAssetQuoteData.estimateMinAmountOutNativeTokenUsd) && Intrinsics.EZpvd((Object) this.estimateNetworkFeeNativeAmt, (Object) smallAssetQuoteData.estimateNetworkFeeNativeAmt) && Intrinsics.EZpvd((Object) this.estimateServiceFeeNativeAmt, (Object) smallAssetQuoteData.estimateServiceFeeNativeAmt) && Intrinsics.EZpvd((Object) this.originalServiceFeeRate, (Object) smallAssetQuoteData.originalServiceFeeRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountedServiceFeeRate() {
        return this.discountedServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateExpectedAmountOutNativeTokenUsd() {
        return this.estimateExpectedAmountOutNativeTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateMinAmountOutNativeTokenUsd() {
        return this.estimateMinAmountOutNativeTokenUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateNetworkFeeNativeAmt() {
        return this.estimateNetworkFeeNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateReserveGasTokenFee() {
        return this.estimateReserveGasTokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateServiceFeeNativeAmt() {
        return this.estimateServiceFeeNativeAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedGasFee() {
        return this.estimatedGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedGasFeeUsd() {
        return this.estimatedGasFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireDurationMillis() {
        return this.expireDurationMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalServiceFeeRate() {
        return this.originalServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, QuoteDetail> getQuotes() {
        return this.quotes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeUsd() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetTokenAddress() {
        return this.targetTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalExpectedAmountOut() {
        return this.totalExpectedAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalExpectedAmountOutUsd() {
        return this.totalExpectedAmountOutUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalMinAmountOut() {
        return this.totalMinAmountOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.quoteId.hashCode()) * 31) + this.targetTokenAddress.hashCode()) * 31) + this.totalExpectedAmountOut.hashCode()) * 31) + this.totalExpectedAmountOutUsd.hashCode()) * 31) + this.totalMinAmountOut.hashCode()) * 31) + this.estimatedGasFee.hashCode()) * 31) + this.estimatedGasFeeUsd.hashCode()) * 31) + this.estimateReserveGasTokenFee.hashCode()) * 31) + this.serviceFeeUsd.hashCode()) * 31) + this.quotes.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.expireDurationMillis.hashCode()) * 31) + this.discountedServiceFeeRate.hashCode()) * 31) + this.estimateExpectedAmountOutNativeTokenUsd.hashCode()) * 31) + this.estimateMinAmountOutNativeTokenUsd.hashCode()) * 31) + this.estimateNetworkFeeNativeAmt.hashCode()) * 31) + this.estimateServiceFeeNativeAmt.hashCode()) * 31) + this.originalServiceFeeRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmallAssetQuoteData(chainId=" + this.chainId + ", quoteId=" + this.quoteId + ", targetTokenAddress=" + this.targetTokenAddress + ", totalExpectedAmountOut=" + this.totalExpectedAmountOut + ", totalExpectedAmountOutUsd=" + this.totalExpectedAmountOutUsd + ", totalMinAmountOut=" + this.totalMinAmountOut + ", estimatedGasFee=" + this.estimatedGasFee + ", estimatedGasFeeUsd=" + this.estimatedGasFeeUsd + ", estimateReserveGasTokenFee=" + this.estimateReserveGasTokenFee + ", serviceFeeUsd=" + this.serviceFeeUsd + ", quotes=" + this.quotes + ", timestamp=" + this.timestamp + ", expireDurationMillis=" + this.expireDurationMillis + ", discountedServiceFeeRate=" + this.discountedServiceFeeRate + ", estimateExpectedAmountOutNativeTokenUsd=" + this.estimateExpectedAmountOutNativeTokenUsd + ", estimateMinAmountOutNativeTokenUsd=" + this.estimateMinAmountOutNativeTokenUsd + ", estimateNetworkFeeNativeAmt=" + this.estimateNetworkFeeNativeAmt + ", estimateServiceFeeNativeAmt=" + this.estimateServiceFeeNativeAmt + ", originalServiceFeeRate=" + this.originalServiceFeeRate + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmallAssetQuoteData> serializer() {
            return SmallAssetQuoteData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmallAssetQuoteData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, long j, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.quoteId = "";
        } else {
            this.quoteId = str2;
        }
        if ((i & 4) == 0) {
            this.targetTokenAddress = "";
        } else {
            this.targetTokenAddress = str3;
        }
        if ((i & 8) == 0) {
            this.totalExpectedAmountOut = "";
        } else {
            this.totalExpectedAmountOut = str4;
        }
        if ((i & 16) == 0) {
            this.totalExpectedAmountOutUsd = "";
        } else {
            this.totalExpectedAmountOutUsd = str5;
        }
        if ((i & 32) == 0) {
            this.totalMinAmountOut = "";
        } else {
            this.totalMinAmountOut = str6;
        }
        if ((i & 64) == 0) {
            this.estimatedGasFee = "";
        } else {
            this.estimatedGasFee = str7;
        }
        if ((i & 128) == 0) {
            this.estimatedGasFeeUsd = "";
        } else {
            this.estimatedGasFeeUsd = str8;
        }
        if ((i & 256) == 0) {
            this.estimateReserveGasTokenFee = "";
        } else {
            this.estimateReserveGasTokenFee = str9;
        }
        if ((i & 512) == 0) {
            this.serviceFeeUsd = "";
        } else {
            this.serviceFeeUsd = str10;
        }
        this.quotes = (i & 1024) == 0 ? C56424yEw.KWHzl() : map;
        this.timestamp = (i & 2048) == 0 ? 0L : j;
        if ((i & 4096) == 0) {
            this.expireDurationMillis = "";
        } else {
            this.expireDurationMillis = str11;
        }
        if ((i & 8192) == 0) {
            this.discountedServiceFeeRate = "";
        } else {
            this.discountedServiceFeeRate = str12;
        }
        if ((i & 16384) == 0) {
            this.estimateExpectedAmountOutNativeTokenUsd = "";
        } else {
            this.estimateExpectedAmountOutNativeTokenUsd = str13;
        }
        if ((32768 & i) == 0) {
            this.estimateMinAmountOutNativeTokenUsd = "";
        } else {
            this.estimateMinAmountOutNativeTokenUsd = str14;
        }
        if ((65536 & i) == 0) {
            this.estimateNetworkFeeNativeAmt = "";
        } else {
            this.estimateNetworkFeeNativeAmt = str15;
        }
        if ((131072 & i) == 0) {
            this.estimateServiceFeeNativeAmt = "";
        } else {
            this.estimateServiceFeeNativeAmt = str16;
        }
        if ((i & 262144) == 0) {
            this.originalServiceFeeRate = "";
        } else {
            this.originalServiceFeeRate = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(SmallAssetQuoteData smallAssetQuoteData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, smallAssetQuoteData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.quoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, smallAssetQuoteData.quoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.targetTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, smallAssetQuoteData.targetTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.totalExpectedAmountOut, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, smallAssetQuoteData.totalExpectedAmountOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.totalExpectedAmountOutUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, smallAssetQuoteData.totalExpectedAmountOutUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.totalMinAmountOut, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, smallAssetQuoteData.totalMinAmountOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.estimatedGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, smallAssetQuoteData.estimatedGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.estimatedGasFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, smallAssetQuoteData.estimatedGasFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.estimateReserveGasTokenFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, smallAssetQuoteData.estimateReserveGasTokenFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.serviceFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, smallAssetQuoteData.serviceFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(smallAssetQuoteData.quotes, C56424yEw.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], smallAssetQuoteData.quotes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || smallAssetQuoteData.timestamp != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 11, smallAssetQuoteData.timestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.expireDurationMillis, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, smallAssetQuoteData.expireDurationMillis);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.discountedServiceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, smallAssetQuoteData.discountedServiceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.estimateExpectedAmountOutNativeTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, smallAssetQuoteData.estimateExpectedAmountOutNativeTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.estimateMinAmountOutNativeTokenUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, smallAssetQuoteData.estimateMinAmountOutNativeTokenUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.estimateNetworkFeeNativeAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, smallAssetQuoteData.estimateNetworkFeeNativeAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) smallAssetQuoteData.estimateServiceFeeNativeAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, smallAssetQuoteData.estimateServiceFeeNativeAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd((Object) smallAssetQuoteData.originalServiceFeeRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 18, smallAssetQuoteData.originalServiceFeeRate);
    }

    public SmallAssetQuoteData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull Map<String, QuoteDetail> map, long j, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.chainId = str;
        this.quoteId = str2;
        this.targetTokenAddress = str3;
        this.totalExpectedAmountOut = str4;
        this.totalExpectedAmountOutUsd = str5;
        this.totalMinAmountOut = str6;
        this.estimatedGasFee = str7;
        this.estimatedGasFeeUsd = str8;
        this.estimateReserveGasTokenFee = str9;
        this.serviceFeeUsd = str10;
        this.quotes = map;
        this.timestamp = j;
        this.expireDurationMillis = str11;
        this.discountedServiceFeeRate = str12;
        this.estimateExpectedAmountOutNativeTokenUsd = str13;
        this.estimateMinAmountOutNativeTokenUsd = str14;
        this.estimateNetworkFeeNativeAmt = str15;
        this.estimateServiceFeeNativeAmt = str16;
        this.originalServiceFeeRate = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00db: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0054: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:20)) : (r32v0 java.util.Map))
  (wrap:long:?: TERNARY null = ((wrap:int:0x005f: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r33v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009f: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map<java.lang.String, com.okinc.business.dex.api.bean.sa_small_assets.QuoteDetail>, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmallAssetQuoteData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, long j, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? C56424yEw.KWHzl() : map, (i & 2048) != 0 ? 0L : j, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17);
    }
}
