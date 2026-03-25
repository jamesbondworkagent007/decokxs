package o;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: renamed from: o.yAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56299yAf extends AbstractC58247yxg<java.lang.Object> {
    public static final AbstractC58247yxg<java.lang.Object> AEQbTJ = new C56299yAf();

    private C56299yAf() {
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super java.lang.Object> interfaceC58256yxp) {
        interfaceC58256yxp.onSubscribe(EmptyDisposable.NEVER);
    }
}
