package o;

import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class CallableC58335yzO<T> extends AbstractC58247yxg<T> implements Callable<T> {
    public final Callable<? extends T> OLrzqt;

    public CallableC58335yzO(Callable<? extends T> callable) {
        this.OLrzqt = callable;
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
            deferredScalarDisposable.complete(C58297yyd.AEQbTJ((java.lang.Object) this.OLrzqt.call(), "Callable returned null"));
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            if (!deferredScalarDisposable.isDisposed()) {
                interfaceC58256yxp.onError(th);
            } else {
                yBG.copydefault(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
        return (T) C58297yyd.AEQbTJ((java.lang.Object) this.OLrzqt.call(), "The callable returned a null value");
    }
}
