package o;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class CallableC58351yze<T> extends AbstractC58245yxe<T> implements Callable<T> {
    public final Callable<? extends T> copydefault;

    public CallableC58351yze(Callable<? extends T> callable) {
        this.copydefault = callable;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        InterfaceC58217yxC interfaceC58217yxCCopydefault = C58215yxA.copydefault();
        interfaceC58242yxb.onSubscribe(interfaceC58217yxCCopydefault);
        if (interfaceC58217yxCCopydefault.isDisposed()) {
            return;
        }
        try {
            T tCall = this.copydefault.call();
            if (interfaceC58217yxCCopydefault.isDisposed()) {
                return;
            }
            if (tCall == null) {
                interfaceC58242yxb.onComplete();
            } else {
                interfaceC58242yxb.onSuccess(tCall);
            }
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            if (!interfaceC58217yxCCopydefault.isDisposed()) {
                interfaceC58242yxb.onError(th);
            } else {
                yBG.copydefault(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws java.lang.Exception {
        return this.copydefault.call();
    }
}
