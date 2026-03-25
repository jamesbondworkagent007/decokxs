package o;

/* JADX INFO: renamed from: o.aep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7174aep implements InterfaceC7171aem {
    public final C7235afx OLrzqt;
    public final InterfaceC7171aem copydefault;

    public C7174aep(C7235afx c7235afx, InterfaceC7171aem interfaceC7171aem) {
        this.OLrzqt = c7235afx;
        this.copydefault = interfaceC7171aem;
    }

    @Override // o.InterfaceC7171aem
    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = this.copydefault.EZpvd(interfaceC7163aee);
        this.OLrzqt.EZpvd(interfaceC7163aee);
        return c7169aekEZpvd;
    }
}
