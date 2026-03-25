package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58368yzv<T, U> extends AbstractC58349yzc<T, U> {
    public final Callable<? extends U> AEQbTJ;
    public final InterfaceC58220yxF<? super U, ? super T> EZpvd;

    public C58368yzv(InterfaceC58255yxo<T> interfaceC58255yxo, Callable<? extends U> callable, InterfaceC58220yxF<? super U, ? super T> interfaceC58220yxF) {
        super(interfaceC58255yxo);
        this.AEQbTJ = callable;
        this.EZpvd = interfaceC58220yxF;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super U> interfaceC58256yxp) {
        try {
            this.OLrzqt.subscribe(new StateListAnimator(interfaceC58256yxp, C58297yyd.AEQbTJ(this.AEQbTJ.call(), "The initialSupplier returned a null value"), this.EZpvd));
        } catch (java.lang.Throwable th) {
            EmptyDisposable.error(th, interfaceC58256yxp);
        }
    }

    /* JADX INFO: renamed from: o.yzv$StateListAnimator */
    public static final class StateListAnimator<T, U> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final U EZpvd;
        public final InterfaceC58220yxF<? super U, ? super T> KWHzl;
        public final InterfaceC58256yxp<? super U> OLrzqt;
        public boolean copydefault;

        public StateListAnimator(InterfaceC58256yxp<? super U> interfaceC58256yxp, U u, InterfaceC58220yxF<? super U, ? super T> interfaceC58220yxF) {
            this.OLrzqt = interfaceC58256yxp;
            this.KWHzl = interfaceC58220yxF;
            this.EZpvd = u;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
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
            if (this.copydefault) {
                return;
            }
            try {
                this.KWHzl.copydefault(this.EZpvd, t);
            } catch (java.lang.Throwable th) {
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
            this.OLrzqt.onNext(this.EZpvd);
            this.OLrzqt.onComplete();
        }
    }
}
