package o;

/* JADX INFO: renamed from: o.yzf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58352yzf<T> extends AbstractC58245yxe<T> implements InterfaceCallableC58300yyg<T> {
    public final T AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceCallableC58300yyg, java.util.concurrent.Callable
    public T call() {
        return this.AEQbTJ;
    }

    public C58352yzf(T t) {
        this.AEQbTJ = t;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        interfaceC58242yxb.onSubscribe(C58215yxA.EZpvd());
        interfaceC58242yxb.onSuccess(this.AEQbTJ);
    }
}
