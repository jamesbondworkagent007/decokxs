package o;

/* JADX INFO: renamed from: o.zkW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59621zkW implements InterfaceC59583zjl {
    public static final C59621zkW copydefault = new C59621zkW();
    public final InterfaceC59586zjo OLrzqt;

    public C59621zkW(InterfaceC59586zjo interfaceC59586zjo) {
        this.OLrzqt = (InterfaceC59586zjo) C59851zoo.AEQbTJ(interfaceC59586zjo, "Reason phrase catalog");
    }

    public C59621zkW() {
        this(C59622zkX.OLrzqt);
    }

    @Override // o.InterfaceC59583zjl
    public InterfaceC59584zjm AEQbTJ(InterfaceC59587zjp interfaceC59587zjp, InterfaceC59838zob interfaceC59838zob) {
        C59851zoo.AEQbTJ(interfaceC59587zjp, "Status line");
        return new C59767znJ(interfaceC59587zjp, this.OLrzqt, copydefault(interfaceC59838zob));
    }

    public java.util.Locale copydefault(InterfaceC59838zob interfaceC59838zob) {
        return java.util.Locale.getDefault();
    }
}
