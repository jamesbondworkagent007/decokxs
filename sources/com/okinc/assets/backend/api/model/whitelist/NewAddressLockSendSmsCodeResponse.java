package com.okinc.assets.backend.api.model.whitelist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class NewAddressLockSendSmsCodeResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewAddressLockSendSmsCodeResponse> CREATOR = new Creator();
    private String phone;

    public static final class Creator implements Parcelable.Creator<NewAddressLockSendSmsCodeResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewAddressLockSendSmsCodeResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NewAddressLockSendSmsCodeResponse(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewAddressLockSendSmsCodeResponse[] newArray(int i) {
            return new NewAddressLockSendSmsCodeResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewAddressLockSendSmsCodeResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewAddressLockSendSmsCodeResponse copy$default(NewAddressLockSendSmsCodeResponse newAddressLockSendSmsCodeResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newAddressLockSendSmsCodeResponse.phone;
        }
        return newAddressLockSendSmsCodeResponse.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewAddressLockSendSmsCodeResponse copy(String str) {
        return new NewAddressLockSendSmsCodeResponse(str);
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
        return (obj instanceof NewAddressLockSendSmsCodeResponse) && Intrinsics.EZpvd((Object) this.phone, (Object) ((NewAddressLockSendSmsCodeResponse) obj).phone);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.phone;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhone(String str) {
        this.phone = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewAddressLockSendSmsCodeResponse(phone=" + this.phone + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.phone);
    }

    public NewAddressLockSendSmsCodeResponse(String str) {
        this.phone = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.whitelist.NewAddressLockSendSmsCodeResponse.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ NewAddressLockSendSmsCodeResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
