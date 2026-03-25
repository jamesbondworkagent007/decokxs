package o;

import io.reactivex.internal.subscriptions.ScalarSubscription;

/* JADX INFO: renamed from: o.yyW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58290yyW<T> extends AbstractC58185ywX<T> implements InterfaceCallableC58300yyg<T> {
    public final T OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceCallableC58300yyg, java.util.concurrent.Callable
    public T call() {
        return this.OLrzqt;
    }

    public C58290yyW(T t) {
        this.OLrzqt = t;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        interfaceC60097zve.onSubscribe(new ScalarSubscription(interfaceC60097zve, this.OLrzqt));
    }
}
