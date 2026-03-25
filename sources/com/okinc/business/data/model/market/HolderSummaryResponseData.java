package com.okinc.business.data.model.market;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class HolderSummaryResponseData implements Parcelable {
    public static final int $stable = 0;
    private final String avgHoldValue;
    private final String devHoldPercentage;
    private final boolean isPnlSupported;
    private final String sniperTagHolderAmount;
    private final String suspectedRatTradingHoldPercentage;
    private final String suspiciousHoldPercentage;
    private final String suspiciousTagHolderAmount;
    private final String top100BoughtAvgPrice;
    private final String top100BoughtAvgPricePercentage;
    private final String top100HoldAmountPercentage;
    private final String top100SoldAvgPrice;
    private final String top100SoldAvgPricePercentage;
    private final String top10HoldAmountPercentage;
    private final String totalHolderAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HolderSummaryResponseData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HolderSummaryResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderSummaryResponseData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HolderSummaryResponseData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderSummaryResponseData[] newArray(int i) {
            return new HolderSummaryResponseData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderSummaryResponseData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    @SerialName("avgHoldValue")
    public static /* synthetic */ void getAvgHoldValue$annotations() {
    }

    @SerialName("devHoldPercentage")
    public static /* synthetic */ void getDevHoldPercentage$annotations() {
    }

    @SerialName("sniperTagHolderAmount")
    public static /* synthetic */ void getSniperTagHolderAmount$annotations() {
    }

    @SerialName("suspectedRatTradingHoldPercentage")
    public static /* synthetic */ void getSuspectedRatTradingHoldPercentage$annotations() {
    }

    @SerialName("suspiciousHoldPercentage")
    public static /* synthetic */ void getSuspiciousHoldPercentage$annotations() {
    }

    @SerialName("suspiciousTagHolderAmount")
    public static /* synthetic */ void getSuspiciousTagHolderAmount$annotations() {
    }

    @SerialName("top100BoughtAvgPrice")
    public static /* synthetic */ void getTop100BoughtAvgPrice$annotations() {
    }

    @SerialName("top100BoughtAvgPricePercentage")
    public static /* synthetic */ void getTop100BoughtAvgPricePercentage$annotations() {
    }

    @SerialName("top100HoldAmountPercentage")
    public static /* synthetic */ void getTop100HoldAmountPercentage$annotations() {
    }

    @SerialName("top100SoldAvgPrice")
    public static /* synthetic */ void getTop100SoldAvgPrice$annotations() {
    }

    @SerialName("top100SoldAvgPricePercentage")
    public static /* synthetic */ void getTop100SoldAvgPricePercentage$annotations() {
    }

    @SerialName("top10HoldAmountPercentage")
    public static /* synthetic */ void getTop10HoldAmountPercentage$annotations() {
    }

    @SerialName("totalHolderAmount")
    public static /* synthetic */ void getTotalHolderAmount$annotations() {
    }

    @SerialName("isPnlSupported")
    public static /* synthetic */ void isPnlSupported$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalHolderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.suspiciousHoldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.top100BoughtAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.top100BoughtAvgPricePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.top100SoldAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.top100SoldAvgPricePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.top10HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.top100HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.suspiciousTagHolderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sniperTagHolderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.avgHoldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.devHoldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.suspectedRatTradingHoldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderSummaryResponseData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
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
        return new HolderSummaryResponseData(str, str2, str3, str4, str5, str6, str7, z, str8, str9, str10, str11, str12, str13);
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
        if (!(obj instanceof HolderSummaryResponseData)) {
            return false;
        }
        HolderSummaryResponseData holderSummaryResponseData = (HolderSummaryResponseData) obj;
        return Intrinsics.EZpvd((Object) this.totalHolderAmount, (Object) holderSummaryResponseData.totalHolderAmount) && Intrinsics.EZpvd((Object) this.top10HoldAmountPercentage, (Object) holderSummaryResponseData.top10HoldAmountPercentage) && Intrinsics.EZpvd((Object) this.top100HoldAmountPercentage, (Object) holderSummaryResponseData.top100HoldAmountPercentage) && Intrinsics.EZpvd((Object) this.suspiciousTagHolderAmount, (Object) holderSummaryResponseData.suspiciousTagHolderAmount) && Intrinsics.EZpvd((Object) this.sniperTagHolderAmount, (Object) holderSummaryResponseData.sniperTagHolderAmount) && Intrinsics.EZpvd((Object) this.avgHoldValue, (Object) holderSummaryResponseData.avgHoldValue) && Intrinsics.EZpvd((Object) this.devHoldPercentage, (Object) holderSummaryResponseData.devHoldPercentage) && this.isPnlSupported == holderSummaryResponseData.isPnlSupported && Intrinsics.EZpvd((Object) this.suspectedRatTradingHoldPercentage, (Object) holderSummaryResponseData.suspectedRatTradingHoldPercentage) && Intrinsics.EZpvd((Object) this.suspiciousHoldPercentage, (Object) holderSummaryResponseData.suspiciousHoldPercentage) && Intrinsics.EZpvd((Object) this.top100BoughtAvgPrice, (Object) holderSummaryResponseData.top100BoughtAvgPrice) && Intrinsics.EZpvd((Object) this.top100BoughtAvgPricePercentage, (Object) holderSummaryResponseData.top100BoughtAvgPricePercentage) && Intrinsics.EZpvd((Object) this.top100SoldAvgPrice, (Object) holderSummaryResponseData.top100SoldAvgPrice) && Intrinsics.EZpvd((Object) this.top100SoldAvgPricePercentage, (Object) holderSummaryResponseData.top100SoldAvgPricePercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgHoldValue() {
        return this.avgHoldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevHoldPercentage() {
        return this.devHoldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSniperTagHolderAmount() {
        return this.sniperTagHolderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspectedRatTradingHoldPercentage() {
        return this.suspectedRatTradingHoldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspiciousHoldPercentage() {
        return this.suspiciousHoldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuspiciousTagHolderAmount() {
        return this.suspiciousTagHolderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop100BoughtAvgPrice() {
        return this.top100BoughtAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop100BoughtAvgPricePercentage() {
        return this.top100BoughtAvgPricePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop100HoldAmountPercentage() {
        return this.top100HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop100SoldAvgPrice() {
        return this.top100SoldAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop100SoldAvgPricePercentage() {
        return this.top100SoldAvgPricePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTop10HoldAmountPercentage() {
        return this.top10HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalHolderAmount() {
        return this.totalHolderAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.totalHolderAmount.hashCode() * 31) + this.top10HoldAmountPercentage.hashCode()) * 31) + this.top100HoldAmountPercentage.hashCode()) * 31) + this.suspiciousTagHolderAmount.hashCode()) * 31) + this.sniperTagHolderAmount.hashCode()) * 31) + this.avgHoldValue.hashCode()) * 31) + this.devHoldPercentage.hashCode()) * 31) + Boolean.hashCode(this.isPnlSupported)) * 31) + this.suspectedRatTradingHoldPercentage.hashCode()) * 31) + this.suspiciousHoldPercentage.hashCode()) * 31) + this.top100BoughtAvgPrice.hashCode()) * 31) + this.top100BoughtAvgPricePercentage.hashCode()) * 31) + this.top100SoldAvgPrice.hashCode()) * 31) + this.top100SoldAvgPricePercentage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPnlSupported() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderSummaryResponseData(totalHolderAmount=" + this.totalHolderAmount + ", top10HoldAmountPercentage=" + this.top10HoldAmountPercentage + ", top100HoldAmountPercentage=" + this.top100HoldAmountPercentage + ", suspiciousTagHolderAmount=" + this.suspiciousTagHolderAmount + ", sniperTagHolderAmount=" + this.sniperTagHolderAmount + ", avgHoldValue=" + this.avgHoldValue + ", devHoldPercentage=" + this.devHoldPercentage + ", isPnlSupported=" + this.isPnlSupported + ", suspectedRatTradingHoldPercentage=" + this.suspectedRatTradingHoldPercentage + ", suspiciousHoldPercentage=" + this.suspiciousHoldPercentage + ", top100BoughtAvgPrice=" + this.top100BoughtAvgPrice + ", top100BoughtAvgPricePercentage=" + this.top100BoughtAvgPricePercentage + ", top100SoldAvgPrice=" + this.top100SoldAvgPrice + ", top100SoldAvgPricePercentage=" + this.top100SoldAvgPricePercentage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalHolderAmount);
        parcel.writeString(this.top10HoldAmountPercentage);
        parcel.writeString(this.top100HoldAmountPercentage);
        parcel.writeString(this.suspiciousTagHolderAmount);
        parcel.writeString(this.sniperTagHolderAmount);
        parcel.writeString(this.avgHoldValue);
        parcel.writeString(this.devHoldPercentage);
        parcel.writeInt(this.isPnlSupported ? 1 : 0);
        parcel.writeString(this.suspectedRatTradingHoldPercentage);
        parcel.writeString(this.suspiciousHoldPercentage);
        parcel.writeString(this.top100BoughtAvgPrice);
        parcel.writeString(this.top100BoughtAvgPricePercentage);
        parcel.writeString(this.top100SoldAvgPrice);
        parcel.writeString(this.top100SoldAvgPricePercentage);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.data.model.market.HolderSummaryResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HolderSummaryResponseData> serializer() {
            return HolderSummaryResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HolderSummaryResponseData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalHolderAmount = "";
        } else {
            this.totalHolderAmount = str;
        }
        if ((i & 2) == 0) {
            this.top10HoldAmountPercentage = "";
        } else {
            this.top10HoldAmountPercentage = str2;
        }
        if ((i & 4) == 0) {
            this.top100HoldAmountPercentage = "";
        } else {
            this.top100HoldAmountPercentage = str3;
        }
        if ((i & 8) == 0) {
            this.suspiciousTagHolderAmount = "";
        } else {
            this.suspiciousTagHolderAmount = str4;
        }
        if ((i & 16) == 0) {
            this.sniperTagHolderAmount = "";
        } else {
            this.sniperTagHolderAmount = str5;
        }
        if ((i & 32) == 0) {
            this.avgHoldValue = "";
        } else {
            this.avgHoldValue = str6;
        }
        if ((i & 64) == 0) {
            this.devHoldPercentage = "";
        } else {
            this.devHoldPercentage = str7;
        }
        this.isPnlSupported = (i & 128) == 0 ? false : z;
        if ((i & 256) == 0) {
            this.suspectedRatTradingHoldPercentage = "";
        } else {
            this.suspectedRatTradingHoldPercentage = str8;
        }
        if ((i & 512) == 0) {
            this.suspiciousHoldPercentage = "";
        } else {
            this.suspiciousHoldPercentage = str9;
        }
        if ((i & 1024) == 0) {
            this.top100BoughtAvgPrice = "";
        } else {
            this.top100BoughtAvgPrice = str10;
        }
        if ((i & 2048) == 0) {
            this.top100BoughtAvgPricePercentage = "";
        } else {
            this.top100BoughtAvgPricePercentage = str11;
        }
        if ((i & 4096) == 0) {
            this.top100SoldAvgPrice = "";
        } else {
            this.top100SoldAvgPrice = str12;
        }
        if ((i & 8192) == 0) {
            this.top100SoldAvgPricePercentage = "";
        } else {
            this.top100SoldAvgPricePercentage = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HolderSummaryResponseData holderSummaryResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.totalHolderAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, holderSummaryResponseData.totalHolderAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.top10HoldAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holderSummaryResponseData.top10HoldAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.top100HoldAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, holderSummaryResponseData.top100HoldAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.suspiciousTagHolderAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, holderSummaryResponseData.suspiciousTagHolderAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.sniperTagHolderAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, holderSummaryResponseData.sniperTagHolderAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.avgHoldValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, holderSummaryResponseData.avgHoldValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.devHoldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, holderSummaryResponseData.devHoldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || holderSummaryResponseData.isPnlSupported) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, holderSummaryResponseData.isPnlSupported);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.suspectedRatTradingHoldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, holderSummaryResponseData.suspectedRatTradingHoldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.suspiciousHoldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, holderSummaryResponseData.suspiciousHoldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.top100BoughtAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, holderSummaryResponseData.top100BoughtAvgPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.top100BoughtAvgPricePercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, holderSummaryResponseData.top100BoughtAvgPricePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) holderSummaryResponseData.top100SoldAvgPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, holderSummaryResponseData.top100SoldAvgPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) holderSummaryResponseData.top100SoldAvgPricePercentage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, holderSummaryResponseData.top100SoldAvgPricePercentage);
    }

    public HolderSummaryResponseData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
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
        this.totalHolderAmount = str;
        this.top10HoldAmountPercentage = str2;
        this.top100HoldAmountPercentage = str3;
        this.suspiciousTagHolderAmount = str4;
        this.sniperTagHolderAmount = str5;
        this.avgHoldValue = str6;
        this.devHoldPercentage = str7;
        this.isPnlSupported = z;
        this.suspectedRatTradingHoldPercentage = str8;
        this.suspiciousHoldPercentage = str9;
        this.top100BoughtAvgPrice = str10;
        this.top100BoughtAvgPricePercentage = str11;
        this.top100SoldAvgPrice = str12;
        this.top100SoldAvgPricePercentage = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:160) call: com.okinc.business.data.model.market.HolderSummaryResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HolderSummaryResponseData(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? false : z, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) == 0 ? str13 : "");
    }
}
