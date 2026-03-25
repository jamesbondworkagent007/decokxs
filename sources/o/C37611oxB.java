package o;

/* JADX INFO: renamed from: o.oxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C37611oxB {
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37611oxB copy$default(C37611oxB c37611oxB, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c37611oxB.OLrzqt;
        }
        return c37611oxB.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37611oxB AEQbTJ(boolean z) {
        return new C37611oxB(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37611oxB) && this.OLrzqt == ((C37611oxB) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CheckedPayload(isSelected=" + this.OLrzqt + ")";
    }

    public C37611oxB(boolean z) {
        this.OLrzqt = z;
    }
}
