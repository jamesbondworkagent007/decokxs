package com.okinc.account.api.model.register;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RegisterRoute implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RegisterRoute> CREATOR = new Creator();
    private final boolean clearTop;
    private final String email;
    private final String from;

    public static final class Creator implements Parcelable.Creator<RegisterRoute> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterRoute createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RegisterRoute(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegisterRoute[] newArray(int i) {
            return new RegisterRoute[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegisterRoute() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegisterRoute copy$default(RegisterRoute registerRoute, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerRoute.from;
        }
        if ((i & 2) != 0) {
            str2 = registerRoute.email;
        }
        if ((i & 4) != 0) {
            z = registerRoute.clearTop;
        }
        return registerRoute.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.clearTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterRoute copy(String str, String str2, boolean z) {
        return new RegisterRoute(str, str2, z);
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
        if (!(obj instanceof RegisterRoute)) {
            return false;
        }
        RegisterRoute registerRoute = (RegisterRoute) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) registerRoute.from) && Intrinsics.EZpvd((Object) this.email, (Object) registerRoute.email) && this.clearTop == registerRoute.clearTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClearTop() {
        return this.clearTop;
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
    public int hashCode() {
        String str = this.from;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.email;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.clearTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegisterRoute(from=" + this.from + ", email=" + this.email + ", clearTop=" + this.clearTop + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.from);
        parcel.writeString(this.email);
        parcel.writeInt(this.clearTop ? 1 : 0);
    }

    public RegisterRoute(String str, String str2, boolean z) {
        this.from = str;
        this.email = str2;
        this.clearTop = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:7) call: com.okinc.account.api.model.register.RegisterRoute.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ RegisterRoute(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
