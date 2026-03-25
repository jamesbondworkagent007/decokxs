package o;

/* JADX INFO: renamed from: o.AzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4135AzD {
    public static final int $stable = 8;
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4135AzD copy$default(C4135AzD c4135AzD, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c4135AzD.KWHzl;
        }
        return c4135AzD.copydefault(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4135AzD copydefault(boolean z) {
        return new C4135AzD(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4135AzD) && this.KWHzl == ((C4135AzD) obj).KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BridgePlatformCheckResponse(bridgeForceUpgrade=" + this.KWHzl + ")";
    }

    public C4135AzD(boolean z) {
        this.KWHzl = z;
    }
}
