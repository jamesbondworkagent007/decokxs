package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58364yzr<T> extends AbstractC58260yxt<java.lang.Long> implements InterfaceC58240yxZ<java.lang.Long> {
    public final InterfaceC58255yxo<T> AEQbTJ;

    public C58364yzr(InterfaceC58255yxo<T> interfaceC58255yxo) {
        this.AEQbTJ = interfaceC58255yxo;
    }

    @Override // o.AbstractC58260yxt
    public void KWHzl(InterfaceC58258yxr<? super java.lang.Long> interfaceC58258yxr) {
        this.AEQbTJ.subscribe(new StateListAnimator(interfaceC58258yxr));
    }

    @Override // o.InterfaceC58240yxZ
    public AbstractC58247yxg<java.lang.Long> copydefault() {
        return yBG.EZpvd(new C58366yzt(this.AEQbTJ));
    }

    /* JADX INFO: renamed from: o.yzr$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator implements InterfaceC58256yxp<java.lang.Object>, InterfaceC58217yxC {
        public long EZpvd;
        public final InterfaceC58258yxr<? super java.lang.Long> KWHzl;
        public InterfaceC58217yxC OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58256yxp
        public void onNext(java.lang.Object obj) {
            this.EZpvd++;
        }

        public StateListAnimator(InterfaceC58258yxr<? super java.lang.Long> interfaceC58258yxr) {
            this.KWHzl = interfaceC58258yxr;
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
            this.OLrzqt = DisposableHelper.DISPOSED;
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.OLrzqt = DisposableHelper.DISPOSED;
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.OLrzqt = DisposableHelper.DISPOSED;
            this.KWHzl.onSuccess(java.lang.Long.valueOf(this.EZpvd));
        }
    }
}
