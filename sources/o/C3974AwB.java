package o;

/* JADX INFO: renamed from: o.AwB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3974AwB {
    public static final int $stable = 8;
    public int AEQbTJ;
    public double EZpvd;
    public boolean OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3974AwB copy$default(C3974AwB c3974AwB, boolean z, boolean z2, int i, double d, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c3974AwB.copydefault;
        }
        if ((i2 & 2) != 0) {
            z2 = c3974AwB.OLrzqt;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            i = c3974AwB.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            d = c3974AwB.EZpvd;
        }
        return c3974AwB.AEQbTJ(z, z3, i3, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3974AwB AEQbTJ(boolean z, boolean z2, int i, double d) {
        return new C3974AwB(z, z2, i, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3974AwB)) {
            return false;
        }
        C3974AwB c3974AwB = (C3974AwB) obj;
        return this.copydefault == c3974AwB.copydefault && this.OLrzqt == c3974AwB.OLrzqt && this.AEQbTJ == c3974AwB.AEQbTJ && java.lang.Double.compare(this.EZpvd, c3974AwB.EZpvd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Double.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CaptureFrameResult(isBetter=" + this.copydefault + ", isComplete=" + this.OLrzqt + ", captureCount=" + this.AEQbTJ + ", maxBlurScore=" + this.EZpvd + ")";
    }

    public C3974AwB(boolean z, boolean z2, int i, double d) {
        this.copydefault = z;
        this.OLrzqt = z2;
        this.AEQbTJ = i;
        this.EZpvd = d;
    }
}
