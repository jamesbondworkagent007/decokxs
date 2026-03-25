package o;

/* JADX INFO: renamed from: o.iPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23961iPt {
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23961iPt copy$default(C23961iPt c23961iPt, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c23961iPt.OLrzqt;
        }
        return c23961iPt.KWHzl(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23961iPt KWHzl(int i) {
        return new C23961iPt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23961iPt) && this.OLrzqt == ((C23961iPt) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestUniv3KeyBoardUIBean(inputContent=" + this.OLrzqt + ")";
    }

    public C23961iPt(int i) {
        this.OLrzqt = i;
    }
}
