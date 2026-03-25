package com.okinc.account.api.model.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class BindInfoUser implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BindInfoUser> CREATOR = new Creator();
    private String authId;
    private int behavior;
    private String telegramMsg;
    private String thirdName;
    private String thirdToken;
    private int thirdType;
    private int verifyType;

    public static final class Creator implements Parcelable.Creator<BindInfoUser> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindInfoUser createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BindInfoUser(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindInfoUser[] newArray(int i) {
            return new BindInfoUser[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BindInfoUser() {
        this(0, 0, 0, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BindInfoUser copy$default(BindInfoUser bindInfoUser, int i, int i2, int i3, String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bindInfoUser.verifyType;
        }
        if ((i4 & 2) != 0) {
            i2 = bindInfoUser.thirdType;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = bindInfoUser.behavior;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = bindInfoUser.thirdToken;
        }
        String str5 = str;
        if ((i4 & 16) != 0) {
            str2 = bindInfoUser.authId;
        }
        String str6 = str2;
        if ((i4 & 32) != 0) {
            str3 = bindInfoUser.telegramMsg;
        }
        String str7 = str3;
        if ((i4 & 64) != 0) {
            str4 = bindInfoUser.thirdName;
        }
        return bindInfoUser.copy(i, i5, i6, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.thirdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.thirdToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.authId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.telegramMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.thirdName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindInfoUser copy(int i, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BindInfoUser(i, i2, i3, str, str2, str3, str4);
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
        if (!(obj instanceof BindInfoUser)) {
            return false;
        }
        BindInfoUser bindInfoUser = (BindInfoUser) obj;
        return this.verifyType == bindInfoUser.verifyType && this.thirdType == bindInfoUser.thirdType && this.behavior == bindInfoUser.behavior && Intrinsics.EZpvd((Object) this.thirdToken, (Object) bindInfoUser.thirdToken) && Intrinsics.EZpvd((Object) this.authId, (Object) bindInfoUser.authId) && Intrinsics.EZpvd((Object) this.telegramMsg, (Object) bindInfoUser.telegramMsg) && Intrinsics.EZpvd((Object) this.thirdName, (Object) bindInfoUser.thirdName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthId() {
        return this.authId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBehavior() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTelegramMsg() {
        return this.telegramMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThirdName() {
        return this.thirdName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThirdToken() {
        return this.thirdToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getThirdType() {
        return this.thirdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVerifyType() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.verifyType) * 31) + Integer.hashCode(this.thirdType)) * 31) + Integer.hashCode(this.behavior)) * 31) + this.thirdToken.hashCode()) * 31) + this.authId.hashCode()) * 31) + this.telegramMsg.hashCode()) * 31) + this.thirdName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBehavior(int i) {
        this.behavior = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTelegramMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.telegramMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThirdName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.thirdName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThirdToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.thirdToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThirdType(int i) {
        this.thirdType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerifyType(int i) {
        this.verifyType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BindInfoUser(verifyType=" + this.verifyType + ", thirdType=" + this.thirdType + ", behavior=" + this.behavior + ", thirdToken=" + this.thirdToken + ", authId=" + this.authId + ", telegramMsg=" + this.telegramMsg + ", thirdName=" + this.thirdName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.verifyType);
        parcel.writeInt(this.thirdType);
        parcel.writeInt(this.behavior);
        parcel.writeString(this.thirdToken);
        parcel.writeString(this.authId);
        parcel.writeString(this.telegramMsg);
        parcel.writeString(this.thirdName);
    }

    public BindInfoUser(int i, int i2, int i3, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.verifyType = i;
        this.thirdType = i2;
        this.behavior = i3;
        this.thirdToken = str;
        this.authId = str2;
        this.telegramMsg = str3;
        this.thirdName = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 int) : (-1 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.account.api.model.login.BindInfoUser.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BindInfoUser(int i, int i2, int i3, String str, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) == 0 ? i3 : -1, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4);
    }
}
