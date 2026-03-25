package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58342yzV<T> extends AbstractC58245yxe<T> {
    public final InterfaceC58255yxo<T> KWHzl;

    public C58342yzV(InterfaceC58255yxo<T> interfaceC58255yxo) {
        this.KWHzl = interfaceC58255yxo;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        this.KWHzl.subscribe(new Activity(interfaceC58242yxb));
    }

    /* JADX INFO: renamed from: o.yzV$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public final InterfaceC58242yxb<? super T> AEQbTJ;
        public T EZpvd;
        public InterfaceC58217yxC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            this.EZpvd = t;
        }

        public Activity(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
            this.AEQbTJ = interfaceC58242yxb;
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.copydefault.dispose();
            this.copydefault = DisposableHelper.DISPOSED;
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault == DisposableHelper.DISPOSED;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.copydefault, interfaceC58217yxC)) {
                this.copydefault = interfaceC58217yxC;
                this.AEQbTJ.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.copydefault = DisposableHelper.DISPOSED;
            this.EZpvd = null;
            this.AEQbTJ.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.copydefault = DisposableHelper.DISPOSED;
            T t = this.EZpvd;
            if (t != null) {
                this.EZpvd = null;
                this.AEQbTJ.onSuccess(t);
            } else {
                this.AEQbTJ.onComplete();
            }
        }
    }
}
