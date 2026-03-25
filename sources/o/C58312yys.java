package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: renamed from: o.yys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58312yys<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
    public InterfaceC58217yxC AEQbTJ;
    public final InterfaceC58222yxH EZpvd;
    public final InterfaceC58256yxp<? super T> OLrzqt;
    public final InterfaceC58227yxM<? super InterfaceC58217yxC> copydefault;

    public C58312yys(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58227yxM<? super InterfaceC58217yxC> interfaceC58227yxM, InterfaceC58222yxH interfaceC58222yxH) {
        this.OLrzqt = interfaceC58256yxp;
        this.copydefault = interfaceC58227yxM;
        this.EZpvd = interfaceC58222yxH;
    }

    @Override // o.InterfaceC58256yxp
    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        try {
            this.copydefault.accept(interfaceC58217yxC);
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
            }
        } catch (java.lang.Throwable th) {
            C58218yxD.AEQbTJ(th);
            interfaceC58217yxC.dispose();
            this.AEQbTJ = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.OLrzqt);
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onNext(T t) {
        this.OLrzqt.onNext(t);
    }

    @Override // o.InterfaceC58256yxp
    public void onError(java.lang.Throwable th) {
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (interfaceC58217yxC != disposableHelper) {
            this.AEQbTJ = disposableHelper;
            this.OLrzqt.onError(th);
        } else {
            yBG.copydefault(th);
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onComplete() {
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (interfaceC58217yxC != disposableHelper) {
            this.AEQbTJ = disposableHelper;
            this.OLrzqt.onComplete();
        }
    }

    @Override // o.InterfaceC58217yxC
    public void dispose() {
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (interfaceC58217yxC != disposableHelper) {
            this.AEQbTJ = disposableHelper;
            try {
                this.EZpvd.run();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                yBG.copydefault(th);
            }
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return this.AEQbTJ.isDisposed();
    }
}
