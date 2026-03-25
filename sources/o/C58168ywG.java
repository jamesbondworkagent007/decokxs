package o;

/* JADX INFO: renamed from: o.ywG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58168ywG<T> implements InterfaceC58164ywC<T> {
    public static final java.lang.Object EZpvd = new java.lang.Object();
    public volatile java.lang.Object AEQbTJ = EZpvd;
    public volatile InterfaceC58164ywC<T> copydefault;

    public C58168ywG(InterfaceC58164ywC<T> interfaceC58164ywC) {
        this.copydefault = interfaceC58164ywC;
    }

    @Override // o.yCP
    public T get() {
        T t = (T) this.AEQbTJ;
        if (t != EZpvd) {
            return t;
        }
        InterfaceC58164ywC<T> interfaceC58164ywC = this.copydefault;
        if (interfaceC58164ywC == null) {
            return (T) this.AEQbTJ;
        }
        T t2 = interfaceC58164ywC.get();
        this.AEQbTJ = t2;
        this.copydefault = null;
        return t2;
    }

    public static <T> InterfaceC58164ywC<T> OLrzqt(InterfaceC58164ywC<T> interfaceC58164ywC) {
        return ((interfaceC58164ywC instanceof C58168ywG) || (interfaceC58164ywC instanceof C58213ywz)) ? interfaceC58164ywC : new C58168ywG((InterfaceC58164ywC) C58165ywD.copydefault(interfaceC58164ywC));
    }
}
