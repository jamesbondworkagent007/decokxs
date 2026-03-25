package o;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yyN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class CallableC58281yyN<T> extends AbstractC58185ywX<T> implements Callable<T> {
    public final Callable<? extends T> AEQbTJ;

    public CallableC58281yyN(Callable<? extends T> callable) {
        this.AEQbTJ = callable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.internal.subscriptions.DeferredScalarSubscription */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(interfaceC60097zve);
        interfaceC60097zve.onSubscribe(deferredScalarSubscription);
        try {
            deferredScalarSubscription.complete(C58297yyd.AEQbTJ((java.lang.Object) this.AEQbTJ.call(), "The callable returned a null value"));
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            if (deferredScalarSubscription.isCancelled()) {
                yBG.copydefault(th);
            } else {
                interfaceC60097zve.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
        return (T) C58297yyd.AEQbTJ((java.lang.Object) this.AEQbTJ.call(), "The callable returned a null value");
    }
}
