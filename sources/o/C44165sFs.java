package o;

/* JADX INFO: renamed from: o.sFs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44165sFs {
    public final int AEQbTJ;
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44165sFs copy$default(C44165sFs c44165sFs, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c44165sFs.EZpvd;
        }
        if ((i3 & 2) != 0) {
            i2 = c44165sFs.AEQbTJ;
        }
        return c44165sFs.KWHzl(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44165sFs KWHzl(int i, int i2) {
        return new C44165sFs(i, i2);
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
        if (!(obj instanceof C44165sFs)) {
            return false;
        }
        C44165sFs c44165sFs = (C44165sFs) obj;
        return this.EZpvd == c44165sFs.EZpvd && this.AEQbTJ == c44165sFs.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ImageDimensions(width=" + this.EZpvd + ", height=" + this.AEQbTJ + ")";
    }

    public C44165sFs(int i, int i2) {
        this.EZpvd = i;
        this.AEQbTJ = i2;
    }
}
