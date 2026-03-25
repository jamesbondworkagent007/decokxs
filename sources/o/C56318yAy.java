package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56318yAy<T> extends AbstractC58349yzc<T, T> {
    public C56318yAy(InterfaceC58255yxo<T> interfaceC58255yxo) {
        super(interfaceC58255yxo);
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58256yxp));
    }

    /* JADX INFO: renamed from: o.yAy$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58256yxp<? super T> AEQbTJ;
        public T KWHzl;
        public InterfaceC58217yxC OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.KWHzl = t;
        }

        public ActionBar(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
            this.AEQbTJ = interfaceC58256yxp;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.AEQbTJ.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.KWHzl = null;
            this.AEQbTJ.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            OLrzqt();
        }

        public void OLrzqt() {
            T t = this.KWHzl;
            if (t != null) {
                this.KWHzl = null;
                this.AEQbTJ.onNext(t);
            }
            this.AEQbTJ.onComplete();
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.KWHzl = null;
            this.OLrzqt.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt.isDisposed();
        }
    }
}
