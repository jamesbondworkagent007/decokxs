package com.okinc.account.api.model.uploadpersonalinfo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UploadPersonalInfoRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UploadPersonalInfoRequest> CREATOR = new Creator();
    private final String areaCode;
    private final String email;
    private final AccountMfaScenario mfaScenario;
    private final String phone;
    private final String reminderContent;
    private final String sessionId;
    private final UploadPersonalInfoSource source;
    private final String workFlowToken;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<UploadPersonalInfoRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadPersonalInfoRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UploadPersonalInfoRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UploadPersonalInfoSource.valueOf(parcel.readString()), AccountMfaScenario.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadPersonalInfoRequest[] newArray(int i) {
            return new UploadPersonalInfoRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadPersonalInfoSource component6() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMfaScenario component7() {
        return this.mfaScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.workFlowToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadPersonalInfoRequest copy(String str, String str2, String str3, @NotNull String str4, String str5, UploadPersonalInfoSource uploadPersonalInfoSource, @NotNull AccountMfaScenario accountMfaScenario, String str6) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(accountMfaScenario, "");
        return new UploadPersonalInfoRequest(str, str2, str3, str4, str5, uploadPersonalInfoSource, accountMfaScenario, str6);
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
        if (!(obj instanceof UploadPersonalInfoRequest)) {
            return false;
        }
        UploadPersonalInfoRequest uploadPersonalInfoRequest = (UploadPersonalInfoRequest) obj;
        return Intrinsics.EZpvd((Object) this.email, (Object) uploadPersonalInfoRequest.email) && Intrinsics.EZpvd((Object) this.areaCode, (Object) uploadPersonalInfoRequest.areaCode) && Intrinsics.EZpvd((Object) this.phone, (Object) uploadPersonalInfoRequest.phone) && Intrinsics.EZpvd((Object) this.sessionId, (Object) uploadPersonalInfoRequest.sessionId) && Intrinsics.EZpvd((Object) this.reminderContent, (Object) uploadPersonalInfoRequest.reminderContent) && this.source == uploadPersonalInfoRequest.source && this.mfaScenario == uploadPersonalInfoRequest.mfaScenario && Intrinsics.EZpvd((Object) this.workFlowToken, (Object) uploadPersonalInfoRequest.workFlowToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountMfaScenario getMfaScenario() {
        return this.mfaScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReminderContent() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadPersonalInfoSource getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWorkFlowToken() {
        return this.workFlowToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.email;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.areaCode;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.phone;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.sessionId.hashCode();
        String str4 = this.reminderContent;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        UploadPersonalInfoSource uploadPersonalInfoSource = this.source;
        int iHashCode6 = uploadPersonalInfoSource == null ? 0 : uploadPersonalInfoSource.hashCode();
        int iHashCode7 = this.mfaScenario.hashCode();
        String str5 = this.workFlowToken;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UploadPersonalInfoRequest(email=" + this.email + ", areaCode=" + this.areaCode + ", phone=" + this.phone + ", sessionId=" + this.sessionId + ", reminderContent=" + this.reminderContent + ", source=" + this.source + ", mfaScenario=" + this.mfaScenario + ", workFlowToken=" + this.workFlowToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.email);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.phone);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.reminderContent);
        UploadPersonalInfoSource uploadPersonalInfoSource = this.source;
        if (uploadPersonalInfoSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uploadPersonalInfoSource.name());
        }
        this.mfaScenario.writeToParcel(parcel, i);
        parcel.writeString(this.workFlowToken);
    }

    public UploadPersonalInfoRequest(String str, String str2, String str3, @NotNull String str4, String str5, UploadPersonalInfoSource uploadPersonalInfoSource, @NotNull AccountMfaScenario accountMfaScenario, String str6) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(accountMfaScenario, "");
        this.email = str;
        this.areaCode = str2;
        this.phone = str3;
        this.sessionId = str4;
        this.reminderContent = str5;
        this.source = uploadPersonalInfoSource;
        this.mfaScenario = accountMfaScenario;
        this.workFlowToken = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource:?: TERNARY null = ((wrap:int:0x0020: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource) : (r18v0 com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource))
  (wrap:com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario:?: TERNARY null = ((wrap:int:0x0028: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002e: SGET  A[WRAPPED] (LINE:16) com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario.IsPostLogin com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario) : (r19v0 com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource, com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario, java.lang.String):void (m)] (LINE:9) call: com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoSource, com.okinc.account.api.model.uploadpersonalinfo.AccountMfaScenario, java.lang.String):void type: THIS */
    public /* synthetic */ UploadPersonalInfoRequest(String str, String str2, String str3, String str4, String str5, UploadPersonalInfoSource uploadPersonalInfoSource, AccountMfaScenario accountMfaScenario, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : uploadPersonalInfoSource, (i & 64) != 0 ? AccountMfaScenario.IsPostLogin : accountMfaScenario, (i & 128) != 0 ? null : str6);
    }
}
