package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58371yzy<T> extends AbstractC58247yxg<T> {
    public final Callable<? extends InterfaceC58255yxo<? extends T>> copydefault;

    public C58371yzy(Callable<? extends InterfaceC58255yxo<? extends T>> callable) {
        this.copydefault = callable;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        try {
            ((InterfaceC58255yxo) C58297yyd.AEQbTJ(this.copydefault.call(), "null ObservableSource supplied")).subscribe(interfaceC58256yxp);
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58256yxp);
        }
    }
}
