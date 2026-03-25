package o;

/* JADX INFO: renamed from: o.zuz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60076zuz {
    public final boolean AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60076zuz copy$default(C60076zuz c60076zuz, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c60076zuz.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = c60076zuz.KWHzl;
        }
        return c60076zuz.KWHzl(z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60076zuz KWHzl(boolean z, int i) {
        return new C60076zuz(z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60076zuz)) {
            return false;
        }
        C60076zuz c60076zuz = (C60076zuz) obj;
        return this.AEQbTJ == c60076zuz.AEQbTJ && this.KWHzl == c60076zuz.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.AEQbTJ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BIP44Element(hardened=" + this.AEQbTJ + ", number=" + this.KWHzl + ')';
    }

    public C60076zuz(boolean z, int i) {
        this.AEQbTJ = z;
        this.KWHzl = i;
        this.EZpvd = z ? i | Integer.MIN_VALUE : i;
    }
}
