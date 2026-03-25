package o;

/* JADX INFO: renamed from: o.Bze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5008Bze {
    public static final int $stable = 8;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5008Bze copy$default(C5008Bze c5008Bze, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c5008Bze.OLrzqt;
        }
        return c5008Bze.EZpvd(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5008Bze EZpvd(boolean z) {
        return new C5008Bze(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5008Bze) && this.OLrzqt == ((C5008Bze) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RmFeatures(isRelationshipManager=" + this.OLrzqt + ")";
    }

    public C5008Bze(boolean z) {
        this.OLrzqt = z;
    }
}
