package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56314yAu<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58239yxY<? super T> copydefault;

    public C56314yAu(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        super(interfaceC58255yxo);
        this.copydefault = interfaceC58239yxY;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new Application(interfaceC58256yxp, this.copydefault));
    }

    /* JADX INFO: renamed from: o.yAu$Application */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58256yxp<? super T> EZpvd;
        public final InterfaceC58239yxY<? super T> KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public boolean copydefault;

        public Application(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.EZpvd = interfaceC58256yxp;
            this.KWHzl = interfaceC58239yxY;
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
            if (this.copydefault) {
                return;
            }
            this.EZpvd.onNext(t);
            try {
                if (this.KWHzl.test(t)) {
                    this.copydefault = true;
                    this.OLrzqt.dispose();
                    this.EZpvd.onComplete();
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (!this.copydefault) {
                this.copydefault = true;
                this.EZpvd.onError(th);
            } else {
                yBG.copydefault(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            this.EZpvd.onComplete();
        }
    }
}
