package o;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: o.yyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58308yyo<T> extends CountDownLatch implements InterfaceC58258yxr<T>, InterfaceC58179ywR, InterfaceC58242yxb<T> {
    public volatile boolean EZpvd;
    public java.lang.Throwable KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public T copydefault;

    public C58308yyo() {
        super(1);
    }

    public void EZpvd() {
        this.EZpvd = true;
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC58258yxr
    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        this.OLrzqt = interfaceC58217yxC;
        if (this.EZpvd) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC58258yxr
    public void onSuccess(T t) {
        this.copydefault = t;
        countDown();
    }

    @Override // o.InterfaceC58258yxr
    public void onError(java.lang.Throwable th) {
        this.KWHzl = th;
        countDown();
    }

    @Override // o.InterfaceC58179ywR
    public void onComplete() {
        countDown();
    }

    public T KWHzl() {
        if (getCount() != 0) {
            try {
                C56336yBp.EZpvd();
                await();
            } catch (java.lang.InterruptedException e) {
                EZpvd();
                throw ExceptionHelper.AEQbTJ(e);
            }
        }
        java.lang.Throwable th = this.KWHzl;
        if (th == null) {
            return this.copydefault;
        }
        throw ExceptionHelper.AEQbTJ(th);
    }
}
