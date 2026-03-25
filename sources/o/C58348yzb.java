package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58348yzb<T> extends AbstractC58291yyX<T, T> {
    public final InterfaceC58239yxY<? super T> copydefault;

    public C58348yzb(InterfaceC58246yxf<T> interfaceC58246yxf, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
        super(interfaceC58246yxf);
        this.copydefault = interfaceC58239yxY;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        this.OLrzqt.OLrzqt(new Activity(interfaceC58242yxb, this.copydefault));
    }

    /* JADX INFO: renamed from: o.yzb$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity<T> implements InterfaceC58242yxb<T>, InterfaceC58217yxC {
        public final InterfaceC58239yxY<? super T> AEQbTJ;
        public final InterfaceC58242yxb<? super T> EZpvd;
        public InterfaceC58217yxC copydefault;

        public Activity(InterfaceC58242yxb<? super T> interfaceC58242yxb, InterfaceC58239yxY<? super T> interfaceC58239yxY) {
            this.EZpvd = interfaceC58242yxb;
            this.AEQbTJ = interfaceC58239yxY;
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
            this.copydefault = DisposableHelper.DISPOSED;
            interfaceC58217yxC.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.copydefault.isDisposed();
        }

        @Override // o.InterfaceC58242yxb
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.copydefault, interfaceC58217yxC)) {
                this.copydefault = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58242yxb
        public void onSuccess(T t) {
            try {
                if (this.AEQbTJ.test(t)) {
                    this.EZpvd.onSuccess(t);
                } else {
                    this.EZpvd.onComplete();
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.EZpvd.onError(th);
            }
        }

        @Override // o.InterfaceC58242yxb
        public void onError(java.lang.Throwable th) {
            this.EZpvd.onError(th);
        }

        @Override // o.InterfaceC58242yxb
        public void onComplete() {
            this.EZpvd.onComplete();
        }
    }
}
