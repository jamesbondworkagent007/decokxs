package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58327yzG<T> extends AbstractC58245yxe<T> implements InterfaceC58240yxZ<T> {
    public final InterfaceC58255yxo<T> AEQbTJ;
    public final long KWHzl;

    public C58327yzG(InterfaceC58255yxo<T> interfaceC58255yxo, long j) {
        this.AEQbTJ = interfaceC58255yxo;
        this.KWHzl = j;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        this.AEQbTJ.subscribe(new Activity(interfaceC58242yxb, this.KWHzl));
    }

    @Override // o.InterfaceC58240yxZ
    public AbstractC58247yxg<T> copydefault() {
        return yBG.EZpvd(new C58329yzI(this.AEQbTJ, this.KWHzl, null, false));
    }

    /* JADX INFO: renamed from: o.yzG$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public long AEQbTJ;
        public boolean EZpvd;
        public InterfaceC58217yxC KWHzl;
        public final long OLrzqt;
        public final InterfaceC58242yxb<? super T> copydefault;

        public Activity(InterfaceC58242yxb<? super T> interfaceC58242yxb, long j) {
            this.copydefault = interfaceC58242yxb;
            this.OLrzqt = j;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.KWHzl, interfaceC58217yxC)) {
                this.KWHzl = interfaceC58217yxC;
                this.copydefault.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.KWHzl.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.KWHzl.isDisposed();
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.EZpvd) {
                return;
            }
            long j = this.AEQbTJ;
            if (j != this.OLrzqt) {
                this.AEQbTJ = j + 1;
                return;
            }
            this.EZpvd = true;
            this.KWHzl.dispose();
            this.copydefault.onSuccess(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.EZpvd) {
                yBG.copydefault(th);
            } else {
                this.EZpvd = true;
                this.copydefault.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.EZpvd) {
                return;
            }
            this.EZpvd = true;
            this.copydefault.onComplete();
        }
    }
}
