package com.okinc.business.dex.trade.core.domain.model;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ServiceFeeInfo implements Parcelable {
    public static final int $stable = 0;
    private final String discountedServiceFeeRate;
    private final String faqUrl;
    private final String feeTokenAddress;
    private final String isChargeVersion;
    private final String isDisplayServiceFee;
    private final String originalServiceFeeRate;
    private final String refCode;
    private final String referralCommissionAddress;
    private final String referralCommissionRate;
    private final String serviceFeeUsd;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ServiceFeeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ServiceFeeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ServiceFeeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ServiceFeeInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.referralCommissionAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.originalServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.discountedServiceFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.faqUrl;
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
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.referralCommissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new ServiceFeeInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        return Intrinsics.EZpvd((Object) this.serviceFeeUsd, (Object) serviceFeeInfo.serviceFeeUsd) && Intrinsics.EZpvd((Object) this.originalServiceFeeRate, (Object) serviceFeeInfo.originalServiceFeeRate) && Intrinsics.EZpvd((Object) this.discountedServiceFeeRate, (Object) serviceFeeInfo.discountedServiceFeeRate) && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) serviceFeeInfo.feeTokenAddress) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) serviceFeeInfo.faqUrl) && Intrinsics.EZpvd((Object) this.isChargeVersion, (Object) serviceFeeInfo.isChargeVersion) && Intrinsics.EZpvd((Object) this.isDisplayServiceFee, (Object) serviceFeeInfo.isDisplayServiceFee) && Intrinsics.EZpvd((Object) this.refCode, (Object) serviceFeeInfo.refCode) && Intrinsics.EZpvd((Object) this.referralCommissionRate, (Object) serviceFeeInfo.referralCommissionRate) && Intrinsics.EZpvd((Object) this.referralCommissionAddress, (Object) serviceFeeInfo.referralCommissionAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountedServiceFeeRate() {
        return this.discountedServiceFeeRate;
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
    public final String getServiceFeeUsd() {
        return this.serviceFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.serviceFeeUsd;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.originalServiceFeeRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.discountedServiceFeeRate;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.feeTokenAddress;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.faqUrl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.isChargeVersion;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.isDisplayServiceFee;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.refCode;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.referralCommissionRate;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.referralCommissionAddress;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
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
        return "ServiceFeeInfo(serviceFeeUsd=" + this.serviceFeeUsd + ", originalServiceFeeRate=" + this.originalServiceFeeRate + ", discountedServiceFeeRate=" + this.discountedServiceFeeRate + ", feeTokenAddress=" + this.feeTokenAddress + ", faqUrl=" + this.faqUrl + ", isChargeVersion=" + this.isChargeVersion + ", isDisplayServiceFee=" + this.isDisplayServiceFee + ", refCode=" + this.refCode + ", referralCommissionRate=" + this.referralCommissionRate + ", referralCommissionAddress=" + this.referralCommissionAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.serviceFeeUsd);
        parcel.writeString(this.originalServiceFeeRate);
        parcel.writeString(this.discountedServiceFeeRate);
        parcel.writeString(this.feeTokenAddress);
        parcel.writeString(this.faqUrl);
        parcel.writeString(this.isChargeVersion);
        parcel.writeString(this.isDisplayServiceFee);
        parcel.writeString(this.refCode);
        parcel.writeString(this.referralCommissionRate);
        parcel.writeString(this.referralCommissionAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ServiceFeeInfo> serializer() {
            return ServiceFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ServiceFeeInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serviceFeeUsd = null;
        } else {
            this.serviceFeeUsd = str;
        }
        if ((i & 2) == 0) {
            this.originalServiceFeeRate = null;
        } else {
            this.originalServiceFeeRate = str2;
        }
        if ((i & 4) == 0) {
            this.discountedServiceFeeRate = null;
        } else {
            this.discountedServiceFeeRate = str3;
        }
        if ((i & 8) == 0) {
            this.feeTokenAddress = null;
        } else {
            this.feeTokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.faqUrl = null;
        } else {
            this.faqUrl = str5;
        }
        if ((i & 32) == 0) {
            this.isChargeVersion = null;
        } else {
            this.isChargeVersion = str6;
        }
        if ((i & 64) == 0) {
            this.isDisplayServiceFee = null;
        } else {
            this.isDisplayServiceFee = str7;
        }
        if ((i & 128) == 0) {
            this.refCode = null;
        } else {
            this.refCode = str8;
        }
        if ((i & 256) == 0) {
            this.referralCommissionRate = null;
        } else {
            this.referralCommissionRate = str9;
        }
        if ((i & 512) == 0) {
            this.referralCommissionAddress = null;
        } else {
            this.referralCommissionAddress = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ServiceFeeInfo serviceFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || serviceFeeInfo.serviceFeeUsd != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, serviceFeeInfo.serviceFeeUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || serviceFeeInfo.originalServiceFeeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, serviceFeeInfo.originalServiceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || serviceFeeInfo.discountedServiceFeeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, serviceFeeInfo.discountedServiceFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || serviceFeeInfo.feeTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, serviceFeeInfo.feeTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || serviceFeeInfo.faqUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, serviceFeeInfo.faqUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || serviceFeeInfo.isChargeVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, serviceFeeInfo.isChargeVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || serviceFeeInfo.isDisplayServiceFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, serviceFeeInfo.isDisplayServiceFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || serviceFeeInfo.refCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, serviceFeeInfo.refCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || serviceFeeInfo.referralCommissionRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, serviceFeeInfo.referralCommissionRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && serviceFeeInfo.referralCommissionAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, serviceFeeInfo.referralCommissionAddress);
    }

    public ServiceFeeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.serviceFeeUsd = str;
        this.originalServiceFeeRate = str2;
        this.discountedServiceFeeRate = str3;
        this.feeTokenAddress = str4;
        this.faqUrl = str5;
        this.isChargeVersion = str6;
        this.isDisplayServiceFee = str7;
        this.refCode = str8;
        this.referralCommissionRate = str9;
        this.referralCommissionAddress = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:413) call: com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ServiceFeeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
