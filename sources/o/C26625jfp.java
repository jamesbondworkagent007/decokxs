package o;

/* JADX INFO: renamed from: o.jfp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26625jfp implements InterfaceC27436jvE {
    public final boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26625jfp copy$default(C26625jfp c26625jfp, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c26625jfp.EZpvd;
        }
        return c26625jfp.copydefault(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26625jfp copydefault(boolean z) {
        return new C26625jfp(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26625jfp) && this.EZpvd == ((C26625jfp) obj).EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeFiShowMoreItem(isShowMore=" + this.EZpvd + ")";
    }

    public C26625jfp(boolean z) {
        this.EZpvd = z;
    }
}
