package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56317yAx<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58239yxY<? super T> EZpvd;

    public C56317yAx(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        super(interfaceC58255yxo);
        this.EZpvd = interfaceC58239yxY;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new Activity(interfaceC58256yxp, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yAx$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58239yxY<? super T> AEQbTJ;
        public InterfaceC58217yxC EZpvd;
        public boolean KWHzl;
        public final InterfaceC58256yxp<? super T> copydefault;

        public Activity(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.copydefault = interfaceC58256yxp;
            this.AEQbTJ = interfaceC58239yxY;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.EZpvd, interfaceC58217yxC)) {
                this.EZpvd = interfaceC58217yxC;
                this.copydefault.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.EZpvd.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.KWHzl) {
                return;
            }
            try {
                if (!this.AEQbTJ.test(t)) {
                    this.KWHzl = true;
                    this.EZpvd.dispose();
                    this.copydefault.onComplete();
                    return;
                }
                this.copydefault.onNext(t);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.EZpvd.dispose();
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
