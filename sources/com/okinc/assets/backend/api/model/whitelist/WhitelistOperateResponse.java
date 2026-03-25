package com.okinc.assets.backend.api.model.whitelist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WhitelistOperateResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WhitelistOperateResponse> CREATOR = new Creator();
    private Integer newAddressWithdrawalLock;
    private Integer whiteStatus;

    public static final class Creator implements Parcelable.Creator<WhitelistOperateResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhitelistOperateResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WhitelistOperateResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WhitelistOperateResponse[] newArray(int i) {
            return new WhitelistOperateResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WhitelistOperateResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WhitelistOperateResponse copy$default(WhitelistOperateResponse whitelistOperateResponse, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = whitelistOperateResponse.whiteStatus;
        }
        if ((i & 2) != 0) {
            num2 = whitelistOperateResponse.newAddressWithdrawalLock;
        }
        return whitelistOperateResponse.copy(num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.whiteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WhitelistOperateResponse copy(Integer num, Integer num2) {
        return new WhitelistOperateResponse(num, num2);
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
        if (!(obj instanceof WhitelistOperateResponse)) {
            return false;
        }
        WhitelistOperateResponse whitelistOperateResponse = (WhitelistOperateResponse) obj;
        return Intrinsics.EZpvd(this.whiteStatus, whitelistOperateResponse.whiteStatus) && Intrinsics.EZpvd(this.newAddressWithdrawalLock, whitelistOperateResponse.newAddressWithdrawalLock);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNewAddressWithdrawalLock() {
        return this.newAddressWithdrawalLock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWhiteStatus() {
        return this.whiteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.whiteStatus;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.newAddressWithdrawalLock;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewAddressWithdrawalLock(Integer num) {
        this.newAddressWithdrawalLock = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWhiteStatus(Integer num) {
        this.whiteStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WhitelistOperateResponse(whiteStatus=" + this.whiteStatus + ", newAddressWithdrawalLock=" + this.newAddressWithdrawalLock + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.whiteStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.newAddressWithdrawalLock;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public WhitelistOperateResponse(Integer num, Integer num2) {
        this.whiteStatus = num;
        this.newAddressWithdrawalLock = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.whitelist.WhitelistOperateResponse.<init>(java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ WhitelistOperateResponse(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
