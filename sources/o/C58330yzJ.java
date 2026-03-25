package o;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: renamed from: o.yzJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58330yzJ extends AbstractC58247yxg<java.lang.Object> implements InterfaceCallableC58300yyg<java.lang.Object> {
    public static final AbstractC58247yxg<java.lang.Object> EZpvd = new C58330yzJ();

    @Override // o.InterfaceCallableC58300yyg, java.util.concurrent.Callable
    public java.lang.Object call() {
        return null;
    }

    private C58330yzJ() {
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super java.lang.Object> interfaceC58256yxp) {
        EmptyDisposable.complete(interfaceC58256yxp);
    }
}
