package com.okinc.kyc.api.biz.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ForBidden implements Parcelable {
    public static final int $stable = 0;
    private final String country;
    private final String displayCountryName;
    private final int kycLevel;
    private final boolean limit;
    private final Integer politStatus;
    private final String province;
    private final String provinceCode;
    private final boolean removeUserFlag;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ForBidden> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ForBidden> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ForBidden createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ForBidden(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ForBidden[] newArray(int i) {
            return new ForBidden[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ForBidden() {
        this((String) null, (String) null, 0, false, (Integer) null, (String) null, (String) null, false, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayCountryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.politStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.provinceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.removeUserFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForBidden copy(@NotNull String str, @NotNull String str2, int i, boolean z, Integer num, @NotNull String str3, @NotNull String str4, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ForBidden(str, str2, i, z, num, str3, str4, z2);
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
        if (!(obj instanceof ForBidden)) {
            return false;
        }
        ForBidden forBidden = (ForBidden) obj;
        return Intrinsics.EZpvd((Object) this.country, (Object) forBidden.country) && Intrinsics.EZpvd((Object) this.displayCountryName, (Object) forBidden.displayCountryName) && this.kycLevel == forBidden.kycLevel && this.limit == forBidden.limit && Intrinsics.EZpvd(this.politStatus, forBidden.politStatus) && Intrinsics.EZpvd((Object) this.province, (Object) forBidden.province) && Intrinsics.EZpvd((Object) this.provinceCode, (Object) forBidden.provinceCode) && this.removeUserFlag == forBidden.removeUserFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayCountryName() {
        return this.displayCountryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPolitStatus() {
        return this.politStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProvince() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProvinceCode() {
        return this.provinceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRemoveUserFlag() {
        return this.removeUserFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.country.hashCode();
        int iHashCode2 = this.displayCountryName.hashCode();
        int iHashCode3 = Integer.hashCode(this.kycLevel);
        int iHashCode4 = Boolean.hashCode(this.limit);
        Integer num = this.politStatus;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.province.hashCode()) * 31) + this.provinceCode.hashCode()) * 31) + Boolean.hashCode(this.removeUserFlag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ForBidden(country=" + this.country + ", displayCountryName=" + this.displayCountryName + ", kycLevel=" + this.kycLevel + ", limit=" + this.limit + ", politStatus=" + this.politStatus + ", province=" + this.province + ", provinceCode=" + this.provinceCode + ", removeUserFlag=" + this.removeUserFlag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.country);
        parcel.writeString(this.displayCountryName);
        parcel.writeInt(this.kycLevel);
        parcel.writeInt(this.limit ? 1 : 0);
        Integer num = this.politStatus;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.province);
        parcel.writeString(this.provinceCode);
        parcel.writeInt(this.removeUserFlag ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.ForBidden.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ForBidden> serializer() {
            return ForBidden$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ForBidden(int i, String str, String str2, int i2, boolean z, Integer num, String str3, String str4, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.country = "";
        } else {
            this.country = str;
        }
        if ((i & 2) == 0) {
            this.displayCountryName = "";
        } else {
            this.displayCountryName = str2;
        }
        if ((i & 4) == 0) {
            this.kycLevel = 0;
        } else {
            this.kycLevel = i2;
        }
        if ((i & 8) == 0) {
            this.limit = false;
        } else {
            this.limit = z;
        }
        if ((i & 16) == 0) {
            this.politStatus = null;
        } else {
            this.politStatus = num;
        }
        if ((i & 32) == 0) {
            this.province = "";
        } else {
            this.province = str3;
        }
        if ((i & 64) == 0) {
            this.provinceCode = "";
        } else {
            this.provinceCode = str4;
        }
        if ((i & 128) == 0) {
            this.removeUserFlag = false;
        } else {
            this.removeUserFlag = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(ForBidden forBidden, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) forBidden.country, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, forBidden.country);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) forBidden.displayCountryName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, forBidden.displayCountryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || forBidden.kycLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, forBidden.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || forBidden.limit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, forBidden.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || forBidden.politStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, forBidden.politStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) forBidden.province, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, forBidden.province);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) forBidden.provinceCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, forBidden.provinceCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || forBidden.removeUserFlag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, forBidden.removeUserFlag);
        }
    }

    public ForBidden(@NotNull String str, @NotNull String str2, int i, boolean z, Integer num, @NotNull String str3, @NotNull String str4, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.country = str;
        this.displayCountryName = str2;
        this.kycLevel = i;
        this.limit = z;
        this.politStatus = num;
        this.province = str3;
        this.provinceCode = str4;
        this.removeUserFlag = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0021: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r19v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, int, boolean, java.lang.Integer, java.lang.String, java.lang.String, boolean):void (m)] (LINE:30) call: com.okinc.kyc.api.biz.bean.ForBidden.<init>(java.lang.String, java.lang.String, int, boolean, java.lang.Integer, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ForBidden(String str, String str2, int i, boolean z, Integer num, String str3, String str4, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? "" : str3, (i2 & 64) == 0 ? str4 : "", (i2 & 128) == 0 ? z2 : false);
    }
}
