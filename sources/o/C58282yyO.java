package o;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yyO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58282yyO<T> extends AbstractC58185ywX<T> {
    public final Callable<? extends java.lang.Throwable> AEQbTJ;

    public C58282yyO(Callable<? extends java.lang.Throwable> callable) {
        this.AEQbTJ = callable;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        try {
            th = (java.lang.Throwable) C58297yyd.AEQbTJ(this.AEQbTJ.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (java.lang.Throwable th) {
            th = th;
            C58218yxD.AEQbTJ(th);
        }
        EmptySubscription.error(th, interfaceC60097zve);
    }
}
