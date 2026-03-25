package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes13.dex */
public final class yAH<T> extends AbstractC58260yxt<T> {
    public final Callable<? extends java.lang.Throwable> OLrzqt;

    public yAH(Callable<? extends java.lang.Throwable> callable) {
        this.OLrzqt = callable;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super T> interfaceC58258yxr) {
        try {
            th = (java.lang.Throwable) C58297yyd.AEQbTJ(this.OLrzqt.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (java.lang.Throwable th) {
            th = th;
            C58218yxD.AEQbTJ(th);
        }
        EmptyDisposable.error(th, interfaceC58258yxr);
    }
}
