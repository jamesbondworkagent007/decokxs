package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yAi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56302yAi<T> extends AbstractC58245yxe<T> {
    public final InterfaceC58223yxI<T, T, T> EZpvd;
    public final InterfaceC58255yxo<T> OLrzqt;

    public C56302yAi(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58223yxI<T, T, T> interfaceC58223yxI) {
        this.OLrzqt = interfaceC58255yxo;
        this.EZpvd = interfaceC58223yxI;
    }

    @Override // o.AbstractC58245yxe
    public void copydefault(InterfaceC58242yxb<? super T> interfaceC58242yxb) {
        this.OLrzqt.subscribe(new StateListAnimator(interfaceC58242yxb, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.yAi$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public T AEQbTJ;
        public final InterfaceC58223yxI<T, T, T> EZpvd;
        public final InterfaceC58242yxb<? super T> KWHzl;
        public InterfaceC58217yxC OLrzqt;
        public boolean copydefault;

        public StateListAnimator(InterfaceC58242yxb<? super T> interfaceC58242yxb, InterfaceC58223yxI<T, T, T> interfaceC58223yxI) {
            this.KWHzl = interfaceC58242yxb;
            this.EZpvd = interfaceC58223yxI;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.OLrzqt, interfaceC58217yxC)) {
                this.OLrzqt = interfaceC58217yxC;
                this.KWHzl.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.copydefault) {
                return;
            }
            T t2 = this.AEQbTJ;
            if (t2 == null) {
                this.AEQbTJ = t;
                return;
            }
            try {
                this.AEQbTJ = (T) C58297yyd.AEQbTJ((java.lang.Object) this.EZpvd.apply(t2, t), "The reducer returned a null value");
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.OLrzqt.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.copydefault) {
                yBG.copydefault(th);
                return;
            }
            this.copydefault = true;
            this.AEQbTJ = null;
            this.KWHzl.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            T t = this.AEQbTJ;
            this.AEQbTJ = null;
            if (t != null) {
                this.KWHzl.onSuccess(t);
            } else {
                this.KWHzl.onComplete();
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
    }
}
