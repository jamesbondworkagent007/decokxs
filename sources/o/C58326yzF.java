package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58326yzF<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58227yxM<? super T> AEQbTJ;
    public final InterfaceC58222yxH EZpvd;
    public final InterfaceC58222yxH KWHzl;
    public final InterfaceC58227yxM<? super java.lang.Throwable> copydefault;

    public C58326yzF(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2) {
        super(interfaceC58255yxo);
        this.AEQbTJ = interfaceC58227yxM;
        this.copydefault = interfaceC58227yxM2;
        this.KWHzl = interfaceC58222yxH;
        this.EZpvd = interfaceC58222yxH2;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58256yxp, this.AEQbTJ, this.copydefault, this.KWHzl, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yzF$ActionBar */
    public static final class ActionBar<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58256yxp<? super T> AEQbTJ;
        public final InterfaceC58227yxM<? super T> AYXKKw;
        public final InterfaceC58222yxH EZpvd;
        public boolean KWHzl;
        public final InterfaceC58222yxH OLrzqt;
        public final InterfaceC58227yxM<? super java.lang.Throwable> copydefault;
        public InterfaceC58217yxC valueOf;

        public ActionBar(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2) {
            this.AEQbTJ = interfaceC58256yxp;
            this.AYXKKw = interfaceC58227yxM;
            this.copydefault = interfaceC58227yxM2;
            this.EZpvd = interfaceC58222yxH;
            this.OLrzqt = interfaceC58222yxH2;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.valueOf, interfaceC58217yxC)) {
                this.valueOf = interfaceC58217yxC;
                this.AEQbTJ.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.valueOf.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.valueOf.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.KWHzl) {
                return;
            }
            try {
                this.AYXKKw.accept(t);
                this.AEQbTJ.onNext(t);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.valueOf.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.KWHzl) {
                yBG.copydefault(th);
                return;
            }
            this.KWHzl = true;
            try {
                this.copydefault.accept(th);
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                th = new CompositeException(th, th2);
            }
            this.AEQbTJ.onError(th);
            try {
                this.OLrzqt.run();
            } catch (java.lang.Throwable th3) {
                C58218yxD.AEQbTJ(th3);
                yBG.copydefault(th3);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.KWHzl) {
                return;
            }
            try {
                this.EZpvd.run();
                this.KWHzl = true;
                this.AEQbTJ.onComplete();
                try {
                    this.OLrzqt.run();
                } catch (java.lang.Throwable th) {
                    C58218yxD.AEQbTJ(th);
                    yBG.copydefault(th);
                }
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                onError(th2);
            }
        }
    }
}
