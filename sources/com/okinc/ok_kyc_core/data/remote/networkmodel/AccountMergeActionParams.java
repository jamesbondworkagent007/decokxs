package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AccountMergeActionParams implements Parcelable {
    private final String accountName;
    private String certifiedEmail;
    private final String certifiedInfo;
    private String certifiedPhone;
    private final String certifiedType;
    private final String currentInfo;
    private final String currentType;
    private final String idCard;
    private final Boolean isGreaterThan10U;
    private final String realName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountMergeActionParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AccountMergeActionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountMergeActionParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountMergeActionParams(string, string2, string3, string4, string5, string6, string7, string8, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountMergeActionParams[] newArray(int i) {
            return new AccountMergeActionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountMergeActionParams() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.certifiedEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.certifiedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.certifiedInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.certifiedPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isGreaterThan10U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMergeActionParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9) {
        return new AccountMergeActionParams(str, str2, str3, str4, str5, str6, str7, str8, bool, str9);
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
        if (!(obj instanceof AccountMergeActionParams)) {
            return false;
        }
        AccountMergeActionParams accountMergeActionParams = (AccountMergeActionParams) obj;
        return Intrinsics.EZpvd((Object) this.realName, (Object) accountMergeActionParams.realName) && Intrinsics.EZpvd((Object) this.accountName, (Object) accountMergeActionParams.accountName) && Intrinsics.EZpvd((Object) this.idCard, (Object) accountMergeActionParams.idCard) && Intrinsics.EZpvd((Object) this.certifiedType, (Object) accountMergeActionParams.certifiedType) && Intrinsics.EZpvd((Object) this.certifiedInfo, (Object) accountMergeActionParams.certifiedInfo) && Intrinsics.EZpvd((Object) this.currentType, (Object) accountMergeActionParams.currentType) && Intrinsics.EZpvd((Object) this.currentInfo, (Object) accountMergeActionParams.currentInfo) && Intrinsics.EZpvd((Object) this.certifiedPhone, (Object) accountMergeActionParams.certifiedPhone) && Intrinsics.EZpvd(this.isGreaterThan10U, accountMergeActionParams.isGreaterThan10U) && Intrinsics.EZpvd((Object) this.certifiedEmail, (Object) accountMergeActionParams.certifiedEmail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCertifiedEmail() {
        return this.certifiedEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCertifiedInfo() {
        return this.certifiedInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCertifiedPhone() {
        return this.certifiedPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCertifiedType() {
        return this.certifiedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentInfo() {
        return this.currentInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentType() {
        return this.currentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdCard() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealName() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.realName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accountName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.idCard;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.certifiedType;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.certifiedInfo;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.currentType;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.currentInfo;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.certifiedPhone;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        Boolean bool = this.isGreaterThan10U;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str9 = this.certifiedEmail;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isGreaterThan10U() {
        return this.isGreaterThan10U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertifiedEmail(String str) {
        this.certifiedEmail = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertifiedPhone(String str) {
        this.certifiedPhone = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountMergeActionParams(realName=" + this.realName + ", accountName=" + this.accountName + ", idCard=" + this.idCard + ", certifiedType=" + this.certifiedType + ", certifiedInfo=" + this.certifiedInfo + ", currentType=" + this.currentType + ", currentInfo=" + this.currentInfo + ", certifiedPhone=" + this.certifiedPhone + ", isGreaterThan10U=" + this.isGreaterThan10U + ", certifiedEmail=" + this.certifiedEmail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.realName);
        parcel.writeString(this.accountName);
        parcel.writeString(this.idCard);
        parcel.writeString(this.certifiedType);
        parcel.writeString(this.certifiedInfo);
        parcel.writeString(this.currentType);
        parcel.writeString(this.currentInfo);
        parcel.writeString(this.certifiedPhone);
        Boolean bool = this.isGreaterThan10U;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.certifiedEmail);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountMergeActionParams> serializer() {
            return AccountMergeActionParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountMergeActionParams(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.realName = "";
        } else {
            this.realName = str;
        }
        if ((i & 2) == 0) {
            this.accountName = "";
        } else {
            this.accountName = str2;
        }
        if ((i & 4) == 0) {
            this.idCard = "";
        } else {
            this.idCard = str3;
        }
        if ((i & 8) == 0) {
            this.certifiedType = "";
        } else {
            this.certifiedType = str4;
        }
        if ((i & 16) == 0) {
            this.certifiedInfo = "";
        } else {
            this.certifiedInfo = str5;
        }
        if ((i & 32) == 0) {
            this.currentType = "";
        } else {
            this.currentType = str6;
        }
        if ((i & 64) == 0) {
            this.currentInfo = "";
        } else {
            this.currentInfo = str7;
        }
        if ((i & 128) == 0) {
            this.certifiedPhone = "";
        } else {
            this.certifiedPhone = str8;
        }
        if ((i & 256) == 0) {
            this.isGreaterThan10U = Boolean.FALSE;
        } else {
            this.isGreaterThan10U = bool;
        }
        if ((i & 512) == 0) {
            this.certifiedEmail = "";
        } else {
            this.certifiedEmail = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AccountMergeActionParams accountMergeActionParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountMergeActionParams.realName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, accountMergeActionParams.realName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountMergeActionParams.accountName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, accountMergeActionParams.accountName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountMergeActionParams.idCard, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, accountMergeActionParams.idCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountMergeActionParams.certifiedType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, accountMergeActionParams.certifiedType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountMergeActionParams.certifiedInfo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, accountMergeActionParams.certifiedInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountMergeActionParams.currentType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, accountMergeActionParams.currentType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) accountMergeActionParams.currentInfo, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, accountMergeActionParams.currentInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountMergeActionParams.certifiedPhone, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, accountMergeActionParams.certifiedPhone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(accountMergeActionParams.isGreaterThan10U, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, accountMergeActionParams.isGreaterThan10U);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) accountMergeActionParams.certifiedEmail, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, accountMergeActionParams.certifiedEmail);
    }

    public AccountMergeActionParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9) {
        this.realName = str;
        this.accountName = str2;
        this.idCard = str3;
        this.certifiedType = str4;
        this.certifiedInfo = str5;
        this.currentType = str6;
        this.currentInfo = str7;
        this.certifiedPhone = str8;
        this.isGreaterThan10U = bool;
        this.certifiedEmail = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0062: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:5082) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AccountMergeActionParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AccountMergeActionParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) == 0 ? str9 : "");
    }
}
