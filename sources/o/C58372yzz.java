package o;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: o.yzz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58372yzz<T, R> extends AbstractC58349yzc<T, R> {
    public final InterfaceC58229yxO<? super T, ? extends C58248yxh<R>> copydefault;

    public C58372yzz(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58229yxO<? super T, ? extends C58248yxh<R>> interfaceC58229yxO) {
        super(interfaceC58255yxo);
        this.copydefault = interfaceC58229yxO;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super R> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new Activity(interfaceC58256yxp, this.copydefault));
    }

    /* JADX INFO: renamed from: o.yzz$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T, R> implements InterfaceC58256yxp<T>, InterfaceC58217yxC {
        public InterfaceC58217yxC EZpvd;
        public final InterfaceC58256yxp<? super R> KWHzl;
        public boolean OLrzqt;
        public final InterfaceC58229yxO<? super T, ? extends C58248yxh<R>> copydefault;

        public Activity(InterfaceC58256yxp<? super R> interfaceC58256yxp, InterfaceC58229yxO<? super T, ? extends C58248yxh<R>> interfaceC58229yxO) {
            this.KWHzl = interfaceC58256yxp;
            this.copydefault = interfaceC58229yxO;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.EZpvd, interfaceC58217yxC)) {
                this.EZpvd = interfaceC58217yxC;
                this.KWHzl.onSubscribe(this);
            }
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            this.EZpvd.dispose();
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd.isDisposed();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.OLrzqt) {
                if (t instanceof C58248yxh) {
                    C58248yxh c58248yxh = (C58248yxh) t;
                    if (c58248yxh.EZpvd()) {
                        yBG.copydefault(c58248yxh.OLrzqt());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                C58248yxh c58248yxh2 = (C58248yxh) C58297yyd.AEQbTJ(this.copydefault.apply(t), "The selector returned a null Notification");
                if (c58248yxh2.EZpvd()) {
                    this.EZpvd.dispose();
                    onError(c58248yxh2.OLrzqt());
                } else if (c58248yxh2.KWHzl()) {
                    this.EZpvd.dispose();
                    onComplete();
                } else {
                    this.KWHzl.onNext((java.lang.Object) c58248yxh2.copydefault());
                }
            } catch (java.lang.Throwable th) {
                C58218yxD.AEQbTJ(th);
                this.EZpvd.dispose();
                onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.OLrzqt) {
                yBG.copydefault(th);
            } else {
                this.OLrzqt = true;
                this.KWHzl.onError(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.OLrzqt) {
                return;
            }
            this.OLrzqt = true;
            this.KWHzl.onComplete();
        }
    }
}
