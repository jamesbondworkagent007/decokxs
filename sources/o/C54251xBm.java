package o;

/* JADX INFO: renamed from: o.xBm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54251xBm extends xKD {
    public java.lang.Object AEQbTJ;
    public final C56160xxa EZpvd;
    public java.lang.Object KWHzl;
    public final C56235xyw OLrzqt;
    public final xBG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56160xxa AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.Object obj) {
        this.KWHzl = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Object obj) {
        this.AEQbTJ = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBG KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw copydefault() {
        return this.OLrzqt;
    }

    public C54251xBm() {
        C56235xyw c56235xyw = new C56235xyw();
        c56235xyw.fIwbmz();
        this.OLrzqt = c56235xyw;
        xBG xbg = new xBG();
        xbg.fIwbmz();
        this.copydefault = xbg;
        this.EZpvd = new C56160xxa();
    }

    @Override // o.xKD
    public java.util.List<xKK> values() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.AEQbTJ == null) {
            arrayList.add(this.OLrzqt);
        }
        if (this.KWHzl == null) {
            arrayList.add(this.copydefault);
        }
        arrayList.add(this.EZpvd);
        return arrayList;
    }
}
