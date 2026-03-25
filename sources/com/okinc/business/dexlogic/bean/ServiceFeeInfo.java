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
public final class ServiceFeeInfo implements Parcelable {
    public static final int $stable = 0;
    private final boolean commissionDirection;
    private final String country;
    private final String discountedServiceFee;
    private final String discountedServiceFeeRate;
    private final String encryptServiceFeeData;
    private final String faqUrl;
    private final String feeTokenAddress;
    private final String isChargeVersion;
    private final String isDisplayServiceFee;
    private final String nativeTokenCostAmt;
    private final String originalServiceFeeRate;
    private final String refCode;
    private final String referralCommissionAddress;
    private final String referralCommissionRate;
    private final String serviceFeeTokenSymbol;
    private final String serviceFeeUsd;
    private final String userId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ServiceFeeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ServiceFeeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServiceFeeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ServiceFeeInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServiceFeeInfo[] newArray(int i) {
            return new ServiceFeeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ServiceFeeInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.referralCommissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.referralCommissionAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.commissionDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.nativeTokenCostAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.serviceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.originalServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.discountedServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.discountedServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.isChargeVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.isDisplayServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.encryptServiceFeeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        return new ServiceFeeInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, z, str14, str15, str16);
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
        if (!(obj instanceof ServiceFeeInfo)) {
            return false;
        }
        ServiceFeeInfo serviceFeeInfo = (ServiceFeeInfo) obj;
        return Intrinsics.EZpvd((Object) this.serviceFeeUsd, (Object) serviceFeeInfo.serviceFeeUsd) && Intrinsics.EZpvd((Object) this.originalServiceFeeRate, (Object) serviceFeeInfo.originalServiceFeeRate) && Intrinsics.EZpvd((Object) this.discountedServiceFee, (Object) serviceFeeInfo.discountedServiceFee) && Intrinsics.EZpvd((Object) this.discountedServiceFeeRate, (Object) serviceFeeInfo.discountedServiceFeeRate) && Intrinsics.EZpvd((Object) this.userId, (Object) serviceFeeInfo.userId) && Intrinsics.EZpvd((Object) this.isChargeVersion, (Object) serviceFeeInfo.isChargeVersion) && Intrinsics.EZpvd((Object) this.isDisplayServiceFee, (Object) serviceFeeInfo.isDisplayServiceFee) && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) serviceFeeInfo.feeTokenAddress) && Intrinsics.EZpvd((Object) this.encryptServiceFeeData, (Object) serviceFeeInfo.encryptServiceFeeData) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) serviceFeeInfo.faqUrl) && Intrinsics.EZpvd((Object) this.refCode, (Object) serviceFeeInfo.refCode) && Intrinsics.EZpvd((Object) this.referralCommissionRate, (Object) serviceFeeInfo.referralCommissionRate) && Intrinsics.EZpvd((Object) this.referralCommissionAddress, (Object) serviceFeeInfo.referralCommissionAddress) && this.commissionDirection == serviceFeeInfo.commissionDirection && Intrinsics.EZpvd((Object) this.country, (Object) serviceFeeInfo.country) && Intrinsics.EZpvd((Object) this.nativeTokenCostAmt, (Object) serviceFeeInfo.nativeTokenCostAmt) && Intrinsics.EZpvd((Object) this.serviceFeeTokenSymbol, (Object) serviceFeeInfo.serviceFeeTokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCommissionDirection() {
        return this.commissionDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountedServiceFee() {
        return this.discountedServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountedServiceFeeRate() {
        return this.discountedServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptServiceFeeData() {
        return this.encryptServiceFeeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenAddress() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenCostAmt() {
        return this.nativeTokenCostAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalServiceFeeRate() {
        return this.originalServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefCode() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCommissionAddress() {
        return this.referralCommissionAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCommissionRate() {
        return this.referralCommissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeTokenSymbol() {
        return this.serviceFeeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceFeeUsd() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.serviceFeeUsd.hashCode() * 31) + this.originalServiceFeeRate.hashCode()) * 31) + this.discountedServiceFee.hashCode()) * 31) + this.discountedServiceFeeRate.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.isChargeVersion.hashCode()) * 31) + this.isDisplayServiceFee.hashCode()) * 31) + this.feeTokenAddress.hashCode()) * 31) + this.encryptServiceFeeData.hashCode()) * 31) + this.faqUrl.hashCode()) * 31) + this.refCode.hashCode()) * 31) + this.referralCommissionRate.hashCode()) * 31) + this.referralCommissionAddress.hashCode()) * 31) + Boolean.hashCode(this.commissionDirection)) * 31) + this.country.hashCode()) * 31) + this.nativeTokenCostAmt.hashCode()) * 31) + this.serviceFeeTokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isChargeVersion() {
        return this.isChargeVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDisplayServiceFee() {
        return this.isDisplayServiceFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ServiceFeeInfo(serviceFeeUsd=" + this.serviceFeeUsd + ", originalServiceFeeRate=" + this.originalServiceFeeRate + ", discountedServiceFee=" + this.discountedServiceFee + ", discountedServiceFeeRate=" + this.discountedServiceFeeRate + ", userId=" + this.userId + ", isChargeVersion=" + this.isChargeVersion + ", isDisplayServiceFee=" + this.isDisplayServiceFee + ", feeTokenAddress=" + this.feeTokenAddress + ", encryptServiceFeeData=" + this.encryptServiceFeeData + ", faqUrl=" + this.faqUrl + ", refCode=" + this.refCode + ", referralCommissionRate=" + this.referralCommissionRate + ", referralCommissionAddress=" + this.referralCommissionAddress + ", commissionDirection=" + this.commissionDirection + ", country=" + this.country + ", nativeTokenCostAmt=" + this.nativeTokenCostAmt + ", serviceFeeTokenSymbol=" + this.serviceFeeTokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.serviceFeeUsd);
        parcel.writeString(this.originalServiceFeeRate);
        parcel.writeString(this.discountedServiceFee);
        parcel.writeString(this.discountedServiceFeeRate);
        parcel.writeString(this.userId);
        parcel.writeString(this.isChargeVersion);
        parcel.writeString(this.isDisplayServiceFee);
        parcel.writeString(this.feeTokenAddress);
        parcel.writeString(this.encryptServiceFeeData);
        parcel.writeString(this.faqUrl);
        parcel.writeString(this.refCode);
        parcel.writeString(this.referralCommissionRate);
        parcel.writeString(this.referralCommissionAddress);
        parcel.writeInt(this.commissionDirection ? 1 : 0);
        parcel.writeString(this.country);
        parcel.writeString(this.nativeTokenCostAmt);
        parcel.writeString(this.serviceFeeTokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.ServiceFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ServiceFeeInfo> serializer() {
            return ServiceFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ServiceFeeInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serviceFeeUsd = "";
        } else {
            this.serviceFeeUsd = str;
        }
        if ((i & 2) == 0) {
            this.originalServiceFeeRate = "";
        } else {
            this.originalServiceFeeRate = str2;
        }
        if ((i & 4) == 0) {
            this.discountedServiceFee = "";
        } else {
            this.discountedServiceFee = str3;
        }
        if ((i & 8) == 0) {
            this.discountedServiceFeeRate = "";
        } else {
            this.discountedServiceFeeRate = str4;
        }
        if ((i & 16) == 0) {
            this.userId = "";
        } else {
            this.userId = str5;
        }
        if ((i & 32) == 0) {
            this.isChargeVersion = "";
        } else {
            this.isChargeVersion = str6;
        }
        if ((i & 64) == 0) {
            this.isDisplayServiceFee = "";
        } else {
            this.isDisplayServiceFee = str7;
        }
        if ((i & 128) == 0) {
            this.feeTokenAddress = "";
        } else {
            this.feeTokenAddress = str8;
        }
        if ((i & 256) == 0) {
            this.encryptServiceFeeData = "";
        } else {
            this.encryptServiceFeeData = str9;
        }
        if ((i & 512) == 0) {
            this.faqUrl = "";
        } else {
            this.faqUrl = str10;
        }
        if ((i & 1024) == 0) {
            this.refCode = "";
        } else {
            this.refCode = str11;
        }
        if ((i & 2048) == 0) {
            this.referralCommissionRate = "";
        } else {
            this.referralCommissionRate = str12;
        }
        if ((i & 4096) == 0) {
            this.referralCommissionAddress = "";
        } else {
            this.referralCommissionAddress = str13;
        }
        this.commissionDirection = (i & 8192) == 0 ? false : z;
        if ((i & 16384) == 0) {
            this.country = "";
        } else {
            this.country = str14;
        }
        if ((32768 & i) == 0) {
            this.nativeTokenCostAmt = "";
        } else {
            this.nativeTokenCostAmt = str15;
        }
        if ((i & 65536) == 0) {
            this.serviceFeeTokenSymbol = "";
        } else {
            this.serviceFeeTokenSymbol = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ServiceFeeInfo serviceFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) serviceFeeInfo.serviceFeeUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, serviceFeeInfo.serviceFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) serviceFeeInfo.originalServiceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, serviceFeeInfo.originalServiceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) serviceFeeInfo.discountedServiceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, serviceFeeInfo.discountedServiceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) serviceFeeInfo.discountedServiceFeeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, serviceFeeInfo.discountedServiceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) serviceFeeInfo.userId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, serviceFeeInfo.userId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) serviceFeeInfo.isChargeVersion, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, serviceFeeInfo.isChargeVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) serviceFeeInfo.isDisplayServiceFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, serviceFeeInfo.isDisplayServiceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) serviceFeeInfo.feeTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, serviceFeeInfo.feeTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) serviceFeeInfo.encryptServiceFeeData, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, serviceFeeInfo.encryptServiceFeeData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) serviceFeeInfo.faqUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, serviceFeeInfo.faqUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) serviceFeeInfo.refCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, serviceFeeInfo.refCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) serviceFeeInfo.referralCommissionRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, serviceFeeInfo.referralCommissionRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) serviceFeeInfo.referralCommissionAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, serviceFeeInfo.referralCommissionAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || serviceFeeInfo.commissionDirection) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, serviceFeeInfo.commissionDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) serviceFeeInfo.country, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, serviceFeeInfo.country);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) serviceFeeInfo.nativeTokenCostAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, serviceFeeInfo.nativeTokenCostAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) serviceFeeInfo.serviceFeeTokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, serviceFeeInfo.serviceFeeTokenSymbol);
    }

    public ServiceFeeInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        this.serviceFeeUsd = str;
        this.originalServiceFeeRate = str2;
        this.discountedServiceFee = str3;
        this.discountedServiceFeeRate = str4;
        this.userId = str5;
        this.isChargeVersion = str6;
        this.isDisplayServiceFee = str7;
        this.feeTokenAddress = str8;
        this.encryptServiceFeeData = str9;
        this.faqUrl = str10;
        this.refCode = str11;
        this.referralCommissionRate = str12;
        this.referralCommissionAddress = str13;
        this.commissionDirection = z;
        this.country = str14;
        this.nativeTokenCostAmt = str15;
        this.serviceFeeTokenSymbol = str16;
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
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1644) call: com.okinc.business.dexlogic.bean.ServiceFeeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ServiceFeeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16);
    }

    public final boolean isDisplay() {
        return Intrinsics.EZpvd((Object) this.isDisplayServiceFee, (Object) "1");
    }

    public final boolean isCharge() {
        return Intrinsics.EZpvd((Object) this.isChargeVersion, (Object) "1");
    }
}
