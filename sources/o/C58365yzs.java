package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yzs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58365yzs<T, U> extends AbstractC58260yxt<U> implements InterfaceC58240yxZ<U> {
    public final InterfaceC58220yxF<? super U, ? super T> EZpvd;
    public final Callable<? extends U> KWHzl;
    public final InterfaceC58255yxo<T> copydefault;

    public C58365yzs(InterfaceC58255yxo<T> interfaceC58255yxo, Callable<? extends U> callable, InterfaceC58220yxF<? super U, ? super T> interfaceC58220yxF) {
        this.copydefault = interfaceC58255yxo;
        this.KWHzl = callable;
        this.EZpvd = interfaceC58220yxF;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super U> interfaceC58258yxr) {
        try {
            this.copydefault.subscribe(new StateListAnimator(interfaceC58258yxr, C58297yyd.AEQbTJ(this.KWHzl.call(), "The initialSupplier returned a null value"), this.EZpvd));
        } catch (java.lang.Throwable th) {
            EmptyDisposable.error(th, interfaceC58258yxr);
        }
    }

    @Override // o.InterfaceC58240yxZ
    public AbstractC58247yxg<U> copydefault() {
        return yBG.EZpvd(new C58368yzv(this.copydefault, this.KWHzl, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yzs$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T, U> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public boolean AEQbTJ;
        public final InterfaceC58258yxr<? super U> EZpvd;
        public final InterfaceC58220yxF<? super U, ? super T> KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public final U copydefault;

        public StateListAnimator(InterfaceC58258yxr<? super U> interfaceC58258yxr, U u, InterfaceC58220yxF<? super U, ? super T> interfaceC58220yxF) {
            this.EZpvd = interfaceC58258yxr;
            this.KWHzl = interfaceC58220yxF;
            this.copydefault = u;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
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
            if (this.AEQbTJ) {
                return;
            }
            try {
                this.KWHzl.copydefault(this.copydefault, t);
            } catch (java.lang.Throwable th) {
                this.OLrzqt.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.AEQbTJ) {
                yBG.copydefault(th);
            } else {
                this.AEQbTJ = true;
                this.EZpvd.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.AEQbTJ) {
                return;
            }
            this.AEQbTJ = true;
            this.EZpvd.onSuccess(this.copydefault);
        }
    }
}
