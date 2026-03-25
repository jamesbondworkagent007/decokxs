package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C58366yzt<T> extends AbstractC58349yzc<T, java.lang.Long> {
    public C58366yzt(InterfaceC58255yxo<T> interfaceC58255yxo) {
        super(interfaceC58255yxo);
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super java.lang.Long> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58256yxp));
    }

    /* JADX INFO: renamed from: o.yzt$ActionBar */
    public static final class ActionBar implements InterfaceC58256yxp<java.lang.Object>, InterfaceC58217yxC {
        public long EZpvd;
        public final InterfaceC58256yxp<? super java.lang.Long> KWHzl;
        public InterfaceC58217yxC OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58256yxp
        public void onNext(java.lang.Object obj) {
            this.EZpvd++;
        }

        public ActionBar(InterfaceC58256yxp<? super java.lang.Long> interfaceC58256yxp) {
            this.KWHzl = interfaceC58256yxp;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.KWHzl.onSubscribe(this);
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
        public void onError(java.lang.Throwable th) {
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.KWHzl.onNext(java.lang.Long.valueOf(this.EZpvd));
            this.KWHzl.onComplete();
        }
    }
}
