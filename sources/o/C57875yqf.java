package o;

/* JADX INFO: renamed from: o.yqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57875yqf implements InterfaceC57874yqe {
    public final InterfaceC57757yoT OLrzqt;

    public C57875yqf(InterfaceC57757yoT interfaceC57757yoT) {
        this.OLrzqt = interfaceC57757yoT;
    }

    public void copydefault(java.lang.String str) {
        InterfaceC57757yoT interfaceC57757yoT = this.OLrzqt;
        interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_LANGUAGE", str);
    }

    @Override // o.InterfaceC57874yqe
    public java.lang.String OLrzqt() {
        InterfaceC57757yoT interfaceC57757yoT = this.OLrzqt;
        return interfaceC57757yoT.OLrzqt(interfaceC57757yoT.copydefault(), "PREFS_OS_LANGUAGE", "en");
    }
}
