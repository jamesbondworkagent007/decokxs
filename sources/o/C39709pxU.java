package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39709pxU {
    public final double AEQbTJ;
    public final long AhwBna;
    public final int EZpvd;
    public final double KWHzl;
    public final long OLrzqt;
    public final int copydefault;
    public final double djBIcL;
    public final java.lang.String gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39709pxU AEQbTJ(long j, @NotNull java.lang.String str, double d, double d2, long j2, double d3, @androidx.annotation.ColorInt int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C39709pxU(j, str, d, d2, j2, d3, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39709pxU)) {
            return false;
        }
        C39709pxU c39709pxU = (C39709pxU) obj;
        return this.AhwBna == c39709pxU.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c39709pxU.gEmmrt) && java.lang.Double.compare(this.djBIcL, c39709pxU.djBIcL) == 0 && java.lang.Double.compare(this.AEQbTJ, c39709pxU.AEQbTJ) == 0 && this.OLrzqt == c39709pxU.OLrzqt && java.lang.Double.compare(this.KWHzl, c39709pxU.KWHzl) == 0 && this.EZpvd == c39709pxU.EZpvd && this.copydefault == c39709pxU.copydefault && this.valueOf == c39709pxU.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((java.lang.Long.hashCode(this.AhwBna) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Double.hashCode(this.djBIcL)) * 31) + java.lang.Double.hashCode(this.AEQbTJ)) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + java.lang.Double.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ScheduleChartData(ts=" + this.AhwBna + ", title=" + this.gEmmrt + ", unlockAmount=" + this.djBIcL + ", fiat=" + this.AEQbTJ + ", currentAmount=" + this.OLrzqt + ", currentFiat=" + this.KWHzl + ", color=" + this.EZpvd + ", chartIndex=" + this.copydefault + ", labelIndex=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public C39709pxU(long j, @NotNull java.lang.String str, double d, double d2, long j2, double d3, @androidx.annotation.ColorInt int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = j;
        this.gEmmrt = str;
        this.djBIcL = d;
        this.AEQbTJ = d2;
        this.OLrzqt = j2;
        this.KWHzl = d3;
        this.EZpvd = i;
        this.copydefault = i2;
        this.valueOf = i3;
    }
}
