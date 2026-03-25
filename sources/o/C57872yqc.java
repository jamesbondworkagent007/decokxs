package o;

/* JADX INFO: renamed from: o.yqc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57872yqc {
    public static C57872yqc AEQbTJ;
    public InterfaceC57874yqe OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C57872yqc AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(InterfaceC57874yqe interfaceC57874yqe) {
        this.OLrzqt = interfaceC57874yqe;
    }

    public C57872yqc(InterfaceC57757yoT interfaceC57757yoT) {
        AEQbTJ = this;
        if (interfaceC57757yoT.OLrzqt(interfaceC57757yoT.copydefault(), "PREFS_OS_LANGUAGE", null) != null) {
            this.OLrzqt = new C57875yqf(interfaceC57757yoT);
        } else {
            this.OLrzqt = new C57878yqi();
        }
    }

    public java.lang.String OLrzqt() {
        return this.OLrzqt.OLrzqt();
    }
}
