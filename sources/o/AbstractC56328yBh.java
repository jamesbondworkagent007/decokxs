package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: o.yBh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56328yBh<T> extends CountDownLatch implements InterfaceC58186ywY<T> {
    public java.lang.Throwable AEQbTJ;
    public T EZpvd;
    public volatile boolean KWHzl;
    public InterfaceC60094zvb OLrzqt;

    public AbstractC56328yBh() {
        super(1);
    }

    @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
    public final void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
        if (SubscriptionHelper.validate(this.OLrzqt, interfaceC60094zvb)) {
            this.OLrzqt = interfaceC60094zvb;
            if (this.KWHzl) {
                return;
            }
            interfaceC60094zvb.request(Long.MAX_VALUE);
            if (this.KWHzl) {
                this.OLrzqt = SubscriptionHelper.CANCELLED;
                interfaceC60094zvb.cancel();
            }
        }
    }

    @Override // o.InterfaceC60097zve
    public final void onComplete() {
        countDown();
    }

    public final T OLrzqt() {
        if (getCount() != 0) {
            try {
                C56336yBp.EZpvd();
                await();
            } catch (java.lang.InterruptedException e) {
                InterfaceC60094zvb interfaceC60094zvb = this.OLrzqt;
                this.OLrzqt = SubscriptionHelper.CANCELLED;
                if (interfaceC60094zvb != null) {
                    interfaceC60094zvb.cancel();
                }
                throw ExceptionHelper.AEQbTJ(e);
            }
        }
        java.lang.Throwable th = this.AEQbTJ;
        if (th == null) {
            return this.EZpvd;
        }
        throw ExceptionHelper.AEQbTJ(th);
    }
}
