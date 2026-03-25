package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.ConvertCurrencyResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.EarnOption;
import com.okinc.crcore.coreapi.net.responsebean.EarnOption$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class ConvertCurrencyBean implements Parcelable {
    private String available;
    private String ccy;
    private String ccyFullName;
    private int ccyId;
    private EarnOption earnOption;
    private Boolean fiatFlag;
    private int flag;
    private String icon;
    private boolean isHide;
    private boolean isSupport;
    private String localChangeRate;
    private String localCurrencyToUsdRate;
    private String localCurrentPrice;
    private String max;
    private String min;
    private int scale;
    private String sign;
    private boolean transferable;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConvertCurrencyBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ConvertCurrencyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertCurrencyBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConvertCurrencyBean(string, i, string2, string3, string4, string5, string6, i2, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? EarnOption.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertCurrencyBean[] newArray(int i) {
            return new ConvertCurrencyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConvertCurrencyBean() {
        this((String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (Boolean) null, (String) null, (String) null, false, false, (String) null, false, 0, (String) null, (EarnOption) null, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isHide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.transferable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.localCurrencyToUsdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption component18() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.ccyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.localCurrentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ccyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.localChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.flag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.fiatFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, Boolean bool, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, @NotNull String str9, boolean z3, int i3, @NotNull String str10, EarnOption earnOption) {
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
        return new ConvertCurrencyBean(str, i, str2, str3, str4, str5, str6, i2, bool, str7, str8, z, z2, str9, z3, i3, str10, earnOption);
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
        if (!(obj instanceof ConvertCurrencyBean)) {
            return false;
        }
        ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) convertCurrencyBean.ccy) && this.ccyId == convertCurrencyBean.ccyId && Intrinsics.EZpvd((Object) this.icon, (Object) convertCurrencyBean.icon) && Intrinsics.EZpvd((Object) this.available, (Object) convertCurrencyBean.available) && Intrinsics.EZpvd((Object) this.localCurrentPrice, (Object) convertCurrencyBean.localCurrentPrice) && Intrinsics.EZpvd((Object) this.ccyFullName, (Object) convertCurrencyBean.ccyFullName) && Intrinsics.EZpvd((Object) this.localChangeRate, (Object) convertCurrencyBean.localChangeRate) && this.flag == convertCurrencyBean.flag && Intrinsics.EZpvd(this.fiatFlag, convertCurrencyBean.fiatFlag) && Intrinsics.EZpvd((Object) this.min, (Object) convertCurrencyBean.min) && Intrinsics.EZpvd((Object) this.max, (Object) convertCurrencyBean.max) && this.isSupport == convertCurrencyBean.isSupport && this.isHide == convertCurrencyBean.isHide && Intrinsics.EZpvd((Object) this.sign, (Object) convertCurrencyBean.sign) && this.transferable == convertCurrencyBean.transferable && this.scale == convertCurrencyBean.scale && Intrinsics.EZpvd((Object) this.localCurrencyToUsdRate, (Object) convertCurrencyBean.localCurrencyToUsdRate) && Intrinsics.EZpvd(this.earnOption, convertCurrencyBean.earnOption);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyFullName() {
        return this.ccyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCcyId() {
        return this.ccyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOption getEarnOption() {
        return this.earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFiatFlag() {
        return this.fiatFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFlag() {
        return this.flag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalChangeRate() {
        return this.localChangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalCurrencyToUsdRate() {
        return this.localCurrencyToUsdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalCurrentPrice() {
        return this.localCurrentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTransferable() {
        return this.transferable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ccy.hashCode();
        int iHashCode2 = Integer.hashCode(this.ccyId);
        int iHashCode3 = this.icon.hashCode();
        int iHashCode4 = this.available.hashCode();
        int iHashCode5 = this.localCurrentPrice.hashCode();
        int iHashCode6 = this.ccyFullName.hashCode();
        int iHashCode7 = this.localChangeRate.hashCode();
        int iHashCode8 = Integer.hashCode(this.flag);
        Boolean bool = this.fiatFlag;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        int iHashCode10 = this.min.hashCode();
        int iHashCode11 = this.max.hashCode();
        int iHashCode12 = Boolean.hashCode(this.isSupport);
        int iHashCode13 = Boolean.hashCode(this.isHide);
        int iHashCode14 = this.sign.hashCode();
        int iHashCode15 = Boolean.hashCode(this.transferable);
        int iHashCode16 = Integer.hashCode(this.scale);
        int iHashCode17 = this.localCurrencyToUsdRate.hashCode();
        EarnOption earnOption = this.earnOption;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (earnOption == null ? 0 : earnOption.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHide() {
        return this.isHide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupport() {
        return this.isSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.available = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcyFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccyFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcyId(int i) {
        this.ccyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnOption(EarnOption earnOption) {
        this.earnOption = earnOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFiatFlag(Boolean bool) {
        this.fiatFlag = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFlag(int i) {
        this.flag = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHide(boolean z) {
        this.isHide = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalChangeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localChangeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalCurrencyToUsdRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localCurrencyToUsdRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalCurrentPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localCurrentPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.max = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.min = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScale(int i) {
        this.scale = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupport(boolean z) {
        this.isSupport = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferable(boolean z) {
        this.transferable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertCurrencyBean(ccy=" + this.ccy + ", ccyId=" + this.ccyId + ", icon=" + this.icon + ", available=" + this.available + ", localCurrentPrice=" + this.localCurrentPrice + ", ccyFullName=" + this.ccyFullName + ", localChangeRate=" + this.localChangeRate + ", flag=" + this.flag + ", fiatFlag=" + this.fiatFlag + ", min=" + this.min + ", max=" + this.max + ", isSupport=" + this.isSupport + ", isHide=" + this.isHide + ", sign=" + this.sign + ", transferable=" + this.transferable + ", scale=" + this.scale + ", localCurrencyToUsdRate=" + this.localCurrencyToUsdRate + ", earnOption=" + this.earnOption + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeInt(this.ccyId);
        parcel.writeString(this.icon);
        parcel.writeString(this.available);
        parcel.writeString(this.localCurrentPrice);
        parcel.writeString(this.ccyFullName);
        parcel.writeString(this.localChangeRate);
        parcel.writeInt(this.flag);
        Boolean bool = this.fiatFlag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.min);
        parcel.writeString(this.max);
        parcel.writeInt(this.isSupport ? 1 : 0);
        parcel.writeInt(this.isHide ? 1 : 0);
        parcel.writeString(this.sign);
        parcel.writeInt(this.transferable ? 1 : 0);
        parcel.writeInt(this.scale);
        parcel.writeString(this.localCurrencyToUsdRate);
        EarnOption earnOption = this.earnOption;
        if (earnOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnOption.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ConvertCurrencyBean(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, Boolean bool, String str7, String str8, boolean z, boolean z2, String str9, boolean z3, int i4, String str10, EarnOption earnOption, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.ccyId = 0;
        } else {
            this.ccyId = i2;
        }
        if ((i & 4) == 0) {
            this.icon = "";
        } else {
            this.icon = str2;
        }
        if ((i & 8) == 0) {
            this.available = "";
        } else {
            this.available = str3;
        }
        if ((i & 16) == 0) {
            this.localCurrentPrice = "";
        } else {
            this.localCurrentPrice = str4;
        }
        if ((i & 32) == 0) {
            this.ccyFullName = "";
        } else {
            this.ccyFullName = str5;
        }
        if ((i & 64) == 0) {
            this.localChangeRate = "";
        } else {
            this.localChangeRate = str6;
        }
        if ((i & 128) == 0) {
            this.flag = 0;
        } else {
            this.flag = i3;
        }
        this.fiatFlag = (i & 256) == 0 ? Boolean.FALSE : bool;
        if ((i & 512) == 0) {
            this.min = "";
        } else {
            this.min = str7;
        }
        if ((i & 1024) == 0) {
            this.max = "";
        } else {
            this.max = str8;
        }
        if ((i & 2048) == 0) {
            this.isSupport = false;
        } else {
            this.isSupport = z;
        }
        if ((i & 4096) == 0) {
            this.isHide = false;
        } else {
            this.isHide = z2;
        }
        if ((i & 8192) == 0) {
            this.sign = "";
        } else {
            this.sign = str9;
        }
        if ((i & 16384) == 0) {
            this.transferable = false;
        } else {
            this.transferable = z3;
        }
        this.scale = (32768 & i) == 0 ? 8 : i4;
        if ((65536 & i) == 0) {
            this.localCurrencyToUsdRate = "";
        } else {
            this.localCurrencyToUsdRate = str10;
        }
        this.earnOption = (i & 131072) == 0 ? null : earnOption;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ConvertCurrencyBean convertCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) convertCurrencyBean.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, convertCurrencyBean.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || convertCurrencyBean.ccyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, convertCurrencyBean.ccyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) convertCurrencyBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, convertCurrencyBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) convertCurrencyBean.available, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, convertCurrencyBean.available);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) convertCurrencyBean.localCurrentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, convertCurrencyBean.localCurrentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) convertCurrencyBean.ccyFullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, convertCurrencyBean.ccyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) convertCurrencyBean.localChangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, convertCurrencyBean.localChangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || convertCurrencyBean.flag != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, convertCurrencyBean.flag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(convertCurrencyBean.fiatFlag, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, convertCurrencyBean.fiatFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) convertCurrencyBean.min, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, convertCurrencyBean.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) convertCurrencyBean.max, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, convertCurrencyBean.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || convertCurrencyBean.isSupport) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, convertCurrencyBean.isSupport);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || convertCurrencyBean.isHide) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, convertCurrencyBean.isHide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) convertCurrencyBean.sign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, convertCurrencyBean.sign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || convertCurrencyBean.transferable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, convertCurrencyBean.transferable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || convertCurrencyBean.scale != 8) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, convertCurrencyBean.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) convertCurrencyBean.localCurrencyToUsdRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, convertCurrencyBean.localCurrencyToUsdRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && convertCurrencyBean.earnOption == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, EarnOption$$serializer.INSTANCE, convertCurrencyBean.earnOption);
    }

    public ConvertCurrencyBean(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i2, Boolean bool, @NotNull String str7, @NotNull String str8, boolean z, boolean z2, @NotNull String str9, boolean z3, int i3, @NotNull String str10, EarnOption earnOption) {
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
        this.ccy = str;
        this.ccyId = i;
        this.icon = str2;
        this.available = str3;
        this.localCurrentPrice = str4;
        this.ccyFullName = str5;
        this.localChangeRate = str6;
        this.flag = i2;
        this.fiatFlag = bool;
        this.min = str7;
        this.max = str8;
        this.isSupport = z;
        this.isHide = z2;
        this.sign = str9;
        this.transferable = z3;
        this.scale = i3;
        this.localCurrencyToUsdRate = str10;
        this.earnOption = earnOption;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c6: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0077: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0082: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r35v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.EarnOption:?: TERNARY null = ((wrap:int:0x0098: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.EarnOption) : (r37v0 com.okinc.crcore.coreapi.net.responsebean.EarnOption))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, int, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.EarnOption):void (m)] (LINE:16) call: com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, boolean, int, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.EarnOption):void type: THIS */
    public /* synthetic */ ConvertCurrencyBean(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, Boolean bool, String str7, String str8, boolean z, boolean z2, String str9, boolean z3, int i3, String str10, EarnOption earnOption, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) != 0 ? Boolean.FALSE : bool, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? "" : str8, (i4 & 2048) != 0 ? false : z, (i4 & 4096) != 0 ? false : z2, (i4 & 8192) != 0 ? "" : str9, (i4 & 16384) != 0 ? false : z3, (i4 & 32768) != 0 ? 8 : i3, (i4 & 65536) != 0 ? "" : str10, (i4 & 131072) != 0 ? null : earnOption);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConvertCurrencyBean> serializer() {
            return ConvertCurrencyBean$$serializer.INSTANCE;
        }

        public final ConvertCurrencyBean KWHzl(@NotNull ConvertCurrencyResponseBean convertCurrencyResponseBean) {
            Intrinsics.checkNotNullParameter(convertCurrencyResponseBean, "");
            return new ConvertCurrencyBean(convertCurrencyResponseBean.getCcy(), convertCurrencyResponseBean.getCcyId(), convertCurrencyResponseBean.getIcon(), convertCurrencyResponseBean.getAvailable(), convertCurrencyResponseBean.getLocalCurrentPrice(), convertCurrencyResponseBean.getCcyFullName(), convertCurrencyResponseBean.getLocalChangeRate(), convertCurrencyResponseBean.getFlag(), convertCurrencyResponseBean.getFiatFlag(), convertCurrencyResponseBean.getMin(), convertCurrencyResponseBean.getMax(), convertCurrencyResponseBean.isSupport(), convertCurrencyResponseBean.isHide(), convertCurrencyResponseBean.getSign(), convertCurrencyResponseBean.getTransferable(), convertCurrencyResponseBean.getScale(), convertCurrencyResponseBean.getLocalCurrencyToUsdRate(), convertCurrencyResponseBean.getEarnOption());
        }
    }
}
