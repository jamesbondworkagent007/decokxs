package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56306yAm<T, R> extends AbstractC58349yzc<T, R> {
    public final Callable<R> AEQbTJ;
    public final InterfaceC58223yxI<R, ? super T, R> KWHzl;

    public C56306yAm(InterfaceC58255yxo<T> interfaceC58255yxo, Callable<R> callable, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI) {
        super(interfaceC58255yxo);
        this.KWHzl = interfaceC58223yxI;
        this.AEQbTJ = callable;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super R> interfaceC58256yxp) {
        try {
            this.OLrzqt.subscribe(new Application(interfaceC58256yxp, this.KWHzl, C58297yyd.AEQbTJ(this.AEQbTJ.call(), "The seed supplied is null")));
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            EmptyDisposable.error(th, interfaceC58256yxp);
        }
    }

    /* JADX INFO: renamed from: o.yAm$Application */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application<T, R> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public R EZpvd;
        public boolean KWHzl;
        public final InterfaceC58223yxI<R, ? super T, R> OLrzqt;
        public final InterfaceC58256yxp<? super R> copydefault;

        public Application(InterfaceC58256yxp<? super R> interfaceC58256yxp, InterfaceC58223yxI<R, ? super T, R> interfaceC58223yxI, R r) {
            this.copydefault = interfaceC58256yxp;
            this.OLrzqt = interfaceC58223yxI;
            this.EZpvd = r;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.copydefault.onSubscribe(this);
                this.copydefault.onNext(this.EZpvd);
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
            if (this.KWHzl) {
                return;
            }
            try {
                R r = (R) C58297yyd.AEQbTJ(this.OLrzqt.apply(this.EZpvd, t), "The accumulator returned a null value");
                this.EZpvd = r;
                this.copydefault.onNext(r);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.AEQbTJ.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.KWHzl) {
                yBG.copydefault(th);
            } else {
                this.KWHzl = true;
                this.copydefault.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.copydefault.onComplete();
        }
    }
}
