package o;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes13.dex */
public final class yBL<T> extends yBC<T> {
    public volatile boolean AEQbTJ;
    public boolean EZpvd;
    public C56338yBr<java.lang.Object> OLrzqt;
    public final yBC<T> copydefault;

    public yBL(yBC<T> ybc) {
        this.copydefault = ybc;
    }

    @Override // o.AbstractC58185ywX
    public void AEQbTJ(InterfaceC60097zve<? super T> interfaceC60097zve) {
        this.copydefault.subscribe(interfaceC60097zve);
    }

    @Override // o.InterfaceC60097zve
    public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
        if (!this.AEQbTJ) {
            synchronized (this) {
                boolean z = true;
                if (!this.AEQbTJ) {
                    if (this.EZpvd) {
                        C56338yBr<java.lang.Object> c56338yBr = this.OLrzqt;
                        if (c56338yBr == null) {
                            c56338yBr = new C56338yBr<>(4);
                            this.OLrzqt = c56338yBr;
                        }
                        c56338yBr.copydefault(NotificationLite.subscription(interfaceC60094zvb));
                        return;
                    }
                    this.EZpvd = true;
                    z = false;
                }
                if (!z) {
                    this.copydefault.onSubscribe(interfaceC60094zvb);
                    isConnected();
                    return;
                }
            }
        }
        interfaceC60094zvb.cancel();
    }

    @Override // o.InterfaceC60097zve
    public void onNext(T t) {
        if (this.AEQbTJ) {
            return;
        }
        synchronized (this) {
            if (this.AEQbTJ) {
                return;
            }
            if (this.EZpvd) {
                C56338yBr<java.lang.Object> c56338yBr = this.OLrzqt;
                if (c56338yBr == null) {
                    c56338yBr = new C56338yBr<>(4);
                    this.OLrzqt = c56338yBr;
                }
                c56338yBr.copydefault(NotificationLite.next(t));
                return;
            }
            this.EZpvd = true;
            this.copydefault.onNext(t);
            isConnected();
        }
    }

    @Override // o.InterfaceC60097zve
    public void onError(java.lang.Throwable th) {
        if (this.AEQbTJ) {
            yBG.copydefault(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.AEQbTJ) {
                this.AEQbTJ = true;
                if (this.EZpvd) {
                    C56338yBr<java.lang.Object> c56338yBr = this.OLrzqt;
                    if (c56338yBr == null) {
                        c56338yBr = new C56338yBr<>(4);
                        this.OLrzqt = c56338yBr;
                    }
                    c56338yBr.KWHzl(NotificationLite.error(th));
                    return;
                }
                this.EZpvd = true;
                z = false;
            }
            if (z) {
                yBG.copydefault(th);
            } else {
                this.copydefault.onError(th);
            }
        }
    }

    @Override // o.InterfaceC60097zve
    public void onComplete() {
        if (this.AEQbTJ) {
            return;
        }
        synchronized (this) {
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            if (this.EZpvd) {
                C56338yBr<java.lang.Object> c56338yBr = this.OLrzqt;
                if (c56338yBr == null) {
                    c56338yBr = new C56338yBr<>(4);
                    this.OLrzqt = c56338yBr;
                }
                c56338yBr.copydefault(NotificationLite.complete());
                return;
            }
            this.EZpvd = true;
            this.copydefault.onComplete();
        }
    }

    public void isConnected() {
        C56338yBr<java.lang.Object> c56338yBr;
        while (true) {
            synchronized (this) {
                c56338yBr = this.OLrzqt;
                if (c56338yBr == null) {
                    this.EZpvd = false;
                    return;
                }
                this.OLrzqt = null;
            }
            c56338yBr.EZpvd(this.copydefault);
        }
    }
}
