package com.okinc.account.api.model.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginRoute implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LoginRoute> CREATOR = new Creator();
    private final String areaCode;
    private final boolean clearTop;
    private final Boolean defaultName;
    private final String email;
    private final String from;
    private final boolean isAddOtherAccount;
    private final Boolean isWelcome;
    private final String name;
    private final String nextPage;
    private final String phone;
    private final Integer requestCode;

    public static final class Creator implements Parcelable.Creator<LoginRoute> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginRoute createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LoginRoute(string, string2, string3, string4, string5, boolValueOf, boolValueOf2, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoginRoute[] newArray(int i) {
            return new LoginRoute[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LoginRoute() {
        this(null, null, null, null, null, null, null, null, null, false, false, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.clearTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isAddOtherAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.defaultName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isWelcome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.requestCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoginRoute copy(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, Integer num, boolean z, boolean z2) {
        return new LoginRoute(str, str2, str3, str4, str5, bool, bool2, str6, num, z, z2);
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
        if (!(obj instanceof LoginRoute)) {
            return false;
        }
        LoginRoute loginRoute = (LoginRoute) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) loginRoute.from) && Intrinsics.EZpvd((Object) this.name, (Object) loginRoute.name) && Intrinsics.EZpvd((Object) this.areaCode, (Object) loginRoute.areaCode) && Intrinsics.EZpvd((Object) this.phone, (Object) loginRoute.phone) && Intrinsics.EZpvd((Object) this.email, (Object) loginRoute.email) && Intrinsics.EZpvd(this.defaultName, loginRoute.defaultName) && Intrinsics.EZpvd(this.isWelcome, loginRoute.isWelcome) && Intrinsics.EZpvd((Object) this.nextPage, (Object) loginRoute.nextPage) && Intrinsics.EZpvd(this.requestCode, loginRoute.requestCode) && this.clearTop == loginRoute.clearTop && this.isAddOtherAccount == loginRoute.isAddOtherAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClearTop() {
        return this.clearTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDefaultName() {
        return this.defaultName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPage() {
        return this.nextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRequestCode() {
        return this.requestCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.from;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.areaCode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.phone;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.email;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.defaultName;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isWelcome;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str6 = this.nextPage;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Integer num = this.requestCode;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.clearTop)) * 31) + Boolean.hashCode(this.isAddOtherAccount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAddOtherAccount() {
        return this.isAddOtherAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isWelcome() {
        return this.isWelcome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LoginRoute(from=" + this.from + ", name=" + this.name + ", areaCode=" + this.areaCode + ", phone=" + this.phone + ", email=" + this.email + ", defaultName=" + this.defaultName + ", isWelcome=" + this.isWelcome + ", nextPage=" + this.nextPage + ", requestCode=" + this.requestCode + ", clearTop=" + this.clearTop + ", isAddOtherAccount=" + this.isAddOtherAccount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.from);
        parcel.writeString(this.name);
        parcel.writeString(this.areaCode);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        Boolean bool = this.defaultName;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isWelcome;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.nextPage);
        Integer num = this.requestCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.clearTop ? 1 : 0);
        parcel.writeInt(this.isAddOtherAccount ? 1 : 0);
    }

    public LoginRoute(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, Integer num, boolean z, boolean z2) {
        this.from = str;
        this.name = str2;
        this.areaCode = str3;
        this.phone = str4;
        this.email = str5;
        this.defaultName = bool;
        this.isWelcome = bool2;
        this.nextPage = str6;
        this.requestCode = num;
        this.clearTop = z;
        this.isAddOtherAccount = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, boolean, boolean):void (m)] (LINE:7) call: com.okinc.account.api.model.login.LoginRoute.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, boolean, boolean):void type: THIS */
    public /* synthetic */ LoginRoute(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, Integer num, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : str6, (i & 256) == 0 ? num : null, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false);
    }
}
