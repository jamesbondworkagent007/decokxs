package com.tencent.matrix.util;

import android.os.Debug;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.core.app.FrameMetricsAggregator;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.C58012ytJ;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class PssInfo implements Parcelable {
    public int AEQbTJ;
    public int AYXKKw;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;
    public int gEmmrt;
    public int valueOf;
    public static final Activity Companion = new Activity(null);
    public static final Parcelable.Creator<PssInfo> CREATOR = new Parcelable.Creator<PssInfo>() { // from class: com.tencent.matrix.util.PssInfo$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PssInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PssInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PssInfo[] newArray(int i) {
            return new PssInfo[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PssInfo() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PssInfo AEQbTJ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return new PssInfo(i, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.AEQbTJ = i;
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
        if (!(obj instanceof PssInfo)) {
            return false;
        }
        PssInfo pssInfo = (PssInfo) obj;
        return this.valueOf == pssInfo.valueOf && this.OLrzqt == pssInfo.OLrzqt && this.EZpvd == pssInfo.EZpvd && this.KWHzl == pssInfo.KWHzl && this.AYXKKw == pssInfo.AYXKKw && this.gEmmrt == pssInfo.gEmmrt && this.AEQbTJ == pssInfo.AEQbTJ && this.djBIcL == pssInfo.djBIcL && this.copydefault == pssInfo.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.valueOf) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.AYXKKw)) * 31) + Integer.hashCode(this.gEmmrt)) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Integer.hashCode(this.djBIcL)) * 31) + Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(int i) {
        this.AYXKKw = i;
    }

    public PssInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.valueOf = i;
        this.OLrzqt = i2;
        this.EZpvd = i3;
        this.KWHzl = i4;
        this.AYXKKw = i5;
        this.gEmmrt = i6;
        this.AEQbTJ = i7;
        this.djBIcL = i8;
        this.copydefault = i9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r17v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 int) : (-1 int))
 A[MD:(int, int, int, int, int, int, int, int, int):void (m)] (LINE:109) call: com.tencent.matrix.util.PssInfo.<init>(int, int, int, int, int, int, int, int, int):void type: THIS */
    public /* synthetic */ PssInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? -1 : i, (i10 & 2) != 0 ? -1 : i2, (i10 & 4) != 0 ? -1 : i3, (i10 & 8) != 0 ? -1 : i4, (i10 & 16) != 0 ? -1 : i5, (i10 & 32) != 0 ? -1 : i6, (i10 & 64) != 0 ? -1 : i7, (i10 & 128) != 0 ? -1 : i8, (i10 & 256) == 0 ? i9 : -1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PssInfo(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "");
    }

    public String toString() {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s", Arrays.copyOf(new Object[]{"totalPss=" + this.valueOf + " K", "Java=" + this.OLrzqt + " K", "Native=" + this.EZpvd + " K", "Graphic=" + this.KWHzl + " K", "System=" + this.AYXKKw + " K", "Swap=" + this.gEmmrt + " K", "Code=" + this.AEQbTJ + " K", "Stack=" + this.djBIcL + " K", "PrivateOther=" + this.copydefault + " K"}, 9));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.util.PssInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final PssInfo copydefault() {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            return OLrzqt(memoryInfo);
        }

        public final PssInfo KWHzl() {
            Debug.MemoryInfo[] processMemoryInfo = C58012ytJ.KWHzl.AEQbTJ().getProcessMemoryInfo(yDV.KWHzl(new Integer[]{Integer.valueOf(Process.myPid())}));
            Intrinsics.checkNotNullExpressionValue(processMemoryInfo, "");
            Debug.MemoryInfo memoryInfo = (Debug.MemoryInfo) yDV.zsXlph(processMemoryInfo);
            if (memoryInfo != null) {
                return OLrzqt(memoryInfo);
            }
            return new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
        }

        public final PssInfo OLrzqt(@NotNull Debug.MemoryInfo memoryInfo) {
            Intrinsics.checkNotNullParameter(memoryInfo, "");
            PssInfo pssInfo = new PssInfo(0, 0, 0, 0, 0, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
            pssInfo.AYXKKw(memoryInfo.getTotalPss());
            Map<String, String> memoryStats = memoryInfo.getMemoryStats();
            Intrinsics.checkNotNullExpressionValue(memoryStats, "");
            pssInfo.KWHzl(KWHzl(memoryStats, "summary.java-heap"));
            pssInfo.AEQbTJ(KWHzl(memoryStats, "summary.native-heap"));
            pssInfo.copydefault(KWHzl(memoryStats, "summary.code"));
            pssInfo.AhwBna(KWHzl(memoryStats, "summary.stack"));
            pssInfo.OLrzqt(KWHzl(memoryStats, "summary.graphics"));
            pssInfo.EZpvd(KWHzl(memoryStats, "summary.private-other"));
            pssInfo.valueOf(KWHzl(memoryStats, "summary.system"));
            pssInfo.gEmmrt(KWHzl(memoryStats, "summary.total-swap"));
            return pssInfo;
        }

        public static final int KWHzl(Map<String, String> map, String str) {
            String str2 = map.get(str);
            if (str2 != null) {
                return Integer.parseInt(str2);
            }
            return -1;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.valueOf);
        parcel.writeInt(this.OLrzqt);
        parcel.writeInt(this.EZpvd);
        parcel.writeInt(this.KWHzl);
        parcel.writeInt(this.AYXKKw);
        parcel.writeInt(this.gEmmrt);
        parcel.writeInt(this.AEQbTJ);
        parcel.writeInt(this.djBIcL);
        parcel.writeInt(this.copydefault);
    }
}
