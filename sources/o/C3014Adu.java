package o;

/* JADX INFO: renamed from: o.Adu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3014Adu {
    public static final int $stable = 8;
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3014Adu copy$default(C3014Adu c3014Adu, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c3014Adu.KWHzl;
        }
        return c3014Adu.EZpvd(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3014Adu EZpvd(boolean z) {
        return new C3014Adu(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3014Adu) && this.KWHzl == ((C3014Adu) obj).KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegisterPasswordState(isSubmitButtonEnabled=" + this.KWHzl + ")";
    }

    public C3014Adu(boolean z) {
        this.KWHzl = z;
    }
}
