package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.xwA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56081xwA<T> {
    public java.util.ArrayList<InterfaceC58184ywW<T>> EZpvd = new java.util.ArrayList<>();
    public AtomicBoolean KWHzl = new AtomicBoolean(false);
    public AtomicBoolean copydefault = new AtomicBoolean(false);

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xwA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleResult$default(C56081xwA c56081xwA, java.lang.Throwable th, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        c56081xwA.copydefault(th, obj);
    }

    public final void copydefault(java.lang.Throwable th, T t) {
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            InterfaceC58184ywW interfaceC58184ywW = (InterfaceC58184ywW) it.next();
            if (th == null && t != null) {
                interfaceC58184ywW.onNext(t);
            } else {
                interfaceC58184ywW.onError(th == null ? new java.lang.Exception("init Fail") : th);
            }
        }
        this.EZpvd.clear();
    }
}
