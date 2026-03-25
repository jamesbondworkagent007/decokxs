package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DexOrderDetailBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String dexCryptoIconDayUrl;
    private final String dexCryptoIconNightUrl;
    private final String disclaimerDesc;
    private final String disclaimerLearnMoreUrl;
    private final Integer fiatOrderStatus;
    private final String network;
    private final String networkFee;
    private final String networkFeeCurrency;
    private final String networkIconUrl;
    private final String refundAmount;
    private final String refundCurrency;
    private final String serviceFeeAmount;
    private final String serviceFeeCurrency;
    private final String serviceFeeRate;
    private final String tokenAddress;
    private final String totalFee;
    private final String totalFeeCurrency;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.refundAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.refundCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.dexCryptoIconNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.dexCryptoIconDayUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.fiatOrderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.disclaimerDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.disclaimerLearnMoreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.networkFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.networkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.serviceFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.serviceFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetailBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, Integer num, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        return new DexOrderDetailBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, num, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexOrderDetailBean)) {
            return false;
        }
        DexOrderDetailBean dexOrderDetailBean = (DexOrderDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.networkFee, (Object) dexOrderDetailBean.networkFee) && Intrinsics.EZpvd((Object) this.networkFeeCurrency, (Object) dexOrderDetailBean.networkFeeCurrency) && Intrinsics.EZpvd((Object) this.network, (Object) dexOrderDetailBean.network) && Intrinsics.EZpvd((Object) this.networkIconUrl, (Object) dexOrderDetailBean.networkIconUrl) && Intrinsics.EZpvd((Object) this.serviceFeeCurrency, (Object) dexOrderDetailBean.serviceFeeCurrency) && Intrinsics.EZpvd((Object) this.serviceFeeAmount, (Object) dexOrderDetailBean.serviceFeeAmount) && Intrinsics.EZpvd((Object) this.serviceFeeRate, (Object) dexOrderDetailBean.serviceFeeRate) && Intrinsics.EZpvd((Object) this.totalFee, (Object) dexOrderDetailBean.totalFee) && Intrinsics.EZpvd((Object) this.totalFeeCurrency, (Object) dexOrderDetailBean.totalFeeCurrency) && Intrinsics.EZpvd((Object) this.refundAmount, (Object) dexOrderDetailBean.refundAmount) && Intrinsics.EZpvd((Object) this.refundCurrency, (Object) dexOrderDetailBean.refundCurrency) && Intrinsics.EZpvd((Object) this.dexCryptoIconNightUrl, (Object) dexOrderDetailBean.dexCryptoIconNightUrl) && Intrinsics.EZpvd((Object) this.dexCryptoIconDayUrl, (Object) dexOrderDetailBean.dexCryptoIconDayUrl) && Intrinsics.EZpvd(this.fiatOrderStatus, dexOrderDetailBean.fiatOrderStatus) && Intrinsics.EZpvd((Object) this.disclaimerDesc, (Object) dexOrderDetailBean.disclaimerDesc) && Intrinsics.EZpvd((Object) this.disclaimerLearnMoreUrl, (Object) dexOrderDetailBean.disclaimerLearnMoreUrl) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexOrderDetailBean.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexCryptoIconDayUrl() {
        return this.dexCryptoIconDayUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexCryptoIconNightUrl() {
        return this.dexCryptoIconNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisclaimerDesc() {
        return this.disclaimerDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisclaimerLearnMoreUrl() {
        return this.disclaimerLearnMoreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFiatOrderStatus() {
        return this.fiatOrderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeCurrency() {
        return this.networkFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkIconUrl() {
        return this.networkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefundAmount() {
        return this.refundAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefundCurrency() {
        return this.refundCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeAmount() {
        return this.serviceFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeCurrency() {
        return this.serviceFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeRate() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFee() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFeeCurrency() {
        return this.totalFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.networkFee.hashCode();
        int iHashCode2 = this.networkFeeCurrency.hashCode();
        int iHashCode3 = this.network.hashCode();
        int iHashCode4 = this.networkIconUrl.hashCode();
        int iHashCode5 = this.serviceFeeCurrency.hashCode();
        int iHashCode6 = this.serviceFeeAmount.hashCode();
        int iHashCode7 = this.serviceFeeRate.hashCode();
        int iHashCode8 = this.totalFee.hashCode();
        int iHashCode9 = this.totalFeeCurrency.hashCode();
        int iHashCode10 = this.refundAmount.hashCode();
        int iHashCode11 = this.refundCurrency.hashCode();
        int iHashCode12 = this.dexCryptoIconNightUrl.hashCode();
        int iHashCode13 = this.dexCryptoIconDayUrl.hashCode();
        Integer num = this.fiatOrderStatus;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.disclaimerDesc.hashCode()) * 31) + this.disclaimerLearnMoreUrl.hashCode()) * 31) + this.tokenAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexOrderDetailBean(networkFee=" + this.networkFee + ", networkFeeCurrency=" + this.networkFeeCurrency + ", network=" + this.network + ", networkIconUrl=" + this.networkIconUrl + ", serviceFeeCurrency=" + this.serviceFeeCurrency + ", serviceFeeAmount=" + this.serviceFeeAmount + ", serviceFeeRate=" + this.serviceFeeRate + ", totalFee=" + this.totalFee + ", totalFeeCurrency=" + this.totalFeeCurrency + ", refundAmount=" + this.refundAmount + ", refundCurrency=" + this.refundCurrency + ", dexCryptoIconNightUrl=" + this.dexCryptoIconNightUrl + ", dexCryptoIconDayUrl=" + this.dexCryptoIconDayUrl + ", fiatOrderStatus=" + this.fiatOrderStatus + ", disclaimerDesc=" + this.disclaimerDesc + ", disclaimerLearnMoreUrl=" + this.disclaimerLearnMoreUrl + ", tokenAddress=" + this.tokenAddress + ")";
    }

    public /* synthetic */ DexOrderDetailBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if (122879 != (i & 122879)) {
            PluginExceptionsKt.throwMissingFieldException(i, 122879, DexOrderDetailBean$$serializer.INSTANCE.getDescriptor());
        }
        this.networkFee = str;
        this.networkFeeCurrency = str2;
        this.network = str3;
        this.networkIconUrl = str4;
        this.serviceFeeCurrency = str5;
        this.serviceFeeAmount = str6;
        this.serviceFeeRate = str7;
        this.totalFee = str8;
        this.totalFeeCurrency = str9;
        this.refundAmount = str10;
        this.refundCurrency = str11;
        this.dexCryptoIconNightUrl = str12;
        this.dexCryptoIconDayUrl = str13;
        this.fiatOrderStatus = (i & 8192) == 0 ? null : num;
        this.disclaimerDesc = str14;
        this.disclaimerLearnMoreUrl = str15;
        this.tokenAddress = str16;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexOrderDetailBean dexOrderDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dexOrderDetailBean.networkFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dexOrderDetailBean.networkFeeCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dexOrderDetailBean.network);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, dexOrderDetailBean.networkIconUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, dexOrderDetailBean.serviceFeeCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, dexOrderDetailBean.serviceFeeAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, dexOrderDetailBean.serviceFeeRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, dexOrderDetailBean.totalFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, dexOrderDetailBean.totalFeeCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, dexOrderDetailBean.refundAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, dexOrderDetailBean.refundCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, dexOrderDetailBean.dexCryptoIconNightUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, dexOrderDetailBean.dexCryptoIconDayUrl);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dexOrderDetailBean.fiatOrderStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, dexOrderDetailBean.fiatOrderStatus);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 14, dexOrderDetailBean.disclaimerDesc);
        compositeEncoder.encodeStringElement(serialDescriptor, 15, dexOrderDetailBean.disclaimerLearnMoreUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 16, dexOrderDetailBean.tokenAddress);
    }

    public DexOrderDetailBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, Integer num, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        this.networkFee = str;
        this.networkFeeCurrency = str2;
        this.network = str3;
        this.networkIconUrl = str4;
        this.serviceFeeCurrency = str5;
        this.serviceFeeAmount = str6;
        this.serviceFeeRate = str7;
        this.totalFee = str8;
        this.totalFeeCurrency = str9;
        this.refundAmount = str10;
        this.refundCurrency = str11;
        this.dexCryptoIconNightUrl = str12;
        this.dexCryptoIconDayUrl = str13;
        this.fiatOrderStatus = num;
        this.disclaimerDesc = str14;
        this.disclaimerLearnMoreUrl = str15;
        this.tokenAddress = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:199) call: com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexOrderDetailBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, (i & 8192) != 0 ? null : num, str14, str15, str16);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexOrderDetailBean> serializer() {
            return DexOrderDetailBean$$serializer.INSTANCE;
        }

        public final DexOrderDetailBean AEQbTJ(@NotNull DexOrderDetailResponseBean dexOrderDetailResponseBean) {
            Intrinsics.checkNotNullParameter(dexOrderDetailResponseBean, "");
            return new DexOrderDetailBean(dexOrderDetailResponseBean.getNetworkFee(), dexOrderDetailResponseBean.getNetworkFeeCurrency(), dexOrderDetailResponseBean.getNetwork(), dexOrderDetailResponseBean.getNetworkIconUrl(), dexOrderDetailResponseBean.getServiceFeeCurrency(), dexOrderDetailResponseBean.getServiceFeeAmount(), dexOrderDetailResponseBean.getServiceFeeRate(), dexOrderDetailResponseBean.getTotalFeeAmount(), dexOrderDetailResponseBean.getTotalFeeCurrency(), dexOrderDetailResponseBean.getRefundAmount(), dexOrderDetailResponseBean.getRefundCurrency(), dexOrderDetailResponseBean.getDexCryptoIconNightUrl(), dexOrderDetailResponseBean.getDexCryptoIconDayUrl(), dexOrderDetailResponseBean.getFiatOrderStatus(), dexOrderDetailResponseBean.getDisclaimerDesc(), dexOrderDetailResponseBean.getDisclaimerLearnMoreUrl(), dexOrderDetailResponseBean.getTokenAddress());
        }
    }
}
