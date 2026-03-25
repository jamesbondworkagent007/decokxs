package o;

/* JADX INFO: renamed from: o.dYf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13786dYf {
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C13786dYf copy$default(C13786dYf c13786dYf, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c13786dYf.OLrzqt;
        }
        return c13786dYf.OLrzqt(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13786dYf OLrzqt(boolean z) {
        return new C13786dYf(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13786dYf) && this.OLrzqt == ((C13786dYf) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CreateTeeWalletBean(shouldDismissLoadingFragment=" + this.OLrzqt + ")";
    }

    public C13786dYf(boolean z) {
        this.OLrzqt = z;
    }
}
