package o;

/* JADX INFO: renamed from: o.zli, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59686zli implements InterfaceC59592zju, InterfaceC59594zjw {
    public final boolean AEQbTJ;
    public final boolean copydefault;

    public C59686zli(boolean z, boolean z2) {
        this.copydefault = z;
        this.AEQbTJ = z2;
    }

    public C59686zli() {
        this(true, true);
    }

    @Override // o.InterfaceC59592zju
    public InterfaceC59588zjq OLrzqt(InterfaceC59779znV interfaceC59779znV) {
        return new C59688zlk(this.copydefault, this.AEQbTJ);
    }

    @Override // o.InterfaceC59594zjw
    public InterfaceC59588zjq copydefault(InterfaceC59838zob interfaceC59838zob) {
        return new C59688zlk(this.copydefault, this.AEQbTJ);
    }
}
