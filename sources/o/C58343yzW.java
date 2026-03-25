package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58343yzW<T> extends AbstractC58349yzc<T, T> {
    public C58343yzW(InterfaceC58255yxo<T> interfaceC58255yxo) {
        super(interfaceC58255yxo);
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new ActionBar(interfaceC58256yxp));
    }

    /* JADX INFO: renamed from: o.yzW$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC EZpvd;
        public final InterfaceC58256yxp<? super T> copydefault;

        public ActionBar(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
            this.copydefault = interfaceC58256yxp;
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
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.EZpvd, interfaceC58217yxC)) {
                this.EZpvd = interfaceC58217yxC;
                this.copydefault.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.copydefault.onNext(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.copydefault.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.copydefault.onComplete();
        }
    }
}
