package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class Localization implements Parcelable {
    public static final int $stable = 0;
    private final String accountProtectionForDisplay;
    private final String availableToTradeForDisplay;
    private final String availableToWithdrawForDisplay;
    private final String cryptoWithdrawHoldDaysInfoBoxForDisplay;
    private final String dailyLimitForDisplay;
    private final String dailyLimitRemainingForDisplay;
    private final String disclaimerBodyForDisplay;
    private final String disclaimerForDisplay;
    private final String disclaimerHeaderForDisplay;
    private final String feeRateForDisplay;
    private final String fiatWithdrawHoldDaysInfoBoxForDisplay;
    private final String frequencyLimitForDisplay;
    private final String generalDescriptionForDisplay;
    private final String googleWalletBottomSheetDescFirstPar;
    private final String googleWalletBottomSheetDescSecondPar;
    private final String googleWalletBottomSheetTitle;
    private final String infoBoxForDisplay;
    private final String limitForDisplay;
    private final String paybackDisclaimerForDisplay;
    private final String paybackProcessingTimeForDisplay;
    private final String priceInfoBoxForDisplay;
    private final String processingTimeForDisplay;
    private final String rangeForDisplay;
    private final String singleTransactionLimitForDisplay;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Localization> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Localization> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Localization createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Localization(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Localization[] newArray(int i) {
            return new Localization[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Localization() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16777215, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.processingTimeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.singleTransactionLimitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.accountProtectionForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.infoBoxForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.priceInfoBoxForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.availableToTradeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.availableToWithdrawForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.cryptoWithdrawHoldDaysInfoBoxForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.fiatWithdrawHoldDaysInfoBoxForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.disclaimerForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.disclaimerHeaderForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.paybackProcessingTimeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.disclaimerBodyForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.paybackDisclaimerForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.googleWalletBottomSheetTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.googleWalletBottomSheetDescFirstPar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.googleWalletBottomSheetDescSecondPar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.feeRateForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.limitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.rangeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.generalDescriptionForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dailyLimitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.dailyLimitRemainingForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.frequencyLimitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Localization copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new Localization(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
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
        if (!(obj instanceof Localization)) {
            return false;
        }
        Localization localization = (Localization) obj;
        return Intrinsics.EZpvd((Object) this.processingTimeForDisplay, (Object) localization.processingTimeForDisplay) && Intrinsics.EZpvd((Object) this.paybackProcessingTimeForDisplay, (Object) localization.paybackProcessingTimeForDisplay) && Intrinsics.EZpvd((Object) this.feeRateForDisplay, (Object) localization.feeRateForDisplay) && Intrinsics.EZpvd((Object) this.limitForDisplay, (Object) localization.limitForDisplay) && Intrinsics.EZpvd((Object) this.rangeForDisplay, (Object) localization.rangeForDisplay) && Intrinsics.EZpvd((Object) this.generalDescriptionForDisplay, (Object) localization.generalDescriptionForDisplay) && Intrinsics.EZpvd((Object) this.dailyLimitForDisplay, (Object) localization.dailyLimitForDisplay) && Intrinsics.EZpvd((Object) this.dailyLimitRemainingForDisplay, (Object) localization.dailyLimitRemainingForDisplay) && Intrinsics.EZpvd((Object) this.frequencyLimitForDisplay, (Object) localization.frequencyLimitForDisplay) && Intrinsics.EZpvd((Object) this.singleTransactionLimitForDisplay, (Object) localization.singleTransactionLimitForDisplay) && Intrinsics.EZpvd((Object) this.accountProtectionForDisplay, (Object) localization.accountProtectionForDisplay) && Intrinsics.EZpvd((Object) this.infoBoxForDisplay, (Object) localization.infoBoxForDisplay) && Intrinsics.EZpvd((Object) this.priceInfoBoxForDisplay, (Object) localization.priceInfoBoxForDisplay) && Intrinsics.EZpvd((Object) this.availableToTradeForDisplay, (Object) localization.availableToTradeForDisplay) && Intrinsics.EZpvd((Object) this.availableToWithdrawForDisplay, (Object) localization.availableToWithdrawForDisplay) && Intrinsics.EZpvd((Object) this.cryptoWithdrawHoldDaysInfoBoxForDisplay, (Object) localization.cryptoWithdrawHoldDaysInfoBoxForDisplay) && Intrinsics.EZpvd((Object) this.fiatWithdrawHoldDaysInfoBoxForDisplay, (Object) localization.fiatWithdrawHoldDaysInfoBoxForDisplay) && Intrinsics.EZpvd((Object) this.disclaimerForDisplay, (Object) localization.disclaimerForDisplay) && Intrinsics.EZpvd((Object) this.disclaimerHeaderForDisplay, (Object) localization.disclaimerHeaderForDisplay) && Intrinsics.EZpvd((Object) this.disclaimerBodyForDisplay, (Object) localization.disclaimerBodyForDisplay) && Intrinsics.EZpvd((Object) this.paybackDisclaimerForDisplay, (Object) localization.paybackDisclaimerForDisplay) && Intrinsics.EZpvd((Object) this.googleWalletBottomSheetTitle, (Object) localization.googleWalletBottomSheetTitle) && Intrinsics.EZpvd((Object) this.googleWalletBottomSheetDescFirstPar, (Object) localization.googleWalletBottomSheetDescFirstPar) && Intrinsics.EZpvd((Object) this.googleWalletBottomSheetDescSecondPar, (Object) localization.googleWalletBottomSheetDescSecondPar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountProtectionForDisplay() {
        return this.accountProtectionForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableToTradeForDisplay() {
        return this.availableToTradeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableToWithdrawForDisplay() {
        return this.availableToWithdrawForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoWithdrawHoldDaysInfoBoxForDisplay() {
        return this.cryptoWithdrawHoldDaysInfoBoxForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyLimitForDisplay() {
        return this.dailyLimitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyLimitRemainingForDisplay() {
        return this.dailyLimitRemainingForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisclaimerBodyForDisplay() {
        return this.disclaimerBodyForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisclaimerForDisplay() {
        return this.disclaimerForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisclaimerHeaderForDisplay() {
        return this.disclaimerHeaderForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRateForDisplay() {
        return this.feeRateForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatWithdrawHoldDaysInfoBoxForDisplay() {
        return this.fiatWithdrawHoldDaysInfoBoxForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequencyLimitForDisplay() {
        return this.frequencyLimitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGeneralDescriptionForDisplay() {
        return this.generalDescriptionForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGoogleWalletBottomSheetDescFirstPar() {
        return this.googleWalletBottomSheetDescFirstPar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGoogleWalletBottomSheetDescSecondPar() {
        return this.googleWalletBottomSheetDescSecondPar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGoogleWalletBottomSheetTitle() {
        return this.googleWalletBottomSheetTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInfoBoxForDisplay() {
        return this.infoBoxForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitForDisplay() {
        return this.limitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaybackDisclaimerForDisplay() {
        return this.paybackDisclaimerForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaybackProcessingTimeForDisplay() {
        return this.paybackProcessingTimeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceInfoBoxForDisplay() {
        return this.priceInfoBoxForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProcessingTimeForDisplay() {
        return this.processingTimeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRangeForDisplay() {
        return this.rangeForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSingleTransactionLimitForDisplay() {
        return this.singleTransactionLimitForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.processingTimeForDisplay;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.paybackProcessingTimeForDisplay;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.feeRateForDisplay;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.limitForDisplay;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rangeForDisplay;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.generalDescriptionForDisplay;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.dailyLimitForDisplay;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.dailyLimitRemainingForDisplay;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.frequencyLimitForDisplay;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.singleTransactionLimitForDisplay;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        int iHashCode11 = this.accountProtectionForDisplay.hashCode();
        int iHashCode12 = this.infoBoxForDisplay.hashCode();
        int iHashCode13 = this.priceInfoBoxForDisplay.hashCode();
        int iHashCode14 = this.availableToTradeForDisplay.hashCode();
        int iHashCode15 = this.availableToWithdrawForDisplay.hashCode();
        int iHashCode16 = this.cryptoWithdrawHoldDaysInfoBoxForDisplay.hashCode();
        int iHashCode17 = this.fiatWithdrawHoldDaysInfoBoxForDisplay.hashCode();
        String str11 = this.disclaimerForDisplay;
        int iHashCode18 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.disclaimerHeaderForDisplay;
        int iHashCode19 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.disclaimerBodyForDisplay;
        int iHashCode20 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.paybackDisclaimerForDisplay;
        int iHashCode21 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.googleWalletBottomSheetTitle;
        int iHashCode22 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.googleWalletBottomSheetDescFirstPar;
        int iHashCode23 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.googleWalletBottomSheetDescSecondPar;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (str17 == null ? 0 : str17.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Localization(processingTimeForDisplay=" + this.processingTimeForDisplay + ", paybackProcessingTimeForDisplay=" + this.paybackProcessingTimeForDisplay + ", feeRateForDisplay=" + this.feeRateForDisplay + ", limitForDisplay=" + this.limitForDisplay + ", rangeForDisplay=" + this.rangeForDisplay + ", generalDescriptionForDisplay=" + this.generalDescriptionForDisplay + ", dailyLimitForDisplay=" + this.dailyLimitForDisplay + ", dailyLimitRemainingForDisplay=" + this.dailyLimitRemainingForDisplay + ", frequencyLimitForDisplay=" + this.frequencyLimitForDisplay + ", singleTransactionLimitForDisplay=" + this.singleTransactionLimitForDisplay + ", accountProtectionForDisplay=" + this.accountProtectionForDisplay + ", infoBoxForDisplay=" + this.infoBoxForDisplay + ", priceInfoBoxForDisplay=" + this.priceInfoBoxForDisplay + ", availableToTradeForDisplay=" + this.availableToTradeForDisplay + ", availableToWithdrawForDisplay=" + this.availableToWithdrawForDisplay + ", cryptoWithdrawHoldDaysInfoBoxForDisplay=" + this.cryptoWithdrawHoldDaysInfoBoxForDisplay + ", fiatWithdrawHoldDaysInfoBoxForDisplay=" + this.fiatWithdrawHoldDaysInfoBoxForDisplay + ", disclaimerForDisplay=" + this.disclaimerForDisplay + ", disclaimerHeaderForDisplay=" + this.disclaimerHeaderForDisplay + ", disclaimerBodyForDisplay=" + this.disclaimerBodyForDisplay + ", paybackDisclaimerForDisplay=" + this.paybackDisclaimerForDisplay + ", googleWalletBottomSheetTitle=" + this.googleWalletBottomSheetTitle + ", googleWalletBottomSheetDescFirstPar=" + this.googleWalletBottomSheetDescFirstPar + ", googleWalletBottomSheetDescSecondPar=" + this.googleWalletBottomSheetDescSecondPar + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.processingTimeForDisplay);
        parcel.writeString(this.paybackProcessingTimeForDisplay);
        parcel.writeString(this.feeRateForDisplay);
        parcel.writeString(this.limitForDisplay);
        parcel.writeString(this.rangeForDisplay);
        parcel.writeString(this.generalDescriptionForDisplay);
        parcel.writeString(this.dailyLimitForDisplay);
        parcel.writeString(this.dailyLimitRemainingForDisplay);
        parcel.writeString(this.frequencyLimitForDisplay);
        parcel.writeString(this.singleTransactionLimitForDisplay);
        parcel.writeString(this.accountProtectionForDisplay);
        parcel.writeString(this.infoBoxForDisplay);
        parcel.writeString(this.priceInfoBoxForDisplay);
        parcel.writeString(this.availableToTradeForDisplay);
        parcel.writeString(this.availableToWithdrawForDisplay);
        parcel.writeString(this.cryptoWithdrawHoldDaysInfoBoxForDisplay);
        parcel.writeString(this.fiatWithdrawHoldDaysInfoBoxForDisplay);
        parcel.writeString(this.disclaimerForDisplay);
        parcel.writeString(this.disclaimerHeaderForDisplay);
        parcel.writeString(this.disclaimerBodyForDisplay);
        parcel.writeString(this.paybackDisclaimerForDisplay);
        parcel.writeString(this.googleWalletBottomSheetTitle);
        parcel.writeString(this.googleWalletBottomSheetDescFirstPar);
        parcel.writeString(this.googleWalletBottomSheetDescSecondPar);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.Localization.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Localization> serializer() {
            return Localization$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Localization(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.processingTimeForDisplay = null;
        } else {
            this.processingTimeForDisplay = str;
        }
        if ((i & 2) == 0) {
            this.paybackProcessingTimeForDisplay = null;
        } else {
            this.paybackProcessingTimeForDisplay = str2;
        }
        if ((i & 4) == 0) {
            this.feeRateForDisplay = null;
        } else {
            this.feeRateForDisplay = str3;
        }
        if ((i & 8) == 0) {
            this.limitForDisplay = null;
        } else {
            this.limitForDisplay = str4;
        }
        if ((i & 16) == 0) {
            this.rangeForDisplay = null;
        } else {
            this.rangeForDisplay = str5;
        }
        if ((i & 32) == 0) {
            this.generalDescriptionForDisplay = null;
        } else {
            this.generalDescriptionForDisplay = str6;
        }
        if ((i & 64) == 0) {
            this.dailyLimitForDisplay = null;
        } else {
            this.dailyLimitForDisplay = str7;
        }
        if ((i & 128) == 0) {
            this.dailyLimitRemainingForDisplay = null;
        } else {
            this.dailyLimitRemainingForDisplay = str8;
        }
        if ((i & 256) == 0) {
            this.frequencyLimitForDisplay = null;
        } else {
            this.frequencyLimitForDisplay = str9;
        }
        if ((i & 512) == 0) {
            this.singleTransactionLimitForDisplay = null;
        } else {
            this.singleTransactionLimitForDisplay = str10;
        }
        if ((i & 1024) == 0) {
            this.accountProtectionForDisplay = "";
        } else {
            this.accountProtectionForDisplay = str11;
        }
        if ((i & 2048) == 0) {
            this.infoBoxForDisplay = "";
        } else {
            this.infoBoxForDisplay = str12;
        }
        if ((i & 4096) == 0) {
            this.priceInfoBoxForDisplay = "";
        } else {
            this.priceInfoBoxForDisplay = str13;
        }
        if ((i & 8192) == 0) {
            this.availableToTradeForDisplay = "";
        } else {
            this.availableToTradeForDisplay = str14;
        }
        if ((i & 16384) == 0) {
            this.availableToWithdrawForDisplay = "";
        } else {
            this.availableToWithdrawForDisplay = str15;
        }
        if ((32768 & i) == 0) {
            this.cryptoWithdrawHoldDaysInfoBoxForDisplay = "";
        } else {
            this.cryptoWithdrawHoldDaysInfoBoxForDisplay = str16;
        }
        if ((65536 & i) == 0) {
            this.fiatWithdrawHoldDaysInfoBoxForDisplay = "";
        } else {
            this.fiatWithdrawHoldDaysInfoBoxForDisplay = str17;
        }
        if ((131072 & i) == 0) {
            this.disclaimerForDisplay = null;
        } else {
            this.disclaimerForDisplay = str18;
        }
        if ((262144 & i) == 0) {
            this.disclaimerHeaderForDisplay = null;
        } else {
            this.disclaimerHeaderForDisplay = str19;
        }
        if ((524288 & i) == 0) {
            this.disclaimerBodyForDisplay = null;
        } else {
            this.disclaimerBodyForDisplay = str20;
        }
        if ((1048576 & i) == 0) {
            this.paybackDisclaimerForDisplay = null;
        } else {
            this.paybackDisclaimerForDisplay = str21;
        }
        if ((2097152 & i) == 0) {
            this.googleWalletBottomSheetTitle = null;
        } else {
            this.googleWalletBottomSheetTitle = str22;
        }
        if ((4194304 & i) == 0) {
            this.googleWalletBottomSheetDescFirstPar = null;
        } else {
            this.googleWalletBottomSheetDescFirstPar = str23;
        }
        if ((i & 8388608) == 0) {
            this.googleWalletBottomSheetDescSecondPar = null;
        } else {
            this.googleWalletBottomSheetDescSecondPar = str24;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(Localization localization, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || localization.processingTimeForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, localization.processingTimeForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || localization.paybackProcessingTimeForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, localization.paybackProcessingTimeForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || localization.feeRateForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, localization.feeRateForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || localization.limitForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, localization.limitForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || localization.rangeForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, localization.rangeForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || localization.generalDescriptionForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, localization.generalDescriptionForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || localization.dailyLimitForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, localization.dailyLimitForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || localization.dailyLimitRemainingForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, localization.dailyLimitRemainingForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || localization.frequencyLimitForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, localization.frequencyLimitForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || localization.singleTransactionLimitForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, localization.singleTransactionLimitForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) localization.accountProtectionForDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, localization.accountProtectionForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) localization.infoBoxForDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, localization.infoBoxForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) localization.priceInfoBoxForDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, localization.priceInfoBoxForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) localization.availableToTradeForDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, localization.availableToTradeForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) localization.availableToWithdrawForDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, localization.availableToWithdrawForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) localization.cryptoWithdrawHoldDaysInfoBoxForDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, localization.cryptoWithdrawHoldDaysInfoBoxForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) localization.fiatWithdrawHoldDaysInfoBoxForDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, localization.fiatWithdrawHoldDaysInfoBoxForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || localization.disclaimerForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, localization.disclaimerForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || localization.disclaimerHeaderForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, localization.disclaimerHeaderForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || localization.disclaimerBodyForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, localization.disclaimerBodyForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || localization.paybackDisclaimerForDisplay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, localization.paybackDisclaimerForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || localization.googleWalletBottomSheetTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, localization.googleWalletBottomSheetTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || localization.googleWalletBottomSheetDescFirstPar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, localization.googleWalletBottomSheetDescFirstPar);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) && localization.googleWalletBottomSheetDescSecondPar == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, localization.googleWalletBottomSheetDescSecondPar);
    }

    public Localization(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.processingTimeForDisplay = str;
        this.paybackProcessingTimeForDisplay = str2;
        this.feeRateForDisplay = str3;
        this.limitForDisplay = str4;
        this.rangeForDisplay = str5;
        this.generalDescriptionForDisplay = str6;
        this.dailyLimitForDisplay = str7;
        this.dailyLimitRemainingForDisplay = str8;
        this.frequencyLimitForDisplay = str9;
        this.singleTransactionLimitForDisplay = str10;
        this.accountProtectionForDisplay = str11;
        this.infoBoxForDisplay = str12;
        this.priceInfoBoxForDisplay = str13;
        this.availableToTradeForDisplay = str14;
        this.availableToWithdrawForDisplay = str15;
        this.cryptoWithdrawHoldDaysInfoBoxForDisplay = str16;
        this.fiatWithdrawHoldDaysInfoBoxForDisplay = str17;
        this.disclaimerForDisplay = str18;
        this.disclaimerHeaderForDisplay = str19;
        this.disclaimerBodyForDisplay = str20;
        this.paybackDisclaimerForDisplay = str21;
        this.googleWalletBottomSheetTitle = str22;
        this.googleWalletBottomSheetDescFirstPar = str23;
        this.googleWalletBottomSheetDescSecondPar = str24;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0114: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r50v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:347) call: com.okinc.okpaymentapi.data.remote.model.management.Localization.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Localization(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24);
    }
}
