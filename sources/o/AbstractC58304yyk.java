package o;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: o.yyk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC58304yyk<T> extends CountDownLatch implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
    public java.lang.Throwable AEQbTJ;
    public InterfaceC58217yxC EZpvd;
    public volatile boolean KWHzl;
    public T OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC58217yxC
    public final boolean isDisposed() {
        return this.KWHzl;
    }

    public AbstractC58304yyk() {
        super(1);
    }

    @Override // o.InterfaceC58256yxp
    public final void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        this.EZpvd = interfaceC58217yxC;
        if (this.KWHzl) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC58256yxp
    public final void onComplete() {
        countDown();
    }

    @Override // o.InterfaceC58217yxC
    public final void dispose() {
        this.KWHzl = true;
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final T KWHzl() {
        if (getCount() != 0) {
            try {
                C56336yBp.EZpvd();
                await();
            } catch (java.lang.InterruptedException e) {
                dispose();
                throw ExceptionHelper.AEQbTJ(e);
            }
        }
        java.lang.Throwable th = this.AEQbTJ;
        if (th == null) {
            return this.OLrzqt;
        }
        throw ExceptionHelper.AEQbTJ(th);
    }
}
