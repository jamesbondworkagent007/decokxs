package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes17.dex */
public final class yAB<T, U extends java.util.Collection<? super T>> extends AbstractC58349yzc<T, U> {
    public final Callable<U> KWHzl;

    public yAB(InterfaceC58255yxo<T> interfaceC58255yxo, int i) {
        super(interfaceC58255yxo);
        this.KWHzl = Functions.copydefault(i);
    }

    public yAB(InterfaceC58255yxo<T> interfaceC58255yxo, Callable<U> callable) {
        super(interfaceC58255yxo);
        this.KWHzl = callable;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super U> interfaceC58256yxp) {
        try {
            this.OLrzqt.subscribe(new Application(interfaceC58256yxp, (java.util.Collection) C58297yyd.AEQbTJ(this.KWHzl.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58256yxp);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application<T, U extends java.util.Collection<? super T>> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC58256yxp<? super U> KWHzl;
        public U OLrzqt;

        public Application(InterfaceC58256yxp<? super U> interfaceC58256yxp, U u) {
            this.KWHzl = interfaceC58256yxp;
            this.OLrzqt = u;
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
            this.OLrzqt.add(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.OLrzqt = null;
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            U u = this.OLrzqt;
            this.OLrzqt = null;
            this.KWHzl.onNext(u);
            this.KWHzl.onComplete();
        }
    }
}
