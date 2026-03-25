package o;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yxx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58264yxx {
    public static volatile InterfaceC58229yxO<AbstractC58253yxm, AbstractC58253yxm> KWHzl;
    public static volatile InterfaceC58229yxO<Callable<AbstractC58253yxm>, AbstractC58253yxm> OLrzqt;

    public static AbstractC58253yxm OLrzqt(Callable<AbstractC58253yxm> callable) {
        if (callable == null) {
            throw new java.lang.NullPointerException("scheduler == null");
        }
        InterfaceC58229yxO<Callable<AbstractC58253yxm>, AbstractC58253yxm> interfaceC58229yxO = OLrzqt;
        if (interfaceC58229yxO == null) {
            return AEQbTJ(callable);
        }
        return copydefault(interfaceC58229yxO, callable);
    }

    public static AbstractC58253yxm OLrzqt(AbstractC58253yxm abstractC58253yxm) {
        if (abstractC58253yxm == null) {
            throw new java.lang.NullPointerException("scheduler == null");
        }
        InterfaceC58229yxO<AbstractC58253yxm, AbstractC58253yxm> interfaceC58229yxO = KWHzl;
        return interfaceC58229yxO == null ? abstractC58253yxm : (AbstractC58253yxm) AEQbTJ(interfaceC58229yxO, abstractC58253yxm);
    }

    public static AbstractC58253yxm AEQbTJ(Callable<AbstractC58253yxm> callable) {
        try {
            AbstractC58253yxm abstractC58253yxmCall = callable.call();
            if (abstractC58253yxmCall != null) {
                return abstractC58253yxmCall;
            }
            throw new java.lang.NullPointerException("Scheduler Callable returned null");
        } catch (java.lang.Throwable th) {
            throw C58218yxD.OLrzqt(th);
        }
    }

    public static AbstractC58253yxm copydefault(InterfaceC58229yxO<Callable<AbstractC58253yxm>, AbstractC58253yxm> interfaceC58229yxO, Callable<AbstractC58253yxm> callable) {
        AbstractC58253yxm abstractC58253yxm = (AbstractC58253yxm) AEQbTJ(interfaceC58229yxO, callable);
        if (abstractC58253yxm != null) {
            return abstractC58253yxm;
        }
        throw new java.lang.NullPointerException("Scheduler Callable returned null");
    }

    public static <T, R> R AEQbTJ(InterfaceC58229yxO<T, R> interfaceC58229yxO, T t) {
        try {
            return interfaceC58229yxO.apply(t);
        } catch (java.lang.Throwable th) {
            throw C58218yxD.OLrzqt(th);
        }
    }

    private C58264yxx() {
        throw new java.lang.AssertionError("No instances.");
    }
}
