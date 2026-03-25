package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56311yAr<T> extends AbstractC58245yxe<T> {
    public final InterfaceC58255yxo<T> OLrzqt;

    public C56311yAr(InterfaceC58255yxo<T> interfaceC58255yxo) {
        this.OLrzqt = interfaceC58255yxo;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        this.OLrzqt.subscribe(new Activity(interfaceC58242yxb));
    }

    /* JADX INFO: renamed from: o.yAr$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC AEQbTJ;
        public boolean EZpvd;
        public final InterfaceC58242yxb<? super T> OLrzqt;
        public T copydefault;

        public Activity(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
            this.OLrzqt = interfaceC58242yxb;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.AEQbTJ, interfaceC58217yxC)) {
                this.AEQbTJ = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.AEQbTJ.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.AEQbTJ.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.EZpvd) {
                return;
            }
            if (this.copydefault == null) {
                this.copydefault = t;
                return;
            }
            this.EZpvd = true;
            this.AEQbTJ.dispose();
            this.OLrzqt.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.EZpvd) {
                yBG.copydefault(th);
            } else {
                this.EZpvd = true;
                this.OLrzqt.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.EZpvd) {
                return;
            }
            this.EZpvd = true;
            T t = this.copydefault;
            this.copydefault = null;
            if (t == null) {
                this.OLrzqt.onComplete();
            } else {
                this.OLrzqt.onSuccess(t);
            }
        }
    }
}
