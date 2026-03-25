package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleTeeStatusAndWarringInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleTeeStatusAndWarringInfo> CREATOR = new Creator();
    private boolean canUseSa2;
    private long createAt;
    private boolean hasShowExpiredAlert;
    private SingleTeeStatus singleTeeStatus;
    private long updateAt;

    public static final class Creator implements Parcelable.Creator<SingleTeeStatusAndWarringInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleTeeStatusAndWarringInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SingleTeeStatusAndWarringInfo(SingleTeeStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleTeeStatusAndWarringInfo[] newArray(int i) {
            return new SingleTeeStatusAndWarringInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SingleTeeStatusAndWarringInfo copy$default(SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo, SingleTeeStatus singleTeeStatus, boolean z, long j, long j2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            singleTeeStatus = singleTeeStatusAndWarringInfo.singleTeeStatus;
        }
        if ((i & 2) != 0) {
            z = singleTeeStatusAndWarringInfo.hasShowExpiredAlert;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            j = singleTeeStatusAndWarringInfo.createAt;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = singleTeeStatusAndWarringInfo.updateAt;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z2 = singleTeeStatusAndWarringInfo.canUseSa2;
        }
        return singleTeeStatusAndWarringInfo.copy(singleTeeStatus, z3, j3, j4, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleTeeStatus component1() {
        return this.singleTeeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hasShowExpiredAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.updateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleTeeStatusAndWarringInfo copy(@NotNull SingleTeeStatus singleTeeStatus, boolean z, long j, long j2, boolean z2) {
        Intrinsics.checkNotNullParameter(singleTeeStatus, "");
        return new SingleTeeStatusAndWarringInfo(singleTeeStatus, z, j, j2, z2);
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
        if (!(obj instanceof SingleTeeStatusAndWarringInfo)) {
            return false;
        }
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo = (SingleTeeStatusAndWarringInfo) obj;
        return Intrinsics.EZpvd(this.singleTeeStatus, singleTeeStatusAndWarringInfo.singleTeeStatus) && this.hasShowExpiredAlert == singleTeeStatusAndWarringInfo.hasShowExpiredAlert && this.createAt == singleTeeStatusAndWarringInfo.createAt && this.updateAt == singleTeeStatusAndWarringInfo.updateAt && this.canUseSa2 == singleTeeStatusAndWarringInfo.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanUseSa2() {
        return this.canUseSa2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasShowExpiredAlert() {
        return this.hasShowExpiredAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleTeeStatus getSingleTeeStatus() {
        return this.singleTeeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateAt() {
        return this.updateAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.singleTeeStatus.hashCode() * 31) + Boolean.hashCode(this.hasShowExpiredAlert)) * 31) + Long.hashCode(this.createAt)) * 31) + Long.hashCode(this.updateAt)) * 31) + Boolean.hashCode(this.canUseSa2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanUseSa2(boolean z) {
        this.canUseSa2 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasShowExpiredAlert(boolean z) {
        this.hasShowExpiredAlert = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleTeeStatus(@NotNull SingleTeeStatus singleTeeStatus) {
        Intrinsics.checkNotNullParameter(singleTeeStatus, "");
        this.singleTeeStatus = singleTeeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateAt(long j) {
        this.updateAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleTeeStatusAndWarringInfo(singleTeeStatus=" + this.singleTeeStatus + ", hasShowExpiredAlert=" + this.hasShowExpiredAlert + ", createAt=" + this.createAt + ", updateAt=" + this.updateAt + ", canUseSa2=" + this.canUseSa2 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.singleTeeStatus.writeToParcel(parcel, i);
        parcel.writeInt(this.hasShowExpiredAlert ? 1 : 0);
        parcel.writeLong(this.createAt);
        parcel.writeLong(this.updateAt);
        parcel.writeInt(this.canUseSa2 ? 1 : 0);
    }

    public SingleTeeStatusAndWarringInfo(@NotNull SingleTeeStatus singleTeeStatus, boolean z, long j, long j2, boolean z2) {
        Intrinsics.checkNotNullParameter(singleTeeStatus, "");
        this.singleTeeStatus = singleTeeStatus;
        this.hasShowExpiredAlert = z;
        this.createAt = j;
        this.updateAt = j2;
        this.canUseSa2 = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r8v0 com.okinc.business.defi.biz.net.bean.SingleTeeStatus)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r15v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r12v0 long) : (0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r15v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 boolean) : false)
 A[MD:(com.okinc.business.defi.biz.net.bean.SingleTeeStatus, boolean, long, long, boolean):void (m)] (LINE:107) call: com.okinc.business.defi.biz.net.bean.SingleTeeStatusAndWarringInfo.<init>(com.okinc.business.defi.biz.net.bean.SingleTeeStatus, boolean, long, long, boolean):void type: THIS */
    public /* synthetic */ SingleTeeStatusAndWarringInfo(SingleTeeStatus singleTeeStatus, boolean z, long j, long j2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(singleTeeStatus, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0L : j, (i & 8) == 0 ? j2 : 0L, (i & 16) == 0 ? z2 : false);
    }
}
