package com.okinc.account.api.model.mpcwallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class MpcWalletRouteInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MpcWalletRouteInfo> CREATOR = new Creator();
    private final String areaCode;
    private final String email;
    private final LoginType loginType;
    private final String phone;

    public static final class Creator implements Parcelable.Creator<MpcWalletRouteInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcWalletRouteInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MpcWalletRouteInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LoginType.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcWalletRouteInfo[] newArray(int i) {
            return new MpcWalletRouteInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MpcWalletRouteInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MpcWalletRouteInfo copy$default(MpcWalletRouteInfo mpcWalletRouteInfo, String str, String str2, String str3, LoginType loginType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mpcWalletRouteInfo.areaCode;
        }
        if ((i & 2) != 0) {
            str2 = mpcWalletRouteInfo.phone;
        }
        if ((i & 4) != 0) {
            str3 = mpcWalletRouteInfo.email;
        }
        if ((i & 8) != 0) {
            loginType = mpcWalletRouteInfo.loginType;
        }
        return mpcWalletRouteInfo.copy(str, str2, str3, loginType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoginType component4() {
        return this.loginType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcWalletRouteInfo copy(String str, String str2, String str3, LoginType loginType) {
        return new MpcWalletRouteInfo(str, str2, str3, loginType);
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
        if (!(obj instanceof MpcWalletRouteInfo)) {
            return false;
        }
        MpcWalletRouteInfo mpcWalletRouteInfo = (MpcWalletRouteInfo) obj;
        return Intrinsics.EZpvd((Object) this.areaCode, (Object) mpcWalletRouteInfo.areaCode) && Intrinsics.EZpvd((Object) this.phone, (Object) mpcWalletRouteInfo.phone) && Intrinsics.EZpvd((Object) this.email, (Object) mpcWalletRouteInfo.email) && this.loginType == mpcWalletRouteInfo.loginType;
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
    public final LoginType getLoginType() {
        return this.loginType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.areaCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.phone;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.email;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        LoginType loginType = this.loginType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (loginType != null ? loginType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcWalletRouteInfo(areaCode=" + this.areaCode + ", phone=" + this.phone + ", email=" + this.email + ", loginType=" + this.loginType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.areaCode);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        LoginType loginType = this.loginType;
        if (loginType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loginType.writeToParcel(parcel, i);
        }
    }

    public MpcWalletRouteInfo(String str, String str2, String str3, LoginType loginType) {
        this.areaCode = str;
        this.phone = str2;
        this.email = str3;
        this.loginType = loginType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.account.api.model.mpcwallet.LoginType:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.account.api.model.mpcwallet.LoginType) : (r5v0 com.okinc.account.api.model.mpcwallet.LoginType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.account.api.model.mpcwallet.LoginType):void (m)] (LINE:7) call: com.okinc.account.api.model.mpcwallet.MpcWalletRouteInfo.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.account.api.model.mpcwallet.LoginType):void type: THIS */
    public /* synthetic */ MpcWalletRouteInfo(String str, String str2, String str3, LoginType loginType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : loginType);
    }
}
