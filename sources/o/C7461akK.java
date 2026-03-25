package o;

/* JADX INFO: renamed from: o.akK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7461akK {
    public static int AYXKKw;
    public static int KWHzl;
    public final float AEQbTJ;
    public final float EZpvd;
    public final int OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C7461akK copy$default(C7461akK c7461akK, float f, float f2, int i, float f3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            f = c7461akK.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            f2 = c7461akK.copydefault;
        }
        if ((i2 & 4) != 0) {
            i = c7461akK.OLrzqt;
        }
        if ((i2 & 8) != 0) {
            f3 = c7461akK.EZpvd;
        }
        return c7461akK.OLrzqt(f, f2, i, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7461akK OLrzqt(float f, float f2, int i, float f3) {
        return new C7461akK(f, f2, i, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7461akK)) {
            return false;
        }
        C7461akK c7461akK = (C7461akK) obj;
        return java.lang.Float.compare(this.AEQbTJ, c7461akK.AEQbTJ) == 0 && java.lang.Float.compare(this.copydefault, c7461akK.copydefault) == 0 && this.OLrzqt == c7461akK.OLrzqt && java.lang.Float.compare(this.EZpvd, c7461akK.EZpvd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.AEQbTJ) * 31) + java.lang.Float.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TreeMapAppearanceData(cornerRadius=" + this.AEQbTJ + ", gapWidth=" + this.copydefault + ", maxNum=" + this.OLrzqt + ", padding=" + this.EZpvd + ")";
    }

    public C7461akK(float f, float f2, int i, float f3) {
        this.AEQbTJ = f;
        this.copydefault = f2;
        this.OLrzqt = i;
        this.EZpvd = f3;
    }

    public static int copydefault() {
        int i = KWHzl;
        int i2 = i % 7014248;
        KWHzl = i + 1;
        if (i2 != 0) {
            return AYXKKw;
        }
        int iMyPid = android.os.Process.myPid();
        AYXKKw = iMyPid;
        return iMyPid;
    }
}
