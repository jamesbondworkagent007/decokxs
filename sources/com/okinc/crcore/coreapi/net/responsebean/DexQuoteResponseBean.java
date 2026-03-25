package com.okinc.crcore.coreapi.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DexQuoteResponseBean implements Parcelable {
    private final String activeQuoteTime;
    private final String cefiPrice;
    private final String channelFeeAmount;
    private final String channelFeeCurrency;
    private final String defiPrice;
    private final String dexQuoteId;
    private final String fiatBuyQuoteId;
    private final String fromAmount;
    private final String fromCurrency;
    private final String intermediateCurrency;
    private final String minToAmount;
    private final String networkFeeAmount;
    private final String networkFeeCurrency;
    private final String originalServiceFeeAmount;
    private final String originalServiceFeeRate;
    private final String price;
    private final String referenceDexQuoteId;
    private final String serviceFeeAmount;
    private final String serviceFeeCurrency;
    private final String serviceFeeRate;
    private final boolean serviceFeeRebateApplied;
    private final List<String> slippageRange;
    private final String slippageTolerance;
    private final String toAmount;
    private final String toCurrency;
    private final String totalFeeAmount;
    private final String totalFeeCurrency;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexQuoteResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<DexQuoteResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexQuoteResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexQuoteResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexQuoteResponseBean[] newArray(int i) {
            return new DexQuoteResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexQuoteResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 134217727, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.activeQuoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.totalFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.serviceFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.serviceFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.serviceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.originalServiceFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.originalServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.serviceFeeRebateApplied;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.channelFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.channelFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.dexQuoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.referenceDexQuoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.fiatBuyQuoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component24() {
        return this.slippageRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.intermediateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.cefiPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.defiPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minToAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.slippageTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.networkFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.networkFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexQuoteResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull List<String> list, @NotNull String str23, @NotNull String str24, @NotNull String str25) {
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
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        return new DexQuoteResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z, str17, str18, str19, str20, str21, str22, list, str23, str24, str25);
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
        if (!(obj instanceof DexQuoteResponseBean)) {
            return false;
        }
        DexQuoteResponseBean dexQuoteResponseBean = (DexQuoteResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.activeQuoteTime, (Object) dexQuoteResponseBean.activeQuoteTime) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) dexQuoteResponseBean.fromAmount) && Intrinsics.EZpvd((Object) this.fromCurrency, (Object) dexQuoteResponseBean.fromCurrency) && Intrinsics.EZpvd((Object) this.toAmount, (Object) dexQuoteResponseBean.toAmount) && Intrinsics.EZpvd((Object) this.minToAmount, (Object) dexQuoteResponseBean.minToAmount) && Intrinsics.EZpvd((Object) this.toCurrency, (Object) dexQuoteResponseBean.toCurrency) && Intrinsics.EZpvd((Object) this.slippageTolerance, (Object) dexQuoteResponseBean.slippageTolerance) && Intrinsics.EZpvd((Object) this.networkFeeAmount, (Object) dexQuoteResponseBean.networkFeeAmount) && Intrinsics.EZpvd((Object) this.networkFeeCurrency, (Object) dexQuoteResponseBean.networkFeeCurrency) && Intrinsics.EZpvd((Object) this.totalFeeAmount, (Object) dexQuoteResponseBean.totalFeeAmount) && Intrinsics.EZpvd((Object) this.totalFeeCurrency, (Object) dexQuoteResponseBean.totalFeeCurrency) && Intrinsics.EZpvd((Object) this.serviceFeeAmount, (Object) dexQuoteResponseBean.serviceFeeAmount) && Intrinsics.EZpvd((Object) this.serviceFeeCurrency, (Object) dexQuoteResponseBean.serviceFeeCurrency) && Intrinsics.EZpvd((Object) this.serviceFeeRate, (Object) dexQuoteResponseBean.serviceFeeRate) && Intrinsics.EZpvd((Object) this.originalServiceFeeAmount, (Object) dexQuoteResponseBean.originalServiceFeeAmount) && Intrinsics.EZpvd((Object) this.originalServiceFeeRate, (Object) dexQuoteResponseBean.originalServiceFeeRate) && this.serviceFeeRebateApplied == dexQuoteResponseBean.serviceFeeRebateApplied && Intrinsics.EZpvd((Object) this.channelFeeCurrency, (Object) dexQuoteResponseBean.channelFeeCurrency) && Intrinsics.EZpvd((Object) this.channelFeeAmount, (Object) dexQuoteResponseBean.channelFeeAmount) && Intrinsics.EZpvd((Object) this.dexQuoteId, (Object) dexQuoteResponseBean.dexQuoteId) && Intrinsics.EZpvd((Object) this.referenceDexQuoteId, (Object) dexQuoteResponseBean.referenceDexQuoteId) && Intrinsics.EZpvd((Object) this.fiatBuyQuoteId, (Object) dexQuoteResponseBean.fiatBuyQuoteId) && Intrinsics.EZpvd((Object) this.price, (Object) dexQuoteResponseBean.price) && Intrinsics.EZpvd(this.slippageRange, dexQuoteResponseBean.slippageRange) && Intrinsics.EZpvd((Object) this.intermediateCurrency, (Object) dexQuoteResponseBean.intermediateCurrency) && Intrinsics.EZpvd((Object) this.cefiPrice, (Object) dexQuoteResponseBean.cefiPrice) && Intrinsics.EZpvd((Object) this.defiPrice, (Object) dexQuoteResponseBean.defiPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveQuoteTime() {
        return this.activeQuoteTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCefiPrice() {
        return this.cefiPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelFeeAmount() {
        return this.channelFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelFeeCurrency() {
        return this.channelFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPrice() {
        return this.defiPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexQuoteId() {
        return this.dexQuoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatBuyQuoteId() {
        return this.fiatBuyQuoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCurrency() {
        return this.fromCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntermediateCurrency() {
        return this.intermediateCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinToAmount() {
        return this.minToAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeAmount() {
        return this.networkFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFeeCurrency() {
        return this.networkFeeCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalServiceFeeAmount() {
        return this.originalServiceFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalServiceFeeRate() {
        return this.originalServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferenceDexQuoteId() {
        return this.referenceDexQuoteId;
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
    public final boolean getServiceFeeRebateApplied() {
        return this.serviceFeeRebateApplied;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSlippageRange() {
        return this.slippageRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageTolerance() {
        return this.slippageTolerance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCurrency() {
        return this.toCurrency;
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.activeQuoteTime.hashCode() * 31) + this.fromAmount.hashCode()) * 31) + this.fromCurrency.hashCode()) * 31) + this.toAmount.hashCode()) * 31) + this.minToAmount.hashCode()) * 31) + this.toCurrency.hashCode()) * 31) + this.slippageTolerance.hashCode()) * 31) + this.networkFeeAmount.hashCode()) * 31) + this.networkFeeCurrency.hashCode()) * 31) + this.totalFeeAmount.hashCode()) * 31) + this.totalFeeCurrency.hashCode()) * 31) + this.serviceFeeAmount.hashCode()) * 31) + this.serviceFeeCurrency.hashCode()) * 31) + this.serviceFeeRate.hashCode()) * 31) + this.originalServiceFeeAmount.hashCode()) * 31) + this.originalServiceFeeRate.hashCode()) * 31) + Boolean.hashCode(this.serviceFeeRebateApplied)) * 31) + this.channelFeeCurrency.hashCode()) * 31) + this.channelFeeAmount.hashCode()) * 31) + this.dexQuoteId.hashCode()) * 31) + this.referenceDexQuoteId.hashCode()) * 31) + this.fiatBuyQuoteId.hashCode()) * 31) + this.price.hashCode()) * 31) + this.slippageRange.hashCode()) * 31) + this.intermediateCurrency.hashCode()) * 31) + this.cefiPrice.hashCode()) * 31) + this.defiPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexQuoteResponseBean(activeQuoteTime=" + this.activeQuoteTime + ", fromAmount=" + this.fromAmount + ", fromCurrency=" + this.fromCurrency + ", toAmount=" + this.toAmount + ", minToAmount=" + this.minToAmount + ", toCurrency=" + this.toCurrency + ", slippageTolerance=" + this.slippageTolerance + ", networkFeeAmount=" + this.networkFeeAmount + ", networkFeeCurrency=" + this.networkFeeCurrency + ", totalFeeAmount=" + this.totalFeeAmount + ", totalFeeCurrency=" + this.totalFeeCurrency + ", serviceFeeAmount=" + this.serviceFeeAmount + ", serviceFeeCurrency=" + this.serviceFeeCurrency + ", serviceFeeRate=" + this.serviceFeeRate + ", originalServiceFeeAmount=" + this.originalServiceFeeAmount + ", originalServiceFeeRate=" + this.originalServiceFeeRate + ", serviceFeeRebateApplied=" + this.serviceFeeRebateApplied + ", channelFeeCurrency=" + this.channelFeeCurrency + ", channelFeeAmount=" + this.channelFeeAmount + ", dexQuoteId=" + this.dexQuoteId + ", referenceDexQuoteId=" + this.referenceDexQuoteId + ", fiatBuyQuoteId=" + this.fiatBuyQuoteId + ", price=" + this.price + ", slippageRange=" + this.slippageRange + ", intermediateCurrency=" + this.intermediateCurrency + ", cefiPrice=" + this.cefiPrice + ", defiPrice=" + this.defiPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.activeQuoteTime);
        parcel.writeString(this.fromAmount);
        parcel.writeString(this.fromCurrency);
        parcel.writeString(this.toAmount);
        parcel.writeString(this.minToAmount);
        parcel.writeString(this.toCurrency);
        parcel.writeString(this.slippageTolerance);
        parcel.writeString(this.networkFeeAmount);
        parcel.writeString(this.networkFeeCurrency);
        parcel.writeString(this.totalFeeAmount);
        parcel.writeString(this.totalFeeCurrency);
        parcel.writeString(this.serviceFeeAmount);
        parcel.writeString(this.serviceFeeCurrency);
        parcel.writeString(this.serviceFeeRate);
        parcel.writeString(this.originalServiceFeeAmount);
        parcel.writeString(this.originalServiceFeeRate);
        parcel.writeInt(this.serviceFeeRebateApplied ? 1 : 0);
        parcel.writeString(this.channelFeeCurrency);
        parcel.writeString(this.channelFeeAmount);
        parcel.writeString(this.dexQuoteId);
        parcel.writeString(this.referenceDexQuoteId);
        parcel.writeString(this.fiatBuyQuoteId);
        parcel.writeString(this.price);
        parcel.writeStringList(this.slippageRange);
        parcel.writeString(this.intermediateCurrency);
        parcel.writeString(this.cefiPrice);
        parcel.writeString(this.defiPrice);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.DexQuoteResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexQuoteResponseBean> serializer() {
            return DexQuoteResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexQuoteResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String str19, String str20, String str21, String str22, List list, String str23, String str24, String str25, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.activeQuoteTime = "";
        } else {
            this.activeQuoteTime = str;
        }
        if ((i & 2) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str2;
        }
        if ((i & 4) == 0) {
            this.fromCurrency = "";
        } else {
            this.fromCurrency = str3;
        }
        if ((i & 8) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str4;
        }
        if ((i & 16) == 0) {
            this.minToAmount = "";
        } else {
            this.minToAmount = str5;
        }
        if ((i & 32) == 0) {
            this.toCurrency = "";
        } else {
            this.toCurrency = str6;
        }
        if ((i & 64) == 0) {
            this.slippageTolerance = "";
        } else {
            this.slippageTolerance = str7;
        }
        if ((i & 128) == 0) {
            this.networkFeeAmount = "";
        } else {
            this.networkFeeAmount = str8;
        }
        if ((i & 256) == 0) {
            this.networkFeeCurrency = "";
        } else {
            this.networkFeeCurrency = str9;
        }
        if ((i & 512) == 0) {
            this.totalFeeAmount = "";
        } else {
            this.totalFeeAmount = str10;
        }
        if ((i & 1024) == 0) {
            this.totalFeeCurrency = "";
        } else {
            this.totalFeeCurrency = str11;
        }
        if ((i & 2048) == 0) {
            this.serviceFeeAmount = "";
        } else {
            this.serviceFeeAmount = str12;
        }
        if ((i & 4096) == 0) {
            this.serviceFeeCurrency = "";
        } else {
            this.serviceFeeCurrency = str13;
        }
        if ((i & 8192) == 0) {
            this.serviceFeeRate = "";
        } else {
            this.serviceFeeRate = str14;
        }
        if ((i & 16384) == 0) {
            this.originalServiceFeeAmount = "";
        } else {
            this.originalServiceFeeAmount = str15;
        }
        if ((32768 & i) == 0) {
            this.originalServiceFeeRate = "";
        } else {
            this.originalServiceFeeRate = str16;
        }
        this.serviceFeeRebateApplied = (65536 & i) == 0 ? false : z;
        if ((131072 & i) == 0) {
            this.channelFeeCurrency = "";
        } else {
            this.channelFeeCurrency = str17;
        }
        if ((262144 & i) == 0) {
            this.channelFeeAmount = "";
        } else {
            this.channelFeeAmount = str18;
        }
        if ((524288 & i) == 0) {
            this.dexQuoteId = "";
        } else {
            this.dexQuoteId = str19;
        }
        if ((1048576 & i) == 0) {
            this.referenceDexQuoteId = "";
        } else {
            this.referenceDexQuoteId = str20;
        }
        if ((2097152 & i) == 0) {
            this.fiatBuyQuoteId = "";
        } else {
            this.fiatBuyQuoteId = str21;
        }
        if ((4194304 & i) == 0) {
            this.price = "";
        } else {
            this.price = str22;
        }
        this.slippageRange = (8388608 & i) == 0 ? yDY.AhwBna() : list;
        if ((16777216 & i) == 0) {
            this.intermediateCurrency = "";
        } else {
            this.intermediateCurrency = str23;
        }
        if ((33554432 & i) == 0) {
            this.cefiPrice = "";
        } else {
            this.cefiPrice = str24;
        }
        if ((i & 67108864) == 0) {
            this.defiPrice = "";
        } else {
            this.defiPrice = str25;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexQuoteResponseBean dexQuoteResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.activeQuoteTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexQuoteResponseBean.activeQuoteTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexQuoteResponseBean.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.fromCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexQuoteResponseBean.fromCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexQuoteResponseBean.toAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.minToAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexQuoteResponseBean.minToAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.toCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexQuoteResponseBean.toCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.slippageTolerance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexQuoteResponseBean.slippageTolerance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.networkFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexQuoteResponseBean.networkFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.networkFeeCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexQuoteResponseBean.networkFeeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.totalFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexQuoteResponseBean.totalFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.totalFeeCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexQuoteResponseBean.totalFeeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.serviceFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexQuoteResponseBean.serviceFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.serviceFeeCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexQuoteResponseBean.serviceFeeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.serviceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, dexQuoteResponseBean.serviceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.originalServiceFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, dexQuoteResponseBean.originalServiceFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.originalServiceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, dexQuoteResponseBean.originalServiceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || dexQuoteResponseBean.serviceFeeRebateApplied) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, dexQuoteResponseBean.serviceFeeRebateApplied);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.channelFeeCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, dexQuoteResponseBean.channelFeeCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.channelFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, dexQuoteResponseBean.channelFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.dexQuoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, dexQuoteResponseBean.dexQuoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.referenceDexQuoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, dexQuoteResponseBean.referenceDexQuoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.fiatBuyQuoteId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, dexQuoteResponseBean.fiatBuyQuoteId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, dexQuoteResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd(dexQuoteResponseBean.slippageRange, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 23, kSerializerArr[23], dexQuoteResponseBean.slippageRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.intermediateCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, dexQuoteResponseBean.intermediateCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) dexQuoteResponseBean.cefiPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, dexQuoteResponseBean.cefiPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && Intrinsics.EZpvd((Object) dexQuoteResponseBean.defiPrice, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 26, dexQuoteResponseBean.defiPrice);
    }

    public DexQuoteResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, boolean z, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull List<String> list, @NotNull String str23, @NotNull String str24, @NotNull String str25) {
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
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        this.activeQuoteTime = str;
        this.fromAmount = str2;
        this.fromCurrency = str3;
        this.toAmount = str4;
        this.minToAmount = str5;
        this.toCurrency = str6;
        this.slippageTolerance = str7;
        this.networkFeeAmount = str8;
        this.networkFeeCurrency = str9;
        this.totalFeeAmount = str10;
        this.totalFeeCurrency = str11;
        this.serviceFeeAmount = str12;
        this.serviceFeeCurrency = str13;
        this.serviceFeeRate = str14;
        this.originalServiceFeeAmount = str15;
        this.originalServiceFeeRate = str16;
        this.serviceFeeRebateApplied = z;
        this.channelFeeCurrency = str17;
        this.channelFeeAmount = str18;
        this.dexQuoteId = str19;
        this.referenceDexQuoteId = str20;
        this.fiatBuyQuoteId = str21;
        this.price = str22;
        this.slippageRange = list;
        this.intermediateCurrency = str23;
        this.cefiPrice = str24;
        this.defiPrice = str25;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x013e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r56v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00da: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00de: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:39)) : (r52v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r56v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r56v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.responsebean.DexQuoteResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexQuoteResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, String str18, String str19, String str20, String str21, String str22, List list, String str23, String str24, String str25, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? false : z, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? "" : str22, (i & 8388608) != 0 ? yDY.AhwBna() : list, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? "" : str25);
    }
}
