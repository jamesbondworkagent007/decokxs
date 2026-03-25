package o;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yyE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58272yyE<T> extends AbstractC58185ywX<T> {
    public final Callable<? extends InterfaceC60096zvd<? extends T>> OLrzqt;

    public C58272yyE(Callable<? extends InterfaceC60096zvd<? extends T>> callable) {
        this.OLrzqt = callable;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        try {
            ((InterfaceC60096zvd) C58297yyd.AEQbTJ(this.OLrzqt.call(), "The publisher supplied is null")).subscribe(interfaceC60097zve);
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptySubscription.error(th, interfaceC60097zve);
        }
    }
}
