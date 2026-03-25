package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56310yAq<T> extends AbstractC58349yzc<T, T> {
    public final long KWHzl;

    public C56310yAq(InterfaceC58255yxo<T> interfaceC58255yxo, long j) {
        super(interfaceC58255yxo);
        this.KWHzl = j;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new Application(interfaceC58256yxp, this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yAq$Application */
    public static final class Application<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public long KWHzl;
        public final InterfaceC58256yxp<? super T> OLrzqt;

        public Application(InterfaceC58256yxp<? super T> interfaceC58256yxp, long j) {
            this.OLrzqt = interfaceC58256yxp;
            this.KWHzl = j;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            long j = this.KWHzl;
            if (j != 0) {
                this.KWHzl = j - 1;
            } else {
                this.OLrzqt.onNext(t);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.OLrzqt.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.OLrzqt.onComplete();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ.isDisposed();
        }
    }
}
