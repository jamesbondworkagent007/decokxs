package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes17.dex */
public final class yBF<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
    public final InterfaceC58256yxp<? super T> KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public boolean copydefault;

    public yBF(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.KWHzl = interfaceC58256yxp;
    }

    @Override // o.InterfaceC58256yxp
    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
            this.OLrzqt = interfaceC58217yxC;
            try {
                this.KWHzl.onSubscribe(this);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.copydefault = true;
                try {
                    interfaceC58217yxC.dispose();
                    yBG.copydefault(th);
                } catch (java.lang.Throwable th2) {
                    C58218yxD.AEQbTJ(th2);
                    yBG.copydefault(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // o.InterfaceC58217yxC
    public void dispose() {
        this.OLrzqt.dispose();
    }

    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return this.OLrzqt.isDisposed();
    }

    @Override // o.InterfaceC58256yxp
    public void onNext(T t) {
        if (this.copydefault) {
            return;
        }
        if (this.OLrzqt == null) {
            EZpvd();
            return;
        }
        if (t == null) {
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.OLrzqt.dispose();
                onError(nullPointerException);
                return;
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                onError(new CompositeException(nullPointerException, th));
                return;
            }
        }
        try {
            this.KWHzl.onNext(t);
        } catch (java.lang.Throwable th2) {
            C58218yxD.AEQbTJ(th2);
            try {
                this.OLrzqt.dispose();
                onError(th2);
            } catch (java.lang.Throwable th3) {
                C58218yxD.AEQbTJ(th3);
                onError(new CompositeException(th2, th3));
            }
        }
    }

    public void EZpvd() {
        this.copydefault = true;
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
        try {
            this.KWHzl.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.KWHzl.onError(nullPointerException);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                yBG.copydefault(new CompositeException(nullPointerException, th));
            }
        } catch (java.lang.Throwable th2) {
            C58218yxD.AEQbTJ(th2);
            yBG.copydefault(new CompositeException(nullPointerException, th2));
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onError(java.lang.Throwable th) {
        if (this.copydefault) {
            yBG.copydefault(th);
            return;
        }
        this.copydefault = true;
        if (this.OLrzqt == null) {
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
            try {
                this.KWHzl.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    this.KWHzl.onError(new CompositeException(th, nullPointerException));
                    return;
                } catch (java.lang.Throwable th2) {
                    C58218yxD.AEQbTJ(th2);
                    yBG.copydefault(new CompositeException(th, nullPointerException, th2));
                    return;
                }
            } catch (java.lang.Throwable th3) {
                C58218yxD.AEQbTJ(th3);
                yBG.copydefault(new CompositeException(th, nullPointerException, th3));
                return;
            }
        }
        if (th == null) {
            th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.KWHzl.onError(th);
        } catch (java.lang.Throwable th4) {
            C58218yxD.AEQbTJ(th4);
            yBG.copydefault(new CompositeException(th, th4));
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onComplete() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        if (this.OLrzqt == null) {
            copydefault();
            return;
        }
        try {
            this.KWHzl.onComplete();
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            yBG.copydefault(th);
        }
    }

    public void copydefault() {
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
        try {
            this.KWHzl.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.KWHzl.onError(nullPointerException);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                yBG.copydefault(new CompositeException(nullPointerException, th));
            }
        } catch (java.lang.Throwable th2) {
            C58218yxD.AEQbTJ(th2);
            yBG.copydefault(new CompositeException(nullPointerException, th2));
        }
    }
}
