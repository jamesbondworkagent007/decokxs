package o;

import QfgSZK.AEQbTJ;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class yAF<T> extends AbstractC58260yxt<T> {
    public final Callable<? extends T> OLrzqt;

    public yAF(Callable<? extends T> callable) {
        this.OLrzqt = callable;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        InterfaceC58217yxC interfaceC58217yxCCopydefault = C58215yxA.copydefault();
        interfaceC58258yxr.onSubscribe(interfaceC58217yxCCopydefault);
        if (interfaceC58217yxCCopydefault.isDisposed()) {
            return;
        }
        try {
            AEQbTJ aEQbTJ = (java.lang.Object) C58297yyd.AEQbTJ((java.lang.Object) this.OLrzqt.call(), "The callable returned a null value");
            if (interfaceC58217yxCCopydefault.isDisposed()) {
                return;
            }
            interfaceC58258yxr.onSuccess(aEQbTJ);
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            if (!interfaceC58217yxCCopydefault.isDisposed()) {
                interfaceC58258yxr.onError(th);
            } else {
                yBG.copydefault(th);
            }
        }
    }
}
