package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC58306yym<T, R> implements InterfaceC58256yxp<T>, InterfaceC58301yyh<R> {
    public boolean AEQbTJ;
    public final InterfaceC58256yxp<? super R> EZpvd;
    public int KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public InterfaceC58301yyh<T> copydefault;

    public boolean EZpvd() {
        return true;
    }

    public void OLrzqt() {
    }

    public AbstractC58306yym(InterfaceC58256yxp<? super R> interfaceC58256yxp) {
        this.EZpvd = interfaceC58256yxp;
    }

    @Override // o.InterfaceC58256yxp
    public final void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
            this.OLrzqt = interfaceC58217yxC;
            if (interfaceC58217yxC instanceof InterfaceC58301yyh) {
                this.copydefault = (InterfaceC58301yyh) interfaceC58217yxC;
            }
            if (EZpvd()) {
                this.EZpvd.onSubscribe(this);
                OLrzqt();
            }
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

    public final void AEQbTJ(java.lang.Throwable th) {
        C58218yxD.AEQbTJ(th);
        this.OLrzqt.dispose();
        onError(th);
    }

    @Override // o.InterfaceC58256yxp
    public void onComplete() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        this.EZpvd.onComplete();
    }

    public final int KWHzl(int i) {
        InterfaceC58301yyh<T> interfaceC58301yyh = this.copydefault;
        if (interfaceC58301yyh == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = interfaceC58301yyh.requestFusion(i);
        if (iRequestFusion != 0) {
            this.KWHzl = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // o.InterfaceC58217yxC
    public void dispose() {
        this.OLrzqt.dispose();
    }

    @Override // o.InterfaceC58217yxC
    public boolean isDisposed() {
        return this.OLrzqt.isDisposed();
    }

    @Override // o.InterfaceC58305yyl
    public boolean isEmpty() {
        return this.copydefault.isEmpty();
    }

    @Override // o.InterfaceC58305yyl
    public void clear() {
        this.copydefault.clear();
    }

    @Override // o.InterfaceC58305yyl
    public final boolean offer(R r) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }
}
