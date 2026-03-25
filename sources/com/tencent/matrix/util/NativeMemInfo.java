package com.tencent.matrix.util;

import android.os.Debug;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class NativeMemInfo implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final long KWHzl;
    public final long OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NativeMemInfo() {
        this(0L, 0L, 0L, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NativeMemInfo copy$default(NativeMemInfo nativeMemInfo, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = nativeMemInfo.KWHzl;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = nativeMemInfo.copydefault;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = nativeMemInfo.OLrzqt;
        }
        return nativeMemInfo.copydefault(j4, j5, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NativeMemInfo copydefault(long j, long j2, long j3) {
        return new NativeMemInfo(j, j2, j3);
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
        if (!(obj instanceof NativeMemInfo)) {
            return false;
        }
        NativeMemInfo nativeMemInfo = (NativeMemInfo) obj;
        return this.KWHzl == nativeMemInfo.KWHzl && this.copydefault == nativeMemInfo.copydefault && this.OLrzqt == nativeMemInfo.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.KWHzl) * 31) + Long.hashCode(this.copydefault)) * 31) + Long.hashCode(this.OLrzqt);
    }

    public NativeMemInfo(long j, long j2, long j3) {
        this.KWHzl = j;
        this.copydefault = j2;
        this.OLrzqt = j3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: android.os.Debug.getNativeHeapSize():long A[MD:():long (c), WRAPPED] (LINE:439)) : (r8v0 long))
  (wrap:long:0x0011: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x000d: INVOKE  STATIC call: android.os.Debug.getNativeHeapFreeSize():long A[MD:():long (c), WRAPPED] (LINE:440)) : (r10v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0016: INVOKE  STATIC call: android.os.Debug.getNativeHeapAllocatedSize():long A[MD:():long (c), WRAPPED] (LINE:441)) : (r12v0 long))
 A[MD:(long, long, long):void (m)] (LINE:438) call: com.tencent.matrix.util.NativeMemInfo.<init>(long, long, long):void type: THIS */
    public /* synthetic */ NativeMemInfo(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Debug.getNativeHeapSize() : j, (i & 2) != 0 ? Debug.getNativeHeapFreeSize() : j2, (i & 4) != 0 ? Debug.getNativeHeapAllocatedSize() : j3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeMemInfo(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readLong(), parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "");
    }

    public String toString() {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%-21s %-21s %-21s", Arrays.copyOf(new Object[]{"Used=" + this.OLrzqt + " B", "Recycled=" + this.copydefault + " B", "HeapSize=" + this.KWHzl + " B"}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.KWHzl);
        parcel.writeLong(this.copydefault);
        parcel.writeLong(this.OLrzqt);
    }

    public static final class CREATOR implements Parcelable.Creator<NativeMemInfo> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.util.NativeMemInfo.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NativeMemInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NativeMemInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NativeMemInfo[] newArray(int i) {
            return new NativeMemInfo[i];
        }
    }
}
