package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.yBy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC56345yBy<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
    public final AtomicReference<InterfaceC58217yxC> valueOf = new AtomicReference<>();

    public void AEQbTJ() {
    }

    @Override // o.InterfaceC58256yxp
    public final void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        if (C56337yBq.EZpvd(this.valueOf, interfaceC58217yxC, getClass())) {
            AEQbTJ();
        }
    }

    @Override // o.InterfaceC58217yxC
    public final boolean isDisposed() {
        return this.valueOf.get() == DisposableHelper.DISPOSED;
    }

    @Override // o.InterfaceC58217yxC
    public final void dispose() {
        DisposableHelper.dispose(this.valueOf);
    }
}
