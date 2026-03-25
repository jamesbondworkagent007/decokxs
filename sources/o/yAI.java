package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes17.dex */
public final class yAI<T, U, V> extends AbstractC58247yxg<V> {
    public final AbstractC58247yxg<? extends T> AEQbTJ;
    public final java.lang.Iterable<U> KWHzl;
    public final InterfaceC58223yxI<? super T, ? super U, ? extends V> copydefault;

    public yAI(AbstractC58247yxg<? extends T> abstractC58247yxg, java.lang.Iterable<U> iterable, InterfaceC58223yxI<? super T, ? super U, ? extends V> interfaceC58223yxI) {
        this.AEQbTJ = abstractC58247yxg;
        this.KWHzl = iterable;
        this.copydefault = interfaceC58223yxI;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super V> interfaceC58256yxp) {
        try {
            java.util.Iterator it = (java.util.Iterator) C58297yyd.AEQbTJ(this.KWHzl.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(interfaceC58256yxp);
                } else {
                    this.AEQbTJ.subscribe(new StateListAnimator(interfaceC58256yxp, it, this.copydefault));
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                EmptyDisposable.error(th, interfaceC58256yxp);
            }
        } catch (java.lang.Throwable th2) {
            C58218yxD.AEQbTJ(th2);
            EmptyDisposable.error(th2, interfaceC58256yxp);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T, U, V> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC58223yxI<? super T, ? super U, ? extends V> EZpvd;
        public final InterfaceC58256yxp<? super V> KWHzl;
        public boolean OLrzqt;
        public final java.util.Iterator<U> copydefault;

        public StateListAnimator(InterfaceC58256yxp<? super V> interfaceC58256yxp, java.util.Iterator<U> it, InterfaceC58223yxI<? super T, ? super U, ? extends V> interfaceC58223yxI) {
            this.KWHzl = interfaceC58256yxp;
            this.copydefault = it;
            this.EZpvd = interfaceC58223yxI;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.KWHzl.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.OLrzqt) {
                return;
            }
            try {
                try {
                    this.KWHzl.onNext(C58297yyd.AEQbTJ(this.EZpvd.apply(t, C58297yyd.AEQbTJ(this.copydefault.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.copydefault.hasNext()) {
                            return;
                        }
                        this.OLrzqt = true;
                        this.AEQbTJ.dispose();
                        this.KWHzl.onComplete();
                    } catch (java.lang.Throwable th) {
                        C58218yxD.AEQbTJ(th);
                        copydefault(th);
                    }
                } catch (java.lang.Throwable th2) {
                    C58218yxD.AEQbTJ(th2);
                    copydefault(th2);
                }
            } catch (java.lang.Throwable th3) {
                C58218yxD.AEQbTJ(th3);
                copydefault(th3);
            }
        }

        public void copydefault(java.lang.Throwable th) {
            this.OLrzqt = true;
            this.AEQbTJ.dispose();
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.OLrzqt) {
                yBG.copydefault(th);
            } else {
                this.OLrzqt = true;
                this.KWHzl.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.OLrzqt) {
                return;
            }
            this.OLrzqt = true;
            this.KWHzl.onComplete();
        }
    }
}
