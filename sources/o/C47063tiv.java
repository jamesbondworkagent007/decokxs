package o;

import com.okinc.okrisk.collection.sensors.SensorType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tiv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47063tiv {
    public final SensorType AEQbTJ;
    public final float EZpvd;
    public final long KWHzl;
    public final float OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47063tiv copy$default(C47063tiv c47063tiv, float f, float f2, float f3, SensorType sensorType, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = c47063tiv.EZpvd;
        }
        if ((i & 2) != 0) {
            f2 = c47063tiv.OLrzqt;
        }
        float f4 = f2;
        if ((i & 4) != 0) {
            f3 = c47063tiv.copydefault;
        }
        float f5 = f3;
        if ((i & 8) != 0) {
            sensorType = c47063tiv.AEQbTJ;
        }
        SensorType sensorType2 = sensorType;
        if ((i & 16) != 0) {
            j = c47063tiv.KWHzl;
        }
        return c47063tiv.copydefault(f, f4, f5, sensorType2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SensorType EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47063tiv copydefault(float f, float f2, float f3, @NotNull SensorType sensorType, long j) {
        Intrinsics.checkNotNullParameter(sensorType, "");
        return new C47063tiv(f, f2, f3, sensorType, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47063tiv)) {
            return false;
        }
        C47063tiv c47063tiv = (C47063tiv) obj;
        return java.lang.Float.compare(this.EZpvd, c47063tiv.EZpvd) == 0 && java.lang.Float.compare(this.OLrzqt, c47063tiv.OLrzqt) == 0 && java.lang.Float.compare(this.copydefault, c47063tiv.copydefault) == 0 && this.AEQbTJ == c47063tiv.AEQbTJ && this.KWHzl == c47063tiv.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.EZpvd) * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Long.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Point(x=" + this.EZpvd + ", y=" + this.OLrzqt + ", z=" + this.copydefault + ", type=" + this.AEQbTJ + ", timestamp=" + this.KWHzl + ")";
    }

    public C47063tiv(float f, float f2, float f3, @NotNull SensorType sensorType, long j) {
        Intrinsics.checkNotNullParameter(sensorType, "");
        this.EZpvd = f;
        this.OLrzqt = f2;
        this.copydefault = f3;
        this.AEQbTJ = sensorType;
        this.KWHzl = j;
    }

    public final java.lang.String djBIcL() {
        float f = this.EZpvd;
        float f2 = -1.0f;
        float f3 = (java.lang.Float.isInfinite(f) || java.lang.Float.isNaN(f)) ? -1.0f : this.EZpvd;
        float f4 = this.OLrzqt;
        float f5 = (java.lang.Float.isInfinite(f4) || java.lang.Float.isNaN(f4)) ? -1.0f : this.OLrzqt;
        float f6 = this.copydefault;
        if (!java.lang.Float.isInfinite(f6) && !java.lang.Float.isNaN(f6)) {
            f2 = this.copydefault;
        }
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String str = java.lang.String.format(locale, "%.6f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        java.lang.String str2 = java.lang.String.format(locale, "%.6f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f5)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        java.lang.String str3 = java.lang.String.format(locale, "%.6f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        return "[" + str + ", " + str2 + ", " + str3 + "]";
    }
}
