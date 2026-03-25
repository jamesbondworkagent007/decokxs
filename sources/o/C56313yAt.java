package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56313yAt<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58239yxY<? super T> EZpvd;

    public C56313yAt(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        super(interfaceC58255yxo);
        this.EZpvd = interfaceC58239yxY;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new Activity(interfaceC58256yxp, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yAt$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58256yxp<? super T> AEQbTJ;
        public InterfaceC58217yxC EZpvd;
        public boolean KWHzl;
        public final InterfaceC58239yxY<? super T> copydefault;

        public Activity(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.AEQbTJ = interfaceC58256yxp;
            this.copydefault = interfaceC58239yxY;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.EZpvd, interfaceC58217yxC)) {
                this.EZpvd = interfaceC58217yxC;
                this.AEQbTJ.onSubscribe(this);
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
                this.AEQbTJ.onNext(t);
                return;
            }
            try {
                if (this.copydefault.test(t)) {
                    return;
                }
                this.KWHzl = true;
                this.AEQbTJ.onNext(t);
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.EZpvd.dispose();
                this.AEQbTJ.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.AEQbTJ.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.AEQbTJ.onComplete();
        }
    }
}
