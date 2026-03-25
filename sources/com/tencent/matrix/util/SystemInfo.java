package com.tencent.matrix.util;

import android.app.ActivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.C58012ytJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SystemInfo implements Parcelable {
    public final long AEQbTJ;
    public final long EZpvd;
    public final long OLrzqt;
    public final boolean copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<SystemInfo> CREATOR = new Parcelable.Creator<SystemInfo>() { // from class: com.tencent.matrix.util.SystemInfo$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SystemInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SystemInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SystemInfo[] newArray(int i) {
            return new SystemInfo[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SystemInfo() {
        this(0L, 0L, false, 0L, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemInfo KWHzl(long j, long j2, boolean z, long j3) {
        return new SystemInfo(j, j2, z, j3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemInfo)) {
            return false;
        }
        SystemInfo systemInfo = (SystemInfo) obj;
        return this.OLrzqt == systemInfo.OLrzqt && this.EZpvd == systemInfo.EZpvd && this.copydefault == systemInfo.copydefault && this.AEQbTJ == systemInfo.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.OLrzqt);
        int iHashCode2 = Long.hashCode(this.EZpvd);
        boolean z = this.copydefault;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + r2) * 31) + Long.hashCode(this.AEQbTJ);
    }

    public SystemInfo(long j, long j2, boolean z, long j3) {
        this.OLrzqt = j;
        this.EZpvd = j2;
        this.copydefault = z;
        this.AEQbTJ = j3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r7v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r9v0 long))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r12v0 long))
 A[MD:(long, long, boolean, long):void (m)] (LINE:487) call: com.tencent.matrix.util.SystemInfo.<init>(long, long, boolean, long):void type: THIS */
    public /* synthetic */ SystemInfo(long j, long j2, boolean z, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? -1L : j2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? -1L : j3);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.util.SystemInfo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final SystemInfo EZpvd() {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            C58012ytJ.KWHzl.AEQbTJ().getMemoryInfo(memoryInfo);
            return new SystemInfo(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.lowMemory, memoryInfo.threshold);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SystemInfo(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readLong(), parcel.readByte() != 0, parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "");
    }

    public String toString() {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{"totalMem=" + this.OLrzqt + " B", "availMem=" + this.EZpvd + " B", "lowMemory=" + this.copydefault, "threshold=" + this.AEQbTJ + " B"}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.OLrzqt);
        parcel.writeLong(this.EZpvd);
        parcel.writeByte(this.copydefault ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.AEQbTJ);
    }
}
