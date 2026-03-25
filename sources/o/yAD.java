package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes17.dex */
public final class yAD<T> extends AbstractC58349yzc<T, yBO<T>> {
    public final AbstractC58253yxm AEQbTJ;
    public final java.util.concurrent.TimeUnit copydefault;

    public yAD(InterfaceC58255yxo<T> interfaceC58255yxo, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
        super(interfaceC58255yxo);
        this.AEQbTJ = abstractC58253yxm;
        this.copydefault = timeUnit;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super yBO<T>> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new StateListAnimator(interfaceC58256yxp, this.copydefault, this.AEQbTJ));
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public long AEQbTJ;
        public final AbstractC58253yxm EZpvd;
        public final java.util.concurrent.TimeUnit KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public final InterfaceC58256yxp<? super yBO<T>> copydefault;

        public StateListAnimator(InterfaceC58256yxp<? super yBO<T>> interfaceC58256yxp, java.util.concurrent.TimeUnit timeUnit, AbstractC58253yxm abstractC58253yxm) {
            this.copydefault = interfaceC58256yxp;
            this.EZpvd = abstractC58253yxm;
            this.KWHzl = timeUnit;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.AEQbTJ = this.EZpvd.now(this.KWHzl);
                this.copydefault.onSubscribe(this);
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
            long jNow = this.EZpvd.now(this.KWHzl);
            long j = this.AEQbTJ;
            this.AEQbTJ = jNow;
            this.copydefault.onNext(new yBO(t, jNow - j, this.KWHzl));
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.copydefault.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.copydefault.onComplete();
        }
    }
}
