package com.okinc.account.api.model.login;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class SecurityCodeResponse implements Parcelable {
    private String _tk;
    private String otpCode;
    private Integer pastDue;
    private String status;
    private String token;
    private String uid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SecurityCodeResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SecurityCodeResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityCodeResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SecurityCodeResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SecurityCodeResponse[] newArray(int i) {
            return new SecurityCodeResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecurityCodeResponse() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SecurityCodeResponse copy$default(SecurityCodeResponse securityCodeResponse, String str, String str2, String str3, Integer num, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = securityCodeResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = securityCodeResponse.otpCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = securityCodeResponse.token;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            num = securityCodeResponse.pastDue;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = securityCodeResponse._tk;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = securityCodeResponse.uid;
        }
        return securityCodeResponse.copy(str, str6, str7, num2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.otpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.pastDue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this._tk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityCodeResponse copy(String str, String str2, String str3, Integer num, String str4, String str5) {
        return new SecurityCodeResponse(str, str2, str3, num, str4, str5);
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
        if (!(obj instanceof SecurityCodeResponse)) {
            return false;
        }
        SecurityCodeResponse securityCodeResponse = (SecurityCodeResponse) obj;
        return Intrinsics.EZpvd((Object) this.status, (Object) securityCodeResponse.status) && Intrinsics.EZpvd((Object) this.otpCode, (Object) securityCodeResponse.otpCode) && Intrinsics.EZpvd((Object) this.token, (Object) securityCodeResponse.token) && Intrinsics.EZpvd(this.pastDue, securityCodeResponse.pastDue) && Intrinsics.EZpvd((Object) this._tk, (Object) securityCodeResponse._tk) && Intrinsics.EZpvd((Object) this.uid, (Object) securityCodeResponse.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOtpCode() {
        return this.otpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPastDue() {
        return this.pastDue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String get_tk() {
        return this._tk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.status;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.otpCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.token;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.pastDue;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this._tk;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.uid;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOtpCode(String str) {
        this.otpCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPastDue(Integer num) {
        this.pastDue = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(String str) {
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(String str) {
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUid(String str) {
        this.uid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set_tk(String str) {
        this._tk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SecurityCodeResponse(status=" + this.status + ", otpCode=" + this.otpCode + ", token=" + this.token + ", pastDue=" + this.pastDue + ", _tk=" + this._tk + ", uid=" + this.uid + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.status);
        parcel.writeString(this.otpCode);
        parcel.writeString(this.token);
        Integer num = this.pastDue;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this._tk);
        parcel.writeString(this.uid);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.SecurityCodeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SecurityCodeResponse> serializer() {
            return SecurityCodeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecurityCodeResponse(int i, String str, String str2, String str3, Integer num, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.otpCode = null;
        } else {
            this.otpCode = str2;
        }
        if ((i & 4) == 0) {
            this.token = null;
        } else {
            this.token = str3;
        }
        if ((i & 8) == 0) {
            this.pastDue = null;
        } else {
            this.pastDue = num;
        }
        if ((i & 16) == 0) {
            this._tk = null;
        } else {
            this._tk = str4;
        }
        if ((i & 32) == 0) {
            this.uid = null;
        } else {
            this.uid = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(SecurityCodeResponse securityCodeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || securityCodeResponse.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, securityCodeResponse.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || securityCodeResponse.otpCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, securityCodeResponse.otpCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || securityCodeResponse.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, securityCodeResponse.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || securityCodeResponse.pastDue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, securityCodeResponse.pastDue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || securityCodeResponse._tk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, securityCodeResponse._tk);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && securityCodeResponse.uid == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, securityCodeResponse.uid);
    }

    public SecurityCodeResponse(String str, String str2, String str3, Integer num, String str4, String str5) {
        this.status = str;
        this.otpCode = str2;
        this.token = str3;
        this.pastDue = num;
        this._tk = str4;
        this.uid = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:30) call: com.okinc.account.api.model.login.SecurityCodeResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SecurityCodeResponse(String str, String str2, String str3, Integer num, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public final NewDeviceSecurityCodeStatus getProcessStatus() {
        String str = this.status;
        return Intrinsics.EZpvd((Object) str, (Object) "AWAITING_AUTHORIZE") ? NewDeviceSecurityCodeStatus.AWAITING_AUTHORIZE : Intrinsics.EZpvd((Object) str, (Object) "AUTHORIZED") ? NewDeviceSecurityCodeStatus.AUTHORIZED : NewDeviceSecurityCodeStatus.UNAUTHORIZED;
    }
}
