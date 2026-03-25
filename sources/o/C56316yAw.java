package o;

import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: renamed from: o.yAw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C56316yAw<T> extends AbstractC58349yzc<T, T> {
    public final InterfaceC58255yxo<? extends T> EZpvd;

    public C56316yAw(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58255yxo<? extends T> interfaceC58255yxo2) {
        super(interfaceC58255yxo);
        this.EZpvd = interfaceC58255yxo2;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        StateListAnimator stateListAnimator = new StateListAnimator(interfaceC58256yxp, this.EZpvd);
        interfaceC58256yxp.onSubscribe(stateListAnimator.AEQbTJ);
        this.OLrzqt.subscribe(stateListAnimator);
    }

    /* JADX INFO: renamed from: o.yAw$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T> implements InterfaceC58256yxp<T> {
        public final InterfaceC58256yxp<? super T> OLrzqt;
        public final InterfaceC58255yxo<? extends T> copydefault;
        public boolean EZpvd = true;
        public final SequentialDisposable AEQbTJ = new SequentialDisposable();

        public StateListAnimator(InterfaceC58256yxp<? super T> interfaceC58256yxp, InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
            this.OLrzqt = interfaceC58256yxp;
            this.copydefault = interfaceC58255yxo;
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            this.AEQbTJ.update(interfaceC58217yxC);
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (this.EZpvd) {
                this.EZpvd = false;
            }
            this.OLrzqt.onNext(t);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.OLrzqt.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.EZpvd) {
                this.EZpvd = false;
                this.copydefault.subscribe(this);
            } else {
                this.OLrzqt.onComplete();
            }
        }
    }
}
