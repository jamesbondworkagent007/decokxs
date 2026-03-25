package com.okinc.buysell.ui.result.view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AssetMaxApyEarnInfo implements Parcelable {
    private String capitalTypeMsg;
    private String currencyFullName;
    private String currencyIcon;
    private Integer currencyId;
    private String period;
    private Integer productsType;
    private String projectIcon;
    private String projectName;
    private String projectType;
    private String rate;
    private Double rateRangeMax;
    private Double rateRangeMin;
    private Integer redeemDay;
    private Integer savingType;
    private Integer type;
    private String unit;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetMaxApyEarnInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AssetMaxApyEarnInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetMaxApyEarnInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetMaxApyEarnInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetMaxApyEarnInfo[] newArray(int i) {
            return new AssetMaxApyEarnInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetMaxApyEarnInfo() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Double) null, (Double) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.capitalTypeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component11() {
        return this.rateRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component12() {
        return this.rateRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.redeemDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.savingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.productsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.projectIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.projectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.projectType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetMaxApyEarnInfo copy(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, Double d, Double d2, Integer num3, Integer num4, Integer num5, String str9, String str10) {
        return new AssetMaxApyEarnInfo(str, str2, str3, num, str4, num2, str5, str6, str7, str8, d, d2, num3, num4, num5, str9, str10);
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
        if (!(obj instanceof AssetMaxApyEarnInfo)) {
            return false;
        }
        AssetMaxApyEarnInfo assetMaxApyEarnInfo = (AssetMaxApyEarnInfo) obj;
        return Intrinsics.EZpvd((Object) this.capitalTypeMsg, (Object) assetMaxApyEarnInfo.capitalTypeMsg) && Intrinsics.EZpvd((Object) this.currencyFullName, (Object) assetMaxApyEarnInfo.currencyFullName) && Intrinsics.EZpvd((Object) this.currencyIcon, (Object) assetMaxApyEarnInfo.currencyIcon) && Intrinsics.EZpvd(this.currencyId, assetMaxApyEarnInfo.currencyId) && Intrinsics.EZpvd((Object) this.period, (Object) assetMaxApyEarnInfo.period) && Intrinsics.EZpvd(this.productsType, assetMaxApyEarnInfo.productsType) && Intrinsics.EZpvd((Object) this.projectIcon, (Object) assetMaxApyEarnInfo.projectIcon) && Intrinsics.EZpvd((Object) this.projectName, (Object) assetMaxApyEarnInfo.projectName) && Intrinsics.EZpvd((Object) this.projectType, (Object) assetMaxApyEarnInfo.projectType) && Intrinsics.EZpvd((Object) this.rate, (Object) assetMaxApyEarnInfo.rate) && Intrinsics.EZpvd(this.rateRangeMax, assetMaxApyEarnInfo.rateRangeMax) && Intrinsics.EZpvd(this.rateRangeMin, assetMaxApyEarnInfo.rateRangeMin) && Intrinsics.EZpvd(this.redeemDay, assetMaxApyEarnInfo.redeemDay) && Intrinsics.EZpvd(this.savingType, assetMaxApyEarnInfo.savingType) && Intrinsics.EZpvd(this.type, assetMaxApyEarnInfo.type) && Intrinsics.EZpvd((Object) this.unit, (Object) assetMaxApyEarnInfo.unit) && Intrinsics.EZpvd((Object) this.url, (Object) assetMaxApyEarnInfo.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCapitalTypeMsg() {
        return this.capitalTypeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyIcon() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProductsType() {
        return this.productsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectIcon() {
        return this.projectIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectName() {
        return this.projectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectType() {
        return this.projectType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getRateRangeMax() {
        return this.rateRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getRateRangeMin() {
        return this.rateRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRedeemDay() {
        return this.redeemDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSavingType() {
        return this.savingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.capitalTypeMsg;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currencyFullName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currencyIcon;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.currencyId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.period;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.productsType;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.projectIcon;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.projectName;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.projectType;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.rate;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        Double d = this.rateRangeMax;
        int iHashCode11 = d == null ? 0 : d.hashCode();
        Double d2 = this.rateRangeMin;
        int iHashCode12 = d2 == null ? 0 : d2.hashCode();
        Integer num3 = this.redeemDay;
        int iHashCode13 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.savingType;
        int iHashCode14 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.type;
        int iHashCode15 = num5 == null ? 0 : num5.hashCode();
        String str9 = this.unit;
        int iHashCode16 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.url;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str10 == null ? 0 : str10.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCapitalTypeMsg(String str) {
        this.capitalTypeMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyFullName(String str) {
        this.currencyFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyIcon(String str) {
        this.currencyIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPeriod(String str) {
        this.period = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProductsType(Integer num) {
        this.productsType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectIcon(String str) {
        this.projectIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectName(String str) {
        this.projectName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectType(String str) {
        this.projectType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(String str) {
        this.rate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateRangeMax(Double d) {
        this.rateRangeMax = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateRangeMin(Double d) {
        this.rateRangeMin = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedeemDay(Integer num) {
        this.redeemDay = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSavingType(Integer num) {
        this.savingType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnit(String str) {
        this.unit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetMaxApyEarnInfo(capitalTypeMsg=" + this.capitalTypeMsg + ", currencyFullName=" + this.currencyFullName + ", currencyIcon=" + this.currencyIcon + ", currencyId=" + this.currencyId + ", period=" + this.period + ", productsType=" + this.productsType + ", projectIcon=" + this.projectIcon + ", projectName=" + this.projectName + ", projectType=" + this.projectType + ", rate=" + this.rate + ", rateRangeMax=" + this.rateRangeMax + ", rateRangeMin=" + this.rateRangeMin + ", redeemDay=" + this.redeemDay + ", savingType=" + this.savingType + ", type=" + this.type + ", unit=" + this.unit + ", url=" + this.url + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.capitalTypeMsg);
        parcel.writeString(this.currencyFullName);
        parcel.writeString(this.currencyIcon);
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.period);
        Integer num2 = this.productsType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.projectIcon);
        parcel.writeString(this.projectName);
        parcel.writeString(this.projectType);
        parcel.writeString(this.rate);
        Double d = this.rateRangeMax;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.rateRangeMin;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Integer num3 = this.redeemDay;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.savingType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.type;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeString(this.unit);
        parcel.writeString(this.url);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.result.view.AssetMaxApyEarnInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetMaxApyEarnInfo> serializer() {
            return AssetMaxApyEarnInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetMaxApyEarnInfo(int i, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, Double d, Double d2, Integer num3, Integer num4, Integer num5, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.capitalTypeMsg = null;
        } else {
            this.capitalTypeMsg = str;
        }
        if ((i & 2) == 0) {
            this.currencyFullName = null;
        } else {
            this.currencyFullName = str2;
        }
        if ((i & 4) == 0) {
            this.currencyIcon = null;
        } else {
            this.currencyIcon = str3;
        }
        if ((i & 8) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 16) == 0) {
            this.period = null;
        } else {
            this.period = str4;
        }
        if ((i & 32) == 0) {
            this.productsType = null;
        } else {
            this.productsType = num2;
        }
        if ((i & 64) == 0) {
            this.projectIcon = null;
        } else {
            this.projectIcon = str5;
        }
        if ((i & 128) == 0) {
            this.projectName = null;
        } else {
            this.projectName = str6;
        }
        if ((i & 256) == 0) {
            this.projectType = null;
        } else {
            this.projectType = str7;
        }
        if ((i & 512) == 0) {
            this.rate = null;
        } else {
            this.rate = str8;
        }
        if ((i & 1024) == 0) {
            this.rateRangeMax = null;
        } else {
            this.rateRangeMax = d;
        }
        if ((i & 2048) == 0) {
            this.rateRangeMin = null;
        } else {
            this.rateRangeMin = d2;
        }
        if ((i & 4096) == 0) {
            this.redeemDay = null;
        } else {
            this.redeemDay = num3;
        }
        if ((i & 8192) == 0) {
            this.savingType = null;
        } else {
            this.savingType = num4;
        }
        if ((i & 16384) == 0) {
            this.type = null;
        } else {
            this.type = num5;
        }
        if ((32768 & i) == 0) {
            this.unit = null;
        } else {
            this.unit = str9;
        }
        if ((i & 65536) == 0) {
            this.url = null;
        } else {
            this.url = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKBuySell_buysell_impl(AssetMaxApyEarnInfo assetMaxApyEarnInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || assetMaxApyEarnInfo.capitalTypeMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, assetMaxApyEarnInfo.capitalTypeMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetMaxApyEarnInfo.currencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetMaxApyEarnInfo.currencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || assetMaxApyEarnInfo.currencyIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetMaxApyEarnInfo.currencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || assetMaxApyEarnInfo.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, assetMaxApyEarnInfo.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || assetMaxApyEarnInfo.period != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, assetMaxApyEarnInfo.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || assetMaxApyEarnInfo.productsType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, assetMaxApyEarnInfo.productsType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || assetMaxApyEarnInfo.projectIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, assetMaxApyEarnInfo.projectIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || assetMaxApyEarnInfo.projectName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, assetMaxApyEarnInfo.projectName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || assetMaxApyEarnInfo.projectType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, assetMaxApyEarnInfo.projectType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || assetMaxApyEarnInfo.rate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, assetMaxApyEarnInfo.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || assetMaxApyEarnInfo.rateRangeMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DoubleSerializer.INSTANCE, assetMaxApyEarnInfo.rateRangeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || assetMaxApyEarnInfo.rateRangeMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, DoubleSerializer.INSTANCE, assetMaxApyEarnInfo.rateRangeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || assetMaxApyEarnInfo.redeemDay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, assetMaxApyEarnInfo.redeemDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || assetMaxApyEarnInfo.savingType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, assetMaxApyEarnInfo.savingType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || assetMaxApyEarnInfo.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, assetMaxApyEarnInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || assetMaxApyEarnInfo.unit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, assetMaxApyEarnInfo.unit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && assetMaxApyEarnInfo.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, assetMaxApyEarnInfo.url);
    }

    public AssetMaxApyEarnInfo(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, Double d, Double d2, Integer num3, Integer num4, Integer num5, String str9, String str10) {
        this.capitalTypeMsg = str;
        this.currencyFullName = str2;
        this.currencyIcon = str3;
        this.currencyId = num;
        this.period = str4;
        this.productsType = num2;
        this.projectIcon = str5;
        this.projectName = str6;
        this.projectType = str7;
        this.rate = str8;
        this.rateRangeMax = d;
        this.rateRangeMin = d2;
        this.redeemDay = num3;
        this.savingType = num4;
        this.type = num5;
        this.unit = str9;
        this.url = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002a: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0052: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r29v0 java.lang.Double))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r30v0 java.lang.Double))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0072: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.buysell.ui.result.view.AssetMaxApyEarnInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AssetMaxApyEarnInfo(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, Double d, Double d2, Integer num3, Integer num4, Integer num5, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : d, (i & 2048) != 0 ? null : d2, (i & 4096) != 0 ? null : num3, (i & 8192) != 0 ? null : num4, (i & 16384) != 0 ? null : num5, (i & 32768) != 0 ? null : str9, (i & 65536) != 0 ? null : str10);
    }
}
