package o;

/* JADX INFO: renamed from: o.ywy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58212ywy<T> implements InterfaceC58162ywA<T> {
    public InterfaceC58164ywC<T> AEQbTJ;

    @Override // o.yCP
    public T get() {
        InterfaceC58164ywC<T> interfaceC58164ywC = this.AEQbTJ;
        if (interfaceC58164ywC == null) {
            throw new java.lang.IllegalStateException();
        }
        return interfaceC58164ywC.get();
    }

    public static <T> void AEQbTJ(InterfaceC58164ywC<T> interfaceC58164ywC, InterfaceC58164ywC<T> interfaceC58164ywC2) {
        EZpvd((C58212ywy) interfaceC58164ywC, interfaceC58164ywC2);
    }

    public static <T> void EZpvd(C58212ywy<T> c58212ywy, InterfaceC58164ywC<T> interfaceC58164ywC) {
        C58165ywD.copydefault(interfaceC58164ywC);
        if (c58212ywy.AEQbTJ != null) {
            throw new java.lang.IllegalStateException();
        }
        c58212ywy.AEQbTJ = interfaceC58164ywC;
    }
}
