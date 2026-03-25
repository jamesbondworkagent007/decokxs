package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes13.dex */
public final class yBT<T> implements InterfaceC58186ywY<T>, InterfaceC60094zvb {
    public final boolean AEQbTJ;
    public InterfaceC60094zvb AhwBna;
    public volatile boolean EZpvd;
    public boolean KWHzl;
    public final InterfaceC60097zve<? super T> OLrzqt;
    public C56338yBr<java.lang.Object> copydefault;

    public yBT(InterfaceC60097zve<? super T> interfaceC60097zve) {
        this(interfaceC60097zve, false);
    }

    public yBT(InterfaceC60097zve<? super T> interfaceC60097zve, boolean z) {
        this.OLrzqt = interfaceC60097zve;
        this.AEQbTJ = z;
    }

    @Override // o.InterfaceC58186ywY, o.InterfaceC60097zve
    public void onSubscribe(InterfaceC60094zvb interfaceC60094zvb) {
        if (SubscriptionHelper.validate(this.AhwBna, interfaceC60094zvb)) {
            this.AhwBna = interfaceC60094zvb;
            this.OLrzqt.onSubscribe(this);
        }
    }

    @Override // o.InterfaceC60097zve
    public void onNext(T t) {
        if (this.EZpvd) {
            return;
        }
        if (t == null) {
            this.AhwBna.cancel();
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.EZpvd) {
                return;
            }
            if (this.KWHzl) {
                C56338yBr<java.lang.Object> c56338yBr = this.copydefault;
                if (c56338yBr == null) {
                    c56338yBr = new C56338yBr<>(4);
                    this.copydefault = c56338yBr;
                }
                c56338yBr.copydefault(NotificationLite.next(t));
                return;
            }
            this.KWHzl = true;
            this.OLrzqt.onNext(t);
            copydefault();
        }
    }

    @Override // o.InterfaceC60097zve
    public void onError(java.lang.Throwable th) {
        if (this.EZpvd) {
            yBG.copydefault(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.EZpvd) {
                if (this.KWHzl) {
                    this.EZpvd = true;
                    C56338yBr<java.lang.Object> c56338yBr = this.copydefault;
                    if (c56338yBr == null) {
                        c56338yBr = new C56338yBr<>(4);
                        this.copydefault = c56338yBr;
                    }
                    java.lang.Object objError = NotificationLite.error(th);
                    if (this.AEQbTJ) {
                        c56338yBr.copydefault(objError);
                    } else {
                        c56338yBr.KWHzl(objError);
                    }
                    return;
                }
                this.EZpvd = true;
                this.KWHzl = true;
                z = false;
            }
            if (z) {
                yBG.copydefault(th);
            } else {
                this.OLrzqt.onError(th);
            }
        }
    }

    @Override // o.InterfaceC60097zve
    public void onComplete() {
        if (this.EZpvd) {
            return;
        }
        synchronized (this) {
            if (this.EZpvd) {
                return;
            }
            if (this.KWHzl) {
                C56338yBr<java.lang.Object> c56338yBr = this.copydefault;
                if (c56338yBr == null) {
                    c56338yBr = new C56338yBr<>(4);
                    this.copydefault = c56338yBr;
                }
                c56338yBr.copydefault(NotificationLite.complete());
                return;
            }
            this.EZpvd = true;
            this.KWHzl = true;
            this.OLrzqt.onComplete();
        }
    }

    public void copydefault() {
        C56338yBr<java.lang.Object> c56338yBr;
        do {
            synchronized (this) {
                c56338yBr = this.copydefault;
                if (c56338yBr == null) {
                    this.KWHzl = false;
                    return;
                }
                this.copydefault = null;
            }
        } while (!c56338yBr.EZpvd(this.OLrzqt));
    }

    @Override // o.InterfaceC60094zvb
    public void request(long j) {
        this.AhwBna.request(j);
    }

    @Override // o.InterfaceC60094zvb
    public void cancel() {
        this.AhwBna.cancel();
    }
}
