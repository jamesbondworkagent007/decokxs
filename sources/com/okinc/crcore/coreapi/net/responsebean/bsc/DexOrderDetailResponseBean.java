package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class DexOrderDetailResponseBean implements Parcelable {
    public static final int $stable = 0;
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
    private final String totalFeeAmount;
    private final String totalFeeCurrency;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexOrderDetailResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexOrderDetailResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexOrderDetailResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexOrderDetailResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexOrderDetailResponseBean[] newArray(int i) {
            return new DexOrderDetailResponseBean[i];
        }
    }

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
        return this.totalFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.totalFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetailResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, Integer num, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        return new DexOrderDetailResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, num, str14, str15, str16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexOrderDetailResponseBean)) {
            return false;
        }
        DexOrderDetailResponseBean dexOrderDetailResponseBean = (DexOrderDetailResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.networkFee, (Object) dexOrderDetailResponseBean.networkFee) && Intrinsics.EZpvd((Object) this.networkFeeCurrency, (Object) dexOrderDetailResponseBean.networkFeeCurrency) && Intrinsics.EZpvd((Object) this.network, (Object) dexOrderDetailResponseBean.network) && Intrinsics.EZpvd((Object) this.networkIconUrl, (Object) dexOrderDetailResponseBean.networkIconUrl) && Intrinsics.EZpvd((Object) this.serviceFeeCurrency, (Object) dexOrderDetailResponseBean.serviceFeeCurrency) && Intrinsics.EZpvd((Object) this.serviceFeeAmount, (Object) dexOrderDetailResponseBean.serviceFeeAmount) && Intrinsics.EZpvd((Object) this.serviceFeeRate, (Object) dexOrderDetailResponseBean.serviceFeeRate) && Intrinsics.EZpvd((Object) this.totalFeeAmount, (Object) dexOrderDetailResponseBean.totalFeeAmount) && Intrinsics.EZpvd((Object) this.totalFeeCurrency, (Object) dexOrderDetailResponseBean.totalFeeCurrency) && Intrinsics.EZpvd((Object) this.refundAmount, (Object) dexOrderDetailResponseBean.refundAmount) && Intrinsics.EZpvd((Object) this.refundCurrency, (Object) dexOrderDetailResponseBean.refundCurrency) && Intrinsics.EZpvd((Object) this.dexCryptoIconNightUrl, (Object) dexOrderDetailResponseBean.dexCryptoIconNightUrl) && Intrinsics.EZpvd((Object) this.dexCryptoIconDayUrl, (Object) dexOrderDetailResponseBean.dexCryptoIconDayUrl) && Intrinsics.EZpvd(this.fiatOrderStatus, dexOrderDetailResponseBean.fiatOrderStatus) && Intrinsics.EZpvd((Object) this.disclaimerDesc, (Object) dexOrderDetailResponseBean.disclaimerDesc) && Intrinsics.EZpvd((Object) this.disclaimerLearnMoreUrl, (Object) dexOrderDetailResponseBean.disclaimerLearnMoreUrl) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexOrderDetailResponseBean.tokenAddress);
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
    public final String getTotalFeeAmount() {
        return this.totalFeeAmount;
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
        int iHashCode8 = this.totalFeeAmount.hashCode();
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
        return "DexOrderDetailResponseBean(networkFee=" + this.networkFee + ", networkFeeCurrency=" + this.networkFeeCurrency + ", network=" + this.network + ", networkIconUrl=" + this.networkIconUrl + ", serviceFeeCurrency=" + this.serviceFeeCurrency + ", serviceFeeAmount=" + this.serviceFeeAmount + ", serviceFeeRate=" + this.serviceFeeRate + ", totalFeeAmount=" + this.totalFeeAmount + ", totalFeeCurrency=" + this.totalFeeCurrency + ", refundAmount=" + this.refundAmount + ", refundCurrency=" + this.refundCurrency + ", dexCryptoIconNightUrl=" + this.dexCryptoIconNightUrl + ", dexCryptoIconDayUrl=" + this.dexCryptoIconDayUrl + ", fiatOrderStatus=" + this.fiatOrderStatus + ", disclaimerDesc=" + this.disclaimerDesc + ", disclaimerLearnMoreUrl=" + this.disclaimerLearnMoreUrl + ", tokenAddress=" + this.tokenAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.networkFee);
        parcel.writeString(this.networkFeeCurrency);
        parcel.writeString(this.network);
        parcel.writeString(this.networkIconUrl);
        parcel.writeString(this.serviceFeeCurrency);
        parcel.writeString(this.serviceFeeAmount);
        parcel.writeString(this.serviceFeeRate);
        parcel.writeString(this.totalFeeAmount);
        parcel.writeString(this.totalFeeCurrency);
        parcel.writeString(this.refundAmount);
        parcel.writeString(this.refundCurrency);
        parcel.writeString(this.dexCryptoIconNightUrl);
        parcel.writeString(this.dexCryptoIconDayUrl);
        Integer num = this.fiatOrderStatus;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.disclaimerDesc);
        parcel.writeString(this.disclaimerLearnMoreUrl);
        parcel.writeString(this.tokenAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexOrderDetailResponseBean> serializer() {
            return DexOrderDetailResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexOrderDetailResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if (122879 != (i & 122879)) {
            PluginExceptionsKt.throwMissingFieldException(i, 122879, DexOrderDetailResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.networkFee = str;
        this.networkFeeCurrency = str2;
        this.network = str3;
        this.networkIconUrl = str4;
        this.serviceFeeCurrency = str5;
        this.serviceFeeAmount = str6;
        this.serviceFeeRate = str7;
        this.totalFeeAmount = str8;
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

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexOrderDetailResponseBean dexOrderDetailResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dexOrderDetailResponseBean.networkFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dexOrderDetailResponseBean.networkFeeCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dexOrderDetailResponseBean.network);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, dexOrderDetailResponseBean.networkIconUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, dexOrderDetailResponseBean.serviceFeeCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, dexOrderDetailResponseBean.serviceFeeAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, dexOrderDetailResponseBean.serviceFeeRate);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, dexOrderDetailResponseBean.totalFeeAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, dexOrderDetailResponseBean.totalFeeCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, dexOrderDetailResponseBean.refundAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, dexOrderDetailResponseBean.refundCurrency);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, dexOrderDetailResponseBean.dexCryptoIconNightUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, dexOrderDetailResponseBean.dexCryptoIconDayUrl);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dexOrderDetailResponseBean.fiatOrderStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, dexOrderDetailResponseBean.fiatOrderStatus);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 14, dexOrderDetailResponseBean.disclaimerDesc);
        compositeEncoder.encodeStringElement(serialDescriptor, 15, dexOrderDetailResponseBean.disclaimerLearnMoreUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 16, dexOrderDetailResponseBean.tokenAddress);
    }

    public DexOrderDetailResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, Integer num, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        this.totalFeeAmount = str8;
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:185) call: com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexOrderDetailResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, (i & 8192) != 0 ? null : num, str14, str15, str16);
    }
}
