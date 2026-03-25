package com.okinc.business.finance_api.api;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class FinanceLimitInfo implements Parcelable {
    public static final int $stable = 0;
    private final String country;
    private final String displayCountryName;
    private final int kycLevel;
    private final boolean limit;
    private final int politStatus;
    private final String province;
    private final String provinceCode;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FinanceLimitInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FinanceLimitInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinanceLimitInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FinanceLimitInfo(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinanceLimitInfo[] newArray(int i) {
            return new FinanceLimitInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FinanceLimitInfo() {
        this(false, (String) null, (String) null, (String) null, (String) null, 0, 0, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FinanceLimitInfo copy$default(FinanceLimitInfo financeLimitInfo, boolean z, String str, String str2, String str3, String str4, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = financeLimitInfo.limit;
        }
        if ((i3 & 2) != 0) {
            str = financeLimitInfo.country;
        }
        String str5 = str;
        if ((i3 & 4) != 0) {
            str2 = financeLimitInfo.displayCountryName;
        }
        String str6 = str2;
        if ((i3 & 8) != 0) {
            str3 = financeLimitInfo.province;
        }
        String str7 = str3;
        if ((i3 & 16) != 0) {
            str4 = financeLimitInfo.provinceCode;
        }
        String str8 = str4;
        if ((i3 & 32) != 0) {
            i = financeLimitInfo.kycLevel;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = financeLimitInfo.politStatus;
        }
        return financeLimitInfo.copy(z, str5, str6, str7, str8, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayCountryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.province;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.provinceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.politStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FinanceLimitInfo copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new FinanceLimitInfo(z, str, str2, str3, str4, i, i2);
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
        if (!(obj instanceof FinanceLimitInfo)) {
            return false;
        }
        FinanceLimitInfo financeLimitInfo = (FinanceLimitInfo) obj;
        return this.limit == financeLimitInfo.limit && Intrinsics.EZpvd((Object) this.country, (Object) financeLimitInfo.country) && Intrinsics.EZpvd((Object) this.displayCountryName, (Object) financeLimitInfo.displayCountryName) && Intrinsics.EZpvd((Object) this.province, (Object) financeLimitInfo.province) && Intrinsics.EZpvd((Object) this.provinceCode, (Object) financeLimitInfo.provinceCode) && this.kycLevel == financeLimitInfo.kycLevel && this.politStatus == financeLimitInfo.politStatus;
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
    public final int getPolitStatus() {
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
    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.limit) * 31) + this.country.hashCode()) * 31) + this.displayCountryName.hashCode()) * 31) + this.province.hashCode()) * 31) + this.provinceCode.hashCode()) * 31) + Integer.hashCode(this.kycLevel)) * 31) + Integer.hashCode(this.politStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FinanceLimitInfo(limit=" + this.limit + ", country=" + this.country + ", displayCountryName=" + this.displayCountryName + ", province=" + this.province + ", provinceCode=" + this.provinceCode + ", kycLevel=" + this.kycLevel + ", politStatus=" + this.politStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.limit ? 1 : 0);
        parcel.writeString(this.country);
        parcel.writeString(this.displayCountryName);
        parcel.writeString(this.province);
        parcel.writeString(this.provinceCode);
        parcel.writeInt(this.kycLevel);
        parcel.writeInt(this.politStatus);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.finance_api.api.FinanceLimitInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinanceLimitInfo> serializer() {
            return FinanceLimitInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinanceLimitInfo(int i, boolean z, String str, String str2, String str3, String str4, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.limit = false;
        } else {
            this.limit = z;
        }
        if ((i & 2) == 0) {
            this.country = "";
        } else {
            this.country = str;
        }
        if ((i & 4) == 0) {
            this.displayCountryName = "";
        } else {
            this.displayCountryName = str2;
        }
        if ((i & 8) == 0) {
            this.province = "";
        } else {
            this.province = str3;
        }
        if ((i & 16) == 0) {
            this.provinceCode = "";
        } else {
            this.provinceCode = str4;
        }
        if ((i & 32) == 0) {
            this.kycLevel = 0;
        } else {
            this.kycLevel = i2;
        }
        if ((i & 64) == 0) {
            this.politStatus = 0;
        } else {
            this.politStatus = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(FinanceLimitInfo financeLimitInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || financeLimitInfo.limit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, financeLimitInfo.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) financeLimitInfo.country, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, financeLimitInfo.country);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) financeLimitInfo.displayCountryName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, financeLimitInfo.displayCountryName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) financeLimitInfo.province, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, financeLimitInfo.province);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) financeLimitInfo.provinceCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, financeLimitInfo.provinceCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || financeLimitInfo.kycLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, financeLimitInfo.kycLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && financeLimitInfo.politStatus == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, financeLimitInfo.politStatus);
    }

    public FinanceLimitInfo(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.limit = z;
        this.country = str;
        this.displayCountryName = str2;
        this.province = str3;
        this.provinceCode = str4;
        this.kycLevel = i;
        this.politStatus = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int):void (m)] (LINE:16) call: com.okinc.business.finance_api.api.FinanceLimitInfo.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ FinanceLimitInfo(boolean z, String str, String str2, String str3, String str4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) == 0 ? str4 : "", (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
    }
}
