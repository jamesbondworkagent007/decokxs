package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58336yzP<T, R> extends AbstractC58349yzc<T, R> {
    public final InterfaceC58229yxO<? super T, ? extends java.lang.Iterable<? extends R>> EZpvd;

    public C58336yzP(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends java.lang.Iterable<? extends R>> interfaceC58229yxO) {
        super(interfaceC58255yxo);
        this.EZpvd = interfaceC58229yxO;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super R> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new StateListAnimator(interfaceC58256yxp, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yzP$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T, R> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC58256yxp<? super R> EZpvd;
        public final InterfaceC58229yxO<? super T, ? extends java.lang.Iterable<? extends R>> OLrzqt;

        public StateListAnimator(InterfaceC58256yxp<? super R> interfaceC58256yxp, InterfaceC58229yxO<? super T, ? extends java.lang.Iterable<? extends R>> interfaceC58229yxO) {
            this.EZpvd = interfaceC58256yxp;
            this.OLrzqt = interfaceC58229yxO;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.AEQbTJ == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                java.util.Iterator<? extends R> it = this.OLrzqt.apply(t).iterator();
                InterfaceC58256yxp<? super R> interfaceC58256yxp = this.EZpvd;
                while (it.hasNext()) {
                    try {
                        try {
                            interfaceC58256yxp.onNext((java.lang.Object) C58297yyd.AEQbTJ(it.next(), "The iterator returned a null value"));
                        } catch (java.lang.Throwable th) {
                            C58218yxD.AEQbTJ(th);
                            this.AEQbTJ.dispose();
                            onError(th);
                            return;
                        }
                    } catch (java.lang.Throwable th2) {
                        C58218yxD.AEQbTJ(th2);
                        this.AEQbTJ.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (java.lang.Throwable th3) {
                C58218yxD.AEQbTJ(th3);
                this.AEQbTJ.dispose();
                onError(th3);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (interfaceC58217yxC == disposableHelper) {
                yBG.copydefault(th);
            } else {
                this.AEQbTJ = disposableHelper;
                this.EZpvd.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (interfaceC58217yxC == disposableHelper) {
                return;
            }
            this.AEQbTJ = disposableHelper;
            this.EZpvd.onComplete();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ.isDisposed();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ.dispose();
            this.AEQbTJ = DisposableHelper.DISPOSED;
        }
    }
}
