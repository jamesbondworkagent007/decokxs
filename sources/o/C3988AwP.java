package o;

/* JADX INFO: renamed from: o.AwP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3988AwP {
    public static final int $stable = 8;
    public double AEQbTJ;
    public boolean EZpvd;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3988AwP copy$default(C3988AwP c3988AwP, int i, int i2, double d, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c3988AwP.OLrzqt;
        }
        if ((i3 & 2) != 0) {
            i2 = c3988AwP.copydefault;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            d = c3988AwP.AEQbTJ;
        }
        double d2 = d;
        if ((i3 & 8) != 0) {
            z = c3988AwP.EZpvd;
        }
        return c3988AwP.EZpvd(i, i4, d2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3988AwP EZpvd(int i, int i2, double d, boolean z) {
        return new C3988AwP(i, i2, d, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3988AwP)) {
            return false;
        }
        C3988AwP c3988AwP = (C3988AwP) obj;
        return this.OLrzqt == c3988AwP.OLrzqt && this.copydefault == c3988AwP.copydefault && java.lang.Double.compare(this.AEQbTJ, c3988AwP.AEQbTJ) == 0 && this.EZpvd == c3988AwP.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Double.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GlareResult(glarePixelCount=" + this.OLrzqt + ", totalPixels=" + this.copydefault + ", glareRatio=" + this.AEQbTJ + ", hasGlare=" + this.EZpvd + ")";
    }

    public C3988AwP(int i, int i2, double d, boolean z) {
        this.OLrzqt = i;
        this.copydefault = i2;
        this.AEQbTJ = d;
        this.EZpvd = z;
    }
}
