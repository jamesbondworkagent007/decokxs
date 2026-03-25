package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UpdateStatus implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UpdateStatus> CREATOR = new Creator();
    private final Boolean autoRenew;
    private final Long expiredTimestamp;
    private final Boolean isActive;
    private final Boolean isCreated;
    private final Boolean isDisabledByUser;
    private final Boolean isVerify;
    private final Integer upgradeStatus;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<UpdateStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateStatus createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Intrinsics.checkNotNullParameter(parcel, "");
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
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UpdateStatus(boolValueOf, boolValueOf2, lValueOf, boolValueOf3, boolValueOf4, boolValueOf5, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateStatus[] newArray(int i) {
            return new UpdateStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpdateStatus() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateStatus copy$default(UpdateStatus updateStatus, Boolean bool, Boolean bool2, Long l, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = updateStatus.isCreated;
        }
        if ((i & 2) != 0) {
            bool2 = updateStatus.isActive;
        }
        Boolean bool6 = bool2;
        if ((i & 4) != 0) {
            l = updateStatus.expiredTimestamp;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            bool3 = updateStatus.isDisabledByUser;
        }
        Boolean bool7 = bool3;
        if ((i & 16) != 0) {
            bool4 = updateStatus.isVerify;
        }
        Boolean bool8 = bool4;
        if ((i & 32) != 0) {
            bool5 = updateStatus.autoRenew;
        }
        Boolean bool9 = bool5;
        if ((i & 64) != 0) {
            num = updateStatus.upgradeStatus;
        }
        return updateStatus.copy(bool, bool6, l2, bool7, bool8, bool9, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isDisabledByUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateStatus copy(Boolean bool, Boolean bool2, Long l, Boolean bool3, Boolean bool4, Boolean bool5, Integer num) {
        return new UpdateStatus(bool, bool2, l, bool3, bool4, bool5, num);
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
        if (!(obj instanceof UpdateStatus)) {
            return false;
        }
        UpdateStatus updateStatus = (UpdateStatus) obj;
        return Intrinsics.EZpvd(this.isCreated, updateStatus.isCreated) && Intrinsics.EZpvd(this.isActive, updateStatus.isActive) && Intrinsics.EZpvd(this.expiredTimestamp, updateStatus.expiredTimestamp) && Intrinsics.EZpvd(this.isDisabledByUser, updateStatus.isDisabledByUser) && Intrinsics.EZpvd(this.isVerify, updateStatus.isVerify) && Intrinsics.EZpvd(this.autoRenew, updateStatus.autoRenew) && Intrinsics.EZpvd(this.upgradeStatus, updateStatus.upgradeStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiredTimestamp() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isCreated;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isActive;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Long l = this.expiredTimestamp;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Boolean bool3 = this.isDisabledByUser;
        int iHashCode4 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.isVerify;
        int iHashCode5 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.autoRenew;
        int iHashCode6 = bool5 == null ? 0 : bool5.hashCode();
        Integer num = this.upgradeStatus;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCreated() {
        return this.isCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDisabledByUser() {
        return this.isDisabledByUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isVerify() {
        return this.isVerify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateStatus(isCreated=" + this.isCreated + ", isActive=" + this.isActive + ", expiredTimestamp=" + this.expiredTimestamp + ", isDisabledByUser=" + this.isDisabledByUser + ", isVerify=" + this.isVerify + ", autoRenew=" + this.autoRenew + ", upgradeStatus=" + this.upgradeStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.isCreated;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isActive;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l = this.expiredTimestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool3 = this.isDisabledByUser;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.isVerify;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.autoRenew;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Integer num = this.upgradeStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public UpdateStatus(Boolean bool, Boolean bool2, Long l, Boolean bool3, Boolean bool4, Boolean bool5, Integer num) {
        this.isCreated = bool;
        this.isActive = bool2;
        this.expiredTimestamp = l;
        this.isDisabledByUser = bool3;
        this.isVerify = bool4;
        this.autoRenew = bool5;
        this.upgradeStatus = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r12v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
 A[MD:(java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:117) call: com.okinc.business.defi.biz.net.bean.UpdateStatus.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ UpdateStatus(Boolean bool, Boolean bool2, Long l, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : num);
    }
}
