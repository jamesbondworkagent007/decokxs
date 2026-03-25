package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C58353yzg<T, R> extends AbstractC58291yyX<T, R> {
    public final InterfaceC58229yxO<? super T, ? extends R> KWHzl;

    public C58353yzg(InterfaceC58246yxf<T> interfaceC58246yxf, InterfaceC58229yxO<? super T, ? extends R> interfaceC58229yxO) {
        super(interfaceC58246yxf);
        this.KWHzl = interfaceC58229yxO;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super R> interfaceC58242yxb) {
        this.OLrzqt.OLrzqt(new Activity(interfaceC58242yxb, this.KWHzl));
    }

    /* JADX INFO: renamed from: o.yzg$Activity */
    public static final class Activity<T, R> implements InterfaceC58242yxb<T>, InterfaceC58217yxC {
        public final InterfaceC58229yxO<? super T, ? extends R> AEQbTJ;
        public final InterfaceC58242yxb<? super R> EZpvd;
        public InterfaceC58217yxC KWHzl;

        public Activity(InterfaceC58242yxb<? super R> interfaceC58242yxb, InterfaceC58229yxO<? super T, ? extends R> interfaceC58229yxO) {
            this.EZpvd = interfaceC58242yxb;
            this.AEQbTJ = interfaceC58229yxO;
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
            this.KWHzl = DisposableHelper.DISPOSED;
            interfaceC58217yxC.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl.isDisposed();
        }

        @Override // o.InterfaceC58242yxb
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.KWHzl, interfaceC58217yxC)) {
                this.KWHzl = interfaceC58217yxC;
                this.EZpvd.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58242yxb
        public void onSuccess(T t) {
            try {
                this.EZpvd.onSuccess(C58297yyd.AEQbTJ(this.AEQbTJ.apply(t), "The mapper returned a null item"));
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
