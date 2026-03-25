package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class GasPrice implements Parcelable {
    private String average;
    private String averageCost;
    private String baseFee;
    private String fast;
    private String fastCost;
    private String fastPriorityFee;
    private String gasPriceUnit;
    private Integer gweiPrecision;
    private String proposePriorityFee;
    private String safePriorityFee;
    private String slow;
    private String slowCost;
    private String suggestBaseFee;
    private Boolean supportEip1559;
    private String usdAverage;
    private String usdFast;
    private String usdLow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GasPrice> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<GasPrice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasPrice createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GasPrice(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, numValueOf, string13, string14, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasPrice[] newArray(int i) {
            return new GasPrice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GasPrice() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (Boolean) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.slowCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fastCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.gweiPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.gasPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.average;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.safePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.proposePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fastPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.usdLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.usdAverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.usdFast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, Boolean bool, String str15) {
        return new GasPrice(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, num, str13, str14, bool, str15);
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
        if (!(obj instanceof GasPrice)) {
            return false;
        }
        GasPrice gasPrice = (GasPrice) obj;
        return Intrinsics.EZpvd((Object) this.slow, (Object) gasPrice.slow) && Intrinsics.EZpvd((Object) this.average, (Object) gasPrice.average) && Intrinsics.EZpvd((Object) this.fast, (Object) gasPrice.fast) && Intrinsics.EZpvd((Object) this.safePriorityFee, (Object) gasPrice.safePriorityFee) && Intrinsics.EZpvd((Object) this.proposePriorityFee, (Object) gasPrice.proposePriorityFee) && Intrinsics.EZpvd((Object) this.fastPriorityFee, (Object) gasPrice.fastPriorityFee) && Intrinsics.EZpvd((Object) this.usdLow, (Object) gasPrice.usdLow) && Intrinsics.EZpvd((Object) this.usdAverage, (Object) gasPrice.usdAverage) && Intrinsics.EZpvd((Object) this.usdFast, (Object) gasPrice.usdFast) && Intrinsics.EZpvd((Object) this.slowCost, (Object) gasPrice.slowCost) && Intrinsics.EZpvd((Object) this.averageCost, (Object) gasPrice.averageCost) && Intrinsics.EZpvd((Object) this.fastCost, (Object) gasPrice.fastCost) && Intrinsics.EZpvd(this.gweiPrecision, gasPrice.gweiPrecision) && Intrinsics.EZpvd((Object) this.suggestBaseFee, (Object) gasPrice.suggestBaseFee) && Intrinsics.EZpvd((Object) this.baseFee, (Object) gasPrice.baseFee) && Intrinsics.EZpvd(this.supportEip1559, gasPrice.supportEip1559) && Intrinsics.EZpvd((Object) this.gasPriceUnit, (Object) gasPrice.gasPriceUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverage() {
        return this.average;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageCost() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFast() {
        return this.fast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastCost() {
        return this.fastCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastPriorityFee() {
        return this.fastPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceUnit() {
        return this.gasPriceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGweiPrecision() {
        return this.gweiPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProposePriorityFee() {
        return this.proposePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafePriorityFee() {
        return this.safePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlow() {
        return this.slow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlowCost() {
        return this.slowCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuggestBaseFee() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAverage() {
        return this.usdAverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdFast() {
        return this.usdFast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdLow() {
        return this.usdLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.slow;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.average;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fast;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.safePriorityFee;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.proposePriorityFee;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.fastPriorityFee;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.usdLow;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.usdAverage;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.usdFast;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.slowCost;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.averageCost;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.fastCost;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        Integer num = this.gweiPrecision;
        int iHashCode13 = num == null ? 0 : num.hashCode();
        String str13 = this.suggestBaseFee;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.baseFee;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        Boolean bool = this.supportEip1559;
        int iHashCode16 = bool == null ? 0 : bool.hashCode();
        String str15 = this.gasPriceUnit;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str15 == null ? 0 : str15.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAverage(String str) {
        this.average = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAverageCost(String str) {
        this.averageCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseFee(String str) {
        this.baseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFast(String str) {
        this.fast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastCost(String str) {
        this.fastCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastPriorityFee(String str) {
        this.fastPriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPriceUnit(String str) {
        this.gasPriceUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGweiPrecision(Integer num) {
        this.gweiPrecision = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProposePriorityFee(String str) {
        this.proposePriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSafePriorityFee(String str) {
        this.safePriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlow(String str) {
        this.slow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlowCost(String str) {
        this.slowCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuggestBaseFee(String str) {
        this.suggestBaseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportEip1559(Boolean bool) {
        this.supportEip1559 = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdAverage(String str) {
        this.usdAverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdFast(String str) {
        this.usdFast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdLow(String str) {
        this.usdLow = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GasPrice(slow=" + this.slow + ", average=" + this.average + ", fast=" + this.fast + ", safePriorityFee=" + this.safePriorityFee + ", proposePriorityFee=" + this.proposePriorityFee + ", fastPriorityFee=" + this.fastPriorityFee + ", usdLow=" + this.usdLow + ", usdAverage=" + this.usdAverage + ", usdFast=" + this.usdFast + ", slowCost=" + this.slowCost + ", averageCost=" + this.averageCost + ", fastCost=" + this.fastCost + ", gweiPrecision=" + this.gweiPrecision + ", suggestBaseFee=" + this.suggestBaseFee + ", baseFee=" + this.baseFee + ", supportEip1559=" + this.supportEip1559 + ", gasPriceUnit=" + this.gasPriceUnit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.slow);
        parcel.writeString(this.average);
        parcel.writeString(this.fast);
        parcel.writeString(this.safePriorityFee);
        parcel.writeString(this.proposePriorityFee);
        parcel.writeString(this.fastPriorityFee);
        parcel.writeString(this.usdLow);
        parcel.writeString(this.usdAverage);
        parcel.writeString(this.usdFast);
        parcel.writeString(this.slowCost);
        parcel.writeString(this.averageCost);
        parcel.writeString(this.fastCost);
        Integer num = this.gweiPrecision;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.suggestBaseFee);
        parcel.writeString(this.baseFee);
        Boolean bool = this.supportEip1559;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.gasPriceUnit);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.GasPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GasPrice> serializer() {
            return GasPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GasPrice(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, Boolean bool, String str15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.slow = null;
        } else {
            this.slow = str;
        }
        if ((i & 2) == 0) {
            this.average = null;
        } else {
            this.average = str2;
        }
        if ((i & 4) == 0) {
            this.fast = null;
        } else {
            this.fast = str3;
        }
        if ((i & 8) == 0) {
            this.safePriorityFee = null;
        } else {
            this.safePriorityFee = str4;
        }
        if ((i & 16) == 0) {
            this.proposePriorityFee = null;
        } else {
            this.proposePriorityFee = str5;
        }
        if ((i & 32) == 0) {
            this.fastPriorityFee = null;
        } else {
            this.fastPriorityFee = str6;
        }
        if ((i & 64) == 0) {
            this.usdLow = null;
        } else {
            this.usdLow = str7;
        }
        if ((i & 128) == 0) {
            this.usdAverage = null;
        } else {
            this.usdAverage = str8;
        }
        if ((i & 256) == 0) {
            this.usdFast = null;
        } else {
            this.usdFast = str9;
        }
        if ((i & 512) == 0) {
            this.slowCost = null;
        } else {
            this.slowCost = str10;
        }
        if ((i & 1024) == 0) {
            this.averageCost = null;
        } else {
            this.averageCost = str11;
        }
        if ((i & 2048) == 0) {
            this.fastCost = null;
        } else {
            this.fastCost = str12;
        }
        if ((i & 4096) == 0) {
            this.gweiPrecision = null;
        } else {
            this.gweiPrecision = num;
        }
        if ((i & 8192) == 0) {
            this.suggestBaseFee = null;
        } else {
            this.suggestBaseFee = str13;
        }
        if ((i & 16384) == 0) {
            this.baseFee = null;
        } else {
            this.baseFee = str14;
        }
        if ((32768 & i) == 0) {
            this.supportEip1559 = null;
        } else {
            this.supportEip1559 = bool;
        }
        if ((i & 65536) == 0) {
            this.gasPriceUnit = null;
        } else {
            this.gasPriceUnit = str15;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(GasPrice gasPrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || gasPrice.slow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, gasPrice.slow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || gasPrice.average != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, gasPrice.average);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || gasPrice.fast != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, gasPrice.fast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || gasPrice.safePriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, gasPrice.safePriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || gasPrice.proposePriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, gasPrice.proposePriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || gasPrice.fastPriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, gasPrice.fastPriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || gasPrice.usdLow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, gasPrice.usdLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || gasPrice.usdAverage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, gasPrice.usdAverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || gasPrice.usdFast != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, gasPrice.usdFast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || gasPrice.slowCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, gasPrice.slowCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || gasPrice.averageCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, gasPrice.averageCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || gasPrice.fastCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, gasPrice.fastCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || gasPrice.gweiPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, gasPrice.gweiPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || gasPrice.suggestBaseFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, gasPrice.suggestBaseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || gasPrice.baseFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, gasPrice.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || gasPrice.supportEip1559 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, gasPrice.supportEip1559);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && gasPrice.gasPriceUnit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, gasPrice.gasPriceUnit);
    }

    public GasPrice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, Boolean bool, String str15) {
        this.slow = str;
        this.average = str2;
        this.fast = str3;
        this.safePriorityFee = str4;
        this.proposePriorityFee = str5;
        this.fastPriorityFee = str6;
        this.usdLow = str7;
        this.usdAverage = str8;
        this.usdFast = str9;
        this.slowCost = str10;
        this.averageCost = str11;
        this.fastCost = str12;
        this.gweiPrecision = num;
        this.suggestBaseFee = str13;
        this.baseFee = str14;
        this.supportEip1559 = bool;
        this.gasPriceUnit = str15;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:375) call: com.okinc.business.defi.biz.net.bean.GasPrice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ GasPrice(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, Boolean bool, String str15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : str15);
    }
}
