package o;

/* JADX INFO: renamed from: o.zDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58459zDd {
    public static final int $stable = 8;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58459zDd copy$default(C58459zDd c58459zDd, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c58459zDd.copydefault;
        }
        return c58459zDd.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58459zDd AEQbTJ(boolean z) {
        return new C58459zDd(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58459zDd) && this.copydefault == ((C58459zDd) obj).copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LoginInteractorInput(disablePrefillUsername=" + this.copydefault + ")";
    }

    public C58459zDd(boolean z) {
        this.copydefault = z;
    }
}
