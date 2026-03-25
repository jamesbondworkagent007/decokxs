package o;

/* JADX INFO: renamed from: o.AVs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2696AVs {
    public static final int $stable = 8;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2696AVs copy$default(C2696AVs c2696AVs, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c2696AVs.OLrzqt;
        }
        return c2696AVs.copydefault(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2696AVs copydefault(boolean z) {
        return new C2696AVs(z);
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
        return (obj instanceof C2696AVs) && this.OLrzqt == ((C2696AVs) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeeplinkRegistry(registered=" + this.OLrzqt + ")";
    }

    public C2696AVs(boolean z) {
        this.OLrzqt = z;
    }
}
