package o;

/* JADX INFO: renamed from: o.AwG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3979AwG {
    public static final int $stable = 8;
    public float AEQbTJ;
    public float EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3979AwG copy$default(C3979AwG c3979AwG, float f, float f2, float f3, float f4, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = c3979AwG.KWHzl;
        }
        if ((i & 2) != 0) {
            f2 = c3979AwG.AEQbTJ;
        }
        float f5 = f2;
        if ((i & 4) != 0) {
            f3 = c3979AwG.OLrzqt;
        }
        float f6 = f3;
        if ((i & 8) != 0) {
            f4 = c3979AwG.EZpvd;
        }
        float f7 = f4;
        if ((i & 16) != 0) {
            z = c3979AwG.copydefault;
        }
        return c3979AwG.AEQbTJ(f, f5, f6, f7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3979AwG AEQbTJ(float f, float f2, float f3, float f4, boolean z) {
        return new C3979AwG(f, f2, f3, f4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3979AwG)) {
            return false;
        }
        C3979AwG c3979AwG = (C3979AwG) obj;
        return java.lang.Float.compare(this.KWHzl, c3979AwG.KWHzl) == 0 && java.lang.Float.compare(this.AEQbTJ, c3979AwG.AEQbTJ) == 0 && java.lang.Float.compare(this.OLrzqt, c3979AwG.OLrzqt) == 0 && java.lang.Float.compare(this.EZpvd, c3979AwG.EZpvd) == 0 && this.copydefault == c3979AwG.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.KWHzl) * 31) + java.lang.Float.hashCode(this.AEQbTJ)) * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CardAngleResult(leftAngle=" + this.KWHzl + ", rightAngle=" + this.AEQbTJ + ", topAngle=" + this.OLrzqt + ", bottomAngle=" + this.EZpvd + ", isAligned=" + this.copydefault + ")";
    }

    public C3979AwG(float f, float f2, float f3, float f4, boolean z) {
        this.KWHzl = f;
        this.AEQbTJ = f2;
        this.OLrzqt = f3;
        this.EZpvd = f4;
        this.copydefault = z;
    }
}
