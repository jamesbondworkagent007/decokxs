package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58363yzq<T> extends AbstractC58349yzc<T, java.lang.Boolean> {
    public final InterfaceC58239yxY<? super T> EZpvd;

    public C58363yzq(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        super(interfaceC58255yxo);
        this.EZpvd = interfaceC58239yxY;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super java.lang.Boolean> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new StateListAnimator(interfaceC58256yxp, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yzq$StateListAnimator */
    public static final class StateListAnimator<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC58239yxY<? super T> EZpvd;
        public final InterfaceC58256yxp<? super java.lang.Boolean> OLrzqt;
        public boolean copydefault;

        public StateListAnimator(InterfaceC58256yxp<? super java.lang.Boolean> interfaceC58256yxp, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.OLrzqt = interfaceC58256yxp;
            this.EZpvd = interfaceC58239yxY;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.copydefault) {
                return;
            }
            try {
                if (this.EZpvd.test(t)) {
                    this.copydefault = true;
                    this.AEQbTJ.dispose();
                    this.OLrzqt.onNext(java.lang.Boolean.TRUE);
                    this.OLrzqt.onComplete();
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.AEQbTJ.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.copydefault) {
                yBG.copydefault(th);
            } else {
                this.copydefault = true;
                this.OLrzqt.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            this.OLrzqt.onNext(java.lang.Boolean.FALSE);
            this.OLrzqt.onComplete();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ.isDisposed();
        }
    }
}
