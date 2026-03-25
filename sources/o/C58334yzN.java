package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58334yzN<T> extends AbstractC58247yxg<T> {
    public final Callable<? extends java.lang.Throwable> AEQbTJ;

    public C58334yzN(Callable<? extends java.lang.Throwable> callable) {
        this.AEQbTJ = callable;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        try {
            th = (java.lang.Throwable) C58297yyd.AEQbTJ(this.AEQbTJ.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (java.lang.Throwable th) {
            th = th;
            C58218yxD.AEQbTJ(th);
        }
        EmptyDisposable.error(th, interfaceC58256yxp);
    }
}
