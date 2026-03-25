package com.tencent.matrix.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.C58012ytJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class JavaMemInfo implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    public final long AEQbTJ;
    public final long AYXKKw;
    public final long EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaMemInfo() {
        this(0L, 0L, 0L, 0L, 0, 0, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JavaMemInfo AEQbTJ(long j, long j2, long j3, long j4, int i, int i2) {
        return new JavaMemInfo(j, j2, j3, j4, i, i2);
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
        if (!(obj instanceof JavaMemInfo)) {
            return false;
        }
        JavaMemInfo javaMemInfo = (JavaMemInfo) obj;
        return this.AEQbTJ == javaMemInfo.AEQbTJ && this.EZpvd == javaMemInfo.EZpvd && this.AYXKKw == javaMemInfo.AYXKKw && this.copydefault == javaMemInfo.copydefault && this.KWHzl == javaMemInfo.KWHzl && this.OLrzqt == javaMemInfo.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.AEQbTJ) * 31) + Long.hashCode(this.EZpvd)) * 31) + Long.hashCode(this.AYXKKw)) * 31) + Long.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.OLrzqt);
    }

    public JavaMemInfo(long j, long j2, long j3, long j4, int i, int i2) {
        this.AEQbTJ = j;
        this.EZpvd = j2;
        this.AYXKKw = j3;
        this.copydefault = j4;
        this.KWHzl = i;
        this.OLrzqt = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JavaMemInfo(long j, long j2, long j3, long j4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        long j5 = (i3 & 1) != 0 ? Runtime.getRuntime().totalMemory() : j;
        long jFreeMemory = (i3 & 2) != 0 ? Runtime.getRuntime().freeMemory() : j2;
        this(j5, jFreeMemory, (i3 & 4) != 0 ? j5 - jFreeMemory : j3, (i3 & 8) != 0 ? Runtime.getRuntime().maxMemory() : j4, (i3 & 16) != 0 ? C58012ytJ.KWHzl.copydefault() : i, (i3 & 32) != 0 ? C58012ytJ.KWHzl.OLrzqt() : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JavaMemInfo(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "");
    }

    public String toString() {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%-21s %-21s %-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{"Used=" + this.AYXKKw + " B", "Recycled=" + this.EZpvd + " B", "HeapSize=" + this.AEQbTJ + " B", "Max=" + this.copydefault + " B", "MemClass:" + this.KWHzl + " M", "LargeMemClass=" + this.OLrzqt + " M"}, 6));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.AEQbTJ);
        parcel.writeLong(this.EZpvd);
        parcel.writeLong(this.AYXKKw);
        parcel.writeLong(this.copydefault);
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.OLrzqt);
    }

    public static final class CREATOR implements Parcelable.Creator<JavaMemInfo> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.util.JavaMemInfo.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JavaMemInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JavaMemInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public JavaMemInfo[] newArray(int i) {
            return new JavaMemInfo[i];
        }
    }
}
