package o;

import io.reactivex.internal.operators.observable.ObservableScalarXMap;

/* JADX INFO: renamed from: o.yzX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58344yzX<T> extends AbstractC58247yxg<T> implements InterfaceCallableC58300yyg<T> {
    public final T EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceCallableC58300yyg, java.util.concurrent.Callable
    public T call() {
        return this.EZpvd;
    }

    public C58344yzX(T t) {
        this.EZpvd = t;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(interfaceC58256yxp, this.EZpvd);
        interfaceC58256yxp.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }
}
