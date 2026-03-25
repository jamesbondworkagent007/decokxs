package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes13.dex */
public final class yBE<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
    public C56338yBr<java.lang.Object> AEQbTJ;
    public volatile boolean EZpvd;
    public final InterfaceC58256yxp<? super T> KWHzl;
    public final boolean OLrzqt;
    public boolean copydefault;
    public InterfaceC58217yxC djBIcL;

    public yBE(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this(interfaceC58256yxp, false);
    }

    public yBE(InterfaceC58256yxp<? super T> interfaceC58256yxp, boolean z) {
        this.KWHzl = interfaceC58256yxp;
        this.OLrzqt = z;
    }

    @Override // o.InterfaceC58256yxp
    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        if (DisposableHelper.validate(this.djBIcL, interfaceC58217yxC)) {
            this.djBIcL = interfaceC58217yxC;
            this.KWHzl.onSubscribe(this);
        }
    }

    @Override // o.InterfaceC58217yxC
    public void dispose() {
        this.djBIcL.dispose();
    }

    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return this.djBIcL.isDisposed();
    }

    @Override // o.InterfaceC58256yxp
    public void onNext(T t) {
        if (this.EZpvd) {
            return;
        }
        if (t == null) {
            this.djBIcL.dispose();
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.EZpvd) {
                return;
            }
            if (this.copydefault) {
                C56338yBr<java.lang.Object> c56338yBr = this.AEQbTJ;
                if (c56338yBr == null) {
                    c56338yBr = new C56338yBr<>(4);
                    this.AEQbTJ = c56338yBr;
                }
                c56338yBr.copydefault(NotificationLite.next(t));
                return;
            }
            this.copydefault = true;
            this.KWHzl.onNext(t);
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
                if (this.copydefault) {
                    this.EZpvd = true;
                    C56338yBr<java.lang.Object> c56338yBr = this.AEQbTJ;
                    if (c56338yBr == null) {
                        c56338yBr = new C56338yBr<>(4);
                        this.AEQbTJ = c56338yBr;
                    }
                    java.lang.Object objError = NotificationLite.error(th);
                    if (this.OLrzqt) {
                        c56338yBr.copydefault(objError);
                    } else {
                        c56338yBr.KWHzl(objError);
                    }
                    return;
                }
                this.EZpvd = true;
                this.copydefault = true;
                z = false;
            }
            if (z) {
                yBG.copydefault(th);
            } else {
                this.KWHzl.onError(th);
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
            if (this.copydefault) {
                C56338yBr<java.lang.Object> c56338yBr = this.AEQbTJ;
                if (c56338yBr == null) {
                    c56338yBr = new C56338yBr<>(4);
                    this.AEQbTJ = c56338yBr;
                }
                c56338yBr.copydefault(NotificationLite.complete());
                return;
            }
            this.EZpvd = true;
            this.copydefault = true;
            this.KWHzl.onComplete();
        }
    }

    public void KWHzl() {
        C56338yBr<java.lang.Object> c56338yBr;
        do {
            synchronized (this) {
                c56338yBr = this.AEQbTJ;
                if (c56338yBr == null) {
                    this.copydefault = false;
                    return;
                }
                this.AEQbTJ = null;
            }
        } while (!c56338yBr.OLrzqt(this.KWHzl));
    }
}
