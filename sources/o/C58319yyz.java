package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: renamed from: o.yyz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58319yyz extends AbstractC58177ywP {
    public final InterfaceC58222yxH AEQbTJ;
    public final InterfaceC58180ywS AhwBna;
    public final InterfaceC58227yxM<? super java.lang.Throwable> EZpvd;
    public final InterfaceC58222yxH KWHzl;
    public final InterfaceC58227yxM<? super InterfaceC58217yxC> OLrzqt;
    public final InterfaceC58222yxH copydefault;
    public final InterfaceC58222yxH valueOf;

    public C58319yyz(InterfaceC58180ywS interfaceC58180ywS, InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH, InterfaceC58222yxH interfaceC58222yxH2, InterfaceC58222yxH interfaceC58222yxH3, InterfaceC58222yxH interfaceC58222yxH4) {
        this.AhwBna = interfaceC58180ywS;
        this.OLrzqt = interfaceC58227yxM;
        this.EZpvd = interfaceC58227yxM2;
        this.copydefault = interfaceC58222yxH;
        this.valueOf = interfaceC58222yxH2;
        this.AEQbTJ = interfaceC58222yxH3;
        this.KWHzl = interfaceC58222yxH4;
    }

    @Override // o.AbstractC58177ywP
    public void KWHzl(InterfaceC58179ywR interfaceC58179ywR) {
        this.AhwBna.copydefault(new Activity(interfaceC58179ywR));
    }

    /* JADX INFO: renamed from: o.yyz$Activity */
    public final class Activity implements InterfaceC58179ywR, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public final InterfaceC58179ywR KWHzl;

        public Activity(InterfaceC58179ywR interfaceC58179ywR) {
            this.KWHzl = interfaceC58179ywR;
        }

        @Override // o.InterfaceC58179ywR
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            try {
                C58319yyz.this.OLrzqt.accept(interfaceC58217yxC);
                if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                    this.AEQbTJ = interfaceC58217yxC;
                    this.KWHzl.onSubscribe(this);
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                interfaceC58217yxC.dispose();
                this.AEQbTJ = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.KWHzl);
            }
        }

        @Override // o.InterfaceC58179ywR
        public void onError(java.lang.Throwable th) {
            if (this.AEQbTJ == DisposableHelper.DISPOSED) {
                yBG.copydefault(th);
                return;
            }
            try {
                C58319yyz.this.EZpvd.accept(th);
                C58319yyz.this.valueOf.run();
            } catch (java.lang.Throwable th2) {
                C58218yxD.AEQbTJ(th2);
                th = new CompositeException(th, th2);
            }
            this.KWHzl.onError(th);
            OLrzqt();
        }

        @Override // o.InterfaceC58179ywR
        public void onComplete() {
            if (this.AEQbTJ == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                C58319yyz.this.copydefault.run();
                C58319yyz.this.valueOf.run();
                this.KWHzl.onComplete();
                OLrzqt();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.KWHzl.onError(th);
            }
        }

        public void OLrzqt() {
            try {
                C58319yyz.this.AEQbTJ.run();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                yBG.copydefault(th);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            try {
                C58319yyz.this.KWHzl.run();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                yBG.copydefault(th);
            }
            this.AEQbTJ.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ.isDisposed();
        }
    }
}
