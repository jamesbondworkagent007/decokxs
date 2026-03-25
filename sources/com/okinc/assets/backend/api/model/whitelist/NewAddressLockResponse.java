package com.okinc.assets.backend.api.model.whitelist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class NewAddressLockResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewAddressLockResponse> CREATOR = new Creator();
    private Integer newAddressWithdrawalLock;

    public static final class Creator implements Parcelable.Creator<NewAddressLockResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewAddressLockResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NewAddressLockResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewAddressLockResponse[] newArray(int i) {
            return new NewAddressLockResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewAddressLockResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewAddressLockResponse copy$default(NewAddressLockResponse newAddressLockResponse, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = newAddressLockResponse.newAddressWithdrawalLock;
        }
        return newAddressLockResponse.copy(num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewAddressLockResponse copy(Integer num) {
        return new NewAddressLockResponse(num);
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
        return (obj instanceof NewAddressLockResponse) && Intrinsics.EZpvd(this.newAddressWithdrawalLock, ((NewAddressLockResponse) obj).newAddressWithdrawalLock);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNewAddressWithdrawalLock() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.newAddressWithdrawalLock;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewAddressWithdrawalLock(Integer num) {
        this.newAddressWithdrawalLock = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewAddressLockResponse(newAddressWithdrawalLock=" + this.newAddressWithdrawalLock + ")";
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
    }

    public NewAddressLockResponse(Integer num) {
        this.newAddressWithdrawalLock = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r1v0 java.lang.Integer))
 A[MD:(java.lang.Integer):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.whitelist.NewAddressLockResponse.<init>(java.lang.Integer):void type: THIS */
    public /* synthetic */ NewAddressLockResponse(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
