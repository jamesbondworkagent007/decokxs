package com.okinc.business.dexlogic.main.limmitorder.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class NewFeeData implements Parcelable {
    public static final int $stable = 0;
    private final String fastActualFee;
    private final String fastActualFeeUsd;
    private final String fastFee;
    private final String fastFeeUsd;
    private final String marketActualFee;
    private final String marketActualFeeUsd;
    private final String marketFee;
    private final String marketFeeUsd;
    private final String maxFee;
    private final String minFee;
    private final String solDecimals;
    private final String solPrice;
    private final String solTokenSymbol;
    private final String turboActualFee;
    private final String turboActualFeeUsd;
    private final String turboFee;
    private final String turboFeeUsd;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NewFeeData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NewFeeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewFeeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NewFeeData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewFeeData[] newArray(int i) {
            return new NewFeeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewFeeData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.solDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.solPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.solTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.turboFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.turboFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.turboActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.turboActualFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fastFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fastActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fastActualFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.marketFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.marketFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.marketActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.marketActualFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewFeeData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        return new NewFeeData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
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
        if (!(obj instanceof NewFeeData)) {
            return false;
        }
        NewFeeData newFeeData = (NewFeeData) obj;
        return Intrinsics.EZpvd((Object) this.fastFee, (Object) newFeeData.fastFee) && Intrinsics.EZpvd((Object) this.fastFeeUsd, (Object) newFeeData.fastFeeUsd) && Intrinsics.EZpvd((Object) this.fastActualFee, (Object) newFeeData.fastActualFee) && Intrinsics.EZpvd((Object) this.fastActualFeeUsd, (Object) newFeeData.fastActualFeeUsd) && Intrinsics.EZpvd((Object) this.marketFee, (Object) newFeeData.marketFee) && Intrinsics.EZpvd((Object) this.marketFeeUsd, (Object) newFeeData.marketFeeUsd) && Intrinsics.EZpvd((Object) this.marketActualFee, (Object) newFeeData.marketActualFee) && Intrinsics.EZpvd((Object) this.marketActualFeeUsd, (Object) newFeeData.marketActualFeeUsd) && Intrinsics.EZpvd((Object) this.maxFee, (Object) newFeeData.maxFee) && Intrinsics.EZpvd((Object) this.minFee, (Object) newFeeData.minFee) && Intrinsics.EZpvd((Object) this.solDecimals, (Object) newFeeData.solDecimals) && Intrinsics.EZpvd((Object) this.solPrice, (Object) newFeeData.solPrice) && Intrinsics.EZpvd((Object) this.solTokenSymbol, (Object) newFeeData.solTokenSymbol) && Intrinsics.EZpvd((Object) this.turboFee, (Object) newFeeData.turboFee) && Intrinsics.EZpvd((Object) this.turboFeeUsd, (Object) newFeeData.turboFeeUsd) && Intrinsics.EZpvd((Object) this.turboActualFee, (Object) newFeeData.turboActualFee) && Intrinsics.EZpvd((Object) this.turboActualFeeUsd, (Object) newFeeData.turboActualFeeUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastActualFee() {
        return this.fastActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastActualFeeUsd() {
        return this.fastActualFeeUsd;
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
    public final String getMarketActualFee() {
        return this.marketActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketActualFeeUsd() {
        return this.marketActualFeeUsd;
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
    public final String getMaxFee() {
        return this.maxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinFee() {
        return this.minFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSolDecimals() {
        return this.solDecimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSolPrice() {
        return this.solPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSolTokenSymbol() {
        return this.solTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboActualFee() {
        return this.turboActualFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurboActualFeeUsd() {
        return this.turboActualFeeUsd;
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
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.fastFee.hashCode() * 31) + this.fastFeeUsd.hashCode()) * 31) + this.fastActualFee.hashCode()) * 31) + this.fastActualFeeUsd.hashCode()) * 31) + this.marketFee.hashCode()) * 31) + this.marketFeeUsd.hashCode()) * 31) + this.marketActualFee.hashCode()) * 31) + this.marketActualFeeUsd.hashCode()) * 31) + this.maxFee.hashCode()) * 31) + this.minFee.hashCode()) * 31) + this.solDecimals.hashCode()) * 31) + this.solPrice.hashCode()) * 31) + this.solTokenSymbol.hashCode()) * 31) + this.turboFee.hashCode()) * 31) + this.turboFeeUsd.hashCode()) * 31) + this.turboActualFee.hashCode()) * 31) + this.turboActualFeeUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewFeeData(fastFee=" + this.fastFee + ", fastFeeUsd=" + this.fastFeeUsd + ", fastActualFee=" + this.fastActualFee + ", fastActualFeeUsd=" + this.fastActualFeeUsd + ", marketFee=" + this.marketFee + ", marketFeeUsd=" + this.marketFeeUsd + ", marketActualFee=" + this.marketActualFee + ", marketActualFeeUsd=" + this.marketActualFeeUsd + ", maxFee=" + this.maxFee + ", minFee=" + this.minFee + ", solDecimals=" + this.solDecimals + ", solPrice=" + this.solPrice + ", solTokenSymbol=" + this.solTokenSymbol + ", turboFee=" + this.turboFee + ", turboFeeUsd=" + this.turboFeeUsd + ", turboActualFee=" + this.turboActualFee + ", turboActualFeeUsd=" + this.turboActualFeeUsd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fastFee);
        parcel.writeString(this.fastFeeUsd);
        parcel.writeString(this.fastActualFee);
        parcel.writeString(this.fastActualFeeUsd);
        parcel.writeString(this.marketFee);
        parcel.writeString(this.marketFeeUsd);
        parcel.writeString(this.marketActualFee);
        parcel.writeString(this.marketActualFeeUsd);
        parcel.writeString(this.maxFee);
        parcel.writeString(this.minFee);
        parcel.writeString(this.solDecimals);
        parcel.writeString(this.solPrice);
        parcel.writeString(this.solTokenSymbol);
        parcel.writeString(this.turboFee);
        parcel.writeString(this.turboFeeUsd);
        parcel.writeString(this.turboActualFee);
        parcel.writeString(this.turboActualFeeUsd);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.NewFeeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewFeeData> serializer() {
            return NewFeeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewFeeData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fastFee = "";
        } else {
            this.fastFee = str;
        }
        if ((i & 2) == 0) {
            this.fastFeeUsd = "";
        } else {
            this.fastFeeUsd = str2;
        }
        if ((i & 4) == 0) {
            this.fastActualFee = "";
        } else {
            this.fastActualFee = str3;
        }
        if ((i & 8) == 0) {
            this.fastActualFeeUsd = "";
        } else {
            this.fastActualFeeUsd = str4;
        }
        if ((i & 16) == 0) {
            this.marketFee = "";
        } else {
            this.marketFee = str5;
        }
        if ((i & 32) == 0) {
            this.marketFeeUsd = "";
        } else {
            this.marketFeeUsd = str6;
        }
        if ((i & 64) == 0) {
            this.marketActualFee = "";
        } else {
            this.marketActualFee = str7;
        }
        if ((i & 128) == 0) {
            this.marketActualFeeUsd = "";
        } else {
            this.marketActualFeeUsd = str8;
        }
        if ((i & 256) == 0) {
            this.maxFee = "";
        } else {
            this.maxFee = str9;
        }
        if ((i & 512) == 0) {
            this.minFee = "";
        } else {
            this.minFee = str10;
        }
        if ((i & 1024) == 0) {
            this.solDecimals = "";
        } else {
            this.solDecimals = str11;
        }
        if ((i & 2048) == 0) {
            this.solPrice = "";
        } else {
            this.solPrice = str12;
        }
        if ((i & 4096) == 0) {
            this.solTokenSymbol = "";
        } else {
            this.solTokenSymbol = str13;
        }
        if ((i & 8192) == 0) {
            this.turboFee = "";
        } else {
            this.turboFee = str14;
        }
        if ((i & 16384) == 0) {
            this.turboFeeUsd = "";
        } else {
            this.turboFeeUsd = str15;
        }
        if ((32768 & i) == 0) {
            this.turboActualFee = "";
        } else {
            this.turboActualFee = str16;
        }
        if ((i & 65536) == 0) {
            this.turboActualFeeUsd = "";
        } else {
            this.turboActualFeeUsd = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(NewFeeData newFeeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) newFeeData.fastFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, newFeeData.fastFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) newFeeData.fastFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, newFeeData.fastFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) newFeeData.fastActualFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, newFeeData.fastActualFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) newFeeData.fastActualFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, newFeeData.fastActualFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) newFeeData.marketFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, newFeeData.marketFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) newFeeData.marketFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, newFeeData.marketFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) newFeeData.marketActualFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, newFeeData.marketActualFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) newFeeData.marketActualFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, newFeeData.marketActualFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) newFeeData.maxFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, newFeeData.maxFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) newFeeData.minFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, newFeeData.minFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) newFeeData.solDecimals, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, newFeeData.solDecimals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) newFeeData.solPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, newFeeData.solPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) newFeeData.solTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, newFeeData.solTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) newFeeData.turboFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, newFeeData.turboFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) newFeeData.turboFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, newFeeData.turboFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) newFeeData.turboActualFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, newFeeData.turboActualFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) newFeeData.turboActualFeeUsd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, newFeeData.turboActualFeeUsd);
    }

    public NewFeeData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
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
        this.fastFee = str;
        this.fastFeeUsd = str2;
        this.fastActualFee = str3;
        this.fastActualFeeUsd = str4;
        this.marketFee = str5;
        this.marketFeeUsd = str6;
        this.marketActualFee = str7;
        this.marketActualFeeUsd = str8;
        this.maxFee = str9;
        this.minFee = str10;
        this.solDecimals = str11;
        this.solPrice = str12;
        this.solTokenSymbol = str13;
        this.turboFee = str14;
        this.turboFeeUsd = str15;
        this.turboActualFee = str16;
        this.turboActualFeeUsd = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:65) call: com.okinc.business.dexlogic.main.limmitorder.bean.NewFeeData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewFeeData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17);
    }
}
