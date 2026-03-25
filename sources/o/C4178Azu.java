package o;

/* JADX INFO: renamed from: o.Azu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C4178Azu {
    public static final int $stable = 8;
    public int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4178Azu copy$default(C4178Azu c4178Azu, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c4178Azu.AEQbTJ;
        }
        return c4178Azu.AEQbTJ(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4178Azu AEQbTJ(int i) {
        return new C4178Azu(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4178Azu) && this.AEQbTJ == ((C4178Azu) obj).AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AddAlertResponse(ruleId=" + this.AEQbTJ + ")";
    }

    public C4178Azu(int i) {
        this.AEQbTJ = i;
    }
}
