package o;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: o.yzT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58340yzT<T> extends AbstractC58247yxg<T> {
    public final Future<? extends T> KWHzl;
    public final java.util.concurrent.TimeUnit OLrzqt;
    public final long copydefault;

    public C58340yzT(Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.KWHzl = future;
        this.copydefault = j;
        this.OLrzqt = timeUnit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.observers.DeferredScalarDisposable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(interfaceC58256yxp);
        interfaceC58256yxp.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            java.util.concurrent.TimeUnit timeUnit = this.OLrzqt;
            deferredScalarDisposable.complete(C58297yyd.AEQbTJ((java.lang.Object) (timeUnit != null ? this.KWHzl.get(this.copydefault, timeUnit) : this.KWHzl.get()), "Future returned null"));
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            interfaceC58256yxp.onError(th);
        }
    }
}
