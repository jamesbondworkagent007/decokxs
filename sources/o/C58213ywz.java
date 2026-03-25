package o;

import dagger.Lazy;

/* JADX INFO: renamed from: o.ywz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58213ywz<T> implements InterfaceC58164ywC<T>, Lazy<T> {
    public static final java.lang.Object KWHzl = new java.lang.Object();
    public volatile InterfaceC58164ywC<T> OLrzqt;
    public volatile java.lang.Object copydefault = KWHzl;

    public C58213ywz(InterfaceC58164ywC<T> interfaceC58164ywC) {
        this.OLrzqt = interfaceC58164ywC;
    }

    @Override // o.yCP
    public T get() {
        T t = (T) this.copydefault;
        return t == KWHzl ? (T) KWHzl() : t;
    }

    public final java.lang.Object KWHzl() {
        java.lang.Object obj;
        synchronized (this) {
            obj = this.copydefault;
            if (obj == KWHzl) {
                obj = this.OLrzqt.get();
                this.copydefault = EZpvd(this.copydefault, obj);
                this.OLrzqt = null;
            }
        }
        return obj;
    }

    public static java.lang.Object EZpvd(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == KWHzl || obj == obj2) {
            return obj2;
        }
        throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <T> InterfaceC58164ywC<T> AEQbTJ(InterfaceC58164ywC<T> interfaceC58164ywC) {
        C58165ywD.copydefault(interfaceC58164ywC);
        return interfaceC58164ywC instanceof C58213ywz ? interfaceC58164ywC : new C58213ywz(interfaceC58164ywC);
    }

    public static <T> Lazy<T> EZpvd(InterfaceC58164ywC<T> interfaceC58164ywC) {
        if (interfaceC58164ywC instanceof Lazy) {
            return (Lazy) interfaceC58164ywC;
        }
        return new C58213ywz((InterfaceC58164ywC) C58165ywD.copydefault(interfaceC58164ywC));
    }
}
