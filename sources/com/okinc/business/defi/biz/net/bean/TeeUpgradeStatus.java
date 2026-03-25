package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TeeUpgradeStatus implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TeeUpgradeStatus> CREATOR = new Creator();
    private final int upgradeStatus;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<TeeUpgradeStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeUpgradeStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TeeUpgradeStatus(parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeUpgradeStatus[] newArray(int i) {
            return new TeeUpgradeStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeUpgradeStatus() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeUpgradeStatus copy$default(TeeUpgradeStatus teeUpgradeStatus, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = teeUpgradeStatus.upgradeStatus;
        }
        return teeUpgradeStatus.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeUpgradeStatus copy(int i) {
        return new TeeUpgradeStatus(i);
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
        return (obj instanceof TeeUpgradeStatus) && this.upgradeStatus == ((TeeUpgradeStatus) obj).upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.upgradeStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeUpgradeStatus(upgradeStatus=" + this.upgradeStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.upgradeStatus);
    }

    public TeeUpgradeStatus(int i) {
        this.upgradeStatus = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:9) call: com.okinc.business.defi.biz.net.bean.TeeUpgradeStatus.<init>(int):void type: THIS */
    public /* synthetic */ TeeUpgradeStatus(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
