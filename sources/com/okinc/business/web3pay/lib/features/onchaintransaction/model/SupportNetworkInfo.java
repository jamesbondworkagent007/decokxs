package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SupportNetworkInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SupportNetworkInfo> CREATOR = new Creator();
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final long maintenanceBeginTime;
    private final long maintenanceEndTime;
    private final boolean underMaintenance;

    public static final class Creator implements Parcelable.Creator<SupportNetworkInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportNetworkInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportNetworkInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportNetworkInfo[] newArray(int i) {
            return new SupportNetworkInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.underMaintenance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.maintenanceBeginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.maintenanceEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportNetworkInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SupportNetworkInfo(str, str2, str3, z, j, j2);
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
        if (!(obj instanceof SupportNetworkInfo)) {
            return false;
        }
        SupportNetworkInfo supportNetworkInfo = (SupportNetworkInfo) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) supportNetworkInfo.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) supportNetworkInfo.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) supportNetworkInfo.chainLogo) && this.underMaintenance == supportNetworkInfo.underMaintenance && this.maintenanceBeginTime == supportNetworkInfo.maintenanceBeginTime && this.maintenanceEndTime == supportNetworkInfo.maintenanceEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMaintenanceBeginTime() {
        return this.maintenanceBeginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMaintenanceEndTime() {
        return this.maintenanceEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUnderMaintenance() {
        return this.underMaintenance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.chainIndex.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + Boolean.hashCode(this.underMaintenance)) * 31) + Long.hashCode(this.maintenanceBeginTime)) * 31) + Long.hashCode(this.maintenanceEndTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportNetworkInfo(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", underMaintenance=" + this.underMaintenance + ", maintenanceBeginTime=" + this.maintenanceBeginTime + ", maintenanceEndTime=" + this.maintenanceEndTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogo);
        parcel.writeInt(this.underMaintenance ? 1 : 0);
        parcel.writeLong(this.maintenanceBeginTime);
        parcel.writeLong(this.maintenanceEndTime);
    }

    public SupportNetworkInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.underMaintenance = z;
        this.maintenanceBeginTime = j;
        this.maintenanceEndTime = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, long, long):void (m)] (LINE:9) call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.SupportNetworkInfo.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, long, long):void type: THIS */
    public /* synthetic */ SupportNetworkInfo(String str, String str2, String str3, boolean z, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? 0L : j2);
    }
}
