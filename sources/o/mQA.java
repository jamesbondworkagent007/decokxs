package o;

/* JADX INFO: loaded from: classes18.dex */
public final class mQA implements InterfaceC32140mQz {
    public final int KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ mQA copy$default(mQA mqa, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = mqa.KWHzl;
        }
        if ((i3 & 2) != 0) {
            i2 = mqa.OLrzqt;
        }
        return mqa.copydefault(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32140mQz
    public int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32140mQz
    public int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mQA copydefault(int i, int i2) {
        return new mQA(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mQA)) {
            return false;
        }
        mQA mqa = (mQA) obj;
        return this.KWHzl == mqa.KWHzl && this.OLrzqt == mqa.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavigateEventTab(primaryTab=" + this.KWHzl + ", secondaryTab=" + this.OLrzqt + ")";
    }

    public mQA(int i, int i2) {
        this.KWHzl = i;
        this.OLrzqt = i2;
    }
}
