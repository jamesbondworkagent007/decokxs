package o;

import io.reactivex.internal.util.NotificationLite;
import o.C56338yBr;

/* JADX INFO: loaded from: classes17.dex */
public final class yBQ<T> extends yBU<T> implements C56338yBr.Application<java.lang.Object> {
    public final yBU<T> AEQbTJ;
    public volatile boolean EZpvd;
    public boolean OLrzqt;
    public C56338yBr<java.lang.Object> copydefault;

    public yBQ(yBU<T> ybu) {
        this.AEQbTJ = ybu;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.AEQbTJ.subscribe(interfaceC58256yxp);
    }

    @Override // o.InterfaceC58256yxp
    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        if (!this.EZpvd) {
            synchronized (this) {
                boolean z = true;
                if (!this.EZpvd) {
                    if (this.OLrzqt) {
                        C56338yBr<java.lang.Object> c56338yBr = this.copydefault;
                        if (c56338yBr == null) {
                            c56338yBr = new C56338yBr<>(4);
                            this.copydefault = c56338yBr;
                        }
                        c56338yBr.copydefault(NotificationLite.disposable(interfaceC58217yxC));
                        return;
                    }
                    this.OLrzqt = true;
                    z = false;
                }
                if (!z) {
                    this.AEQbTJ.onSubscribe(interfaceC58217yxC);
                    KWHzl();
                    return;
                }
            }
        }
        interfaceC58217yxC.dispose();
    }

    @Override // o.InterfaceC58256yxp
    public void onNext(T t) {
        if (this.EZpvd) {
            return;
        }
        synchronized (this) {
            if (this.EZpvd) {
                return;
            }
            if (this.OLrzqt) {
                C56338yBr<java.lang.Object> c56338yBr = this.copydefault;
                if (c56338yBr == null) {
                    c56338yBr = new C56338yBr<>(4);
                    this.copydefault = c56338yBr;
                }
                c56338yBr.copydefault(NotificationLite.next(t));
                return;
            }
            this.OLrzqt = true;
            this.AEQbTJ.onNext(t);
            KWHzl();
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onError(java.lang.Throwable th) {
        if (this.EZpvd) {
            yBG.copydefault(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.EZpvd) {
                this.EZpvd = true;
                if (this.OLrzqt) {
                    C56338yBr<java.lang.Object> c56338yBr = this.copydefault;
                    if (c56338yBr == null) {
                        c56338yBr = new C56338yBr<>(4);
                        this.copydefault = c56338yBr;
                    }
                    c56338yBr.KWHzl(NotificationLite.error(th));
                    return;
                }
                this.OLrzqt = true;
                z = false;
            }
            if (z) {
                yBG.copydefault(th);
            } else {
                this.AEQbTJ.onError(th);
            }
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onComplete() {
        if (this.EZpvd) {
            return;
        }
        synchronized (this) {
            if (this.EZpvd) {
                return;
            }
            this.EZpvd = true;
            if (this.OLrzqt) {
                C56338yBr<java.lang.Object> c56338yBr = this.copydefault;
                if (c56338yBr == null) {
                    c56338yBr = new C56338yBr<>(4);
                    this.copydefault = c56338yBr;
                }
                c56338yBr.copydefault(NotificationLite.complete());
                return;
            }
            this.OLrzqt = true;
            this.AEQbTJ.onComplete();
        }
    }

    public void KWHzl() {
        C56338yBr<java.lang.Object> c56338yBr;
        while (true) {
            synchronized (this) {
                c56338yBr = this.copydefault;
                if (c56338yBr == null) {
                    this.OLrzqt = false;
                    return;
                }
                this.copydefault = null;
            }
            c56338yBr.EZpvd(this);
        }
    }

    @Override // o.C56338yBr.Application, o.InterfaceC58239yxY
    public boolean test(java.lang.Object obj) {
        return NotificationLite.acceptFull(obj, this.AEQbTJ);
    }
}
