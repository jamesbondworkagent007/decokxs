package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uJL {
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final float copydefault;
    public final int gEmmrt;
    public final double valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uJL EZpvd(float f, double d, int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new uJL(f, d, i, i2, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uJL)) {
            return false;
        }
        uJL ujl = (uJL) obj;
        return java.lang.Float.compare(this.copydefault, ujl.copydefault) == 0 && java.lang.Double.compare(this.valueOf, ujl.valueOf) == 0 && this.gEmmrt == ujl.gEmmrt && this.EZpvd == ujl.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ujl.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ujl.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ujl.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((java.lang.Float.hashCode(this.copydefault) * 31) + java.lang.Double.hashCode(this.valueOf)) * 31) + java.lang.Integer.hashCode(this.gEmmrt)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BacktestProgress(progress=" + this.copydefault + ", remainingHours=" + this.valueOf + ", remainingMinutes=" + this.gEmmrt + ", elapsedMins=" + this.EZpvd + ", formattedRemainingHours=" + this.OLrzqt + ", formattedRemainingMinutes=" + this.KWHzl + ", formattedElapsedMinutes=" + this.AEQbTJ + ")";
    }

    public uJL(float f, double d, int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = f;
        this.valueOf = d;
        this.gEmmrt = i;
        this.EZpvd = i2;
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
    }
}
