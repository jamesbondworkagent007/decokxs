package com.okinc.assets.backend.api.model.whitelist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WhitelistOperateRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<WhitelistOperateRequest> CREATOR = new Creator();
    private final String emailCode;
    private final Integer newAddressWithdrawalLock;
    private final Integer operateType;
    private final String phoneCode;
    private final String totpCode;

    public static final class Creator implements Parcelable.Creator<WhitelistOperateRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhitelistOperateRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WhitelistOperateRequest(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhitelistOperateRequest[] newArray(int i) {
            return new WhitelistOperateRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WhitelistOperateRequest() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WhitelistOperateRequest copy$default(WhitelistOperateRequest whitelistOperateRequest, Integer num, String str, String str2, String str3, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = whitelistOperateRequest.operateType;
        }
        if ((i & 2) != 0) {
            str = whitelistOperateRequest.phoneCode;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = whitelistOperateRequest.totpCode;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = whitelistOperateRequest.emailCode;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            num2 = whitelistOperateRequest.newAddressWithdrawalLock;
        }
        return whitelistOperateRequest.copy(num, str4, str5, str6, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.operateType;
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
    public final Integer component5() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WhitelistOperateRequest copy(Integer num, String str, String str2, String str3, Integer num2) {
        return new WhitelistOperateRequest(num, str, str2, str3, num2);
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
        if (!(obj instanceof WhitelistOperateRequest)) {
            return false;
        }
        WhitelistOperateRequest whitelistOperateRequest = (WhitelistOperateRequest) obj;
        return Intrinsics.EZpvd(this.operateType, whitelistOperateRequest.operateType) && Intrinsics.EZpvd((Object) this.phoneCode, (Object) whitelistOperateRequest.phoneCode) && Intrinsics.EZpvd((Object) this.totpCode, (Object) whitelistOperateRequest.totpCode) && Intrinsics.EZpvd((Object) this.emailCode, (Object) whitelistOperateRequest.emailCode) && Intrinsics.EZpvd(this.newAddressWithdrawalLock, whitelistOperateRequest.newAddressWithdrawalLock);
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
    public final Integer getOperateType() {
        return this.operateType;
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
        Integer num = this.operateType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.phoneCode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.totpCode;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.emailCode;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.newAddressWithdrawalLock;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WhitelistOperateRequest(operateType=" + this.operateType + ", phoneCode=" + this.phoneCode + ", totpCode=" + this.totpCode + ", emailCode=" + this.emailCode + ", newAddressWithdrawalLock=" + this.newAddressWithdrawalLock + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.operateType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.phoneCode);
        parcel.writeString(this.totpCode);
        parcel.writeString(this.emailCode);
        Integer num2 = this.newAddressWithdrawalLock;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public WhitelistOperateRequest(Integer num, String str, String str2, String str3, Integer num2) {
        this.operateType = num;
        this.phoneCode = str;
        this.totpCode = str2;
        this.emailCode = str3;
        this.newAddressWithdrawalLock = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.whitelist.WhitelistOperateRequest.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ WhitelistOperateRequest(Integer num, String str, String str2, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2);
    }
}
