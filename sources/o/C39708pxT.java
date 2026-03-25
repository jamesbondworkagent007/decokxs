package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39708pxT {
    public final java.lang.String AEQbTJ;
    public final float EZpvd;
    public final int KWHzl;
    public final float OLrzqt;
    public final long copydefault;
    public final float gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39708pxT copy$default(C39708pxT c39708pxT, java.lang.String str, float f, int i, float f2, float f3, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c39708pxT.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            f = c39708pxT.EZpvd;
        }
        float f4 = f;
        if ((i2 & 4) != 0) {
            i = c39708pxT.KWHzl;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            f2 = c39708pxT.OLrzqt;
        }
        float f5 = f2;
        if ((i2 & 16) != 0) {
            f3 = c39708pxT.gEmmrt;
        }
        float f6 = f3;
        if ((i2 & 32) != 0) {
            j = c39708pxT.copydefault;
        }
        return c39708pxT.copydefault(str, f4, i3, f5, f6, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39708pxT copydefault(@NotNull java.lang.String str, float f, @androidx.annotation.ColorInt int i, float f2, float f3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C39708pxT(str, f, i, f2, f3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39708pxT)) {
            return false;
        }
        C39708pxT c39708pxT = (C39708pxT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c39708pxT.AEQbTJ) && java.lang.Float.compare(this.EZpvd, c39708pxT.EZpvd) == 0 && this.KWHzl == c39708pxT.KWHzl && java.lang.Float.compare(this.OLrzqt, c39708pxT.OLrzqt) == 0 && java.lang.Float.compare(this.gEmmrt, c39708pxT.gEmmrt) == 0 && this.copydefault == c39708pxT.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.AEQbTJ.hashCode() * 31) + java.lang.Float.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.gEmmrt)) * 31) + java.lang.Long.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UnlockPieData(title=" + this.AEQbTJ + ", percent=" + this.EZpvd + ", color=" + this.KWHzl + ", progress=" + this.OLrzqt + ", unlockPercent=" + this.gEmmrt + ", maxSupply=" + this.copydefault + ")";
    }

    public C39708pxT(@NotNull java.lang.String str, float f, @androidx.annotation.ColorInt int i, float f2, float f3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.EZpvd = f;
        this.KWHzl = i;
        this.OLrzqt = f2;
        this.gEmmrt = f3;
        this.copydefault = j;
    }

    public final java.lang.String AhwBna() {
        return pTB.formatICUPercent$default(java.lang.Float.valueOf(this.EZpvd * 100.0f), RoundingMode.HALF_UP, null, null, null, null, 30, null);
    }
}
