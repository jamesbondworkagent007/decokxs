package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.Azi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4166Azi {
    public static final int $stable = 8;
    public int AEQbTJ;
    public int EZpvd;
    public double OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 double), (r3v0 int), (r4v0 int) A[MD:(double, int, int):void (m)] call: o.Azi.<init>(double, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C4166Azi(double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-BltQuoY$default, reason: not valid java name */
    public static /* synthetic */ C4166Azi m8207copyBltQuoY$default(C4166Azi c4166Azi, double d, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            d = c4166Azi.OLrzqt;
        }
        if ((i3 & 2) != 0) {
            i = c4166Azi.AEQbTJ;
        }
        if ((i3 & 4) != 0) {
            i2 = c4166Azi.EZpvd;
        }
        return c4166Azi.AEQbTJ(d, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4166Azi AEQbTJ(double d, int i, int i2) {
        return new C4166Azi(d, i, i2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4166Azi)) {
            return false;
        }
        C4166Azi c4166Azi = (C4166Azi) obj;
        return java.lang.Double.compare(this.OLrzqt, c4166Azi.OLrzqt) == 0 && this.AEQbTJ == c4166Azi.AEQbTJ && this.EZpvd == c4166Azi.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Double.hashCode(this.OLrzqt) * 31) + C56395yDu.KWHzl(this.AEQbTJ)) * 31) + C56395yDu.KWHzl(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MotionBlurConfig(focalLengthPixels=" + this.OLrzqt + ", sensorWidth=" + C56395yDu.OLrzqt(this.AEQbTJ) + ", sensorHeight=" + C56395yDu.OLrzqt(this.EZpvd) + ")";
    }

    public C4166Azi(double d, int i, int i2) {
        this.OLrzqt = d;
        this.AEQbTJ = i;
        this.EZpvd = i2;
    }
}
