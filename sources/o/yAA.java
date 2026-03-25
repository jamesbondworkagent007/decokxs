package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes17.dex */
public final class yAA<T, U extends java.util.Collection<? super T>> extends AbstractC58260yxt<U> implements InterfaceC58240yxZ<U> {
    public final Callable<U> AEQbTJ;
    public final InterfaceC58255yxo<T> OLrzqt;

    public yAA(InterfaceC58255yxo<T> interfaceC58255yxo, int i) {
        this.OLrzqt = interfaceC58255yxo;
        this.AEQbTJ = Functions.copydefault(i);
    }

    public yAA(InterfaceC58255yxo<T> interfaceC58255yxo, Callable<U> callable) {
        this.OLrzqt = interfaceC58255yxo;
        this.AEQbTJ = callable;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super U> interfaceC58258yxr) {
        try {
            this.OLrzqt.subscribe(new Activity(interfaceC58258yxr, (java.util.Collection) C58297yyd.AEQbTJ(this.AEQbTJ.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58258yxr);
        }
    }

    @Override // o.InterfaceC58240yxZ
    public AbstractC58247yxg<U> copydefault() {
        return yBG.EZpvd(new yAB(this.OLrzqt, this.AEQbTJ));
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T, U extends java.util.Collection<? super T>> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC58258yxr<? super U> KWHzl;
        public U OLrzqt;

        public Activity(InterfaceC58258yxr<? super U> interfaceC58258yxr, U u) {
            this.KWHzl = interfaceC58258yxr;
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
            this.KWHzl.onSuccess(u);
        }
    }
}
