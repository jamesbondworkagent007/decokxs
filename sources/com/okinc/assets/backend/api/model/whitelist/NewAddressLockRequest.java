package com.okinc.assets.backend.api.model.whitelist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class NewAddressLockRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewAddressLockRequest> CREATOR = new Creator();
    private String emailCode;
    private Integer newAddressWithdrawalLock;
    private String phoneCode;
    private String totpCode;

    public static final class Creator implements Parcelable.Creator<NewAddressLockRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewAddressLockRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NewAddressLockRequest(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewAddressLockRequest[] newArray(int i) {
            return new NewAddressLockRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewAddressLockRequest() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewAddressLockRequest copy$default(NewAddressLockRequest newAddressLockRequest, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newAddressLockRequest.newAddressWithdrawalLock;
        }
        if ((i & 2) != 0) {
            str = newAddressLockRequest.phoneCode;
        }
        if ((i & 4) != 0) {
            str2 = newAddressLockRequest.totpCode;
        }
        if ((i & 8) != 0) {
            str3 = newAddressLockRequest.emailCode;
        }
        return newAddressLockRequest.copy(num, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewAddressLockRequest copy(Integer num, String str, String str2, String str3) {
        return new NewAddressLockRequest(num, str, str2, str3);
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
        if (!(obj instanceof NewAddressLockRequest)) {
            return false;
        }
        NewAddressLockRequest newAddressLockRequest = (NewAddressLockRequest) obj;
        return Intrinsics.EZpvd(this.newAddressWithdrawalLock, newAddressLockRequest.newAddressWithdrawalLock) && Intrinsics.EZpvd((Object) this.phoneCode, (Object) newAddressLockRequest.phoneCode) && Intrinsics.EZpvd((Object) this.totpCode, (Object) newAddressLockRequest.totpCode) && Intrinsics.EZpvd((Object) this.emailCode, (Object) newAddressLockRequest.emailCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmailCode() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNewAddressWithdrawalLock() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneCode() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotpCode() {
        return this.totpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.newAddressWithdrawalLock;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.phoneCode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.totpCode;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.emailCode;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmailCode(String str) {
        this.emailCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewAddressWithdrawalLock(Integer num) {
        this.newAddressWithdrawalLock = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneCode(String str) {
        this.phoneCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotpCode(String str) {
        this.totpCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewAddressLockRequest(newAddressWithdrawalLock=" + this.newAddressWithdrawalLock + ", phoneCode=" + this.phoneCode + ", totpCode=" + this.totpCode + ", emailCode=" + this.emailCode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.newAddressWithdrawalLock;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.phoneCode);
        parcel.writeString(this.totpCode);
        parcel.writeString(this.emailCode);
    }

    public NewAddressLockRequest(Integer num, String str, String str2, String str3) {
        this.newAddressWithdrawalLock = num;
        this.phoneCode = str;
        this.totpCode = str2;
        this.emailCode = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.whitelist.NewAddressLockRequest.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewAddressLockRequest(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
