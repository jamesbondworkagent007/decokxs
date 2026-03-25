package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yBS<T> implements InterfaceC58186ywY<T>, InterfaceC58217yxC {
    public final AtomicReference<InterfaceC60094zvb> valueOf = new AtomicReference<>();

    @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
    public final void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
        if (C56337yBq.KWHzl(this.valueOf, interfaceC60094zvb, getClass())) {
            OLrzqt();
        }
    }

    public void OLrzqt() {
        this.valueOf.get().request(Long.MAX_VALUE);
    }

    public final void OLrzqt(long j) {
        this.valueOf.get().request(j);
    }

    public final void copydefault() {
        dispose();
    }

    @Override // o.InterfaceC58217yxC
    public final boolean isDisposed() {
        return this.valueOf.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // o.InterfaceC58217yxC
    public final void dispose() {
        SubscriptionHelper.cancel(this.valueOf);
    }
}
