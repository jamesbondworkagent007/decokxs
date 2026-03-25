package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yza, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58347yza<T> extends AbstractC58245yxe<T> {
    public final InterfaceC58239yxY<? super T> KWHzl;
    public final InterfaceC58261yxu<T> OLrzqt;

    public C58347yza(InterfaceC58261yxu<T> interfaceC58261yxu, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        this.OLrzqt = interfaceC58261yxu;
        this.KWHzl = interfaceC58239yxY;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        this.OLrzqt.copydefault(new Activity(interfaceC58242yxb, this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yza$Activity */
    public static final class Activity<T> implements InterfaceC58258yxr<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC EZpvd;
        public final InterfaceC58239yxY<? super T> KWHzl;
        public final InterfaceC58242yxb<? super T> OLrzqt;

        public Activity(InterfaceC58242yxb<? super T> interfaceC58242yxb, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.OLrzqt = interfaceC58242yxb;
            this.KWHzl = interfaceC58239yxY;
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
            this.EZpvd = DisposableHelper.DISPOSED;
            interfaceC58217yxC.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd.isDisposed();
        }

        @Override // o.InterfaceC58258yxr
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.EZpvd, interfaceC58217yxC)) {
                this.EZpvd = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58258yxr
        public void onSuccess(T t) {
            try {
                if (this.KWHzl.test(t)) {
                    this.OLrzqt.onSuccess(t);
                } else {
                    this.OLrzqt.onComplete();
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.onError(th);
            }
        }

        @Override // o.InterfaceC58258yxr
        public void onError(java.lang.Throwable th) {
            this.OLrzqt.onError(th);
        }
    }
}
