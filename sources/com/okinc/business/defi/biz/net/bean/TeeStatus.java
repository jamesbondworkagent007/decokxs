package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TeeStatus implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TeeStatus> CREATOR = new Creator();
    private final Boolean autoRenew;
    private final Integer disableReason;
    private final long expiredTimestamp;
    private final Integer extendExpirePeriodDay;
    private final boolean isActive;
    private final boolean isCreated;
    private int model;
    private final Integer upgradeStatus;
    private final boolean userDisable;

    public static final class Creator implements Parcelable.Creator<TeeStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeStatus createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            long j = parcel.readLong();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TeeStatus(z, z2, j, numValueOf, z3, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeStatus[] newArray(int i) {
            return new TeeStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.extendExpirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.userDisable;
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
    public final Integer component8() {
        return this.disableReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeStatus copy(boolean z, boolean z2, long j, Integer num, boolean z3, Boolean bool, Integer num2, Integer num3, int i) {
        return new TeeStatus(z, z2, j, num, z3, bool, num2, num3, i);
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
        if (!(obj instanceof TeeStatus)) {
            return false;
        }
        TeeStatus teeStatus = (TeeStatus) obj;
        return this.isCreated == teeStatus.isCreated && this.isActive == teeStatus.isActive && this.expiredTimestamp == teeStatus.expiredTimestamp && Intrinsics.EZpvd(this.extendExpirePeriodDay, teeStatus.extendExpirePeriodDay) && this.userDisable == teeStatus.userDisable && Intrinsics.EZpvd(this.autoRenew, teeStatus.autoRenew) && Intrinsics.EZpvd(this.upgradeStatus, teeStatus.upgradeStatus) && Intrinsics.EZpvd(this.disableReason, teeStatus.disableReason) && this.model == teeStatus.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisableReason() {
        return this.disableReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiredTimestamp() {
        return this.expiredTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getExtendExpirePeriodDay() {
        return this.extendExpirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getModel() {
        return this.model;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUserDisable() {
        return this.userDisable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isCreated);
        int iHashCode2 = Boolean.hashCode(this.isActive);
        int iHashCode3 = Long.hashCode(this.expiredTimestamp);
        Integer num = this.extendExpirePeriodDay;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = Boolean.hashCode(this.userDisable);
        Boolean bool = this.autoRenew;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Integer num2 = this.upgradeStatus;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.disableReason;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + Integer.hashCode(this.model);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCreated() {
        return this.isCreated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModel(int i) {
        this.model = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeStatus(isCreated=" + this.isCreated + ", isActive=" + this.isActive + ", expiredTimestamp=" + this.expiredTimestamp + ", extendExpirePeriodDay=" + this.extendExpirePeriodDay + ", userDisable=" + this.userDisable + ", autoRenew=" + this.autoRenew + ", upgradeStatus=" + this.upgradeStatus + ", disableReason=" + this.disableReason + ", model=" + this.model + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isCreated ? 1 : 0);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeLong(this.expiredTimestamp);
        Integer num = this.extendExpirePeriodDay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.userDisable ? 1 : 0);
        Boolean bool = this.autoRenew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.upgradeStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.disableReason;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.model);
    }

    public TeeStatus(boolean z, boolean z2, long j, Integer num, boolean z3, Boolean bool, Integer num2, Integer num3, int i) {
        this.isCreated = z;
        this.isActive = z2;
        this.expiredTimestamp = j;
        this.extendExpirePeriodDay = num;
        this.userDisable = z3;
        this.autoRenew = bool;
        this.upgradeStatus = num2;
        this.disableReason = num3;
        this.model = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (r15v0 boolean)
  (r16v0 boolean)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002a: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0032: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
 A[MD:(boolean, boolean, long, java.lang.Integer, boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, int):void (m)] (LINE:41) call: com.okinc.business.defi.biz.net.bean.TeeStatus.<init>(boolean, boolean, long, java.lang.Integer, boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, int):void type: THIS */
    public /* synthetic */ TeeStatus(boolean z, boolean z2, long j, Integer num, boolean z3, Boolean bool, Integer num2, Integer num3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : num, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? 0 : num3, (i2 & 256) != 0 ? 0 : i);
    }
}
