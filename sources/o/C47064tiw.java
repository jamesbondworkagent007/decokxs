package o;

import com.okinc.okrisk.collection.sensors.SensorType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tiw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47064tiw {
    public final int AEQbTJ;
    public final int EZpvd;
    public final SensorType KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47064tiw copy$default(C47064tiw c47064tiw, SensorType sensorType, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            sensorType = c47064tiw.KWHzl;
        }
        if ((i4 & 2) != 0) {
            i = c47064tiw.AEQbTJ;
        }
        if ((i4 & 4) != 0) {
            i2 = c47064tiw.OLrzqt;
        }
        if ((i4 & 8) != 0) {
            i3 = c47064tiw.EZpvd;
        }
        return c47064tiw.AEQbTJ(sensorType, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SensorType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47064tiw AEQbTJ(@NotNull SensorType sensorType, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sensorType, "");
        return new C47064tiw(sensorType, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47064tiw)) {
            return false;
        }
        C47064tiw c47064tiw = (C47064tiw) obj;
        return this.KWHzl == c47064tiw.KWHzl && this.AEQbTJ == c47064tiw.AEQbTJ && this.OLrzqt == c47064tiw.OLrzqt && this.EZpvd == c47064tiw.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SensorCollectionConfig(type=" + this.KWHzl + ", bufferSize=" + this.AEQbTJ + ", duration=" + this.OLrzqt + ", samplingRate=" + this.EZpvd + ")";
    }

    public C47064tiw(@NotNull SensorType sensorType, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sensorType, "");
        this.KWHzl = sensorType;
        this.AEQbTJ = i;
        this.OLrzqt = i2;
        this.EZpvd = i3;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Buffer size must be positive".toString());
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("Duration must be positive".toString());
        }
        this.copydefault = (i3 < 0 || i3 >= 4) ? 3 : i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r1v0 com.okinc.okrisk.collection.sensors.SensorType)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (500 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (5000 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r4v0 int))
 A[MD:(com.okinc.okrisk.collection.sensors.SensorType, int, int, int):void (m)] (LINE:19) call: o.tiw.<init>(com.okinc.okrisk.collection.sensors.SensorType, int, int, int):void type: THIS */
    public /* synthetic */ C47064tiw(SensorType sensorType, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(sensorType, (i4 & 2) != 0 ? 500 : i, (i4 & 4) != 0 ? 5000 : i2, (i4 & 8) != 0 ? 3 : i3);
    }
}
