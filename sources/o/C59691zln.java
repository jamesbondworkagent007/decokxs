package o;

/* JADX INFO: renamed from: o.zln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59691zln implements InterfaceC59592zju, InterfaceC59594zjw {
    public final boolean AEQbTJ;
    public final boolean KWHzl;

    public C59691zln(boolean z, boolean z2) {
        this.AEQbTJ = z;
        this.KWHzl = z2;
    }

    public C59691zln() {
        this(true, true);
    }

    @Override // o.InterfaceC59592zju
    public InterfaceC59588zjq OLrzqt(InterfaceC59779znV interfaceC59779znV) {
        return new C59693zlp(this.AEQbTJ, this.KWHzl);
    }

    @Override // o.InterfaceC59594zjw
    public InterfaceC59588zjq copydefault(InterfaceC59838zob interfaceC59838zob) {
        return new C59693zlp(this.AEQbTJ, this.KWHzl);
    }
}
