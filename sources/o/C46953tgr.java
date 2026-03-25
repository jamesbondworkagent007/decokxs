package o;

/* JADX INFO: renamed from: o.tgr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46953tgr {
    public final boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46953tgr copy$default(C46953tgr c46953tgr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c46953tgr.EZpvd;
        }
        return c46953tgr.OLrzqt(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46953tgr OLrzqt(boolean z) {
        return new C46953tgr(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46953tgr) && this.EZpvd == ((C46953tgr) obj).EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKPushInappModel(isSkipDefaultBar=" + this.EZpvd + ")";
    }

    public C46953tgr(boolean z) {
        this.EZpvd = z;
    }
}
