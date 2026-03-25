package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58357yzk<T> extends AbstractC58349yzc<T, java.lang.Boolean> {
    public final InterfaceC58239yxY<? super T> KWHzl;

    public C58357yzk(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        super(interfaceC58255yxo);
        this.KWHzl = interfaceC58239yxY;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super java.lang.Boolean> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58256yxp, this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yzk$ActionBar */
    public static final class ActionBar<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58239yxY<? super T> EZpvd;
        public final InterfaceC58256yxp<? super java.lang.Boolean> KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public boolean copydefault;

        public ActionBar(InterfaceC58256yxp<? super java.lang.Boolean> interfaceC58256yxp, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.KWHzl = interfaceC58256yxp;
            this.EZpvd = interfaceC58239yxY;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.KWHzl.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.copydefault) {
                return;
            }
            try {
                if (this.EZpvd.test(t)) {
                    return;
                }
                this.copydefault = true;
                this.OLrzqt.dispose();
                this.KWHzl.onNext(java.lang.Boolean.FALSE);
                this.KWHzl.onComplete();
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.copydefault) {
                yBG.copydefault(th);
            } else {
                this.copydefault = true;
                this.KWHzl.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            this.KWHzl.onNext(java.lang.Boolean.TRUE);
            this.KWHzl.onComplete();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.OLrzqt.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt.isDisposed();
        }
    }
}
