package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class NonMevPriorityFeeInfo implements Parcelable {
    public static final int $stable = 0;
    private final String baseFee;
    private final String baseFeeUsd;
    private final String fastFee;
    private final String fastFeeUsd;
    private final String fastGasPrice;
    private final String fastMaxFeeUsd;
    private final String fastPriority;
    private final String marketFee;
    private final String marketFeeUsd;
    private final String marketGasPrice;
    private final String marketMaxFeeUsd;
    private final String marketPriority;
    private final String maxBaseFee;
    private final String turboFee;
    private final String turboFeeUsd;
    private final String turboGasPrice;
    private final String turboMaxFeeUsd;
    private final String turboPriority;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NonMevPriorityFeeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NonMevPriorityFeeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NonMevPriorityFeeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NonMevPriorityFeeInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NonMevPriorityFeeInfo[] newArray(int i) {
            return new NonMevPriorityFeeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NonMevPriorityFeeInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.marketPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.turboFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.turboFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.turboMaxFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.turboPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.marketGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.fastGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.turboGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.maxBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fastFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fastMaxFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fastPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.marketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.marketFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.marketMaxFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonMevPriorityFeeInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
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
        return new NonMevPriorityFeeInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
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
        if (!(obj instanceof NonMevPriorityFeeInfo)) {
            return false;
        }
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo = (NonMevPriorityFeeInfo) obj;
        return Intrinsics.EZpvd((Object) this.baseFee, (Object) nonMevPriorityFeeInfo.baseFee) && Intrinsics.EZpvd((Object) this.baseFeeUsd, (Object) nonMevPriorityFeeInfo.baseFeeUsd) && Intrinsics.EZpvd((Object) this.fastFee, (Object) nonMevPriorityFeeInfo.fastFee) && Intrinsics.EZpvd((Object) this.fastFeeUsd, (Object) nonMevPriorityFeeInfo.fastFeeUsd) && Intrinsics.EZpvd((Object) this.fastMaxFeeUsd, (Object) nonMevPriorityFeeInfo.fastMaxFeeUsd) && Intrinsics.EZpvd((Object) this.fastPriority, (Object) nonMevPriorityFeeInfo.fastPriority) && Intrinsics.EZpvd((Object) this.marketFee, (Object) nonMevPriorityFeeInfo.marketFee) && Intrinsics.EZpvd((Object) this.marketFeeUsd, (Object) nonMevPriorityFeeInfo.marketFeeUsd) && Intrinsics.EZpvd((Object) this.marketMaxFeeUsd, (Object) nonMevPriorityFeeInfo.marketMaxFeeUsd) && Intrinsics.EZpvd((Object) this.marketPriority, (Object) nonMevPriorityFeeInfo.marketPriority) && Intrinsics.EZpvd((Object) this.turboFee, (Object) nonMevPriorityFeeInfo.turboFee) && Intrinsics.EZpvd((Object) this.turboFeeUsd, (Object) nonMevPriorityFeeInfo.turboFeeUsd) && Intrinsics.EZpvd((Object) this.turboMaxFeeUsd, (Object) nonMevPriorityFeeInfo.turboMaxFeeUsd) && Intrinsics.EZpvd((Object) this.turboPriority, (Object) nonMevPriorityFeeInfo.turboPriority) && Intrinsics.EZpvd((Object) this.marketGasPrice, (Object) nonMevPriorityFeeInfo.marketGasPrice) && Intrinsics.EZpvd((Object) this.fastGasPrice, (Object) nonMevPriorityFeeInfo.fastGasPrice) && Intrinsics.EZpvd((Object) this.turboGasPrice, (Object) nonMevPriorityFeeInfo.turboGasPrice) && Intrinsics.EZpvd((Object) this.maxBaseFee, (Object) nonMevPriorityFeeInfo.maxBaseFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFeeUsd() {
        return this.baseFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastFee() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastFeeUsd() {
        return this.fastFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastGasPrice() {
        return this.fastGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastMaxFeeUsd() {
        return this.fastMaxFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastPriority() {
        return this.fastPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketFee() {
        return this.marketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketFeeUsd() {
        return this.marketFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketGasPrice() {
        return this.marketGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketMaxFeeUsd() {
        return this.marketMaxFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketPriority() {
        return this.marketPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxBaseFee() {
        return this.maxBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboFee() {
        return this.turboFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboFeeUsd() {
        return this.turboFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboGasPrice() {
        return this.turboGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboMaxFeeUsd() {
        return this.turboMaxFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboPriority() {
        return this.turboPriority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.baseFee.hashCode() * 31) + this.baseFeeUsd.hashCode()) * 31) + this.fastFee.hashCode()) * 31) + this.fastFeeUsd.hashCode()) * 31) + this.fastMaxFeeUsd.hashCode()) * 31) + this.fastPriority.hashCode()) * 31) + this.marketFee.hashCode()) * 31) + this.marketFeeUsd.hashCode()) * 31) + this.marketMaxFeeUsd.hashCode()) * 31) + this.marketPriority.hashCode()) * 31) + this.turboFee.hashCode()) * 31) + this.turboFeeUsd.hashCode()) * 31) + this.turboMaxFeeUsd.hashCode()) * 31) + this.turboPriority.hashCode()) * 31) + this.marketGasPrice.hashCode()) * 31) + this.fastGasPrice.hashCode()) * 31) + this.turboGasPrice.hashCode()) * 31) + this.maxBaseFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NonMevPriorityFeeInfo(baseFee=" + this.baseFee + ", baseFeeUsd=" + this.baseFeeUsd + ", fastFee=" + this.fastFee + ", fastFeeUsd=" + this.fastFeeUsd + ", fastMaxFeeUsd=" + this.fastMaxFeeUsd + ", fastPriority=" + this.fastPriority + ", marketFee=" + this.marketFee + ", marketFeeUsd=" + this.marketFeeUsd + ", marketMaxFeeUsd=" + this.marketMaxFeeUsd + ", marketPriority=" + this.marketPriority + ", turboFee=" + this.turboFee + ", turboFeeUsd=" + this.turboFeeUsd + ", turboMaxFeeUsd=" + this.turboMaxFeeUsd + ", turboPriority=" + this.turboPriority + ", marketGasPrice=" + this.marketGasPrice + ", fastGasPrice=" + this.fastGasPrice + ", turboGasPrice=" + this.turboGasPrice + ", maxBaseFee=" + this.maxBaseFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseFee);
        parcel.writeString(this.baseFeeUsd);
        parcel.writeString(this.fastFee);
        parcel.writeString(this.fastFeeUsd);
        parcel.writeString(this.fastMaxFeeUsd);
        parcel.writeString(this.fastPriority);
        parcel.writeString(this.marketFee);
        parcel.writeString(this.marketFeeUsd);
        parcel.writeString(this.marketMaxFeeUsd);
        parcel.writeString(this.marketPriority);
        parcel.writeString(this.turboFee);
        parcel.writeString(this.turboFeeUsd);
        parcel.writeString(this.turboMaxFeeUsd);
        parcel.writeString(this.turboPriority);
        parcel.writeString(this.marketGasPrice);
        parcel.writeString(this.fastGasPrice);
        parcel.writeString(this.turboGasPrice);
        parcel.writeString(this.maxBaseFee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NonMevPriorityFeeInfo> serializer() {
            return NonMevPriorityFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NonMevPriorityFeeInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseFee = "";
        } else {
            this.baseFee = str;
        }
        if ((i & 2) == 0) {
            this.baseFeeUsd = "";
        } else {
            this.baseFeeUsd = str2;
        }
        if ((i & 4) == 0) {
            this.fastFee = "";
        } else {
            this.fastFee = str3;
        }
        if ((i & 8) == 0) {
            this.fastFeeUsd = "";
        } else {
            this.fastFeeUsd = str4;
        }
        if ((i & 16) == 0) {
            this.fastMaxFeeUsd = "";
        } else {
            this.fastMaxFeeUsd = str5;
        }
        if ((i & 32) == 0) {
            this.fastPriority = "";
        } else {
            this.fastPriority = str6;
        }
        if ((i & 64) == 0) {
            this.marketFee = "";
        } else {
            this.marketFee = str7;
        }
        if ((i & 128) == 0) {
            this.marketFeeUsd = "";
        } else {
            this.marketFeeUsd = str8;
        }
        if ((i & 256) == 0) {
            this.marketMaxFeeUsd = "";
        } else {
            this.marketMaxFeeUsd = str9;
        }
        if ((i & 512) == 0) {
            this.marketPriority = "";
        } else {
            this.marketPriority = str10;
        }
        if ((i & 1024) == 0) {
            this.turboFee = "";
        } else {
            this.turboFee = str11;
        }
        if ((i & 2048) == 0) {
            this.turboFeeUsd = "";
        } else {
            this.turboFeeUsd = str12;
        }
        if ((i & 4096) == 0) {
            this.turboMaxFeeUsd = "";
        } else {
            this.turboMaxFeeUsd = str13;
        }
        if ((i & 8192) == 0) {
            this.turboPriority = "";
        } else {
            this.turboPriority = str14;
        }
        if ((i & 16384) == 0) {
            this.marketGasPrice = "";
        } else {
            this.marketGasPrice = str15;
        }
        if ((32768 & i) == 0) {
            this.fastGasPrice = "";
        } else {
            this.fastGasPrice = str16;
        }
        if ((65536 & i) == 0) {
            this.turboGasPrice = "";
        } else {
            this.turboGasPrice = str17;
        }
        if ((i & 131072) == 0) {
            this.maxBaseFee = "";
        } else {
            this.maxBaseFee = str18;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(NonMevPriorityFeeInfo nonMevPriorityFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.baseFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, nonMevPriorityFeeInfo.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.baseFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, nonMevPriorityFeeInfo.baseFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.fastFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, nonMevPriorityFeeInfo.fastFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.fastFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, nonMevPriorityFeeInfo.fastFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.fastMaxFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, nonMevPriorityFeeInfo.fastMaxFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.fastPriority, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, nonMevPriorityFeeInfo.fastPriority);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.marketFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, nonMevPriorityFeeInfo.marketFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.marketFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, nonMevPriorityFeeInfo.marketFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.marketMaxFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, nonMevPriorityFeeInfo.marketMaxFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.marketPriority, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, nonMevPriorityFeeInfo.marketPriority);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.turboFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, nonMevPriorityFeeInfo.turboFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.turboFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, nonMevPriorityFeeInfo.turboFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.turboMaxFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, nonMevPriorityFeeInfo.turboMaxFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.turboPriority, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, nonMevPriorityFeeInfo.turboPriority);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.marketGasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, nonMevPriorityFeeInfo.marketGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.fastGasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, nonMevPriorityFeeInfo.fastGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.turboGasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, nonMevPriorityFeeInfo.turboGasPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && Intrinsics.EZpvd((Object) nonMevPriorityFeeInfo.maxBaseFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 17, nonMevPriorityFeeInfo.maxBaseFee);
    }

    public NonMevPriorityFeeInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18) {
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
        this.baseFee = str;
        this.baseFeeUsd = str2;
        this.fastFee = str3;
        this.fastFeeUsd = str4;
        this.fastMaxFeeUsd = str5;
        this.fastPriority = str6;
        this.marketFee = str7;
        this.marketFeeUsd = str8;
        this.marketMaxFeeUsd = str9;
        this.marketPriority = str10;
        this.turboFee = str11;
        this.turboFeeUsd = str12;
        this.turboMaxFeeUsd = str13;
        this.turboPriority = str14;
        this.marketGasPrice = str15;
        this.fastGasPrice = str16;
        this.turboGasPrice = str17;
        this.maxBaseFee = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:227) call: com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NonMevPriorityFeeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18);
    }
}
