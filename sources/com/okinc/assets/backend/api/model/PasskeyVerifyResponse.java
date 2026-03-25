package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class PasskeyVerifyResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PasskeyVerifyResponse> CREATOR = new Creator();
    private final boolean exceedLimit2FA;
    private boolean need2FA;
    private String state;

    public static final class Creator implements Parcelable.Creator<PasskeyVerifyResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyVerifyResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyVerifyResponse(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyVerifyResponse[] newArray(int i) {
            return new PasskeyVerifyResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PasskeyVerifyResponse() {
        this(null, false, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyVerifyResponse copy$default(PasskeyVerifyResponse passkeyVerifyResponse, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyVerifyResponse.state;
        }
        if ((i & 2) != 0) {
            z = passkeyVerifyResponse.need2FA;
        }
        if ((i & 4) != 0) {
            z2 = passkeyVerifyResponse.exceedLimit2FA;
        }
        return passkeyVerifyResponse.copy(str, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.exceedLimit2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyVerifyResponse copy(String str, boolean z, boolean z2) {
        return new PasskeyVerifyResponse(str, z, z2);
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
        if (!(obj instanceof PasskeyVerifyResponse)) {
            return false;
        }
        PasskeyVerifyResponse passkeyVerifyResponse = (PasskeyVerifyResponse) obj;
        return Intrinsics.EZpvd((Object) this.state, (Object) passkeyVerifyResponse.state) && this.need2FA == passkeyVerifyResponse.need2FA && this.exceedLimit2FA == passkeyVerifyResponse.exceedLimit2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExceedLimit2FA() {
        return this.exceedLimit2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeed2FA() {
        return this.need2FA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.state;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.need2FA)) * 31) + Boolean.hashCode(this.exceedLimit2FA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeed2FA(boolean z) {
        this.need2FA = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setState(String str) {
        this.state = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyVerifyResponse(state=" + this.state + ", need2FA=" + this.need2FA + ", exceedLimit2FA=" + this.exceedLimit2FA + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.state);
        parcel.writeInt(this.need2FA ? 1 : 0);
        parcel.writeInt(this.exceedLimit2FA ? 1 : 0);
    }

    public PasskeyVerifyResponse(String str, boolean z, boolean z2) {
        this.state = str;
        this.need2FA = z;
        this.exceedLimit2FA = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, boolean, boolean):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.PasskeyVerifyResponse.<init>(java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ PasskeyVerifyResponse(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
